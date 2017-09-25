FROM 		tomcat:8.0

MAINTAINER 	maxon4eg

RUN mkdir /usr/local/tomcat/webapps/app
ADD 		app.war /usr/local/tomcat/webapps/app/app.war
ADD 		tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
ADD 		manager.xml /usr/local/tomcat/conf/Catalina/localhost/manager.xml

