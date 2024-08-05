FROM tomcat:9.0.91-jdk11-corretto
COPY target/*.war /usr/local/tomcat/webapps/webapps.war



#FROM tomcat:8.0.20-jre8
#COPY target/*.war /usr/local/tomcat/webapps/maven-web-app.war
