pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "mvn clean package -DskipTests"
            }
        }
        stage('Deploy') {
            steps {
                echo "java -Dspring.profiles.active=qa -jar target\\core-0.0.1-SNAPSHOT.jar"
            }
        }
    }
}