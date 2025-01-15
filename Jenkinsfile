@Library('demo-shared-library') _
pipeline{
  agent any
  stages{
    stage('example'){
      steps{
        helloWorld(name:"Mebin",day:"Monday")
        script {helloWorld(2,3)}
      }
    }
  }
}
