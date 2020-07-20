# swagger-demo
Demo of swagger functionalities
## Rest api documentation
Swagger enables with Rest api documentation. To add swagger to your project, add the following dependency
```xml    
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>2.9.2</version>
</dependency>
```
Add `@EnableSwagger2` annotation to your spring-boot app and start your app.
Now you can access the rest-api documentation at the following URL http://localhost:8080/v2/api-docs

## Swagger UI
The swagger UI enables us to view the api documentation in a html form. You can also try out the apis and get the details of the models used.
To add swagger UI to your project, add the following dependency
```xml
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
	<version>2.9.2</version>
</dependency>
```
Now you can access the html form of rest-api documentation at the following URL http://localhost:8080/swagger-ui.html
