package bf.isge.gsn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TodoServiceListImpl implements TodoService {

   // private Todo tod;
    private final List<Todo> todoList = new ArrayList<>();

    public Todo createTodo(int id, String description, LocalDate createdAt){
        if(this.searchTodo(id) == null){
            Todo tod = new Todo(id, description, createdAt);
            this.todoList.add(tod);
            return  tod;
        }
      return null;
    }

    public void updateTodo(int id, String description, LocalDate createdAt){
        Todo tod;
        tod = this.searchTodo(id);
          if(tod != null){
              tod.setId(id);
              tod.setDescription(description);
              tod.setCreatedAt(createdAt);
          }
    }

    public void deleteTodo(Todo todo){
        todoList.remove(todo);
    }

    @Override
    public void deleteTodoById(int id) {

    }

    public Todo searchTodo(int id){
        Optional<Todo> any = todoList.stream().filter(todo1 -> todo1.getId() == id).findAny();

        return any.orElse(null);
    }

    public List<Todo> listTodo(){
        return this.todoList;
    }
}
