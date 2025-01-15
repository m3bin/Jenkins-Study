@Library('demo-shared-library')
pipeline{
  agent any
  stages{
    stage('example'){
      steps{
        script{
          demo-shared-library.helloWorld.call(name:"Mebin",day:"Monday")
          demo-shared-library.helloWorld.add(2,3)
        }
      }
    }
  }
}
