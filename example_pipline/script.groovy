def sshServer(CMD, HOST, KEYID) {
    withCredentials([usernamePassword(credentialsId: KEYID, usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        command =  """
            sshpass -p '${PASSWORD}' ssh -o StrictHostKeyChecking=no ${USERNAME}@${HOST} '${CMD}'
        """
    }
    sh command
}

return this
