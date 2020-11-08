package com.demo.springbootscala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootScalaApplication

object SpringbootScalaApplication{
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[SpringbootScalaApplication], args: _*)
}
}


