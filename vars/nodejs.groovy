def call(){
  pipeline {
    agent { label 'WORKSTATION' }

    triggers { pollSCM('*/2 * * * *') }

    stages {

      stage('compile the code') {
        steps {
          sh 'echo compile the code'

        }
      }
      stage('check the code quality') {
        steps {
          sh 'echo check the code quality'
        }
      }
      stage('Test cases') {
        steps {
          sh 'echo Test cases'
        }
      }
    }
  }


}



//----------------------
//def info(message) {
//  echo "INFO: ${message}"
//}
//
//def warning(message) {
//  echo "WARNING: ${message}"
//}


//--------------------------------------
//def call() {
//  pipeline {
//    agent {
//      label "${BUILD_LABEL}"
//    }
//
//    triggers {
//      pollSCM('*/2 * * * *')
//    }
//
//    stages {
//
//
//      stage('Check the Code Quality') {
//        steps {
//          sh 'echo Check the code Quality'
//        }
//      }
//
//      stage('Lint Checks') {
//        steps {
//          sh 'echo Test Cases'
//        }
//      }
//
//      stage('Test Cases') {
//        steps {
//          sh 'echo Test Cases'
//        }
//      }
//
//    }
//
//    post {
//      always {
//        cleanWs()
//      }
//    }
//
//  }
//}
