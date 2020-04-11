pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                cmd_exec('mvnw clean package')
            }
        }
        stage('Deploy') {
            steps {
                cmd_exec('java -version')
            }
        }
    }

    def cmd_exec(command) {
        return bat(returnStdout: true, script: "${command}").trim()
    }
}