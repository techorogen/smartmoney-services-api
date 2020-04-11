pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat label: 'build_project', script: 'mvnw clean package -DskipTests'
            }
        }
        stage('Deploy') {
            steps {
                bat label: 'check_java', script: 'java -version'
            }
        }
    }
}