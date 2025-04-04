pipeline {
    agent any

    environment {
        TOKEN_FILE = 'xray_token.txt'
    }

    stages {
        stage('Get Xray Token') {
            steps {
                withCredentials([
                    string(credentialsId: 'AFC9594E0A7F469592C85F5D6BDC6EEB  ', variable: 'XRAY_ID'),
                    string(credentialsId: 'ae0402b7075192c2a554bde07c9ee9ff424e3ab764a1ac082fda09aa39b370f8', variable: 'XRAY_SECRET')
                ]) {
                    bat """
                        curl -X POST https://xray.cloud.getxray.app/api/v2/authenticate ^
                        -H "Content-Type: application/json" ^
                        -d "{\\"client_id\\": \\"%XRAY_ID%\\", \\"client_secret\\": \\"%XRAY_SECRET%\\"}" ^
                        -o %TOKEN_FILE%
                    """

                    bat "type %TOKEN_FILE%"
                }
            }
        }
    }
}