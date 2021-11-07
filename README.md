Spring 4 MVC 
===============================
# STILL A WORK IN PROGRESS APPLICATION...

- Home page with the list of books

![](/home/andile/Downloads/online-book-store/Screenshot from 2020-05-24 16-45-44.png)

 Spring boot application Online Book store for ordering that uses REST services 
 
### 1. Technologies used

* Spring Tool Suite 4.2.2.RELEASE
* Hibernate JPA 
* Angular CLI 8
* jQuery 1.10.2
* Boostrap 3
* Maven built-tool 3
* MYSQL 8 Workbench 4
* Visual Studio Code

### 2. Create the jar file for Spring application
```
mvn clean install  
 or 
mvn -Dmaven.test.skip=true clean install     ## to skip the unit tests

```

## 3. **Clone the application**

	```bash
	git clone https://github.com/andile/book-api.git
	cd book-api
	```

## 4. **Create MYSQL database**

	```bash
	create online-book-db;
	```

### 5. **Change MYSQL username and password as per your MYSQL installation**

	+ open `src/main/resources/application.properties` file.

	+ change `spring.datasource.username` and `spring.datasource.password` properties as per your MYSQL installation
	
### 6 . To import this project into YOUR IDE
 ```
 Import into your favourite IDE
 Done.
```

