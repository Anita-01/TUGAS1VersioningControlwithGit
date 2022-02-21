/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PKPL_JUnitIntro;

/**
 *
 * @author ACER
 */
public class JUnit_Intro {
    public double addDouble (double n1, double n2){
        return n1+n2;
    }
    public String addString(String s1, String s2) {
        return s1+s2;
    }
    public int addInt (int n1, int n2){
        return n1+n2;
    }
    public boolean isOdd(int number){
        if(number%2 != 0){
            System.out.println (number + "is Odd Number");
            return true;
        }
        return false;
    }
    
    public boolean isEven (int number){
        if (number % 2 == 0) {
            System.out.println (number + "is Even Number");
            return true;
        }
        return false;
    }
    
}
