node {
    try {
        stage('Test') {
            sh 'echo "Fallo!"; exit 1'
        }
        echo 'Se ejecuta si exito'
    } catch (e) {
        echo 'Se ejecuta si fallo'
        throw e
    } finally {
        def currentResult = currentBuild.result ?: 'SUCCESS'
        if (currentResult == 'UNSTABLE') {
            echo 'Se ejecuta si unstable'
        }

        def previousResult = currentBuild.previousBuild?.result
        if (previousResult != null && previousResult != currentResult) {
            echo 'Se ejecuta si hay cambio de estado'
        }

        echo 'Se ejecuta siempre'
    }
}
