package de.bht.pr2.lab03.part3;

import de.bht.pr2.lab03.store.*;
import java.util.*;

public class StreamingAudioBookCount {

    public static int sum(List<Hoerbuch> books){
        int s = 0;
        for(Hoerbuch book : books){
            if(book.getAbspielModus().equals("Streaming")){
                s++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        /* 
            Das Ergebnis der Berechnungen sollte sein:
            Anzahl Hoerbuecher per Streaming: 5
        */
        
        BookStore store = new BookStore();
        BooksDataParser parser = new BooksDataParser(store.getSoldBooks());

        System.out.println("audiobooks played via streaming : " + sum(parser.getAudioBooks()));
    }
}
