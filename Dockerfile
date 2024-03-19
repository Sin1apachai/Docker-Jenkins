FROM jenkins/jenkins:lts-jdk11

USER root
RUN apt-get update && apt-get install -y ruby make sshpass git

COPY --chown=jenkins:jenkins ./executors/executors.groovy /usr/share/jenkins/ref/init.groovy.d/executors.groovy