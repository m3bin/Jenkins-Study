#!/usr/bin/env groovy
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

        stage('parallel execution'){
		parallel{
			stage('build on main node'){
				agent{label 'built-in-node'}
				steps{
					echo 'building on main node...'
				}
			}
		stage('build on local node'){
				agent{label 'local-node-1'}
				steps{
					echo 'building on local node 1...'
				}
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
