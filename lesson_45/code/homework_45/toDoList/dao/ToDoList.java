package homework_45.toDoList.dao;

import homework_45.toDoList.model.Task;

import java.time.LocalDate;

public interface ToDoList {

    boolean addTask (Task task);
    boolean removeTask (long id);
    Task updateTask (long id);
    Task findTaskById (long id);
    Task[] findTaskByDate (LocalDate deuData);
    Task findTaskByTitle (String title);
    Task[] getPendingTasks();
    Task[] getCompletedTasks();
    void print();
    int size();





}
