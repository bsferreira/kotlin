package com.github.bsferreira.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController {

    val message = "Hello"

    @GetMapping("/greeting")
    fun get(@RequestParam(value = "name") name: String): String {
        return "$message $name"
    }
    
}

