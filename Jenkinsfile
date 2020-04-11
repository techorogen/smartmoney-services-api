pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat label: 'build_project', script: 'mvnw'
            }
        }
        stage('Deploy') {
            steps {
                bat label: 'check_java', script: 'java'
            }
        }
    }
}