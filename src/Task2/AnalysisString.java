package Task2;

import java.util.Random;

public class AnalysisString extends  Thread {
    private GenerateString generateString;
    private String text;
    Random random = new Random();

    public AnalysisString(GenerateString generateString) {
        this.generateString = generateString;
        setText();
    }

    public void setText(){
        this.text = generateString.getTextValue();
    }

    synchronized public void replaceSymbol(){
        for (char i: text.toCharArray()) {
            if(i != '$'){
                int number  = random.nextInt(text.length());
                char character = text.charAt(number);
                String newText = text.replace(character,'$');
                System.out.println(newText);
            }

        }

    }

    public void run(){
        replaceSymbol();
    }

}


