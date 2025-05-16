FROM ubuntu:22.04

RUN apt-get update
RUN apt-get install -y git
RUN apt update
RUN apt install -y default-jdk

COPY ./projeto_java /app

CMD ["maven", "clean"]