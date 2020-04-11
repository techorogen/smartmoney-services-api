pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven {
                 sh "mvn clean package -DskipTests"
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.....'
            }
        }
    }
}