package bsi.projekt.todolist.service;

import bsi.projekt.todolist.config.AppConfig;
import bsi.projekt.todolist.model.TodoItem;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TodoItemService {

    private final AppConfig appConfig;

    public TodoItem createToDo(TodoItem toDoItem) {
        TodoItem savableToDo = TodoItem.builder()
                .id(UUID.randomUUID().toString())
                .text(toDoItem.getText())
                .createdDate(LocalDateTime.now())
                .build();
        appConfig.getTodoItems().add(savableToDo);
        return savableToDo;
    }

    public List<TodoItem> getAllToDos() {
        return appConfig.getTodoItems();
//        return repository.findAll();
    }

    public void removeToDoItem(String id) {
        appConfig.getTodoItems().removeIf(item -> item.getId().equals(id));
    }

    public void updateToDoItem(TodoItem item) {
        TodoItem itemToModify = appConfig.getTodoItems().stream()
                .filter(todoItem -> todoItem.getId().equals(item.getId()))
                .findFirst()
                .get();
        itemToModify.setText(item.getText());
        itemToModify.setCompleted(item.isCompleted());
        appConfig.getTodoItems().set(appConfig.getTodoItems().indexOf(itemToModify), itemToModify);
    }
}
