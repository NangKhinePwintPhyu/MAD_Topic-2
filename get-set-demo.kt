class BankAccount(private var accountNumber: String, private var balance: Double){
    //get methods
    fun getAccountNumber(): String{
        return accountNumber
    }

    fun getBalance(): Double{
        return balance
    }

    //set methods

    fun setAccountNumber(accNum: String){
        accountNumber = accNum
    }
    fun setBalance(bal: Double){
        balance = bal
    }

    //display

    fun display(){
        println("Account Number: $accountNumber, balance: $balance")
        println("Account Number:" + getAccountNumber())
        println("balance:" + getBalance())
    }

}

//Employee

class Employee(private var name: String, private var baseSalary: Double){
    //get methods

    fun getName(): String{
        return name 
    }
    fun getBaseSalary(): Double{
        return baseSalary
    }

    //set methods
    fun setName(n1: String){
        name = n1
    }

    fun setBaseSalary(bS: Double){
        baseSalary = bS
    }

    //display

    fun display(){
        println ("Name: $name, BaseSalary: $baseSalary)
        println("Name:"+ getName())
        println("BaseSalary:"+ getBaseSalary())
    }



}
