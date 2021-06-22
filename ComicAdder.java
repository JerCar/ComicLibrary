
package qar.comiclibrary;

/**
 *
 * Jer's Comic Library
 * author: Jeremy Carrothers
 * version: 1.0
 * 
 * Class to handle user input for new comics 
 */

import java.util.Scanner;

public class ComicAdder {
    
    String comicName;
    String comicSeries;
    String comicSeriesNumber;
    
    
    Scanner scanner = new Scanner(System.in);
    
    public Comicbook getNewComic() {
        System.out.println("Enter comic series: ");
        comicSeries = scanner.nextLine();
        System.out.println("Enter comic name: ");
        comicName = scanner.nextLine();
        System.out.println("Enter series number: ");
        comicSeriesNumber = scanner.nextLine();
        
                
        Comicbook comicBook = new Comicbook(comicSeries, comicName, comicSeriesNumber);
        
        return comicBook;
    }   
    
}
