/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QAnalysis;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author ayman
 */
public class QAnalyzer {

    public static void Analyze(Question Q) {
        Tokenize(Q);
        Stem(Q);

    }

    public static void Tokenize(Question Q) {
        Q.Words = new Vector<String>(Arrays.asList(Q.Text.split(" ")));
    }

    public static void Stem(Question Q) {
        ArabicStemmer Stemmer = new ArabicStemmer();
        for (String Word : Q.Words) {
            Q.Stems.add(Stemmer.stemWord(Word));
        }
    }
}
