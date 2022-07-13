/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspirateurauto;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class AspirateurAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int xg,yg,xa,ya;
        String orientation="N";
        Scanner scanner =new Scanner(System.in);
        //controle saisie largeur et longueur de la grille
        do{
            System.out.println("Donner les dimensions de la grille :");
            xg=scanner.nextInt();
            yg=scanner.nextInt();
            if (xg<=0 && yg<=0){
                System.out.println("les dimensions doit etre strictement positives!!!");
            }
        }while(xg<=0&&yg<=0);
       
        //controle saisie largeur et longueur de la position initiale de l'aspirateur
        do{
           
            System.out.println("Donner la position initiale de l'aspirateur");
            xa=scanner.nextInt();
            ya=scanner.nextInt();
            if ((xa>xg || xa<=0)||(ya>yg || ya<=0)){
                System.out.println("La position de l'aspirateur  doit etre dans la grille!!!");
            }
        }while((xa>xg || xa<=0)||(ya>yg || ya<=0));
        Aspirateur a1=new Aspirateur(xa,ya,orientation);
                
        Grid g1= new Grid (xg,yg);
        System.out.println(a1.move(xg, yg));
        
    }
    
}
