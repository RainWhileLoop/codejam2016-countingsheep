/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwl.codejam.countingsheep;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author thanthathon.b
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        String output;
        System.out.print("input : ");
        input = scanner.nextInt();
        output = process(input);
        System.out.println("Case #" + 1 + ": " + output);

    }

    private static String process(int input) {
        if (input == 0) {
            return "INSOMNIA";
        }
        int pointer = 0;
        Set<Integer> seen = new HashSet<>();
        while (seen.size() != 10) {
            pointer += input;
            splitNumber(seen, pointer);
            MyLog.info("VALUE -> " + pointer + " , DIGITS -> " + seen);
        }
        return String.valueOf(pointer);
    }

    private static void splitNumber(Set<Integer> output, int value) {
        while (value > 0) {
            output.add(value % 10);
            value /= 10;
        }
    }

}
