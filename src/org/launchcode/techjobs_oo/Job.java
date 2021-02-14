package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){

        this.id = nextId;
        nextId++;



    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();//constructor calls the first in order to initialize the id field.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;
    }

    @Override
    public int hashCode() {
        return id;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

       ArrayList<String> newArrayList = new ArrayList<>();//arrayListConstructorData that has the replaced null with "Data not available"
        String dataNotAvailable = "Data not available";
        ArrayList<String> arrayListConstructorData = new ArrayList<>();//arrayListConstructorData containing the data passed in from the constructor


            Collections.addAll(arrayListConstructorData, this.getName(), this.getEmployer().getValue(), this.getLocation().getValue(), this.getPositionType().getValue(), this.getCoreCompetency().getValue());



            for (int i = 0; i < arrayListConstructorData.size(); i++) {//loop through the the arrayListConstructorData containing constructor data
                if (arrayListConstructorData.get(i) == null || arrayListConstructorData.get(i).isEmpty()) {//if arrayListConstructorData at this index is null or is empty then..
                    arrayListConstructorData.set(i, dataNotAvailable);//...replace that index i data with the string "Data not available"...
                    newArrayList.add(arrayListConstructorData.get(i));//...then add the the replaced index to the new array list
                } else {
                    newArrayList.add(arrayListConstructorData.get(i));//if it isnt null we still add the data at this index to the new array list
                }
            }


        //grab the new array list data and place in the toString to be returned in this format (null replaced with "Data not available")


           return String.format("\nID:%s\nName:%s\nEmployer:%s\nLocation:%s\nPosition Type:%s\nCore Competency:%s\n",
                   this.getId(),newArrayList.get(0),newArrayList.get(1),newArrayList.get(2),newArrayList.get(3),newArrayList.get(4));








    }
}
