
package qar.comiclibrary;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Jeremy Carrothers
 * @version 1.0
 * This file runs the app
 */
public class Comic {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        
        
        ComicAdder comicAdder = new ComicAdder();
        FileReader fileReader = new FileReader();
        //Comicbook tempComic = comicAdder.getNewComic();
        
        
        while (true) {
            System.out.println("Enter new comic? (y/n): ");
            String userAnswer = scanner.next();
            
            if (userAnswer.equals("y")) {
                Comicbook tempComic = comicAdder.getNewComic();
                FileWriter fileWriter = new FileWriter();
                fileWriter.writeComic(tempComic);            
                
            }
            
            else { break; }        
        } 
        
    fileReader.readComicFile();
        for (Object comicList : FileReader.comicList) {
            System.out.println(comicList);
        
        }        
    }    
}
