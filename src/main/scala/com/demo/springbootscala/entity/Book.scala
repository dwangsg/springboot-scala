package com.demo.springbootscala.entity

import javax.persistence.{Entity, GeneratedValue, Id}

import scala.beans.BeanProperty

@Entity
class Book {

    @Id
    @GeneratedValue
    @BeanProperty
    var isin: Long = _

    @BeanProperty
    var title: String = _

    @BeanProperty
    var author: String = _

    @BeanProperty
    var summary: String = _
  }
