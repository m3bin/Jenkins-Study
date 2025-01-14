pipeline{
  agent none
  environment{
    PROJECT_NAME = "sample project"
    BUILD_DIR = "build"
  }
  stages{
    stage('cleaning workspace'){
      agent {label 'built-in-node'}
      steps{
        echo 'cleaning workspace...'
        deleteDir()
      }
    }
    stage('build and test in parallel'){
      parallel{
        stage('build on node 1'){
          agent {label 'local-node-1'}
          steps{
            cleanWorkspace()
            echo 'building on node 1...'
          }
        }
        stage('test on node 2'){
          agent {label 'local-node-2'}
          steps{
            cleanWorkspace()
            echo 'testing on node 2...'
          }
        }
      }    
    }
    stage('deploy'){
        agent {label 'built-in-node'}
        steps{
          cleanWorkspace()
          echo 'deploying app...'
        }
    }
  }
  success {
    echo "Pipeline succeeded!"
  }
  failure {
    echo "Pipeline failed. Please check the logs."
  }
  always {
    echo "Performing final cleanup..."
    cleanWorkspace()
  }
}

def cleanWorkspace(){
  deleteDir()
  echo "Workspace cleaned!"
}
