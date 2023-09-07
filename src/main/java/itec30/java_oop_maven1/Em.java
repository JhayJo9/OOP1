/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itec30.java_oop_maven1;

/**
 *
 * @author JhayJ
 */
// constrator
public class Em {
    // attributes
    String Fav_food;
    String Fav_color;
    
    Em(String Fav_food, String Fav_color){
        this.Fav_food = Fav_food;
        this.Fav_color = Fav_color;
        
        System.out.println(this.Fav_food + " Check ");
        System.out.println(this.Fav_color + " Check ");
    }
}
