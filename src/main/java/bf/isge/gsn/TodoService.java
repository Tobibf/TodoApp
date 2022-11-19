package bf.isge.gsn;

import java.time.LocalDate;
import java.util.List;

public interface TodoService {
    Todo createTodo(int id, String description, LocalDate createdAt);

    void updateTodo(int id, String description, LocalDate createdAt);

    void deleteTodo(Todo todo);

    void deleteTodoById(int id);

    Todo searchTodo(int id);

    List<Todo> listTodo();
}
