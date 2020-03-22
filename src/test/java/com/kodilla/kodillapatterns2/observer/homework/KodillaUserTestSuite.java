package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class KodillaUserTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Mentor mentorJohn = new Mentor("John Wick");
        UserTaskQueue userTaskQueue = new UserTaskQueue("XXX");
        KodillaUser markHunt = new KodillaUser("Mark Hunt");
        KodillaUser johnDoe = new KodillaUser("John Doe");
        KodillaUser peterSmith = new KodillaUser("Peter Smith");

        markHunt.registerObservers(mentorJohn);
        johnDoe.registerObservers(mentorJohn);

        //When
        markHunt.addTask("Create loop");
        markHunt.addTask("Find solution");
        johnDoe.addTask("Create class");
        peterSmith.addTask("Do nothing");

        //Then
        Assert.assertEquals(3, mentorJohn.getUpdateCount());




    }

}