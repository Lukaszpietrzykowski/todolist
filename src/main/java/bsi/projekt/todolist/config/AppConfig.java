package bsi.projekt.todolist.config;

import bsi.projekt.todolist.model.TodoItem;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class AppConfig {
    private final List<TodoItem> todoItems = new ArrayList<>();

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }

}
