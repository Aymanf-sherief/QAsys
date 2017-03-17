/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import QAnalysis.QAnalyzer;
import QAnalysis.Question;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ayman
 */
public class Main {

    public static void main(String args[]) throws IOException {
        IndexFiles.index();
        
        QA_UI userInterface = new QA_UI();
        userInterface.setVisible(true);

    }
    
    
    

}
