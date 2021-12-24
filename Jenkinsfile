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

pipeline {
  agent any
  options { disableConcurrentBuilds() }
  stages {
    stage('ONE') {
      steps {
        sh 'sleep 10'
      }
    }
  }
}
