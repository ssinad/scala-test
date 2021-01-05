import org.apache.log4j.{Level, Logger}
import org.apache.spark._

object FibonacciChallengeRDD {

  def fibonacci(n: Int, sc: SparkContext) = {
    def recurrence(x: List[Int]) : List[Int] = {
      List(x(1), x.sum)
    }
    val funcList = sc.parallelize(List.fill(n)(recurrence _))
    val fx = funcList.reduce((x, y) => x compose y)
    val x0 = List(0, 1)
    fx(x0).head
  }

  def main(args: Array[String]): Unit
  = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext()
    val n = 20

    println(fibonacci(n, sc))
  }
}