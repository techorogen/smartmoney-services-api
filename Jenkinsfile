pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvnw clean package'
            }
        }
        stage('Deploy') {
            steps {
                bat 'java -Dspring.profiles.active=qa -jar target\\core-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}