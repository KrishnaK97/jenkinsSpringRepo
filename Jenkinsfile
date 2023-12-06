pipeline {

    agent any

    stages {
            stage('Compile') {
                steps {

                    echo 'Clean previous build output'
                    sh './gradlew clean'

                    echo 'Compile SpringBootApp1'
                    sh './gradlew :compileJava :compileTestJava --stacktrace'
                }
            }
            }

    stages {
        stage('Build') {
//             steps {
//                 script {
//                     Set up Gradle
//                     def gradleHome = tool 'Gradle'
//                     def gradleCMD = "${gradleHome}/bin/gradle"
//
//                     // Clean and build the Spring Boot application
//                     sh "${gradleCMD} clean build"
//                 }
//             }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests
//                     def gradleHome = tool 'Gradle'
//                     def gradleCMD = "${gradleHome}/bin/gradle"
//
//                     sh "${gradleCMD} test"
                }
            }
        }

//         stage('Deploy') {
//             steps {
//                 // Add deployment steps here
//             }
//         }
    }
}
