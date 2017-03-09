/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QAnalysis;

/**
 *
 * @author ayman
 */


    public class QAnalyzer {

        public static void Analyze(Question Q) {
            Tokenize(Q);
            
        }
        
        public static void Tokenize(Question Q) {
            Q.QWords = Q.QText.split(" ");
        }
    }


