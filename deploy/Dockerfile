FROM 		tomcat:8.0

MAINTAINER 	maxon4eg

RUN         rm -rf /usr/local/tomcat/webapps/ROOT ROOT.war
ADD 		app.war /usr/local/tomcat/webapps/ROOT.war
ADD 		tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
ADD 		manager.xml /usr/local/tomcat/conf/Catalina/localhost/manager.xml

EXPOSE 8080:8080
