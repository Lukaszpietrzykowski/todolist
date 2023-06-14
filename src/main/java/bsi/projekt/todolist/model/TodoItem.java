package bsi.projekt.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class TodoItem {

    private String id;
    private String text;
    private boolean completed;
    private LocalDateTime createdDate;
}
