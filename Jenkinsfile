@Library('demo-shared-library') _
pipeline{
  agent any
  stages{
    stage('example'){
      steps{
        helloWorld(name:"Mebin",day:"Monday")
       /* script{
          helloWorld.call(name:"Mebin",day:"Monday")
          helloWorld.add(2,3)
        } */
      }
    }
  }
}
