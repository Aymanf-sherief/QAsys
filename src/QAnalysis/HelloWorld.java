package QAnalysis;


public class HelloWorld {
    
     public static void main(String args[])
    {
        ArabicStemmer Stemmer=new ArabicStemmer();
        String ArabicWord="مرحبا";
        System.out.println(Stemmer.stemWord(ArabicWord));
        System.exit(0);
    }
}
