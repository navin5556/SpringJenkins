pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven-home"
    }
//--------------------------------
    stages {
//--------------------------------------------
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/navin5556/SpringJenkins.git'

                // Run Maven on a Unix agent.
               // sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
<<<<<<< HEAD
                 //bat "mvn clean package"
                 // 
=======
                 bat "mvn test"
>>>>>>> b8ad4cc6a767961ab6381549d3c81080375ef143
                  }    
           }
 //---------------------------------------
     
    }
}
