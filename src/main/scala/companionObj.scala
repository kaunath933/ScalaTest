class Account {
  val id = Account.newNum(9000)
  println("Hi")
  private var balance = 10
  def deposit(amount: Int):Unit= { balance += amount 

  println("balance "+balance)
  }

}
object Account {// The companion object
  private var amt = 0
  
  def newNum(lastNumber:Int):Unit = { 
    amt +=lastNumber
    println("amount " +amt) 
  }

}

object test extends App{
val Ac=new Account()
Ac.deposit(56)
Account.newNum(5000)
Account.newNum(8000)
}
