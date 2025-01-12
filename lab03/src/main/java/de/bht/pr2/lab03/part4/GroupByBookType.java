package de.bht.pr2.lab03.part4;

import de.bht.pr2.lab03.store.*;
import java.util.*;

public class GroupByBookType {

	public static void main(String[] args) {
		/* 
			Das Ergebnis der Berechnungen sollte sein:
			Buecher Anzahl: 6
			Buch: 7 Minuten am Tag (2016)
			Buch: Der Heimweg (2016)
			Buch: Ohne Schuld (2020)
			Buch: Escape Room (2020)
			Buch: Der Heimweg (2020)
			Buch: Ohne Schuld (2016)
			Ebuecher Anzahl: 4
			Ebuch: Ohne Schuld (2020)
			Ebuch: Der Heimweg (2020)
			Ebuch: Zwei Handvoll Leben (2020)
			Ebuch: Kingsbridge - Der Morgen einer neuen Zeit (2020)
			Hoerbuecher Anzahl: 5
			Hoerbuch: QualityLand 2.0 (2019)
			Hoerbuch: Funken Mord (2018)
			Hoerbuch: QualityLand 2.0 (2018)
			Hoerbuch: Funken Mord (2019)
			Hoerbuch: Harry Potter - alle 7 Baende (2018)
		*/
		BookStore store = new BookStore();
        BooksDataParser parser = new BooksDataParser(store.getSoldBooks());

		//Unique Normal books
		Set<Buch> normalBookSet = new HashSet<>(parser.getNormalBooks());
		System.out.println("Buecher Anzahl: " + normalBookSet.size());
		for(Buch book : normalBookSet){
			System.out.println(book);
		}

		//Unique E-books
		Set<Ebuch> eBookSet = new HashSet<>(parser.getEBooks());
		System.out.println("Ebuecher Anzahl: " + eBookSet.size());
		for(Ebuch book : eBookSet){
			System.out.println(book);
		}

		//Unique Audio books
		Set<Hoerbuch> audioBookSet = new HashSet<>(parser.getAudioBooks());
		System.out.println("Hoerbuecher Anzahl: " + audioBookSet.size());
		for(Hoerbuch book : audioBookSet){
			System.out.println(book);
		}
	}
}
