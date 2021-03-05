import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

//In this class
public class TodoList {

    private int option, TaskNo;
    private boolean setExit = false;
    private String inputText1,inputText2,inputText3,inputText4;


    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    private ArrayList<Task> tasklist = new ArrayList<>();

    public void displayInput()
    {
        System.out.println("Please Enter your choice - for sorting");
        System.out.println("1.Sort based on Date");
        System.out.println("2.Sort based on Project");
    }

}
