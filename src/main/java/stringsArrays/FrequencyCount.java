package stringsArrays;

import java.io.*;
import java.util.*;

public class FrequencyCount {

    static int wordfrequncy(String main,String sub){

        int count=0,index;
        int subl = sub.length(),mainl = main.length();
        for(int i = 0;i+subl<mainl;i++){

            index = main.indexOf(sub,i);
            if(index>=0){
                count++;
                i = index;
                index = -1;
            }

        }

        System.out.println(sub+" is seen "+count);
        return count;
    }


    static void wordFreq(File f) throws IOException {


        Scanner inputs = new Scanner(f);
        TreeMap<String,Integer> wordcounts = new TreeMap<String, Integer>();
        while(inputs.hasNext()){

           String next = inputs.next().toLowerCase();
           if(!wordcounts.containsValue(next)){
               wordcounts.put(next,1);
           }else
           {
               wordcounts.put(next,wordcounts.get(next)+1);
           }
        }
        NavigableMap nmap = wordcounts.descendingMap();
        System.out.println(nmap);
//        for(String item : wordcounts.keySet()){
//            int times=wordcounts.get(item);
//            if(times >= 2){
//                System.out.println(item+" : "+times);
//            }
//        }



    }
    public static void main(String[] args) throws IOException {
        wordfrequncy("mynameisname","name");
//         File x = new File("/Users/dhruba.jyoti/Downloads/sample.txt");
//         wordFreq(x);
    }
}
