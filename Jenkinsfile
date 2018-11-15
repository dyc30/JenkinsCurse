#!/usr/bin/env groovy   //Para que los IDEs coloreen adecuadamente el código

//Sintaxis declarativa
/*
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }        
    }
}
*/

//Sintaxis de scripting
node {
    checkout scm
    stage('Build') {
        withMaven(maven: 'Maven Test') {
            sh 'mvn compile'
        }
    }
    stage('Test') {
        withMaven(maven: 'Maven Test') {
            sh 'mvn test'
        }
        //junit '**/target/*.xml'
    }
    stage('Deploy') {
        try{
            withMaven(maven: 'Maven Test') {
                sh 'mvn package'
            }
            fileOperations([fileCopyOperation(excludes: '', flattenFiles: false, includes: 'target/*.jar', targetLocation: '/home/ivan/jenkins/artefacto')])
        }finally {
            deleteDir()
        }
    }
}
