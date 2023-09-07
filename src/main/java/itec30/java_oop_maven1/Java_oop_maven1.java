/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itec30.java_oop_maven1;

/**
 *
 * @author JhayJ 
 */
public class Java_oop_maven1 {

    public static void main(String[] args) {
        System.out.print("Hello \n");
        /* Class instantiation */
        Real_Man rm = new Real_Man();
        /* class acessing attributes*/
        rm.mc = "Han_Yoo_Hyun";
        rm.status = "ongoing";
        rm.chapters = 155;
        
        System.out.print(rm.mc+"\n");
    }
}
