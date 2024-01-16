node {
    checkout scm

    stage('Build') {
        def img = docker.image('amazoncorretto:17.0.9')
        img.inside {
            sh './gradlew build'
        }
    }
}