package com.github.bsferreira.kotlin

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person(@Id
                  @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long? = null,
                  val name: String? = null)
