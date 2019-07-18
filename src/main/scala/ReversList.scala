object ReverseList extends App {
val lst2=List(23,45,64,76,98)
  val rev1=reverseList(lst2)
  //println("1")
  println(rev1)
  //lst2.reverse

  def reverseList(lst2: List[Int]):List[Int]=
  {
    var anotherList:List[Int] = List()

    for (i <- lst2) {
      anotherList= i :: anotherList
    
    }
       anotherList

  }
}
