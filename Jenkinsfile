pipeline {

    agent any

    environment{

        VERSION_NAME = "K-Version"

    }

    tools{
        gradle "GradleKK"       //check Jenkins > Manage Jenkins > Tools
    }

    stages {

            stage('Compile Only Not Run') {
                steps {
                    echo 'Clean previous build output'
                    bat 'gradlew clean'

                    echo '$SHELL'   // to check terminal used for bat commands execution

                    echo 'Compile SpringBootApp1'
                    bat './gradlew :compileJava :compileTestJava --stacktrace'

                    echo "Jenkins Shell: ${env.SHELL}"
                    echo "Jenkins Shell: ${env.COMSPEC}"
                    echo "Jenkins Shell: ${env.PSModulePath}"
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

    post{

        always{
            echo 'Printed after running all stages'
            echo "Version Name: ${env.VERSION_NAME}"

        }

        success{
            echo 'All steps in all stages successfull'
            echo "Version Name: ${env.VERSION_NAME}"
        }

        failure{
            echo 'All steps in all stages not successfull'

        }



    }
}
