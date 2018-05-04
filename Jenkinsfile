pipeline {
  agent any
  stages {
    stage('Download') {
      steps {
        git(url: 'https://github.com/atisbacsi/helloworldWithGradle.git', poll: true)
      }
    }
    stage('Build') {
      steps {
        sh 'gradle build'
      }
    }
  }
}