package de.bht.pr2.lab03.store;

public class Ebuch extends Buch {
    private int tolinoVersion;
    
    public Ebuch(String titel, String type, double price, int auflage, int tolinoVersion){
        super(titel, type, price, auflage);
        this.tolinoVersion = tolinoVersion;
    }

    public int getTolinoVersion(){
        return this.tolinoVersion;
    }

    @Override
    public String toString(){
        return String.format("Ebook: %s (%d)", getTitel(), getAuflage());
    }
}
