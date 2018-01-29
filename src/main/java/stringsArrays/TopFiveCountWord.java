package stringsArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Read a file and reture top five word count in descending order
    the 14
    on 10
    if 3
    else 1

    Approach :
    Take two array one for word and one for the count.
    read the word and insert it to the word array such that if it is present then increase only the count else add it to word array
    Then find the top 5 occurances of the words

 */
public class TopFiveCountWord {

    int max = 1000;
    static Integer[] intances = new Integer[1000];
    static String[] words = new String[1000];
    int count = 0;

    void insert(String word){

        for(int i =0;i<count;i++) {
            if (words[i].equals(word)) {
                intances[i]++;
                return;
            }
        }
        words[count] = word;
        intances[count] = 1;
        count++;
    }

    int findTop(String word){
        int topCount = intances[0];
        int topIndex = 0;

        for(int i = 0;i<count;i++){
            if(intances[i] > topCount){
                topCount = intances[i];
                topIndex = i;
            }
        }
        intances[topIndex] = 0;
        word = words[topIndex];
        return topCount;

    }
    public static void main(String[] args) throws FileNotFoundException {

        TopFiveCountWord topFiveCountWord = new TopFiveCountWord();
        Scanner inputs = new Scanner(new File("/Users/dhruba.jyoti/Downloads/sample.txt"));
        while(inputs.hasNext()){

            topFiveCountWord.insert(inputs.next());

        }

        for(int i = 0; i<5;i++){
            System.out.println(words[i]+" : "+topFiveCountWord.findTop(words[i]));
        }
    }

}
