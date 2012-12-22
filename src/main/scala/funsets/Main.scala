package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  val firstUnion = union(singletonSet(1), singletonSet(2))
  val secondUnion = union(firstUnion, singletonSet(3))
  val finalUnionSet = union(secondUnion, singletonSet(4))

  printSet(finalUnionSet)

  //{elem: Int => contains(s,elem) && contains(p,elem)}

  //{ forall((filter(s,p)), p) }
}
