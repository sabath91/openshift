#!/bin/bash

DOCKER_IMAGE_NAME="dockertime"

export PATH="~/.minishift/cache/oc/v3.7.2/linux:$PATH"
source '~/.bashrc'

docker login -u developer -p $(oc whoami -t) 172.30.1.1:5000
docker tag ${DOCKER_IMAGE_NAME} 172.30.1.1:5000/myproject/${DOCKER_IMAGE_NAME}
docker push 172.30.1.1:5000/myproject/${DOCKER_IMAGE_NAME}
oc delete all -l app=${DOCKER_IMAGE_NAME}
oc new-app --image-stream=${DOCKER_IMAGE_NAME} --name=${DOCKER_IMAGE_NAME}
oc expose service ${DOCKER_IMAGE_NAME}
