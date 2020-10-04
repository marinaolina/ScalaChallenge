package CheapLetterDeletion

object Solution {
  def solution(s: String, c: Array[Int]): Int = {
    val z = s zip c
//    list of actual cheapest values, current letter, max cost
    val res = z.foldLeft((List[Int](), '?', 0)) { (acc, el) =>
          val letter = el._1
          val cost = el._2
          if (letter == acc._2) {
            val newCheapCost = Math.min(cost, acc._3)
            val newVector = newCheapCost::acc._1
            val newAccumulator = (newVector, letter, Math.max(cost, acc._3))
            newAccumulator
          } else {
            val newAccumulator = (acc._1, letter, cost)
            newAccumulator
          }

    }
    val cheap = res._1.sum
    cheap
  }
}

