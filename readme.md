# School management system.

### Prerequisites:
* java
* Maven 
* Mysql

### How to run?

* First download or clone this repository.
* Import this project as a maven project in any IDE.
* To run this project "sms" database should be created first. Now open the "mysql command line client" and create a database name "sms" by the command
    
      create database sms;
      
* Run "DataModel.java" to create all the necessary entries by executing this command
        
        mvn test
* Then execute this command to run the application

        mvn exec:java -Dexec.mainClass="com.hasib.app.Main"
        
* No authentication required just click the sign-in button.
* Those commands are also executable from the project directory.