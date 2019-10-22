package com.wrk.day06.scala

import scala.actors.{Actor, Future}

case class AsyncMsg(code: Int, msg: String)
// 同步对象
case class SyncMsg(code: Int, msg: String)
// 响应消息
case class ReplyMsg(code: Int, msg: String){
  // 重写样例类的toString方法
  override def toString: String = {
    s"code: $code, msg: $msg"
  }
}


class ActorService extends Actor{
  override def act(): Unit = {
    while (true){
      // 偏函数
      receive{
        case "start" => {
          println("开始运行。。。")
          sender ! ReplyMsg(0, "start")
        }
        case AsyncMsg(code,msg) => {
          println(s"code: $code, msg: $msg")
          Thread.sleep(3000)
          sender ! ReplyMsg(-1, "success")
        }
        case SyncMsg(code,msg) => {
          println(s"code: $code, msg: $msg")
          Thread.sleep(3000)
          sender ! ReplyMsg(1, "success")
        }
      }
    }
  }
}

object ActorMsg {
  def main(args: Array[String]): Unit = {
    val actorService=new ActorService
    actorService.start()

    val reply:Future[ReplyMsg]=(actorService !! "start").asInstanceOf[Future[ReplyMsg]]

    println(reply.isSet)
    Thread.sleep(1000)
    println(reply.apply())
  }
}
