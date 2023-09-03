I went through the feedback from last week’s assignment and made some changes to the code. 
I researched a bit more about Lombok and did as recommended, I inserted annotations from Lombok and deleted my getters 
and setters, ‘cause they were unnecessary. I looked into the file structure and I’m still a bit uncertain about it, 
however, I did make some changes so I hope I got it right this time. 
I also changed *javax.persistence* to *jakarta.persistence*. I then removed the "void contextLoads()" in 
[CarsApplicationTests.java](http://CarsApplicationTests.java). 
I still had loads of problems after that but I fixed some of my problems with the database and then I asked 
ChatGPT for help and I fixed the last problems. 

What are the benefits of using a RESTful API
  RESTful APIs provide a simple, scalable, and flexible way to enable communication and data exchange between different systems.

What is JSON, and why does JSON fit so well with REST?
  JavaScript Object Notation, is a lightweight data interchange format that is easy for both people to read and write 
  and for machines to parse and generate.  JSON's simplicity, lightweight nature, compatibility with web technologies, 
  and support for structured data make it a natural fit for representing data in RESTful APIs.
  It helps facilitate the efficient exchange of data between clients and servers while maintaining readability and ease of use.

How you have designed simple CRUD endpoints using spring boot and DTOs to separate api from data -> Focus on your use of DTO's
  *

What is the advantage of using DTOs to separate api from data structure when designing rest endpoints
  The advantage of using DTOs (Data Transfer Objects) to separate API from data structure in REST endpoints 
  is to decouple the API's internal data representation   from the external representation exposed to clients.

Explain shortly the concept mocking in relation to software testing
  Mocking, in the context of software testing, refers to creating simulated or "mock" objects to mimic the behaviour 
  of real components or dependencies that a piece of code interacts with. The purpose of mocking is to isolate the 
  code being tested so that it can be tested in isolation from external dependencies.

How did you mock database access in your tests, using an in-memory database and/or mockito → Refer to your code
*

Explain the concept Build Server and the role GitHub Actions play here
*

Explain maven, relevant parts in maven, and how maven is used in our CI setup. Explain where maven is used by your GitHub Actions Script(s)
  In the **`pom.xml`**, project dependencies are specified, which Maven fetches from remote repositories and 
  manages, ensuring that my project has the required libraries.
  The CI script includes steps to run Maven commands like **`mvn clean`**, **`mvn compile`**, **`mvn test`**. These 
  steps compile the code and run tests.

Understand and choose cloud service models (IaaS, PaaS, SaaS, DBaaS)for your projects -> **Just explain what you have used for this handin’**
*

To complete 4.3 (*Verify, via Maven, that your project builds, and that all tests are green before the next step*) I ran the **`mvn clean compile`** command which turned out successful. 
Then I ran the **`mvn test`** command which ended up with these results:

`Tests run: 8, Failures: 0, Errors: 0, Skipped: 0`
`BUILD SUCCESS`

I then committed to GitHub and didn’t end up doing the rest of the assignment.
