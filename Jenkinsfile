node {
    checkout scm

    stage('Build') {
        def img = docker.image('amazoncorretto:17.0.9')
        img.inside {
            sh './gradlew clean build publish'
        }
    }

    stage('Publish') {
        withAWS(endpointUrl:'http://minio:9000', credentials:'minio') {
            s3Upload(bucket:"test", path:'', includePathPattern:'**/*', workingDir:'build/repo')
        }
    }
}