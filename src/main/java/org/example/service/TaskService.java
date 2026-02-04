package org.example.service;
import org.example.model.Task;
import org.example.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.repository = repository;
    }
    public Task createTask(Task task){return repository.save(task);}
    public List<Task> getAllTasks(){return repository.findAll();}
    public Task getTaskById(long id){return repository.findById(id).orElse(null);}
    public void deleteTask(long id){repository.deleteById(id);}

    public Task updateStatus(long id , String status){
        Task task = getTaskById(id);
        if(task!=null){
            task.setStatus(status);
            return repository.save(task);
        }
        return null;
    }

}
