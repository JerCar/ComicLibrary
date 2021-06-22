
package qar.comiclibrary;

/**
 * Jer's ComicBookLibrary Library
 author: Jeremy Carrothers
 version: 1.0
 
 SuperClass for all comics 
 */

import java.io.Serializable;

public class Comicbook implements Comparable<Comicbook>, Serializable {
    
    private String comicName;
    private String comicSeries;
    private String comicSeriesNumber;
    
    private static final String NEW_LINE = System.lineSeparator();
    

    public Comicbook(String cName, String cSeries, String cEdition) {
        this.comicName = cName;
        this.comicSeries = cSeries;
        this.comicSeriesNumber = cEdition;
       
    }
    
    public String getComicName() { return comicName; }
    public String getComicSeries() { return comicSeries; }
    public String getComicEdition() { return comicSeriesNumber; }
    
    
    @Override
    public int compareTo(Comicbook comicbook) {
        
        if (getComicSeries() == null || comicbook.getComicSeries() == null) { return 0; }
        return getComicSeries().compareTo(comicbook.getComicSeries());
    }
    
    @Override
    public String toString() {
        //return "Name: " + this.comicName + ", Series: " + this.comicSeries + " Comic Edition: " + this.comicSeriesNumber+ "Publication Date: " + pubDate + "ISBN: " + isbn;
        return this.comicName + ", " + this.comicSeries + ", " + this.comicSeriesNumber; //+ NEW_LINE;
    } 
   
}