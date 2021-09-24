pipeline {
    agent any
    tools {
        maven "maven-home"
    }
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/navin5556/SpringJenkins.git'
                bat "mvn clean install"
           }
        }
        stage('test') {
            steps {
                bat "mvn test"
           }
        }
        stage('deploy') {
            steps {
               deploy adapters: [tomcat8(credentialsId: 'tomcat-major-assign', path: '', url: 'http://107.20.12.162:8080/')], contextPath: 'major-assignment', onFailure: false, war: '**/*.war'
           }
        }
    }
}



