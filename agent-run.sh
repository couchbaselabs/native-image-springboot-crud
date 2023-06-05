#!/usr/bin/env bash

mvn -Pnative -Dagent=true -DskipTests -DskipNativeBuild=true package exec:exec@java-agent