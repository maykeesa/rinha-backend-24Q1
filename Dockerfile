FROM ubuntu:latest
LABEL authors="maike"

ENTRYPOINT ["top", "-b"]