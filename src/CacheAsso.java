
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedago
 */
public class CacheAsso {
    // a/2^4 adresse
        Case[] Case;
    int TailleBloc = 32;
    int succes;
    int echec;
    int temps;
    File file = new File("matrice10.txt");
    double nbr_line;
    
    public CacheAsso(double nbr_ligne){
        this.nbr_line=nbr_ligne;
        double taille = Math.pow(2, nbr_ligne);
        this.Case = new Case[(int) taille];
        for (int i=0;i<taille;i++){
            Case[i]=new Case(-1,0);
        }
        
    }
    public ArrayList<Integer> Simu() {
        File file=new File("matrice10.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CacheAsso.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(sc.hasNextLine()){
                String i = sc.nextLine();
                String num = i.split(":")[0];
                int n = Integer.parseInt(num);
                double deplacement = (n/32);
                double line = (n / 32) % (Math.pow(2, this.nbr_line));
                double etiquette = (n / 32) / (Math.pow(2, this.nbr_line));
    }
    
    
}
}
