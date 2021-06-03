
package qar.comiclibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Jeremy Carrothers
 * @version 1.0
 * 
 * this class reads the csv file
 */
public class FileReader {
    
    public static ArrayList comicList = new ArrayList();
    
    public void readComicFile() throws IOException {
        Path path = Paths.get("C:/Users/jerem/Desktop/output.csv");
        BufferedReader reader = Files.newBufferedReader(path);
                
        String line = reader.readLine();
        while (!(line == null)) {
            comicList.add(line);
            //System.out.println(line);
            line = reader.readLine();            
        }        
    }
    
}
