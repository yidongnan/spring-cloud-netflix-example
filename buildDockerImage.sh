#!/usr/bin/env bash

set -eo pipefail

modules=( admin-dashboard config-server eureka-server hystrix-dashboard service-a service-b zuul )

for module in "${modules[@]}"; do
    docker build -t "spring-cloud-netflix-example/${module}:latest" ${module}
done
