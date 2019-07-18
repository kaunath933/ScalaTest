object rmduplicate extends App{
def rmCons(lst1: List[Int]):Unit={

  var newlst:List[Int]=lst1(0) :: List()
  var pointingValue=lst1(0)

  for(i<- lst1) {

      if (pointingValue != i) {

        newlst = i:: newlst
        pointingValue = i

      }
  }

  println("result : "+newlst.reverse)
  }

val lst1=List(22,22,33,53,53,6,47,47,47,5,5)
rmCons(lst1)
//println(lst1.reverse)
}
