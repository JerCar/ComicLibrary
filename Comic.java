
package qar.comiclibrary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Jeremy Carrothers
 * @version 1.0
 * This file runs the app
 */
public class Comic {
    
    // Scanner scanner = new Scanner(System.in);
    public static ArrayList comicList = new ArrayList<Comicbook>();
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        ComicAdder comicAdder = new ComicAdder();
        ComicWriter comicWriter = new ComicWriter();
        ComicReader comicReader = new ComicReader();
        
        String userChoice;
        
        comicReader.readComics();
        Collections.sort(comicList);
        
        while (true) {
            System.out.println();
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Jer's Comic Library");
            System.out.println("++++++ Main Menu ++++++");
            System.out.println(" -->   (a)dd comic");
            System.out.println(" -->   (p)rint comics in collection");            
            System.out.println(" -->   (e)xit");
            System.out.println("What would you like to do?: ");                   
            userChoice = scanner.next();
            scanner.nextLine();
            
            
        
            if (userChoice.equals("a")) {
                
                Comicbook tempComic = comicAdder.getNewComic();
                // FileWriter fileWriter = new FileWriter();e
                Comic.comicList.add(tempComic);            
            }
            
            else if (userChoice.equals("p")) {
                                
                System.out.println();
                
                for (Object comic : comicList) {
                    System.out.println(comic);        
                }
            }
            
            else if (userChoice.equals("e")) {
                comicWriter.writeComics();
                System.out.println("+++ Good bye +++");
                break;
            }
        }
    }    
}
