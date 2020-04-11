pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven {
                    sh "mvn clean package -Dskip.tests"
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