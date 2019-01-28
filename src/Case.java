/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedago
 */
public class Case {
    int LRU;
    int Etiquette;
    
       public Case(int L, int Eti){
        this.Etiquette=Eti;
        this.LRU=L;
    }
    
    public double getEti(){
        return Etiquette;
    }
    
    public int getVal(){
        return LRU;
    }
    
    public void setEti(int eti){
        this.Etiquette=eti;
    }
    
    public void setVal(int L){
        this.LRU=L;
    }
    
}
    

