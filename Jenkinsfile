//node {
//  stage('One') {
//    sh 'echo Hello'
//  }
//  stage('Two') {
//    sh 'echo Hello'
//  }
//}
//

// Agent example

//pipeline {
//  agent any
//  agent none
//  agent {
//    node { 'workstation'}
//  }
//  agent {
//    label { 'ANSIBLE && CENTOS' }
//  }
//
//  stages {
//    stage('sample') {
//      agent { label 'UBUNTU' }
//      steps {
//        sh 'echo heloo'
//      }
//    }
//  }
//
//}

// options example

//pipeline {
//  agent any
//  options { disableConcurrentBuilds() }
//  stages {
//    stage('ONE') {
//      steps {
//        sh 'sleep 10'
//      }
//    }
//  }
//}

// environment example
pipeline {
  agent any
  environment {
    URL1 = "google.com"
    SSH = credentials("CENTOS")
    SSH1 = credentials("common/ssh")
  }
  stages {
    stage('ONE') {
      steps {
        sh 'echo ${URL1}'
        sh 'env'
        echo SSH
      }
    }
  }
}
