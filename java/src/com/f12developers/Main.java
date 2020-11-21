package com.f12developers;

import com.f12developers.abstractions.MailService;
import com.f12developers.encapsulation.Accounts;
import com.f12developers.extra.Chef;
import com.f12developers.extra.ChefJohn;
import com.f12developers.inheritance.Button;
import com.f12developers.inheritance.FloatingActionButton;
import com.f12developers.polymorphism.Control;
import com.f12developers.polymorphism.ListView;
import com.f12developers.polymorphism.NormalButton;

public class Main {

    public static void main(String[] args) {
        // Encapsulation example
        /*
        * basic idea of encapsulation is to reduce the
        * interaction or reduce the variable's  interaction from other class
        * we don't want value of variable modified from other classes
        * */
        var account = new Accounts();
        account.deposit(15);
        account.withdraw(5);
        float balance = account.getBalance();
        System.out.println(balance);


        // Abstraction example
        /*
        * so basic idea is that we hide all the internal functionality
        * just like remote control of the tv or music system
        * where you hit the button it does all the work which are necessary to complete the task
        * for eg if we hit the power button on remote
        * remote uses the battery power creates the signal and converts to digital signal
        *
        * if we see that thing in code
        *
        * powerButton is function
        * powerButton should do following things
        * userBattery()
        * then createSignal()
        * then convertToLight()
        * then emmitSignal()
        *
        * now we don't want to know the details or we don't want user to have these many options
        * or steps to just shut tv down
        * that's why we have the concept of abstraction
        * by this way we just expose user to the powerButton()
        * other things will be done by that function
         * */
        var emailService = new MailService();
        emailService.sendEmails();


        // inheritance example
        /*
        * well practical case for inheritance can be seen in any gui development
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
        * in two different classes
        * */

        var button = new Button();
        button.onClick();

        var fab = new FloatingActionButton();
        fab.onClick();

        // Polymorphism Example
        /*
        * basic idea is to use code and make that code dynamic
        * for eg look at the UIControl it can take different class
        * basic idea of polymorphism is to take different
        * forms and work with different forms
        * */
        UIControl(new NormalButton());
        UIControl(new ListView());



        // EXTRA
        // Interface
        /*
        * we would use DI to reduce coupling
        * but this is just a example of interface in action or way to work with
        * */

        Chef cook = cookFood();
        cook.Cook();
    }

    public static void UIControl(Control control){
        control.draw();
    }

    public static Chef cookFood(){
        return  new ChefJohn();
    }
}
