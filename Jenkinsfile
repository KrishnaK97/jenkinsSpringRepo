pipeline {

    agent any

    stages {

            stage('Compile Only Not Run') {
                steps {
                    echo 'Clean previous build output'
                    bat 'gradlew clean'

                    echo $SHELL

                    echo 'Compile SpringBootApp1'
                    bat './gradlew :compileJava :compileTestJava --stacktrace'
                }
            }


//             stage('Build') {
//                 steps {
//                     script {
//                         Set up Gradle
//                         def gradleHome = tool 'Gradle'
//                         def gradleCMD = "${gradleHome}/bin/gradle"
//
//                         // Clean and build the Spring Boot application
//                         sh "${gradleCMD} clean build"
//                     }
//                 }
//             }

//             stage('Test') {
//                 steps {
//                     script {
//                         Run tests
//                         def gradleHome = tool 'Gradle'
//                         def gradleCMD = "${gradleHome}/bin/gradle"
//
//                         sh "${gradleCMD} test"
//                     }
//                 }
//             }

//             stage('Deploy') {
//                 steps {
//                     // Add deployment steps here
//                 }
//             }
    }
}
