import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    System.out.println(totalScore);
    System.out.println(totalScore.size() + " students took the exam!");
    int total =0;
    for (int score : totalScore){
      total += score;
    }
    double average = (double)total/totalScore.size();
    System.out.println("The average score is " + average);

    // find the highest score\
    int high = 0;
    int num = 0;
    for (int score : totalScore){
      num = score;
      if(num > high){
        high = num;
      }
    }
    System.out.println("The highest score is " + high);

    // find the lowest score\
    int low = 99999;
    int num1 = 0;
    for(int score : totalScore){
      num1 = score;
      if(num1 < low){ 
        low = num1;
      }
    }
    System.out.println("The lowest score is " + low);
  }

}
