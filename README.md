#Todo-List App

This application is a Java program to create and store you personal tasks as Todo List.

#Basic Overview:

This application has available option to select from Menu. This application has feature to save all User Tasks in the Data so when User open next time it will resume its state.

#Basic Features:

- org.sda.todolist.Task Name
- org.sda.todolist.Task Date
- org.sda.todolist.Task Status
- Project Name

#Basic Functionality:
- add org.sda.todolist.Task
- edit org.sda.todolist.Task
- mark as org.sda.todolist.Task done
- Save org.sda.todolist.Task
- remove the org.sda.todolist.Task

#How to get started:
Required Software to be Installed:*


-IntelliJ IDEA 2020.3.2

#Class: org.sda.todolist.Task.java

- In org.sda.todolist.Task.java class four fields are created: TaskName, ProjectName, TaskStatus, TaskDate.
- Getter and Setter of all the fields are generated.


#Class:org.sda.todolist.TodoList.java

-In this class All the methods for task records are generated.

-Display() method will create the org.sda.todolist.Task object in tasklist.

-addTasklist() method will add task recored to the arraylist of task.

-editTasklist() method  will edit Stored org.sda.todolist.Task based on the field user will select.

-deleteTasklist() method will delete the org.sda.todolist.Task recored from the Arraylist of task which is already stored.

#Class:org.sda.todolist.TaskInput.java

-In this class all the methods are created for user input.

- Displaymainmenu() method will display org.sda.todolist.Main Menu of the Todo Application.User will be asked to choose one action among four options.

- AddTask() method will ask User to enter the values to add a new org.sda.todolist.Task.

- editTask() method will ask User to select the field which has to be edited.

- deleteTask() method will ask user for deleting the task from recored.

- saveandexitTask() method will provide the functionality of saving the task.

