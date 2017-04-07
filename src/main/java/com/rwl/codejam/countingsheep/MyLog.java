/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwl.codejam.countingsheep;

/**
 *
 * @author thanthathon.b
 */
public class MyLog {

    private static boolean enable = true;

    public static void info(String text) {
        if (enable) {
            System.out.println("LOG: " + text);
        }
    }
    
    public void setLogEnable(boolean set){
        enable = set;
    }
}
