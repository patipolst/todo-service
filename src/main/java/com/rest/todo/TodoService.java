package com.rest.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TodoService {  

	static HashMap<Integer,Task> taskMap = getTaskMap();  

	public TodoService() {  
		if(taskMap == null) {  
			taskMap = new HashMap<Integer,Task>();  

			// sample tasks in todo list
			Task t1 = new Task();
			t1.setId();
			t1.setSubject("Pay Internet Bill");
			t1.setDetail("Pay 500 Baht before 1 Aug");
			t1.setDone(false);

			Task t2 = new Task();
			t2.setId();
			t2.setSubject("Project");
			t2.setDetail("Edit customer impl.");
			t2.setDone(true);

			Task t3 = new Task();
			t3.setId();
			t3.setSubject("Medicine");
			t3.setDetail("Buy paracetamol");
			t3.setDone(true);

			Task t4 = new Task();
			t4.setId();
			t4.setSubject("Shoes fix");
			t4.setDetail("Get shoes back in September");
			t4.setDone(false);

			Task t5 = new Task();
			t5.setId();
			t5.setSubject("Docs");
			t5.setDetail("Get transcript at uni.");
			t5.setDone(true);

			Task t6 = new Task();
			t6.setId();
			t6.setSubject("Travel");
			t6.setDetail("Reserve flight to Japan 2017");
			t6.setDone(false);  

			taskMap.put(t1.getId(),t1);  
			taskMap.put(t2.getId(),t2); 
			taskMap.put(t3.getId(),t3); 
			taskMap.put(t4.getId(),t4); 
			taskMap.put(t5.getId(),t5); 
			taskMap.put(t6.getId(),t6); 
		}  
	}  

	public static HashMap<Integer, Task> getTaskMap() {  
		return taskMap;  
	}
	
	public List<Task> getAllTasks() {  
		List<Task> tasks = new ArrayList<Task>(taskMap.values());  
		return tasks;  
	}  

	public Task getTask(int id) {  
		Task task = taskMap.get(id);
		return task;  
	}  

	public Task addTask(Task task) {  
		task.setId();
		taskMap.put(task.getId(), task);  
		return task;
	}  

	public Task updateTask(Task task) {  
		Task foundTask = taskMap.get(task.getId());
		if(foundTask != null) {
			taskMap.put(task.getId(), task);
			return task;
		} else {
			return null;
		}
	} 

	public Task updateTaskStatus(int id, boolean done) {
		Task foundTask = taskMap.get(id);
		if(foundTask != null) {
			foundTask.setDone(done);
			return foundTask;
		} else {
			return null;
		}
	}  

	public String deleteTask(int id) {
		Task foundTask = taskMap.get(id);
		if(foundTask != null) {
			String taskName = taskMap.get(id).getSubject();
			taskMap.remove(id);
			return "Task: " + id + " " + taskName + " has been deleted.";
		} else {
			return "Task: " + id + " not found!";
		}
	}  

}  
