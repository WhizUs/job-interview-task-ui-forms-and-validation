# UI Forms and Validation

In this task we will take a look at a fullstack task: UI Forms and Validations.
Many companies love migrating their existing paperforms into the digital world and don't really like recreating them in a way that makes more sense online.
So they enforce many constraints and dependencies that sometimes do not make any sense anymore, besides increasing the complexity and cost of the project.
At the same time, they want to completely remove any human from the process, this time to save costs, and thus the application has to handle 
every possible combination of inputs and validate it accordingly.

WhizCorp is just such a corporation, yay!

## Guidance

1. Read [the story](STORY.md)
2. Read the [notes](NOTES.md)
3. Think it trough, make some notes, and prepare for a discussion.
4. If anything is badly defined, ask WhizCorp for clarification or make assumptions on your own (and write them down!)
5. Discuss your strategy with your teammates Alice and Bob.

## How to develop

- Start the devcontainer
  - via github codespaces
  - via vscode
  - via [devpod](https://devpod.sh/)

### run backend
- `cd backend`, `./gradlew bootrun` starts the webserver
- if you want to debug use the vscode gradle extension and run the task application/bootrun in debug mode

### run frontend
- `cd frontend`, `npm install && npm start` starts the frontend in dev mode

### Backend API Documentation
When backend server is running open: http://localhost:8080/swagger-ui.html to view the api documentation


## Additional task

* No additional tasks so far