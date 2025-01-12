# CODE_CHANGES = getGitChanges()

pipeline{
	agent any

    parameters{
        # string(name: 'VERSION', defaultValue: '', description: 'version on prod')
        choice(name: 'VERSION', choices: ['1.0', '1.1', '1.2'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

    tools{
        maven 'Maven'
    }

    environment{
        NEW_VERSION = '1.1'
        # SERVER_CREDENTIALS = credentials('server_credentials')
    }

    stages{
        stage('build'){
            steps{
                echo "building ${NEW_VERSION}"
                # sh "mvn install"
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
                echo "deploying ${params.VERSION}"
                # sh "${SERVER_CREDENTIALS}"
                # withCredentials([
                #    usernamePassword(credentials: 'server-credentials', usernameVariable: USER, passwordVariable:PWD)
                # ]){
                #    sh "${USER} ${PWD}"
                }
            }
        }

    }
    post{
        always{
            //
        }
        success{
            //
        }
        failure{
            //
        }
    }
}
