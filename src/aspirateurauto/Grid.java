/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspirateurauto;

/**
 *
 * @author Asus
 */
public class Grid {
    //les attributs
    //x est largeur et y est longeur
   private  int largeur,longueur;
   
    //les constructeurs
    public Grid(){
        
    }
    public Grid(int x ,int y){
        this.largeur=x;
        this.longueur=y;
       
    }
    //getters 

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }

   

    @Override
    public String toString() {
        return "Grid{" + "largeur=" + largeur + ", longueur=" + longueur  + '}';
    }
    
}
