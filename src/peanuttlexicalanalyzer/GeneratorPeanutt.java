package peanuttlexicalanalyzer;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author heraldo
 */
public class GeneratorPeanutt {

//    public static void main(String[] args) {
//
//        String rootPath = Paths.get("").toAbsolutePath().toString();
//        String subPath = "/src/peanuttlexicalanalyzer/";
//        String path = rootPath + subPath + "PeanuttLexical.pen";
//        gerador(path);
//    }

    private static void gerador(String path) {

        File sourceCode = new File(path);
        jflex.Main.generate(sourceCode);
    }
}
