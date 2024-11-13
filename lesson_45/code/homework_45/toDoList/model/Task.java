package homework_45.toDoList.model;

import java.time.LocalDate;

public class Task {

    private long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(long id, String title, String description, LocalDate dueDate, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;

        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", dueDate=").append(dueDate);
        sb.append(", isCompleted=").append(isCompleted);
        sb.append('}');
        return sb.toString();
    }
}
