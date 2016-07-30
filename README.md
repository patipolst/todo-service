# todo-service
A Basic RESTful Web Service that stores the resource for a simple 'to do' task list.

This service is written in Java using Jersey Framework, Grizzly Container, and Maven. It exchanges data in JSON format.

#### Each task consists of:
- ID
- Subject
- Detail
- Status

#### User is able to:
- View all tasks in the list
- View a single task
- Add a task
- Edit an existing task
- Set task status
- Delete a task from the list

## How to setup?
1. Open a Terminal or Command Prompt window.
2. Change the project directory:  
  ```
  cd C:\examples\todo-service
  ```
3. Execute the project using [Maven](https://maven.apache.org/):  
  ```
  mvn exec:java
  ```
4. We will test the service in [Postman](http://www.getpostman.com/). Launch Postman.
5. Enter method and URL as follows

Service | Method | URL | REMARK
------------ | ------------- | ------------- | -------------
View all tasks in the list | GET | http://localhost:8080/myapp/todo | 
View a single task | GET | http://localhost:8080/myapp/todo/id | Change id in URL to task id
Add a task | POST | http://localhost:8080/myapp/todo | 
Edit an existing task | PUT | http://localhost:8080/myapp/todo | 
Set task status | PUT | http://localhost:8080/myapp/todo/id/done | Change id in URL to task id and done to true or false
Delete a task from the list | DELETE | http://localhost:8080/myapp/todo/id | Change id in URL to task id

## Examples

### View all tasks in the list
![AllTasks](http://i.imgur.com/98eiO9P.png)


### View a single task
View task id: 2
![SingleTask](http://i.imgur.com/1AnUWqJ.png)


### Add a task
You need to have new task (JSON format) in post body first.
![Add](http://i.imgur.com/YWl7Bct.png)


### Edit an existing task
You need to have edited task (JSON format) in put body first.
![Edit](http://i.imgur.com/82MNZFt.png)


### Set task status
Set status of task id: 1 to true (done).
![SetStatus](http://i.imgur.com/Vg5HcKP.png)


### Delete a task from the list
Delete task id: 2
![Delete](http://i.imgur.com/oRMTYjD.png)
