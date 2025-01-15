@Library('demo-shared-library') _
pipeline{
  agent any
  stages{
    stage('example'){
      steps{
        script{
          helloWorld.call(name:"Mebin",day:"Monday")
          helloWorld.add(2,3)
        }
      }
    }
  }
}
