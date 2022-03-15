#  File Management operations
## Project and developer details 

First Assessment, Company Lockers Pvt. Ltd. Project objective:

- As a Full Stack Developer, complete the features of the application by planning the development in terms of sprints and then push the source code to the GitHub repository. As this is a prototyped application, the user interaction will be via a command line.

Full stack Java developer:
- Devam Parikh 
- devamparikh15@gmail.com

## Sprints 


In each sprint create a reasonable product. Design product paradigm, design modules, integrate modules and test.

Sprint planning with Product Owner, Scrum Master and Development Team. Daily Scrum to discuss and evaluate the progress.




| Sprint | Features     | Description                |
| :-------- | :------- | :------------------------- |
| `1` | `list Files` | option will return the current file names in ascending order.
|||| The root directory can be either empty or contain few files or folders in it |
| `2` | `create File` | Add a file to the existing directory list |
| `2` | `delete File` | Delete a user specified file from the existing directory list |
| `2` | `search File` | Search a user specified file from the main directory |
| `3` | `Close Application` | There should be a third option to close the application |



## FlowChart

![App Screenshot](https://user-images.githubusercontent.com/95872805/147804782-b9121648-4234-41f2-8e8b-3bc00362a989.png)

## Core concepts used in the project 
The core concepts used in this project is mainly file handling
using the following syntex to make file object and access it for implementing different functionality   

```bash
  File file = new File("file-name");
```
- the option will return the current file names in ascending order. will use ``sort`` as there Array method.

- Add a file to the existing directory list will use `createNewFile` as there File method.
- Delete a user specified file from the existing directory list will use `delete`  as there File method.
- Search a user specified file from the main directory will use `exists`  as there File method.


## Configure
 - Clone this repository
- Run as Java Application
- this code is written in linux machine therefor change file path wherever required from: 
```bash
  File file = new File( (System.getProperty("user.dir") ) + "/" + fileToBeDeleted );
```
- to: (if using OS other then linux )
```bash
  File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeDeleted );
```
You must use the following:

Eclipse/IntelliJ: An IDE to code for the application

Java: A programming language to develop the prototype

Git: To connect and push files from the local system to GitHub
GitHub Repo Link: 
GitHub: To store the application code and track its versions

Scrum: An efficient agile framework to deliver the product incrementally

Search and Sort techniques: Data structures used for the project

Specification document: Any open-source document or Google Docs

List of core concepts Array lists Collections Exception handling Bubble sort Printwriter Array FileIO operations File handlers/functions
## Unique Selling Points

Usage of UI/UX interface Regular expression for validation Binary search to search for a file based on list number Use distributed modules. Stored procedures to reuse the code Connect with database to implement on multiple devices
