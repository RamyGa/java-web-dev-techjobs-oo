package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class JobTest {

   private static Job job1;
   private static Job job2;
   private static Job job3;
   private static Job job4;
   private static Job job5;
   private static Job job6;





    @BeforeClass
    public static void creatJobObjects(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job();
        job6 = new Job("", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    }



    @Test
    public void testSettingJobId(){
        assertEquals(1,job1.getId());
        assertEquals(2, job2.getId());

    }



    @Test
    public void testJobConstructorSetsAllFields(){

        //checks to make sure the instances of said class is made
        assertEquals(3, job3.getId() );
        assertEquals(true, job3.getEmployer() instanceof Employer);
        assertEquals(true, job3.getLocation() instanceof Location);
        assertEquals(true, job3.getPositionType() instanceof PositionType);
        assertEquals(true, job3.getCoreCompetency() instanceof CoreCompetency);


        //checks to make sure the values are set
        assertEquals("Product Tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());


    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job1.equals(job2));
    }

    @Test
    public void test(){
        System.out.println(job6.toString());
    }

    @Test
    public void testJobToStringAndNewLineForName(){
        assertTrue(job3.toString().contains("Name:Product Tester\n"));
        System.out.println(job3);
    }
    @Test
    public void testJobToStringAndNewLineForEmployer(){
        assertTrue(job3.toString().contains("Employer:ACME\n"));
    }
    @Test
    public void testJobToStringAndNewLineForLocation(){
        assertTrue(job3.toString().contains("Location:Desert\n"));
    }
    @Test
    public void testJobToStringAndNewLineForPositionType(){
        assertTrue(job3.toString().contains("Position Type:Quality control\n"));
    }
    @Test
    public void testJobToStringAndNewLineForCompetency(){
        assertTrue(job3.toString().contains("Core Competency:Persistence\n"));
    }














}
