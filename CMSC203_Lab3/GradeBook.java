/* 

 * Class: CMSC203  

 * Instructor: Dr. Grinberg

 * Description: You will be creating a JUnit Test Class for Gradebook.java, (listing 1.1) and you can download it from blackboard. 
Gradebook has two attributes: an array of int called scores to hold scores and scoreSize that indicates how many scores are currently held in the array. This field is initially set to 0. 
 * Due: 02/06/2023

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby_ 

*/ 





import java.util.ArrayList;

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

  
   
   
   
   
 
  
   
   
   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   } 
   public int getScoreSize(){
	   return this.scoresSize;
   }   
   public String toString(){
	      String scoreString = "";
	      for(int i=0;i<scoresSize;i++){
	          scoreString += Double.toString(scores[i]) + " ";
	      }
	   return scoreString; 
   }
   
   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
  
   
   
   
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      if (scoresSize == 0) return 0;
      double smallest = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
}

