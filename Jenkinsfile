pipeline {
    agent any

    parameters {
        string(name: 'ENV', defaultValue: 'qa', description: 'Environment to run tests')
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-repo.git'
            }
        }

        stage('Run Tests') {
            steps {
                sh "mvn clean test -Denv=${params.ENV}"
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'   // publish results
        }
    }
}
