package de.bht.pr2.lab03.store;

import java.util.*;

public class BooksDataParser {

    private List<Buch> normalBooks = new ArrayList<Buch>();
    private List<Hoerbuch> audioBooks = new ArrayList<Hoerbuch>();
    private List<Ebuch> eBooks = new ArrayList<Ebuch>();

    public BooksDataParser(List<String> SoldBooks){
        List<String> types = new ArrayList<>();
        types.add("Buch");
        types.add("Ebuch");
        types.add("Hoerbuch");

        // Data-Parser
        for(String row : SoldBooks){
            
            String[] data = row.split(";");
            // TYPE Check
            if(!types.contains(data[1])) throw new IllegalArgumentException("Type 8alet ya3tik 3asba!");

            // PRICE Check
            double price = 0;
            try {
                price = Double.parseDouble(data[2]);
            } catch (Exception e) {
                System.out.println("Price invalid");
            }
            if(price < 0) throw new IllegalArgumentException("Price 8alet ya3tik 3asba!");

            // AUFLAGE Check
            int auflage = 0;
            try {
                auflage = Integer.parseInt(data[3]);
            } catch (Exception e) {
                System.out.println("Invalid Auflage");
            }
            if(data[3].length() != 4 && (auflage / 1000 != 1 || auflage / 1000 != 2)) throw new IllegalArgumentException("Auflage 8alet ya3tik 3asba!");
            
            // Adding to the normal books list
            if(data.length == 4) this.normalBooks.add(new Buch(data[0], data[1], price, auflage));
            // Adding to the audio books list
            else if(data[4].length() > 1) this.audioBooks.add(new Hoerbuch(data[0], data[1], price, auflage, data[4]));
            else { // Adding to the Ebooks list
                // TolinoVersion Check
                int tolinoVersion = 0;
                try {
                    tolinoVersion = Integer.parseInt(data[4]);
                } catch (Exception e) {
                    System.out.println("Invalid tolinoVersion");
                }
                this.eBooks.add(new Ebuch(data[0], data[1], price, auflage, tolinoVersion));
            }
        }
    }

    public List<Buch> getNormalBooks(){
        return this.normalBooks;
    }

    public List<Hoerbuch> getAudioBooks(){
        return this.audioBooks;
    }

    public List<Ebuch> getEBooks(){
        return this.eBooks;
    }
}
