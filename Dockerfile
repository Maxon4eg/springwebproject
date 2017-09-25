FROM 		tomcat:8.0

MAINTAINER 	maxon4eg

ADD 		app.war /usr/local/tomcat/webapps/app.war
COPY 		tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY    manager.xml  /usr/local/tomcat/conf/Catalina/localhost/

