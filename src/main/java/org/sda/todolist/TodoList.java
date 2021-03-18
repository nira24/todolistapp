package org.sda.todolist;

import javax.swing.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//In this class
public class TodoList {

    private int option, TaskNo, TaskName, ProjectName, Status, TaskDate;
    private boolean setExit = false;
    private String inputText1, inputText2, inputText3, inputText4;
    private int StatusOpen = 0, StatusClosed = 0;
    DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    String filename = null;

    public ArrayList<Task> tasklist;

    //creating object of Todolist
    public TodoList() {
        tasklist = new ArrayList<Task>();
    }

    //Adding created task object in ArrayList with TaskName, ProjectName,TaskStatus and Date of that org.sda.todolist.Task.
    public void displayInput() {

        int cunt = 0;
        int select;
        System.out.println("Please Enter your choice - for sorting");
        System.out.println("1.Sort based on Date");
        System.out.println("2.Sort based on Project");

        select = scanInput();

        if (select == 1) {

            tasklist.sort((Task t1, Task t2) -> t1.getTaskDate().compareTo(t2.getTaskDate()));
        } else if (select == 2) {

            tasklist.sort((Task t1, Task t2) -> t1.getProjectName().compareTo(t2.getProjectName()));
        }
        String displayinput = "%-10s %-12s %-12s %-10s %-10s";
        System.out.println(String.format(displayinput, "  TaskNO", "TaskName", " ProjectName", " Status", "  Date"));
        System.out.println(String.format(displayinput, "---------","----------","-----------"," --------","---------"));

        for (Task file : tasklist) {
            cunt = cunt + 1;

            System.out.println(String.format(displayinput, cunt, file.getTaskName(), file.getProjectName(), file.getTaskStatus(), formatter.format(file.getTaskDate())));
            String changeCase = file.getTaskStatus().toUpperCase();

            if (changeCase.equals("OPEN")) {

                StatusOpen = StatusOpen + 1;
            }
            else if (changeCase.equals("CLOSED"))
            {
                StatusClosed = StatusClosed + 1;
            }
        }
        System.out.println("Number of Tasks Open: " + StatusOpen + "  Number of Tasks Closed: " + StatusClosed);
        StatusClosed = 0;
        StatusOpen = 0;

    }

    public void raderfile() throws IOException {
        Date date = null;

        JFileChooser chooser = new JFileChooser();
        int value = chooser.showOpenDialog(null);
        File file = null;
        if(value == JFileChooser.APPROVE_OPTION)
        {
            file = chooser.getSelectedFile();

        }
        if(file != null)
        {
            filename = file.getPath();
        }

        BufferedReader tasklistFile = new BufferedReader(new FileReader(filename));
        String st;
        try{
            while ((st = tasklistFile.readLine()) != null)
            {
            String st1 = st.toString();
            String[]arr = st1.split(";");
                try{
                    date = formatter.parse(arr[3]);
                }catch(ParseException p){
                    System.out.println("Error while reading the Date field");
                }

                tasklist.add(new Task(arr[0],arr[1],arr[2],date));
            }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputWriter() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

        for (Task out : tasklist) {
            writer.write(out.getTaskName() + ";" + out.getProjectName() + ";" + out.getTaskStatus() + ";" + formatter.format(out.getTaskDate()) + "\n");
        }

        writer.close();
    }

    //Add a new org.sda.todolist.Task
    public void addTasklist(String TaskName, String ProjectName, String TaskStatus, Date TaskDate) throws Exception {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date today = new Date();
        Date todayWithZeroTime = formatter.parse(formatter.format(today));
        Date inputDateWithZeroTime = formatter.parse(formatter.format(TaskDate));

        if (inputDateWithZeroTime.compareTo(todayWithZeroTime) < 0) {

            System.out.println("Please Enter the correct Date");

        } else {
            tasklist.add(new Task(TaskName, ProjectName, TaskStatus, TaskDate));
        }
    }

    //Edit the org.sda.todolist.Task List
    public void editTasklist(int editIndex, String inputField, int changeField) throws IOException, ParseException {
        Date date = null;

        if (changeField == 1) {
            tasklist.set(editIndex, new Task(inputField, tasklist.get(editIndex).getProjectName(), tasklist.get(editIndex).getTaskStatus(), tasklist.get(editIndex).getTaskDate()));
        }
        if (changeField == 2) {
            tasklist.set(editIndex, new Task(tasklist.get(editIndex).getTaskName(), inputField, tasklist.get(editIndex).getTaskStatus(), tasklist.get(editIndex).getTaskDate()));
        }
        if (changeField == 3) {
            tasklist.set(editIndex, new Task(tasklist.get(editIndex).getTaskName(), tasklist.get(editIndex).getProjectName(), inputField, tasklist.get(editIndex).getTaskDate()));
        }
        if (changeField == 4) {

            try {

                date = formatter.parse(inputField);

            } catch (ParseException p) {
                System.out.println("Error occured while editing the TaskList");
            }
            DateFormat formatter = new SimpleDateFormat(("dd-MM-yyyy"));

            Date today = new Date();
            Date todayWithZeroTime = formatter.parse(formatter.format(today));
            Date inputDateWithZeroTime = formatter.parse(formatter.format(date));

            if (inputDateWithZeroTime.compareTo(todayWithZeroTime) < 0) {

                System.out.println("Date Entered should be greater than today");

            } else {

                tasklist.set(editIndex, new Task(tasklist.get(editIndex).getTaskName(), tasklist.get(editIndex).getProjectName(), tasklist.get(editIndex).getTaskStatus(), date));
            }
        }
    }

    public void deleteTasklist(int deleteindex) throws Exception {
        tasklist.remove(deleteindex);
        System.out.println("org.sda.todolist.Task deleted Successfully");
    }

    public int scanInput() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        return a;
    }

}
