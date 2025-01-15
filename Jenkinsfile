@Library('demo-shared-library')
pipeline{
  agent any
  stages{
    stage('example'){
      steps{
        script{
          demoSharedLibrary.helloWorld.call(name:"Mebin",day:"Monday")
          demoSharedLibrary.helloWorld.add(2,3)
        }
      }
    }
  }
}
