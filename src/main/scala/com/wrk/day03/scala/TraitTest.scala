package com.wrk.day03.scala

trait TraitTest {

  def method(message:String)

}
class UserTraitTestP extends TraitTest {
  override def method(message: String): Unit = {
    println(s"xinxi${message}aaa")
  }

}
class YYY{

}
object Test001{
  def main(args: Array[String]): Unit = {
    val log=new UserTraitTestP
    log.method("开始记录")

    val yyy=new YYY with TraitTest{
     override def method(message: String): Unit = {
        println(s"xinxi${message}aaa")
      }
    }
    yyy.method("dayinaaa")
  }
}
