pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven {
                 maven: 'maven-3',
                 sh "mvn clean package"
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
                echo 'Deploying....'
            }
        }
    }
}