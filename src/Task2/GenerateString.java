package Task2;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class GenerateString {
    private String text;

    private String[]  georgianWords = new String[]{"ააა", "ბბბბ", "გგგგ", "დდდდ", "ეეეე"};

    private String[] randomGeneratedWords = new String[20];

    String letters = "აბგდევზთიკლმნოპრსტუფ";

    Random random = new Random();
    public void assignValueToText(String text){
        this.text = text;
        archiveTextInFile();
    }

    public String getTextValue(){
        return text;
    }

    public void generateText(){
        String randString = "";
        for(int i = 0; i<georgianWords.length; i++) {
            int number = random.nextInt(georgianWords.length);
            randString += georgianWords[number];
        }

        assignValueToText(randString);
    }

    public void createrandomgeneratedWords(){
        String newWord = "";
        int newWordLength = 10;

        for( int i =0 ; i< randomGeneratedWords.length; i++) {
            for(int j = 0; j <newWordLength; j++ ) {
                newWord += letters.charAt(random.nextInt((letters.length())));
                randomGeneratedWords[i] = newWord;
            }

            newWord = "";
        }
        System.out.println(Arrays.toString(randomGeneratedWords));
    }

    public void archiveTextInFile() {
        File file = new File("text.txt");
        if (file.isFile()){
            file.delete();
        }
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(file, true));
            bf.write(getTextValue() +"\n" );
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
