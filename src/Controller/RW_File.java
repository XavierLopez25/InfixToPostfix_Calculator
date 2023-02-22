package Controller;

import java.io.*;

/**
 * Clase utilizada para la escritura y lectura del archivo que contendrá la expresion infix.
 */
public class RW_File {

    /**
     * Método que lee String infix que contiene la expresion infix.
     *
     * @return El String infix que contiene la expresion infix, para su uso posterior en otras funciones y clases.
     */
    public static String readInfixFromFile(){

        try {

            File file = new File("infix.txt");
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = buffer.readLine()) != null) {
                stringBuilder.append(line);
            }
            String contents = stringBuilder.toString();

            buffer.close();
            reader.close();

            return contents;

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}

