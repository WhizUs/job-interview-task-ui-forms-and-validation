# The Story

## Forms & Validations

As a Full Stack Developer at WhizCorp, you're now tasked with the modernization of a legacy application, named FormsApp. 
This application was our initial digital transformation of a complex, form-centric bureaucratic process. 
Subforms and select field values in this application often depended on previous selections, with validations ranging from 
basic field requirements to complex, condition-based rules.

Moreover, the application also exposes a REST API for third-party tools to submit forms, implying that validations must be consistent across the API and UI.

Your mission is to design a new solution that is not only manageable, maintainable, and extensible but also improves usability. 
We're particularly interested in enhancing state management to prevent data loss during unintended page refreshes and 
implementing a prefilling logic to pull data from external REST APIs.

The company uses **Angular** and **Spring Boot** as their technology stack.

A simple prototype application has been created (available in `backend` and `frontend` folders) in an barebone state.
Your colleagues have asked you to build upon this prototype to show them how your ideas and integrations may work.

## Tasks

* Where and how would you do validations?
* How can we write the validation logic so that it is scalable and requires minimal human input
* Create a more complex form with a sub-form (aka, another form needs to be filled out if a certain input-value is selected) and show you this integrates
with your validation logic
* Brainstorm:
  * How can we scale the proposed solution?
  * How can we automate?
* Present your improved prototype to your colleagues and talk with them about current and future problems and how we can face them
* Also read/consider topics in `NOTES.md`

## Boundaries
* Since you are creating a prototype / show-case, you do not need to worry about databases and such storage; just use in-memory for this task.

## Questions to get started

* How would you go about this task considering the complex nature of the project and its requirements?
* Could you break down the challenges you foresee in this project? How do they relate to each other?
* How would you propose to solve these challenges, and what technologies/frameworks would you employ to do so?
