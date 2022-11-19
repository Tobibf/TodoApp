package bf.isge.gsn;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TodoService todoService = new TodoServiceListImpl();

        todoService.createTodo(1, "Tom Sawyer", LocalDate.ofEpochDay(2020-12-24));
        todoService.createTodo(2, "Ousmane SINI", LocalDate.ofEpochDay(2010-05-14));
        todoService.createTodo(1, "Cheik SANA", LocalDate.ofEpochDay(2010-05-20));


        System.out.println(todoService.listTodo());
    }
}