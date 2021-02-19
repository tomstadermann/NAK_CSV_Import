package com.company;

import java.util.ArrayList;

public class Export {

    ArrayList<Klausurergebnisse> listOfKlasurergebnisse = new ArrayList<Klausurergebnisse>();

    public void exportToTxt(){

        

        Import impo = new Import();
        impo.importCSV(listOfKlasurergebnisse);

        for(Klausurergebnisse a: listOfKlasurergebnisse){
            System.out.println(a);
        }


    }


}
