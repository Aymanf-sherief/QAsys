/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QAnalysis;

import java.util.Vector;

/**
 *
 * @author ayman
 */
public class Question {

    protected String Text;
    protected Vector<String> Words;
    protected Vector<String> Stems;
    protected Vector<String> Tags;
    protected String StemmerResult;

    public Question(String input) {
        Text = input;
        Words = new Vector<String>();
        Stems = new Vector<String>();
    }

//setters
    //getters
    public String getText() {
        return Text;
    }

    public Vector<String> getWords() {
        return Words;
    }

    public String toString() {
        StringBuilder answer = new StringBuilder();
        for (Object Word : Stems) {
            System.out.println(Word.toString());
            answer.append(Word.toString() + "\n");
        }
        return StemmerResult;
    }

}
