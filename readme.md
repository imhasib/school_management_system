# School management system.

### Prerequisites:
* java
* Maven 
* Mysql

### How to run?

* First download or clone this repository.
* Import this project as a maven project in any IDE.
* Now open the "mysql command line client" and create a database name "sms" by the command
    
      create database sms;
      
* Run "DataModel.java"
        
        mvn test
* Then execute this command

        mvn exec:java -Dexec.mainClass="com.hasib.app.Main"
        
* No authentication required just click the sign-in button.