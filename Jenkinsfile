pipeline{
	agent any

	environment{
        NEW_VERSION = '1.1'
    }
	

    stages{

        stage('build'){
            steps{
                echo "building ${NEW_VERSION}"
            }
        }
        stage('test'){
            steps{
                echo 'testing application...'
            }
        }
        stage('deploy'){
            steps{
        	echo "deploying application..."
                }
            }
        }

    }
    post{
        always{
            echo "pipeline completed..."
        }
        success{
            echo "pipeline success"
        }
        failure{
            echo "pipeline failure"
        }
    }
}
