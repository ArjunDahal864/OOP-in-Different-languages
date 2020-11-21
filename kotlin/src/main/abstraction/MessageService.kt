package main.abstraction

class MessageService {
    fun sendEmails(){
        connectToMailServer()
        authenticate()
        sendEmail()
        disconnect()

    }
}

private fun connectToMailServer(){
    println("Connecting to mail server \n")
}

private fun authenticate(){
    println("Authenticating ")
}

private fun sendEmail(){
    println("send email")
}

private fun disconnect(){
    println("Disconnect")
}