pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Set up Gradle
                    def gradleHome = tool 'Gradle'
                    def gradleCMD = "${gradleHome}/bin/gradle"

                    // Clean and build the Spring Boot application
                    sh "${gradleCMD} clean build"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests
                    def gradleHome = tool 'Gradle'
                    def gradleCMD = "${gradleHome}/bin/gradle"

                    sh "${gradleCMD} test"
                }
            }
        }

        stage('Deploy') {
            steps {
                // Add deployment steps here
            }
        }
    }
}
