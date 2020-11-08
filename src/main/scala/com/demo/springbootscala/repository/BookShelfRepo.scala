package com.demo.springbootscala.repository

import com.demo.springbootscala.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

trait BookShelfRepo extends JpaRepository[Book,Int] {


}
