def gv
pipeline{
	agent any

	environment{
        NEW_VERSION = '1.0'
    }

	parameters{
        choice(name: 'VERSION', choices: ['1.0', '1.1', '1.2'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

    stages{
	    stage('init'){
            steps{
                echo "echoing env variable NEW_VERSION: ${NEW_VERSION}"
		    script{
			    gv.initApp()
		    }
            }
        }

        stage('build'){
            steps{
                echo "building ${params.VERSION}"
            }
        }
        stage('test'){
		when{
                expression{
                    params.executeTests == true
                }
            }
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
