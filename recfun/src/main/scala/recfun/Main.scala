package recfun
import common._
import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if(c == 0 || c == r) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def balanceInner(chars: List[Char], open: Int, close: Int): Boolean = {
      if (close > open) false
      else if (chars.isEmpty) open == close
      else if (chars.head == '(')
        balanceInner(chars.tail, open + 1, close)
      else if (chars.head == ')')
        balanceInner(chars.tail, open, close + 1)
      else balanceInner(chars.tail, open, close)
    }
    balanceInner(chars, 0, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (coins.isEmpty || money < 0) 0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}
