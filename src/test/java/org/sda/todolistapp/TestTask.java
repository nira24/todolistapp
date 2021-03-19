package org.sda.todolistapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;

import org.junit.Test;
import org.sda.todolist.Task;
import org.sda.todolist.TodoList;


public class TestTask {
    Task task;

    String validTaskName = "Test TaskName";
    String validProjectName = "Test ProjectName";
    String validTaskStatus = "Test Status";
    Date validDate;
    DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    


    public void setUp() throws Exception {
        try {
            validDate = formatter.parse("23-03-2021");
            task = new Task(validTaskName, validProjectName, validTaskStatus, validDate);
        } catch (Exception e) {
            System.out.println("There are few errors in the testing of Task class");
            System.out.println("Following message could be helpful to identify the cause:");
            System.out.println(e.getMessage());
        }
    }

    //This method will validate the task.setTitle() method for null as invalid parameter
    // which should result as NullPointerException
    @Test
    public void testNullTaskName() {
        boolean success = false;

        try {
            task.setTaskName(null);
            fail("should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            success = true;
        }

        assertEquals(true, success);
    }


    //This method will validate the task.setTaskName() method for an empty string "" as invalid parameter
    //which should result as NullPointerException
    @Test
    public void testEmptyTaskName() {
        boolean success = false;

        try {
            task.setTaskName("");
            fail("should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            success = true;
        }

        assertEquals(true, success);
    }


    //This method will validate the task.setProjectName() method for null as invalid parameter
    // which should result as NullPointerException
    @Test
    public void testNullProjectName() {
        boolean success = false;

        try {
            task.setProjectName(null);
            fail("should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            success = true;
        }

        assertEquals(true, success);
    }

    //This method will validate the task.setProjectName() method for an empty string  as invalid parameter
    //which should result as NullPointerException
    @Test
    public void testEmptyProjectName() {
        boolean success = false;

        try {
            task.setProjectName("");
            fail("should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            success = true;
        }

        assertEquals(true, success);
    }

    //This method will validate the task.setStatus() method for null as invalid parameter
    // which should result as NullPointerException
    @Test
    public void testNullStatus() {
        boolean success = false;

        try {
            task.setTaskStatus(null);
            fail("should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            success = true;
        }

        assertEquals(true, success);
    }

    //This method will validate the task.setTaskStatus() method for an empty string  as invalid parameter
    //which should result as NullPointerException
    @Test
    public void testEmptyStatus() {
        boolean success = false;

        try {
            task.setTaskStatus("");
            fail("should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            success = true;
        }

        assertEquals(true, success);
    }


    //This method will validate the task.setTaskDate() method with a wrong format date as parameter
    @Test
    public void testIncorrectFormatDueDate() throws ParseException {
        boolean success = false;

        try {
            task.setTaskDate(formatter.parse("24-13-2021"));
            fail("should have thrown a DateTimeParseException");
        } catch (ParseException e) {
            success = true;
        }

        assertEquals(true, success);
    }

    @Test
    public void testPastDueDate() throws ParseException {
        boolean success = false;

        try {
            task.setTaskDate(formatter.parse("01-02-2020"));
            fail("should have thrown a DateTimeParseException");
        } catch (DateTimeException e) {
            success = true;
        }

        assertEquals(true, success);
    }
}
