package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job job1;
    Job job2;
    Job job3;



    @Before
    public void creatJobObjects(){
         job1 = new Job();
         job2 = new Job();
         job3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

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






}
