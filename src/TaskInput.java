
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TaskInput {
    private int option, TaskNo;
    private boolean setExit = false;
    private String inputText1, inputText2, inputText3, inputText4;
    private TodoList demo;
    private Date date;
    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public void displayOption() {
        demo = new TodoList();


        while (!(setExit)) {
            if (option == 1) {
                displayTask();
            }

            if (option == 2) {
                addTask();
            }
            if (option == 3) {
                editTask();
            }
            if (option == 4) {
                deleteTask();
            }
            if (option == 5) {
                saveTask();
            }

        }
    }

    public int scanInput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    public String scanString() {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        return l;
    }

    private void displayTask() {
        demo.displayInput();
        System.out.println("Enter the option");
        option = scanInput();
    }

    private void addTask() {
        System.out.println("Enter the Project name : ");
        inputText1 = scanString();
        System.out.println("Enter the ProjectName : ");
        inputText2 = scanString();
        System.out.println("Enter the Status      :  ");
        inputText3 = scanString();
        System.out.println("Enter the TaskDate(yyyy-MM-dd)      :  ");
        inputText4 = scanString();

    }

    private void editTask() {
        System.out.println("Enter the Task no want to Edit");
        TaskNo = scanInput();
        TaskNo = TaskNo - 1;
        System.out.println("Enter the field you want to Edit");
        System.out.println("1.Task Name  ");
        System.out.println("2.Project Name ");
        System.out.println("3.Status ");
        System.out.println("4.Date");
        option = scanInput();
    }

    private void deleteTask()
   {
       System.out.println("Enter the Task no want to Delete");
       TaskNo = TaskNo - 1;
       System.out.println("Enter the option");
       option = scanInput();

   }

   private void saveTask()
   {
      setExit = true;
   }

}
