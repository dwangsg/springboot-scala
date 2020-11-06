package com.demo.springbootscala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootConfig

object SpringbootScalaApplication extends App {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[BootConfig])
}
}


