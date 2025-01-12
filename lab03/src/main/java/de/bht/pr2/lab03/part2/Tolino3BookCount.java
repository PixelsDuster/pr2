package de.bht.pr2.lab03.part2;

import de.bht.pr2.lab03.store.*;
import java.util.*;

public class Tolino3BookCount {

    public static int sum(List<Ebuch> books){
        int s = 0;
        for(Ebuch book : books){
            if(book.getTolinoVersion() == 3){
                s++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        /* 
            Das Ergebnis der Berechnungen sollte sein:
            Anzahl Ebuecher bei Tolino 3: 9
        */
        
        BookStore store = new BookStore();
        BooksDataParser parser = new BooksDataParser(store.getSoldBooks());

        System.out.println("e-books that are sold on Tolino 3 : " + sum(parser.getEBooks()));
    }
}
