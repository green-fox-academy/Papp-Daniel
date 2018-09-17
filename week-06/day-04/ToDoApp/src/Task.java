import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Task {
    private long id;
    private String task;
    private boolean isCompleted;
    private LocalDate complatedAt;
    private LocalDate createdAt;


    public Task(String task, boolean isCompleted) {
        this(1, task, isCompleted);
    }

    public Task(long id, String task, boolean isCompleted) {
        this.id = id;
        this.task = task;
        this.isCompleted = false;
        this.createdAt = LocalDate.now();
        this.complatedAt = complatedAt;
    }

    public long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString() {
        String a = "completed in ";
        if(isCompleted){
            return String.format("%s - [%s] %s %s %s", id, getXIfCompleted(), task, a,formatDuration());
        }
        return String.format("%s - [%s] %s", id, getXIfCompleted(), task);

    }

    private String getXIfCompleted() {
        if (isCompleted) {
            return "X";
        }

        return " ";
    }

    public Period completionTime() {
        Period period = Period.between(createdAt,complatedAt);
        return period;
    }
    public String formatDuration() {
        long seconds = completionTime().getDays();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }

    public void setComplatedAt(LocalDate complatedAt) {
        this.complatedAt = complatedAt;
    }
}


