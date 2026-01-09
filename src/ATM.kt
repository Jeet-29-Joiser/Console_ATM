class ATM(balance: Double) : Account(balance), Transaction {

    override fun deposit(amount: Double) {
        if (amount > 0) {
            this.balance += amount
            println("Deposit Successful!!")
        } else {
            println("Invalid Amount!!!")
        }
    }

    override fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrawal Successful!!")
        } else {
            println("Insufficient Balance or Invalid Amount!!!")
        }
    }

    fun checkBalance() {
        println("Current Balance: ₹$balance")
    }
}
