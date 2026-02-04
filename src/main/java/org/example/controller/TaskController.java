package org.example.controller;
import org.example.model.Task;
import org.example.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    public final TaskService service ;

    public TaskController(TaskService service){
        this.service=service;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){return service.createTask(task);}

    @GetMapping
    public List<Task> getAllTasks(){return service.getAllTasks();}

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){return service.getTaskById(id);}

    @PutMapping("/{id}/status")
    public Task updateStatus(@PathVariable long id , @RequestBody Map<String,String>body){
        return service.updateStatus(id , body.get("status"));
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id){service.deleteTask(id);}



}
