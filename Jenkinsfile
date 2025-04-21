pipeline {
    agent any

    tools {
        maven 'Maven 3.9.8'
    }

    stages {
        stage('Welcome Stage') {
            steps {
                echo 'Welcome to Jenkins Pipeline'
            }
        }

        stage('Clean Stage') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Test Stage') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Stage') {
            steps {
                sh 'mvn install'
            }
        }

        stage('Build Success') {
            steps {
                echo 'Build Successful'
            }
        }
    }
}
