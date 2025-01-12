package de.bht.pr2.lab03.store;

public class Hoerbuch extends Buch{
    private String abspielModus;

    public Hoerbuch(String titel, String type, double price, int auflage, String abspielModus){
        super(titel, type, price, auflage);
        this.abspielModus = abspielModus;
    }

    public String getAbspielModus(){
        return this.abspielModus;
    }

    @Override
    public String toString(){
        return String.format("Audiobook: %s (%d)", getTitel(), getAuflage());
    }
}
