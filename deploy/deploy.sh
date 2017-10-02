#!/bin/bash

if [ "$EUID" -ne 0 ]
  then echo "Please run as root"
  exit
fi
cd ~/web_project/springwebproject ;

if [ "$1" == "-u"  ]
    then git reset --hard HEAD ; git pull origin dev ;
fi

#web app deploy
docker stop mytomContainer ;
docker rm mytomContainer ;
docker rmi mytomcat ;

git reset --hard HEAD ;
git pull origin dev;
mvn clean package ;
cp target/spring-web-project-1.0-SNAPSHOT.war /home/ubuntu/wars/app.war ;
cp deploy/* /home/ubuntu/wars ;
cd /home/ubuntu/wars; docker build . -t mytomcat ;
docker run -d -p 8888:8080 --name mytomContainer mytomcat ;
echo " BUILD FINISHED ! ";