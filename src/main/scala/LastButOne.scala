object List1 extends App {

  def lastButOne(lst1: List[Int]): Int = {
    var count= 0
    for (l <- lst1) count += 1

    count
  }

  val lst1 = List(3, 4, 5, 32, 54)
  var ordinaryval=lastButOne(lst1)
  println(lst1(ordinaryval -2))



}
