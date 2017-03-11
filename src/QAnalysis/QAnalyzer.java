/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QAnalysis;

import static QAnalysis.QAnalyzer.Stem;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.SentenceUtils;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
        Tag(Q);
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

    public static void Tag(Question Q) {
        InputStream is = new ByteArrayInputStream(Q.Text.getBytes());

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        MaxentTagger tagger = new MaxentTagger("models/arabic.tagger");
        List<List<HasWord>> sentences = MaxentTagger.tokenizeText(br);
        for (List<HasWord> sentence : sentences) {
            List<TaggedWord> tSentence = tagger.tagSentence(sentence);
            System.err.println(SentenceUtils.listToString(tSentence, false));
            Q.Tags = new Vector(Arrays.asList(SentenceUtils.listToString(tSentence, false).split(" ")));

        }
    }
}
