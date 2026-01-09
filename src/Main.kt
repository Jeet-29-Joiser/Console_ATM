fun main() {

    val atm = ATM(49000.0)
    while (true) {
        println("\n===== ATM MENU =====")
        println("1. Check Balance")
        println("2. Deposit")
        println("3. Withdraw")
        println("4. Exit")
        print("Enter choice: ")

        when (readLine()!!.toInt()) {
            1 -> atm.checkBalance()
            2 -> {
                print("Enter deposit amount: ")
                val amount = readLine()!!.toDouble()
                atm.deposit(amount)
            }
            3 -> {
                print("Enter withdrawal amount: ")
                val amount = readLine()!!.toDouble()
                atm.withdraw(amount)
            }
            4 -> {
                println("Thank you for using ATM")
                break
            }
            else -> println("Invalid Choice")
        }
    }
}
