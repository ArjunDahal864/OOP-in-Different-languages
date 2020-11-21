package main

import main.abstraction.MessageService
import main.encapsulation.BankingFacility
import main.inheritance.Button
import main.polymorphism.Control
import main.polymorphism.ListView
import main.polymorphism.NormalButton


fun main() {
    // basic example of abstraction in kotlin
    /*
    *
    * the basic idea is to hide all the complexities and show only function
    * which user needs this reduces the confusion
    * for eg a music player contains only main buttons such as pause,play,next and previous
    * to achieve that there are many inner functions which is not necessary
    * for user to know so here we are limiting those things using the concept of
    * abstraction
    * */
    val mail = MessageService()
    mail.sendEmails()

    // basic example of encapsulation

    /*
    * the basic idea of encapsulation is not never let other class modify the value of
    * variable inside other class
    * */

    val account = BankingFacility()
    account.deposit(15f)
    account.withdraw(5f)
    val balance: Float = account.balance
    println(balance)


    // basic example of Inheritance
    /* well practical case for inheritance can be seen in any gui development
        * where each item inherit the method functions of other classes
        *
        * let's see in code
        *
        * suppose we have  button
        * and button has this function onClick
        *
        * now this onclick can be used by another button
        *
        * suppose floatingActionButton now this button also has this thing
        * onClick so it also can use the same onClick function
        *
        * in this example we are extending onClick method or functionality
        * in  different classes
     */

    val  button = Button()
    button.onClick()
    // showing that same thing can be achieved if we use
    // the concept of inheritance in FloatingAction class too
    // val buttonClick = FloatingAction()
    // buttonClick()


    // basic examples of polymorphism
    /*
    * basic idea is to use code and make that code dynamic
    * for eg look at the UIControl it can take different class
    * basic idea of polymorphism is to take different
    * forms and work with different forms
    * */
    uIControl(NormalButton())
    uIControl(ListView())

}
fun uIControl(control: Control){
    control.draw()
}

