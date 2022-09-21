def countChange(money: Int, coins: List[Int]): Int = {
  if (money == 0) 1
  else if (coins.isEmpty || money < 0) 0
  else countChange(money-coins.head, coins) + countChange(money, coins.tail)
}
println(countChange(300,List(500,5,50,100,20,200,10)))