/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scaner_01;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author r0gv3
 */
public class Ejecutar1 {
      public static void main(String[] args) throws Exception {
        String ruta1 = "src/scaner_01/lexico.flex";
        String ruta2 = "src/scaner_01/lexicocup.flex";
        String[] rutaS = {"-parser", "sintax", "src/scaner_01/sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("src/scaner_01/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/r0gv3/Desktop/002/sym.java"), 
                Paths.get("src/scaner_01/sym.java")
        );
        Path rutaSin = Paths.get("src/scaner_01/sintax1.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/r0gv3/Desktop/002/sintax.java"), 
                Paths.get("src/scaner_01/sintax.java")
        );
    }
}