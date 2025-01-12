package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.store.*;
import java.util.*;

public class SumPrices {

    private static double total = 0;
    
    public static double sum(List<? extends Buch> books){
        double s = 0;
        for(Buch book : books){
            s += book.getPrice();
        }
        total += s;
        return s;
    }

    public static void main(String[] args) {
        /* Das Ergebnis der Berechnungen sollte sein:

            Summe Buch:     € 381.88
            Summe Ebuch:    € 255.82
            Summe Hoerbuch: € 344.58
            Summe Alle:     € 982.28
        */

        BookStore store = new BookStore();
        BooksDataParser parser = new BooksDataParser(store.getSoldBooks());
        
        System.out.println("Summe Buch:     \u20AC " + String.format("%.2f", sum(parser.getNormalBooks())));
        System.out.println("Summe Ebuch:     \u20AC " + String.format("%.2f", sum(parser.getEBooks())));
        System.out.println("Summe Hoerbuch:     \u20AC " + String.format("%.2f", sum(parser.getAudioBooks())));
        System.out.println("Summe Alle:     \u20AC " + String.format("%.2f", total));
    }
}
