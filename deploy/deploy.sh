#!/bin/bash

if [ "$EUID" -ne 0 ]
  then echo "Please run as root"
  exit
fi

if [ "$1" == "-u"  ]
    then git reset --hard HEAD ; git pull origin dev ;
fi

#web app deploy
docker stop applicationContainer ;
docker rm applicationContainer ;
docker rmi project ;

cd .. ;
mvn clean package ;
cp target/app.war deploy/app.war ;
cd deploy/
### build images
docker build . -t project ;
docker run -d --name applicationContainer --link db:db project ;
echo " BUILD FINISHED ! ";