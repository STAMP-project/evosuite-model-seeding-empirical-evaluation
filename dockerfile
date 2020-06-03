ARG experiment


FROM	  	  fedora:latest

RUN         dnf upgrade --assumeyes
RUN         dnf install python2 --assumeyes
RUN         ln -sfn /usr/bin/python2 /usr/bin/python
RUN         dnf install java-1.8.0-openjdk --assumeyes
RUN         dnf install java-1.8.0-openjdk-devel --assumeyes
RUN         dnf install java-1.8.0-openjdk-openjfx --assumeyes
RUN         dnf install java-1.8.0-openjdk-openjfx-devel --assumeyes
RUN         dnf install procps --assumeyes


WORKDIR /evosuite


COPY analysis-result /evosuite/analysis-result
COPY bins /evosuite/bins
COPY libs /evosuite/libs
COPY run-scripts /evosuite/run-scripts
COPY classes.csv /evosuite/classes.csv


RUN chmod 744 run-scripts/bash/main.sh