
package qar.comiclibrary;

/**
 *
 * @author Jeremy Carrothers
 * @version 1.0
 * 
 * This class writes the file to disk as a text
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.String;
import java.nio.file.StandardOpenOption;



public class FileWriter {
    
    private String fileName = "C:/Users/jerem/Desktop/output.csv";
    
    
    public void writeComic(Comicbook comicBook) throws IOException {  
    
        Files.write(Paths.get(fileName), comicBook.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    } 
}
