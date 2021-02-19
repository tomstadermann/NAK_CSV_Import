package com.company;

public class Klausurergebnisse implements Comparable<Klausurergebnisse> {
    private int matrikelNummer;
    private int prozent;
    private double note;


    public Klausurergebnisse(int matrikelNummer, int prozent, double note){
        this.matrikelNummer = matrikelNummer;
        this.prozent = prozent;
        this.note = note;

    }


    public void printZustand(){

        System.out.println(matrikelNummer + prozent + note);
    }

    @Override
    public int compareTo(Klausurergebnisse klausurergebniss) {
        if(prozent == klausurergebniss.prozent){
            return 0;
        }
        else if(prozent > klausurergebniss.prozent){
            return 1;
        }
        else {
            return -1;
        }
    }
}
