pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "mvnw clean"
            }
        }
        stage('Deploy') {
            steps {
                bat label: 'check_java', script: 'java'
            }
        }
    }
}