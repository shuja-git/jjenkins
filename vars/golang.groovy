def call() {
  pipeline {
    agent {
      label "${BUILD_LABEL}"
    }

    triggers {
      pollSCM('*/2 * * * *')
    }

    stages {

      stage('Compile the Code') {
        steps {
          sh 'echo Compile the ${COMPONENT} Code'
        }
      }

      stage('Check the Code Quality') {
        steps {
          sh 'echo Check the code Quality'
        }
      }

      stage('Lint Checks') {
        steps {
          sh 'echo Test Cases'
        }
      }

      stage('Test Cases') {
        steps {
          sh 'echo Test Cases'
        }
      }

    }

    post {
      always {
        cleanWs()
      }
    }

  }
}
