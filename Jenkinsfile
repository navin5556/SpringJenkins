pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'Hello build'
            }
        }
        stage('test') {
            steps {
                echo 'Hello test'
            }
        }
        stage('deploy') {
            steps {
                echo 'Hello deploy'
            }
        }
    }
    post {
        always {
           emailext body: 'success- fail', subject: 'pipeline', to: 'navin5556@gmail.com'
        }
        
    }
}
