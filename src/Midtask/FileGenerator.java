package Midtask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    int cvladi = 10;
    public void SaveToFile() {
        File file = new File("Name.txt");
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(file, true));
            bf.write("ragaca teqsti:"+"\t"+ cvladi +"\n" ); // xazis generireba
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DeleteFiles(){
        File file = new File("Name.txt");
        if (file.isFile()){
            file.delete();
        }
    }
}
