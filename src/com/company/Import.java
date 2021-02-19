package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Import {

    //ArrayList<Klausurergebnisse> listVonKlausurergebnissen = new ArrayList<Klausurergebnisse>();


    public ArrayList importCSV (ArrayList<Klausurergebnisse> listVonKlausurergebnissen) {

        try (Scanner s = new Scanner(
                new FileInputStream("import.csv"), StandardCharsets.UTF_8.name())){
            s.useDelimiter(";|"+System.lineSeparator());
        while(s.hasNextLine())
            //System.out.println(s.nextInt() + " " + s.nextInt() + " " + s.nextDouble());
            listVonKlausurergebnissen.add(new Klausurergebnisse(s.nextInt(), s.nextInt(), s.nextDouble()));
        }

        catch (IOException e) {e.printStackTrace();}


        Collections.sort(listVonKlausurergebnissen);
        return listVonKlausurergebnissen;
    }



}
