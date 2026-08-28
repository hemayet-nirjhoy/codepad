package com.codepad.compiler;

import com.codepad.CodepadException;
import com.codepad.model.CodeSnippet;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CodeCompiler {
    private static final String TEMP_DIR = System.getProperty("java.io.tmpdir");

    private final String ERR_COMPILATION_FAILED_WITH_EXIT_CODE = "Compilation failed with exit code: ";
    private final String ERR_COMPILATION_ERROR = "Compilation error: ";

    public CodeCompiler() {
        new File(TEMP_DIR).mkdirs();
    }

    public void compile(CodeSnippet snippet) throws CodepadException {
        try{
            String filePath = TEMP_DIR + File.separator + snippet.getClassName() + ".java";
            Files.write(Paths.get(filePath), snippet.getSourceCode().getBytes());

            ProcessBuilder pb = new ProcessBuilder("javac", filePath);
            pb.directory(new File(TEMP_DIR));
            Process process = pb.start();
            int exitCode = process.waitFor();

            if (exitCode != 0){
                throw new CodepadException( ERR_COMPILATION_FAILED_WITH_EXIT_CODE + exitCode);
            }

        }catch (Exception e) {
            throw new CodepadException( ERR_COMPILATION_ERROR + e.getMessage(), e);
        }
    }

    public String getTempDir() {
        return TEMP_DIR;
    }


}
