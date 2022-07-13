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
public class Aspirateur {
    //les attributes
    private int x,y;
    private String orientation;
    Scanner scanner =new Scanner(System.in);
    //les constantes
    private final char droite='d';
    private final char gauche='g';
    private final char avance='a';
    private final String north="N";
    private final String south="S";
    private final String west="W";
    private final String east="E";
    //les constructeurs 
    public Aspirateur (){
        
    }
    public Aspirateur (int x,int y,String orientation){
        this.x=x;
        this.y=y;
        this.orientation=orientation;
    }
    //getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getOrientation() {
        return orientation;
    }
    public int controlLargeurAspirateur(int larg){
    
        if (this.x+1>larg ||this.x-1<0){
            return -1;
        }
        return 1;
    }
      public int controlLongeurAspirateur(int longr){
  
        if (this.y+1>longr ||this.y-1<0){
            return -1;
        }
        return 1;
    }
      public boolean controlInstruction(String inst){
          
           // Return false if the instruection
        // has empty or null
        if (inst == null || inst == "") {
            return false;
        }
        int test=1;
        for(int i =0;i<inst.length();i++){
            
            if ((inst.charAt(i)!=this.droite)&& (inst.charAt(i)!=this.gauche)&&(inst.charAt(i)!=this.avance)) {
                test= -1;
                break;
            }
        }
        if(test >0){
            return true;
        }else {
            return false;
        }
      }
    public String move(int larg, int longr){
        String instruction;
        System.out.println("Entrer vos instruction pour l'aspirateur");
        instruction=scanner.nextLine();
        
        if(this.controlInstruction(instruction)){
         for(int i=0;i<instruction.length();i++){

             if(instruction.charAt(i)==this.avance){
                 switch (this.orientation){
                     case("N"):{
                         if(this.controlLongeurAspirateur(longr)==1){
                             this.y++;
                         }
                     }
                      break;
                     case("S"):{
                            if(this.controlLongeurAspirateur(longr)==1){
                                this.y--;
                            }
                         }
                         break;
                      case("E"):{
                            if(this.controlLargeurAspirateur(larg)==1){
                                this.x++;
                            }
                         }
                      break;
                       case("W"):{
                            if(this.controlLargeurAspirateur(larg)==1){
                                this.x--;
                            }
                         }
                       break;
                 } 
             }  else if (instruction.charAt(i)==this.droite){
                      switch(this.orientation){
                            case("N"):{
                                  this.orientation=this.west;
                            }
                            break;
                             case("W"):{
                                  this.orientation=this.south;
                            }
                            break;
                             case("S"):{
                                  this.orientation=this.east;
                            }
                            break;
                             default :{
                                 this.orientation=this.north;
                             }
                         }   
                     } else{
                     switch(this.orientation){
                            case("N"):{
                                  this.orientation=this.east;
                            }
                            break;
                             case("E"):{
                                  this.orientation=this.south;
                            }
                            break;
                             case("S"):{
                                  this.orientation=this.west;
                            }
                            break;
                             default :{
                                 this.orientation=this.north;
                             }
                         }
                 
             } 
         }
         return this.toString();
        } 
         return this.toString();
    }
    @Override
    public String toString() {
        return "Aspirateur{" + "x=" + x + ", y=" + y + ", orientation=" + orientation + '}';
    }
    
}
