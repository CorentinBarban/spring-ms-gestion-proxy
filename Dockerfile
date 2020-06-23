FROM java:8
LABEL maintainer="corentin.barban@toulouse.miage.fr"
VOLUME /tmp
EXPOSE 8090
ADD target/proxy-0.0.1-SNAPSHOT.jar proxy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","proxy-0.0.1-SNAPSHOT.jar"]
