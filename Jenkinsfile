pipeline{
	agent any

	environment{
        NEW_VERSION = '1.1'
    }

	parameters{
        string(name: 'VERSION', defaultValue: '', description: 'version on prod')
        choice(name: 'VERSION', choices: ['1.0', '1.1', '1.2'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

    stages{

        stage('build'){
            steps{
                echo "building ${NEW_VERSION}"
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
