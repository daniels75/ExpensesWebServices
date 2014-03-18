AppFuse Basic Struts Archetype
--------------------------------------------------------------------------------
If you're reading this then you've created your new project using Maven and
tutorial-hibernate.  You have only created the shell of an AppFuse Java EE
application.  The project object model (pom) is defined in the file pom.xml.
The application is ready to run as a web application. The pom.xml file is
pre-defined with Hibernate as a persistence model and Struts 2 as the web
framework.

To get started, please complete the following steps:

1. Download and install a MySQL 5.x database from 
   http://dev.mysql.com/downloads/mysql/5.0.html#downloads.

2. Run "mvn jetty:run" and view the application at http://localhost:8080.

3. More information can be found at:

   http://appfuse.org/display/APF/AppFuse+QuickStart
   
   ------------- Services --------------------------
   http://localhost:8080/services/
   http://localhost:8080/services/api/people.json
   http://localhost:8080/services/api/users.json
   
Another rest services:
http://localhost:8080/rest/payment/save
http://localhost:8080/rest/myuser
http://localhost:8080/rest/myuser/numberOfUsers
http://localhost:8080/rest/myuser/people
http://localhost:8080/rest/myuser/people/1

http://localhost:8080/rest/myuser/manager
http://localhost:8080/rest/myuser/manager/-2
http://localhost:8080/rest/myuser/manager/name/user
http://localhost:8080/rest/myuser/manager/name/admin