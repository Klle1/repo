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

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
    GradeBook g1;
    GradeBook g2;
    
    @Before
    public void setUp() {
        //Creating two new object of GradeBook.
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        //Adding the score to each object.
        g1.addScore(50);
        g1.addScore(75);
        g2.addScore(80);
        g2.addScore(90);
    }
    
    @After
    public void tearDown() {
        //Setting the both object to null.
        g1 = null;
        g2 = null;
    }

    @Test
    public void testSum(){
        //Checking the actual sum and sum returned by the sum() are equivalent.
        assertEquals(125,g1.sum(),0.001);
        assertEquals(170,g2.sum(),0.001);
    }
    @Test
    public void testMinimum(){
        //Checking if the minimum score returned by minimum() is equals to actual minimum value.
        assertEquals(50,g1.minimum(),0.001);
        assertEquals(80,g2.minimum(),0.001);
    }
    @Test
    public void addScoreTest(){
        //Checking if the returned string is equal to expected string.
        assertTrue(g1.toString().equals("50.0 75.0 "));
        assertTrue(g2.toString().equals("80.0 90.0 "));
    }
    @Test 
    public void finalScoreTest(){
        //Since there are two scores in both g1 and g2 the finalScore will return sum of all scores - minimum score.
        assertEquals(75,g1.finalScore(),0.001);
        assertEquals(90,g2.finalScore(),0.001);
    }
    
}
