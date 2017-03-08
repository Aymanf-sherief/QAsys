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


public class Question {

    protected String QText;
    protected String[] QWords;

    public Question(String input) {
        QText = input;
    }

//setters
    //getters
    public String getText() {
        return QText;
    }

    public String[] getWords() {
        return QWords;
    }

}

