
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TaskInput {
    private int option, TaskNo;
    private boolean setExit = false;
    private String input1, input2, input3, input4;
    private TodoList todo;
    private Date date;
    private int editfield;
    DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
    private Date Date;

    //This method will display the main menu and display all the options for User to select.
    public  void displayMainMenu() throws Exception{

        todo = new TodoList();

        System.out.println("\nWELCOME TO TODO LIST APP");
        System.out.println("============================\n");
        System.out.println("Pick an option:");
        System.out.println("(1) Show Task List (by date or project)");
        System.out.println("(2) Add New Task ");
        System.out.println("(3) Edit Task ");
        System.out.println("(4) Delete Task ");
        System.out.println("(5) Save and Quit\n ");
        System.out.print("Please enter your option: ");
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
                saveAndexitTask();
            }
        }

    }

    private int scanInput() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }

    //Read the input FileReader
    public String scanString()
    {
        Scanner scan = new Scanner(System.in);
        String St = scan.nextLine();
        return St;
    }

    //Add Task
    private void addTask() throws Exception
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
        catch (Exception b)
        {
            System.out.println("Error");
        }
        try {

            todo.addTasklist(input1, input2, input3, Date);
        } catch (Exception c) {
            System.out.println("Enter the option");
            option = scanInput();
        }
    }

    //This Method will display the edit Menu to the User
    private void editTask() throws Exception {
        System.out.println("Enter the Task no want to Edit");
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

            todo.editTasklist(TaskNo,input1,editfield);

        }
        if(option ==2)
        {
            System.out.println("Enter the Project Name : ");
            input2 = scanString();
            editfield = 2;

            todo.editTasklist(TaskNo,input2,editfield);

        }
        if(option ==3)
        {
            System.out.println("Edit the Status :");
            input3 = scanString();
            editfield = 3;

            todo.editTasklist(TaskNo,input3,editfield);


        }
        if(option ==4)
        {
            System.out.println("Edit the TaskDate(dd-mm-yyyy)");
            input4 = scanString();
            editfield = 4;

            todo.editTasklist(TaskNo,input4,editfield);


        }

    }

    //Delete Task
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


    }

    //Save and Exit Task
    private void saveAndexitTask() throws Exception{
        try {
            todo.outputWriter();
        }
        catch (Exception a)
        {
            System.out.println("Error occured to write into the file");
        }
        setExit = true;
    }
    private void displayTask()
    {
        todo.displayInput();
        System.out.println("Enter the option");
        option = scanInput();
    }


    }


