pipeline {
    agent any

    options {
        skipDefaultCheckout(true)
    }

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code'
                git branch: 'main',
                    url: 'https://github.com/gokulfalke17/Calculator-Jenkins-Test.git'
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Building and testing application'
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'Build and tests completed successfully'
        }
        failure {
            echo 'Build or tests failed'
        }
    }
}
