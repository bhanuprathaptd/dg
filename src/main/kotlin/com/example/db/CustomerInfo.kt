package com.example.db

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CustomerInfo:Table() {

    val id= integer("id").autoIncrement()
    val customerHash= varchar("customerhash",50)
    val firstName= varchar("firstname",50)
    val lastName= varchar("lastname",50)

    override val primaryKey =PrimaryKey(id)

}