FROM 		openweb/oracle-tomcat

MAINTAINER 	maxon4eg

RUN         rm -rf /usr/local/tomcat/webapps/ROOT
ADD 		app.war /usr/local/tomcat/webapps/ROOT.war
ADD 		admin-user.xml /usr/local/tomcat/conf/tomcat-users.xml
ADD 		manager.xml /usr/local/tomcat/conf/Catalina/localhost/manager.xml

EXPOSE 8080
