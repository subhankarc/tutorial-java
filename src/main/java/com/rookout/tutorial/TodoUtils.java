package com.rookout.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

public class TodoUtils {

    
    public static void addTodoRecord(TodoRecord newTodoRecord){
        TodoStorage todos = TodoStorage.getInstance();
        // The bug in here in is for the bughunt example
        String todoTitle = newTodoRecord.getTitle().replaceAll("[^a-zA-Z0-9\\s]+", "");
        newTodoRecord.setTitle(todoTitle);
        todos.add(newTodoRecord);
    }
}
