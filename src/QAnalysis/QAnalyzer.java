/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QAnalysis;

import static QAnalysis.QAnalyzer.Stem;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Stem Stemmer = new Stem(Q.Text);
        System.out.println(Stemmer.displayText());
        Q.StemmerResult = Stemmer.displayText();
        Q.Stems = Stemmer.getStemsAsVector();
    }

//    public static void Tag(Question Q) {
//        try {
//            String dataDirectory = new StringBuffer(System.getProperty("user.dir") + System.getProperty("file.separator")
//                    + "data" + System.getProperty("file.separator")).toString();
//            System.out.println(dataDirectory);
//            POSTagger tagger = new POSTagger(dataDirectory);
//            ArabicNER ner = new ArabicNER(dataDirectory, tagger);
//            Collections.copy(Q.Tags, ner.tag(Q.Text, true));
//        } catch (IOException ex) {
//            Logger.getLogger(QAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(QAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(QAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
