package com.wrk.day07.scala

class Test[T,U]{

  def method1[T,U](x:T,y:U):T={x}

  def method2(x:T,y:T):T={x}

}

object MethodTest {
  def main(args: Array[String]): Unit = {
    val test=new Test[Any,Any]
    test.method1[Int,String](1,"2")
  }
}
