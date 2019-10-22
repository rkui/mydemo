package com.wrk.day06.scala

import scala.actors.Actor


class ActorTest1 extends Actor{
  override def act(): Unit = {
    for (i<-0 to 10){
      println(s"actor1$i")
    }
  }
}

class ActorTest2 extends Actor{
  override def act(): Unit = {
    for (i<-0 to 10){
      println(s"actor2$i")
    }
  }
}

object ActorTest{
  def main(args: Array[String]): Unit = {
    val actor1=new  ActorTest1
    val actor2=new  ActorTest2

    actor1.start()
    actor2.start()
  }
}
