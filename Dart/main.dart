import 'abstractions/MailService.dart';
import 'encapsulation/Accounts.dart';
import 'inheritance/button.dart';
import 'inheritance/floatingActionButton.dart';
import 'polymorphism/Control.dart';
import 'polymorphism/button.dart';
import 'polymorphism/list.dart';


void main(List<String> args) {
  print("object");
  // encapsulation
  var account = new Accounts();
  account.deposit(10);
  account.withdraw(5);
  var bal = account.getBalance();
  print(bal);

  // inheritance example
  var click = new Button();
  click.onClick();

  var click2 = new FloatingActionButton();
  click2.onClick();

  // abstractions
  var mailService = new MailService();
  mailService.sendMail();

  // polymorphism
  UIControl(new NormalButton());
  UIControl(new DrawList());


}


void UIControl (Control control){
  control.draw();

}