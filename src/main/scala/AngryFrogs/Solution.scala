package AngryFrogs

object Solution {
  def solution(blocks: Array[Int]) = {
    //    accumulator(prev block h, up true/down false, curr width of crater, max with of crater, width of plateau)

    val res = blocks.foldLeft(0, true, 0, 0, 1) { (acc, el) =>
      val wasGoingUp = acc._2
      val nowWeAreGoingUp = el >= acc._1
      val plateau = if (el == acc._1) acc._5 + 1 else 1
      if (nowWeAreGoingUp) {
        val currentWidth = acc._3 + 1
        val maxWidth = Math.max(currentWidth, acc._4)
        val newAccumulator = (el, true, currentWidth, maxWidth, plateau)
        newAccumulator

    } else if (!nowWeAreGoingUp && wasGoingUp){
        val currentWidth = 1 + acc._5
        val maxWidth = Math.max(currentWidth, acc._4)
        val newAccumulator = (el, false, currentWidth, maxWidth, plateau)
        newAccumulator

   } else //if (!nowWeAreGoingUp && !wasGoingUp)
       {
         val currentWidth = acc._3 + 1
         val maxWidth = Math.max(currentWidth, acc._4)
         val newAccumulator = (el, false, currentWidth, maxWidth, plateau)
         newAccumulator
    }}
    res._4
  }
}



