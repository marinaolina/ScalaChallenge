package AngryFrogs

import org.scalatest._
import matchers.should._
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec with Matchers {

  "example 1" should "work" in {
    val blocks = Array(2,6,8,5)
    Solution.solution(blocks) shouldEqual 3
  }

  "example 2" should "work" in {
    val blocks = Array(1,5,5,2,6)
    Solution.solution(blocks) shouldEqual 4
  }

  "example 3" should "work" in {
    val blocks = Array(1,1)
    Solution.solution(blocks) shouldEqual 2
  }

  "example 4" should "work" in {
    val blocks = Array(1,5,5,5,5,2,6)
    Solution.solution(blocks) shouldEqual 6
  }

  val blocksPreMount = Array(1,2,3,4,5,6,5,4,4,5,1,5)
  "example 5" should "work" in {
    Solution.solution(blocksPreMount) shouldEqual 6
  }
  "example 6" should "work" in {
    Solution.solution(blocksPreMount.reverse) shouldEqual 6
  }

  val blocksValley = Array(3,2,1,2,3,4,5,6,5,4,4,5,1,5)
  "example 7" should "work" in {
    Solution.solution(blocksValley) shouldEqual 8
  }

  "example 8" should "work" in {
    Solution.solution(blocksValley.reverse) shouldEqual 8
  }

  "example 9" should "work" in {
    val blocks = Array(5,5,5,5,5,2,6,3,6,5,4,5)
    Solution.solution(blocks) shouldEqual 7
  }

  "example 10" should "work" in {
    val blocks = Array(5,5,5,5,5,2,6,3,6,5,4,5)
    Solution.solution(blocks.reverse) shouldEqual 7
  }
}