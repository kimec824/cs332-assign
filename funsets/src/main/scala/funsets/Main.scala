package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  println(forall(singletonSet(-1000), x => x == -1000))
}
