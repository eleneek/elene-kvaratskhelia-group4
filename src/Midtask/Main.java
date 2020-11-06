package Midtask;

import Task1.Task1;
import Task2.GenerateString;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	Task1 task1 = new Task1();
//	task1.assignValues();
//	task1.assignValuesToArray();
//	task1.getMaximums();
//	task1.printValuesOfArray();
//	task1.getNumOfSevenDivisions();

	GenerateString task2 = new GenerateString();
	task2.generateText();
	task2.createrandomgeneratedWords();
    }
}
