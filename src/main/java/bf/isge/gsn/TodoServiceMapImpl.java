package bf.isge.gsn;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TodoServiceMapImpl implements TodoService {
    // private Todo tod;
    private final Map<Integer, Todo> todoMap = new HashMap<>();

    @Override
    public Todo createTodo(int id, String description, LocalDate createdAt){
        if(this.searchTodo(id) == null){
            Todo tod = new Todo(id, description, createdAt);
            this.todoMap.put(id, tod);
            return  tod;
        }
        return null;
    }

    @Override
    public void updateTodo(int id, String description, LocalDate createdAt){
        Todo tod;
        tod = this.searchTodo(id);
        if(tod != null){
            tod.setId(id);
            tod.setDescription(description);
            tod.setCreatedAt(createdAt);
        }
    }

    @Override
    public void deleteTodo(Todo todo){
        todoMap.remove(todo.getId());
    }
    @Override
    public void deleteTodoById(int id){
        todoMap.remove(id);
    }

    @Override
    public Todo searchTodo(int id){
       return todoMap.get(id);
    }

    @Override
    public List<Todo> listTodo(){
        return this.todoMap.values().stream().collect(Collectors.toList());
    }
}
