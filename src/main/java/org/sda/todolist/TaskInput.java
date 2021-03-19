package org.sda.todolist;

import javax.imageio.IIOException;
import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TaskInput {
    private int option, TaskNo;
    private boolean setExit = false;
    private String input1, input2, input3, input4;
    private TodoList todo;
    private Date Date;
    private int editfield;
    DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");


    //This method will display the main menu and display all the options for User to select.
    public  void displayMainMenu() throws Exception{

        todo = new TodoList();

        //Read frominput Text file.
        try{
            todo.raderfile();
        }
        catch (IIOException d)
        {
            System.out.println("Error while reading file");
        }

        System.out.println("\n>>>> WELCOME TO TODO LIST APP");
        System.out.println("=======================================\n");
        System.out.println("(1) Show Task List (by date or project)");
        System.out.println("(2) Add New Task ");
        System.out.println("(3) Edit Task ");
        System.out.println("(4) Delete Task ");
        System.out.println("(5) Save and Quit\n ");
        System.out.print("Please Select your Option: ");
        option = scanInput();

        while(!(setExit))
        {


            if(option == 1)
            {
                displayTask();
            }


            if(option == 2)
            {
                addTask();
            }

            if(option == 3)
            {
                editTask();
            }


            if (option == 4)
            {
                deleteTask();
            }


            if(option == 5)
            {
                SaveandExitTask();
            }
        }

    }

    private int scanInput() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }


    public String scanString()
    {
        Scanner scan = new Scanner(System.in);
        String St = scan.nextLine();
        return St;
    }

    //This method take input from User to add the task.
    private void addTask() throws ParseException
    {
        System.out.println("Enter the Task name   :  ");
        input1 = scanString();
        System.out.println("Enter the ProjectName :  ");
        input2 = scanString();
        System.out.println("Enter the Status      :  ");
        input3 = scanString();
        System.out.println("Enter the TaskDate(dd-mm-yyyy)      :  ");
        input4 = scanString();
        try {
            Date = formatter.parse(input4);

        }
        catch (ParseException b)
        {
            System.out.println("Please Enter the correct Date");
        }

        try {
            todo.addTasklist(input1, input2, input3, Date);
            System.out.println("Task added Successfully!! Please select Another Option to proceed Further");
            System.out.println("(1) Show Task List (by date or project)");
            System.out.println("(2) Add New Task ");
            System.out.println("(3) Edit Task ");
            System.out.println("(4) Delete Task ");
            System.out.println("(5) Save and Quit\n ");
            option = scanInput();

        } catch (Exception c) {
            System.out.println("Error while adding a Task");

        }

    }

    //This Method will display the edit Menu to the User
    private void editTask() throws Exception {
        System.out.println("Enter the Task Num you want to Edit");
        TaskNo = scanInput();
        TaskNo = TaskNo - 1;
        System.out.println("Enter the option you want to Edit");
        System.out.println("1.Task Name  ");
        System.out.println("2.Project Name ");
        System.out.println("3.Task Status ");
        System.out.println("4.Date ");
        option = scanInput();
        if(option ==1)
        {
            System.out.println("Edit Task Name : ");
            input1 = scanString();
            editfield = 1;
        try {
            todo.editTasklist(TaskNo,input1,editfield);
        }catch (Exception e){
            System.out.println("Error while Editing");
        }
            System.out.println("Please select Another Option to proceed Further");
            System.out.println("(1) Show Task List (by date or project)");
            System.out.println("(2) Add New .Task ");
            System.out.println("(3) Edit Task ");
            System.out.println("(4) Delete Task ");
            System.out.println("(5) Save and Quit\n ");
            option = scanInput();

        }
        if(option ==2)
        {
            System.out.println("Enter the Project Name : ");
            input2 = scanString();
            editfield = 2;

        try {
            todo.editTasklist(TaskNo,input2,editfield);
        }
        catch (Exception c){
            System.out.println("Error while Editing");
        }
            System.out.println("Please select Another Option to proceed Further");
            System.out.println("(1) Task List (by date or project)");
            System.out.println("(2) Add New Task ");
            System.out.println("(3) Edit Task ");
            System.out.println("(4) Delete Task ");
            System.out.println("(5) Save and Quit\n ");
            option = scanInput();

        }
        if(option ==3)
        {
            System.out.println("Edit the Status :");
            input3 = scanString();
            editfield = 3;

        try {
            todo.editTasklist(TaskNo,input3,editfield);
        }
        catch (Exception f){
            System.out.println("Error while Editing");
        }
            System.out.println("Please select Another Option to proceed Further");
            System.out.println("(1) Show Task List (by date or project)");
            System.out.println("(2) Add New Task ");
            System.out.println("(3) Edit Task ");
            System.out.println("(4) Delete Task ");
            System.out.println("(5) Save and Quit\n ");
            option = scanInput();

        }
        if(option ==4)
        {
            System.out.println("Edit the TaskDate(dd-mm-yyyy)");
            input4 = scanString();
            editfield = 4;

        try {
            todo.editTasklist(TaskNo,input4,editfield);
        }
        catch (Exception f){
            System.out.println("Error while Editing");
        }
            System.out.println("Please select Another Option to proceed Further");
            System.out.println("(1) Show Task List (by date or project)");
            System.out.println("(2) Add New Task ");
            System.out.println("(3) Edit Task ");
            System.out.println("(4) Delete Task ");
            System.out.println("(5) Save and Quit\n ");
            option = scanInput();

        }

    }

    //This method will ask User to delete the task
    private void deleteTask() throws Exception {
        System.out.println("Enter the TaskNo to be deleted ");
        TaskNo =scanInput();
        TaskNo = TaskNo - 1;
        try {
            todo.deleteTasklist(TaskNo);
        }
        catch (Exception e)
        {
            System.out.println("Error occured to delete a Task");
        }
        System.out.println("Please select Another Option to proceed Further");
        System.out.println("(1) Show Task List (by date or project)");
        System.out.println("(2) Add New Task ");
        System.out.println("(3) Edit Task ");
        System.out.println("(4) Delete Task ");
        System.out.println("(5) Save and Quit\n ");
        option = scanInput();


    }

    //This method will display User to Save the existing task and Exit
    private void SaveandExitTask() throws Exception{
        try {
            todo.outputWriter();
        }
        catch (Exception a)
        {
            System.out.println("Error occured to write into the file");
        }
        System.out.println("Your All Task are saved!!");
        System.out.println("See you soon!! Have a nice day!");
        setExit = true;
    }

    //This method display the option to User.
    private void displayTask()
    {
        todo.displayInput();
        System.out.println("Please select Another Option to proceed Further");
        System.out.println("(1) Show Task List (by date or project)");
        System.out.println("(2) Add New Task ");
        System.out.println("(3) Edit Task ");
        System.out.println("(4) Delete Task ");
        System.out.println("(5) Save and Quit\n ");
        option = scanInput();
    }


    }


