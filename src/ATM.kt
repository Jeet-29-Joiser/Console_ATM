class ATM(balance: Double) : Account(balance), Transaction {


     fun processWithdrawal(amount: Int) {

        var remainingAmount = amount

        val notes500 = remainingAmount / 500
        remainingAmount %= 500

        val notes100 = remainingAmount / 100
        remainingAmount %= 100

        if (remainingAmount != 0) {
            println("ATM cannot dispense this amount")
            return
        }

        balance -= amount

        println("Please collect your cash:")
        if (notes500 > 0) println("₹500 x $notes500")
        if (notes100 > 0) println("₹100 x $notes100")
        println("Remaining Balance: ₹$balance")
    }

    override fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposit Successful!!")

        } else {
            println("Invalid Amount!!!")
        }
    }

    override fun withdraw(amount: Double) {

        val withdrawAmount = amount.toInt()

        if (withdrawAmount <= 0 || withdrawAmount > balance) {
            println("Insufficient Balance or Invalid Amount!!!")
            return
        }

        if (withdrawAmount % 100 != 0) {
            println("Amount must be multiple of ₹100")
            return
        }

        processWithdrawal(withdrawAmount)
    }


    fun checkBalance() {
        println("Current Balance: ₹$balance")
    }
}

