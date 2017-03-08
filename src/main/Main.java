/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import QAnalysis.QAnalyzer;
import QAnalysis.Question;
import java.util.Scanner;

/**
 *
 * @author ayman
 */
public class Main {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        Question Q = new Question(input);
        QAnalyzer.Tokenize(Q);
        for (String Word : Q.getWords()) {
        System.out.println(Word);
        }
    }
    
}
