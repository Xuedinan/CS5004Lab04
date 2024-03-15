# CS5004Lab04
Repository for CS5004 Lab04 assignment submission

Name: Xuedinan(Dinan) Gao\
Semester: 2024 Spring

### My submission includes following directory/files

- Blocks, Resource, Factories classes
- Main class\
  ![image](https://github.com/Xuedinan/CS5004Lab03/assets/144306521/7e1cc168-bd77-4c59-aa53-8c325fafb6b7)

- Factories tests, Resource test classes\
  ![image](https://github.com/Xuedinan/CS5004Lab03/assets/144306521/0d23f1a0-dae4-4f45-a8cc-6fc59030506c)

### In addition to the requested method, I have extensions below

- New resource type, Concrete
  - New concrete block
  - New concrete block factory
    
- Using ArrayList to store blocks
- Set capacity for each block inventory
- New completely different driver
  - Test breakBlock inside the driver

- Create some JUnit tests
- Add comment in each class
- Add more exception handling for methods that take argument

### My test case is in the NewDriver Class

My driver testing will follow the below work-flow
1. create three types of resources
2. create three block factory
3. create a house factory
4. add weight, subtract weight from all resources 
5. product blocks for each resource
6. break blocks
7. receive returned resource
8. transfer returned resources to block factories
9. try to build the house
10. if blocks are not enough, add more blocks then produce
11. break house check what be returned

### Writing assignment

:star:  **Weekly report**

By completing Lab Assignment 04, I'm familiar with LinkedList and practice a lot of implementation. In addition, since this is an open design assignment, I also try to add more OOD design principles to my assignment, like using more ENUM, Interface, Abstract Class, extracting generic function to a tool class, making my program more abstract and friendly to extension in the future, etc.

For the Linked List data structure, I think it's really great for the design that needs a dynamic size of data structure and is easy to insert and delete. Like this assignment, by using Linked List, we could quickly access the head of all tasks and help us with quick updating and modification, and it saved more memory by utilizing the non-continuous memory of the computer. However, I think this assignment is also achievable without using Linked List, we could implement an array or tree structure but might have different time and space complexity based on our operation design of this program.

In my program, I also apply extension as;
1.
2.
3.
