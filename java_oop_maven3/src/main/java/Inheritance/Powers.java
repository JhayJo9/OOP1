/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author JhayJ
 */
public class Powers extends Main_character{
    int iq;
    Powers(String firstName, String lastName, String address, int age, int iq){
        super(firstName,lastName,address, age);
        this.iq = iq;
    }
    void st(int iq){
        System.out.print(iq);
    }
}
