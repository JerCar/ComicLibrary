
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
    String comicEdition;
    String pubDate;
    int isbn;
    
    Scanner scanner = new Scanner(System.in);
    
    public Comicbook getNewComic() {
        System.out.println("Enter comic name: ");
        comicName = scanner.nextLine();
        System.out.println("Enter comic series: ");
        comicSeries = scanner.nextLine();
        System.out.println("Enter series number: ");
        comicEdition = scanner.nextLine();
        System.out.println("Enter the publication date: ");
        pubDate = scanner.nextLine();
        System.out.println("Enter the ISBN number: ");
        isbn = scanner.nextInt();
        scanner.nextLine();
        
        Comicbook comicBook = new Comicbook(comicName, comicSeries, comicEdition, pubDate, isbn);
        
        return comicBook;
    }   
    
}
