package com.isra.zoos.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ZooController {

    @GetMapping("/zoos/zoos")
    fun getZoos(): ResponseEntity<*> {


        return ResponseEntity("{}", HttpStatus.OK)
    }

}