#!/usr/bin/env bash
export AWS_REGION=eu-central-1
export AWS_PROFILE=techorogen
TAG=612484321332.dkr.ecr.eu-central-1.amazonaws.com/tco-dev-test-ecr
docker build -t $TAG .
$(aws ecr get-login --no-include-email)
docker push $TAG