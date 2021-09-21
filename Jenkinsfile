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
            
                git 'https://github.com/navin5556/SpringJenkins.git'

                 bat "mvn clean package"
                 //bat "mvn test"
                  }    
           }
 //---------------------------------------
 stage('aws connection') {
            steps {
              bat "ssh -i "Naveen-VPC-KEY.pem" ec2-user@34.229.113.27"
              bat "sudo yum install httpd -y"
                  }    
           }
 //--------------------------------------
    }
}
