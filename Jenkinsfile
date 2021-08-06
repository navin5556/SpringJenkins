pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven-home"
    }
//--------------------------------
    stages {
        //-------------------
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/navin5556/SpringJenkins.git'

                // Run Maven on a Unix agent.
               // sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
                  }    
           }
        //------------------------------------------
      stage('Build & Package') {
          steps {
    withSonarQubeEnv('global-sonarqube') {
        bat 'mvn clean package sonar:sonar'
    }
          }
}
        
   //------------------------------------------
    
    }
}
