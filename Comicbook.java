
package qar.comiclibrary;

/**
 * Jer's ComicBookLibrary Library
 author: Jeremy Carrothers
 version: 1.0
 
 SuperClass for all comics 
 */

public class Comicbook {
    
    private String comicName;
    private String comicSeries;
    private String comicEdition;
    private String pubDate;
    private int isbn;
    private static final String NEW_LINE = System.lineSeparator();
    

    public Comicbook(String cName, String cSeries, String cEdition, String publishedDate, int isbNumber) {
        this.comicName = cName;
        this.comicSeries = cSeries;
        this.comicEdition = cEdition;
        this.isbn = isbNumber;
        this.pubDate = publishedDate;
    }
    
    public String getComicName() { return comicName; }
    public String getComicSeries() { return comicSeries; }
    public String getComicEdition() { return comicEdition; }
    public int getIsbn() { return isbn; }
    
    @Override
    public String toString() {
        //return "Name: " + this.comicName + ", Series: " + this.comicSeries + " Comic Edition: " + this.comicEdition + "Publication Date: " + pubDate + "ISBN: " + isbn;
        return this.comicName + ", " + this.comicSeries + ", " + this.comicEdition + ", " + this.pubDate + ", " + this.isbn + NEW_LINE;
    } 
   
}