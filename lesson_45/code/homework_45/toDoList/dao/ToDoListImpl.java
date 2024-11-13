// ToDoListImpl.java
package homework_45.toDoList.dao;

import homework_45.toDoList.model.Task;

import java.io.*;
import java.time.LocalDate;

public class ToDoListImpl implements ToDoList {
    private Task[] tasks;
    private int size;
    private static final String FILE_PATH = "tasks.dat";

    public ToDoListImpl(int capacity) {
        this.tasks = new Task[capacity];
        this.size = 0;
    }

    @Override
    public boolean addTask(Task task) {
        if (size >= tasks.length) return false;
        tasks[size++] = task;
        return true;
    }

    // Реализация методов для управления задачами
    @Override
    public boolean removeTask(long id) {
        // Реализуйте логику удаления задачи
        return false;
    }

    @Override
    public Task updateTask(long id) {
        // Реализуйте логику обновления задачи
        return null;
    }

    @Override
    public Task findTaskById(long id) {
        // Реализуйте логику поиска задачи по ID
        return null;
    }

    @Override
    public Task[] findTaskByDate(LocalDate dueDate) {
        // Реализуйте логику поиска задачи по дате
        return new Task[0];
    }

    @Override
    public Task findTaskByTitle(String title) {
        // Реализуйте логику поиска задачи по названию
        return null;
    }

    @Override
    public Task[] getPendingTasks() {
        // Реализуйте логику получения всех незавершенных задач
        return new Task[0];
    }

    @Override
    public Task[] getCompletedTasks() {
        // Реализуйте логику получения всех завершенных задач
        return new Task[0];
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(tasks[i]);
        }
    }

    @Override
    public int size() {
        return size;
    }


    public void saveTasksToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(tasks);
            oos.writeInt(size);
            System.out.println("Tasks successfully saved to file.");
        } catch (IOException e) {
            System.err.println("Error saving tasks: " + e.getMessage());
        }
    }


}
