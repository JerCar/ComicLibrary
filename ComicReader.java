
package qar.comiclibrary;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Jer's ComicBookLibrary Library
 author: Jeremy Carrothers
 version: 1.0
 
 ComicReader reads the comicFile and loads it into an ArrayList
 * 
 */

public class ComicReader {
    
    String dataFile = "C:\\Users\\jerem\\Desktop\\output.dat";
    
    public void readComics() {
        Comic.comicList.clear();
    
        try {
            FileInputStream fis = new FileInputStream(dataFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try {
                while (true) {
                    Comicbook tempComic = (Comicbook) ois.readObject();
                    Comic.comicList.add(tempComic);
                }
            } catch (EOFException e) { }
        } catch (IOException | ClassNotFoundException ex) { ex.printStackTrace();
        }
    }
}
