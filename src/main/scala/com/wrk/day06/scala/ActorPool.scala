package com.wrk.day06.scala

import scala.actors.Actor

class ActorReceive extends Actor{
  override def act(): Unit = {
    while(true){
      receive{
        case "start" => {
          println("receive: "+Thread.currentThread())
          sender ! "reply"
        }
      }
    }
  }
}

class ActorReact extends Actor {
  override def act(): Unit = {
    loop{
      react{
        case "start" => {
          println("react: "+Thread.currentThread())
          sender ! "reply"
        }
      }
    }

  }
}

object ActorPool {
  def main(args: Array[String]): Unit = {

    for (_<- 1 to 15){
      new ActorReceive().start() !? "start"
    }

    for (_<- 1 to 15){
      new ActorReact().start() !? "start"
    }


  }
}
