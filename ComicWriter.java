
package qar.comiclibrary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Jer's ComicBookLibrary Library
 author: Jeremy Carrothers
 version: 1.0
 
 ComicWriter handles persistence (dumps the Comic.comicList 
 * ArrayList to disk as objects)
 */

public class ComicWriter {
    
    String dataFile = "C:\\Users\\jerem\\Desktop\\output.dat";
    
    public void writeComics() {
    
        
        try {
            FileOutputStream f = new FileOutputStream(new File(dataFile));
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            for (Object comic : Comic.comicList){
                
                o.writeObject(comic);
            }
        } catch (IOException ex) {}
    }
    
}
