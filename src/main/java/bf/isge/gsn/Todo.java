package bf.isge.gsn;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String description;
    private LocalDate createdAt;

    public Todo(int id, String description, LocalDate createdAt) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
    }

    public Todo() {
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
