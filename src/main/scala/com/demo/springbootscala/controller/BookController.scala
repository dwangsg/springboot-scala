package com.demo.springbootscala.controller

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RequestParam, RestController}

@RestController
@RequestMapping(Array("book"))
class BookController {

  @GetMapping("/hello")
  def hello(@RequestParam name: String): String = s"Hello $name"
}
