
package qar.comiclibrary;

/**
 * Jer's Comic Library
 * author: Jeremy Carrothers
 * version: 1.0
 * 
 * SuperClass for all comics 
 */

public class Comic {
    
    private String comicName;
    private String comicSeries;
    private int comicEdition;
    private String pubDate;
    private int isbn;
    

    public Comic(String cName, String cSeries, int cEdition, int isbNumber, String publishedDate) {
        this.comicName = cName;
        this.comicSeries = cSeries;
        this.comicEdition = cEdition;
        this.isbn = isbNumber;
        this.pubDate = publishedDate;
    }
    
    public String getComicName() { return comicName; }
    public String getComicSeries() { return comicSeries; }
    public int getComicEdition() { return comicEdition; }
    public int getIsbn() { return isbn; }
    
    @Override
    public String toString() {
        return "Name: " + this.comicName + ", Series: " + this.comicSeries + " Comic Edition: " + this.comicEdition;
    }
    
    
    public static void main(String[] args) {
    
        Comic comic = new Comic("Summer Special", "The Punisher", 2, 333333333, "Mar 15, 2021");
        System.out.println(comic.toString());
    }
}
