package CheapLetterDeletion

import org.scalatest._
import matchers.should._
import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec with Matchers {

  "example 1" should "work" in {
    val s = "abccbd"
    val c = Array(0,1,2,3,4,5)
    Solution.solution(s,c) shouldEqual 2
  }

  "example 2" should "work" in {
    val s = "aabbcc"
    val c = Array(1,2,1,2,1,2)
    Solution.solution(s,c) shouldEqual 3
  }

  "example 3" should "work" in {
    val s = "aaaa"
    val c = Array(3,4,5,6)
    Solution.solution(s,c) shouldEqual 12
  }

  "example 4" should "work" in {
    val s = "ababa"
    val c = Array(10,5,10,5,10)
    Solution.solution(s,c) shouldEqual 0
  }
}