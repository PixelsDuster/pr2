package de.bht.pr2.lab03.store;

import java.util.Objects;

public class Buch {
 
    protected String titel;
    protected String type;
    protected double price;
    protected int auflage;

    public Buch(String titel, String type, double price, int auflage){
        this.titel = titel;
        this.type = type;
        this.price = price;
        this.auflage = auflage;
    }

    public String getTitel(){
        return this.titel;
    }

    public String getType(){
        return this.type;
    }

    public double getPrice(){
        return this.price;
    }

    public int getAuflage(){
        return this.auflage;
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared) return true;
        if(!(compared instanceof Buch) || compared == null) return false;
        Buch comparedConvert = (Buch) compared;
        if((this.getTitel().equals(comparedConvert.getTitel())) && 
           (this.getAuflage() == comparedConvert.getAuflage())) return true;
        return false;
    }

    public int hashCode() {
        return Objects.hash(titel, auflage);
    }

    public String toString(){
        return String.format("Book: %s (%d)", getTitel(), getAuflage());
    }
}
