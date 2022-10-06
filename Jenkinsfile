pipeline{
    agent any
    environment {
        PASSWORD = credentials('pwd-docker')
    }
    tools{
        maven 'maven_3.8.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/HaitharAli/jenkins-cicd']]])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker image'){
            steps{
                script{
                    bat 'docker build -t haitharali/jenkins-cicd .'
                }
            }
        }
        stage('Push Image to Hub'){
            steps{
                script{
                        bat 'docker login -u haitharali -p %PASSWORD%'
                        bat 'docker push haitharali/jenkins-cicd'
                }
            }
        }
    }


}