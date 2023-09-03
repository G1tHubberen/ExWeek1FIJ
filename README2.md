I went through the feedback from last week’s assignment and made some changes to the code. 
I researched a bit more about Lombok and did as recommended, I inserted annotations from Lombok and deleted my getters and setters, ‘cause they were unnecessary. 
I looked into the file structure and I’m still a bit uncertain about it, however, I did make some changes so I hope I got it right this time. 
I also changed *javax.persistence* to *jakarta.persistence*. I then removed the "void contextLoads()" in [CarsApplicationTests.java](http://CarsApplicationTests.java). 
I still had loads of problems after that but I fixed some of my problems with the database and then I asked ChatGPT for help and I fixed the last problems. 

What are the benefits of using a RESTful API
  RESTful APIs provide a simple, scalable, and flexible way to enable communication and data exchange between different systems.

What is JSON, and why does JSON fit so well with REST?
  JavaScript Object Notation, is a lightweight data interchange format that is easy for both people to read and write and for machines to parse and generate.
  JSON's simplicity, lightweight nature, compatibility with web technologies, and support for structured data make it a natural fit for representing data in RESTful APIs.
  It helps facilitate the efficient exchange of data between clients and servers while maintaining readability and ease of use.

How you have designed simple CRUD endpoints using spring boot and DTOs to separate api from data -> Focus on your use of DTO's
  In loads of my classes I use the @Entity annotation which represents the data I want to manage.
  
