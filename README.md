#Todo-List App

This application is a Java program to create and store you personal tasks as Todo List.

#Basic Overview:

This application has available option to select from Menu. This application has feature to save all User Tasks in the Data so when User open next time it will resume its state.

#Basic Features:

- Task Name
- Task Date
- Task Status
- Project Name

#Basic Functionality:
- add Task
- edit Task
- mark as Task done
- Save Task
- remove the Task

#How to get started:

#Class: Task.java

- In Task.java class four fields are created: TaskName, ProjectName, TaskStatus, TaskDate.
- Getter and Setter of all the fields are generated.


#Class:TodoList.java

-In this class All the methods for task records are generated.

-Display() method will create the Task object in tasklist.

-addTasklist() method will add task recored to the arraylist of task.

-editTasklist() method  will edit Stored Task based on the field user will select.

-deleteTasklist() method will delete the Task recored from the Arraylist of task which is already stored.

#Class:TaskInput.java

-In this class all the methods are created for user input.

- Displaymainmenu() method will display Main Menu of the Todo Application.User will be asked to choose one action among four options.

- AddTask() method will ask User to enter the values to add a new Task.

- editTask() method will ask User to select the field which has to be edited.

- deleteTask() method will ask user for deleting the task from recored.

- saveandexitTask() method will provide the functionality of saving the task.

