class MailService {
  void sendMail(){
    _connect();
    _authenticate();
    _sendMail();
    _disconnect();
  }

  void _connect(){
    print("connecting to server");
  }
  void _authenticate(){
    print("authenticate");
  }
  void _sendMail(){
    print("mail sent");
  }
  void _disconnect(){
    print("disconnect");
  }


  
}