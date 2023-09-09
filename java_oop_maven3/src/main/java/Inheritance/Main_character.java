/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author JhayJ
 */
public class Main_character {
    String firstName, lastName, address;
    int age;
    Main_character(String firstName, String lastName, String address, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }
    void Names(String Name,int age ){
        for(int i = 1;i < 5;i++){
            System.out.println("Your name is " + Name);
        }
        System.out.println(age);
    }
}
