package com.rest.todo;

import java.util.List;  
import javax.ws.rs.DELETE;  
import javax.ws.rs.GET;  
import javax.ws.rs.POST;  
import javax.ws.rs.PUT;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  

@Path("todo")  
public class TodoController {  

	TodoService todoService = new TodoService();  

	@GET  
	@Produces(MediaType.APPLICATION_JSON)  
	public List<Task> getTasks() {  
		List<Task> listOfTasks = todoService.getAllTasks();  
		return listOfTasks;  
	}  

	@GET  
	@Path("{id}")  
	@Produces(MediaType.APPLICATION_JSON)  
	public Task getTaskById(@PathParam("id") int id) {  
		return todoService.getTask(id);  
	}  

	@POST  
	@Produces(MediaType.APPLICATION_JSON)  
	public Task addTask(Task task) {  
		return todoService.addTask(task);  
	}  

	@PUT  
	@Produces(MediaType.APPLICATION_JSON)  
	public Task updateTask(Task task) {  
		return todoService.updateTask(task);  
	}
	
	@PUT
	@Path("{id}/{done}")
	@Produces(MediaType.APPLICATION_JSON)  
	public Task setTaskStatus(@PathParam("id") int id, @PathParam("done") boolean done) {  
		return todoService.updateTaskStatus(id, done);  
	}

	@DELETE  
	@Path("{id}")  
	@Produces(MediaType.TEXT_PLAIN)  
	public String deleteTask(@PathParam("id") int id) {  
		return todoService.deleteTask(id);  
	}  
}  
