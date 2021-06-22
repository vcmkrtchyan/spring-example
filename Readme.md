### Steps of a sample project
 - Create new maven project
 - Add spring-webmvc dependency
 - Set packaging to war
 - Create webapp/WEB-INF/web.xml
 - Add default servlet called spring for servlet class org.springframework.web.servlet.DispatcherServlet
 - Add tomcat configuration
 - Run and see that it looks for <OUR_SERVLET_NAME>-servlet.xml in /WEB-INF/
 - Add the file and re-run, see that everything works and nothing happens
 - Add mvc:annotation-driven
 - Add context:component-scan
 - Add a Controller bean with the corresponding method
 - Add view resolver
 - Add the view file (.jsp)

### Ways to create a bean

 - @Component (general purpose bean)
 - @Controller (bean dedicated for MVC)
 - @RestController = @Controller + @ResponseBody (bean dedicated for HTTP calls)
 - @Service
 - @Repository
 - @Bean
