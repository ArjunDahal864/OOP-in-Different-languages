import 'dart:wasm';

class Accounts {
  
  double _balance = 0;

  void deposit(double amt) {
    if (amt > 0) {
      _balance += amt;
    }
  }

  void withdraw(double amt) {
    if (amt > 0) {
      _balance -= amt;
    }
  }

  double getBalance(){
    return _balance;
  }
}
