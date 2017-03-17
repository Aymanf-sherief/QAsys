/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import edu.stanford.nlp.ie.machinereading.structure.Span;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.SentenceUtils;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author ayman
 */
public class sentenceProducer {

    public static void makeSentences() throws IOException {
        String dir = "documents";

        String[] FileNames = new File(dir).list();
        StringBuilder sb;
        sb = new StringBuilder();
        String outputDir = "sentences";
        File outDir = new File(outputDir);
        FileUtils.cleanDirectory(outDir);
        outDir.mkdir();
        int i = 0;
        BufferedReader br;
        FileReader fr;

        for (String filename : FileNames) {
            filename = dir + "\\" + filename;
            DocumentPreprocessor dp = new DocumentPreprocessor(filename);

            for (List<HasWord> sentence : dp) {
                String stringSent = SentenceUtils.listToString(sentence, true);

                File sentFile = new File("sentences\\" + i + ".txt");
                sentFile.createNewFile();
                FileWriter fw = new FileWriter(sentFile);
                i++;
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(stringSent.replaceAll("[-A-Za-z-]", ""));
                System.err.println(sentence);
                bw.close();
                fw.close();

            }
        }
//            filename = dir + "\\" + filename;
//
//            fr = new FileReader(filename);
//
//            br = new BufferedReader(fr);
//
//            String s;
//            while ((s = br.readLine()) != null) {
//                sb.append(s);
//
//            }
//            br.close();
//            fr.close();
//        }
//        String cleanString = sb.toString();//.replaceAll("[^\\p{L}\\p{Nd}]+", " ");
//        for (String sentence : cleanString.split(",|\\.")) {
//            
//            File sentFile = new File("sentences\\" + i + ".txt");
//            sentFile.createNewFile();
//            FileWriter fw = new FileWriter(sentFile);
//            i++;
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(sentence);
//            System.err.println(sentence);
//            bw.close();
//            fw.close();
//        }

    }
}
