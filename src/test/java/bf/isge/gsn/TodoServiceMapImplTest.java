package bf.isge.gsn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TodoServiceMapImplTest {
    @Test
    public void shouldCreateTodoWhenIDDoesNotExist(){
        TodoService ts = new TodoServiceMapImpl();
        Todo tod = ts.createTodo(1, "Good", LocalDate.ofEpochDay(2020-12-24));

        //Tests
        Assertions.assertNotNull(tod);
        Assertions.assertEquals(1,tod.getId());
        Assertions.assertEquals("Good",tod.getDescription());
        Assertions.assertEquals(LocalDate.ofEpochDay(2020-12-24),tod.getCreatedAt());
    }
    @Test
    public void shouldNotCreateTodoWhenIdExists(){
        TodoService ts = new TodoServiceMapImpl();
        Todo tod = ts.createTodo(1, "Good", LocalDate.ofEpochDay(2020-12-24));
        Todo tod2 = ts.createTodo(1, "Bad", LocalDate.ofEpochDay(2020-1-24));

        //Tests
        Assertions.assertNotNull(tod);
        Assertions.assertNull(tod2);
        Assertions.assertEquals(1, ts.listTodo().size());

    }
}
