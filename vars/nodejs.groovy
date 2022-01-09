def call(){
  pipeline {
    agent any
    triggers {
      pollSCM('*/2 * * * *')
    }
    stages {
      stage('compile the code') {
        steps{
          sh 'echo compile the code'
        }
      }
      stage('Check Code quality') {
        steps{
          sh 'echo check Code Quality'
        }
      }
      stage('Test case') {
        steps{
          sh 'echo Test case'
        }
      }
    }
  }

}
