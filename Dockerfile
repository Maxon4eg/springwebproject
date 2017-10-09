FROM 		tomcat:7.0

MAINTAINER 	maxon4eg

RUN         rm -rf /usr/local/tomcat/webapps/ROOT
ADD 		target/app.war /usr/local/tomcat/webapps/ROOT.war
ADD 		deploy/admin-user.xml /usr/local/tomcat/conf/tomcat-users.xml
ADD 		deploy/manager.xml /usr/local/tomcat/conf/Catalina/localhost/manager.xml

EXPOSE 8080
