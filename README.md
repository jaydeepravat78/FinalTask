# User-Management-System

### Procedure to run application

- Config for tomcat 
  ```
  <role rolename="tomcat"/>
  <role rolename="manager-gui"/>
  <role rolename="admin-gui"/>
  <role rolename="manager-script"/>

  <user username="admin" password="admin" roles="tomcat, manager-gui, admin-gui, manager-script"/>
  ```
  
- mvn command to run
  ``` mvn tomcat7:deploy ```
  
- user_management database
  - users (table)
    ```
    CREATE TABLE `users` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(45) NOT NULL,
    `email` varchar(45) NOT NULL,
    `password` varchar(45) NOT NULL,
    `phone` varchar(10) NOT NULL,
    `gender` varchar(45) NOT NULL,
    `isAdmin` tinyint NOT NULL,
    `photo` mediumblob,
    `lang` varchar(250) NOT NULL,
    `game` varchar(45) NOT NULL,
    `secQuestion` varchar(45) NOT NULL,
     PRIMARY KEY (`id`),
    UNIQUE KEY `user_email_UNIQUE` (`email`)) 
    ```
   - addresses (table)
      ```
     CREATE TABLE `addresses` (
      `address_id` int NOT NULL AUTO_INCREMENT,
      `user_id` int NOT NULL,
      `street` varchar(50) NOT NULL,
      `city` varchar(45) NOT NULL,
      `state` varchar(50) NOT NULL,
        PRIMARY KEY (`address_id`))
      ```
    - users (trigger)
        ```
        CREATE DEFINER=`root`@`localhost` TRIGGER `users_AFTER_DELETE` AFTER DELETE ON `users` 
        FOR EACH ROW 
        BEGIN
	        delete from addresses where user_id = OLD.id;
        END
        ```
 - adding admin credentail (Password: admin@1234)
 	```
	insert into users (name, email, password, phone, gender, isAdmin, lang, game, secQuestion) values ("admin", "admin@gmail.com", "aFqashKiONC2IFdCIMOpgA==", "1234567890", "male", 1, "Java", "Gta", "School");
	``` 
    
