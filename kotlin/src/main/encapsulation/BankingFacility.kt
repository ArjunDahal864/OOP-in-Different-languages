package main.encapsulation

class BankingFacility {
    // Field
    var balance = 0f
    private set
    // methods
    fun deposit(amount: Float) {
        if (amount > 0) balance += amount
    }

    fun withdraw(amount: Float) {
        if (amount > 0) balance -= amount
    }

}