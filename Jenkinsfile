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
                echo "echoing env variable - NEW_VERSION: ${NEW_VERSION}"
		    script{
			    gv = load "script.groovy"
		    }
            }
        }

        stage('build'){
            steps{
		    script{
			    gv.buildApp()
		    }
            }
        }
        stage('test'){
		when{
                expression{
                    params.executeTests == true
                }
            }
            steps{
                script{
			    gv.testApp()
		    }
            }
        }
        stage('deploy'){
            steps{
        	script{
			    gv.deployApp()
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
