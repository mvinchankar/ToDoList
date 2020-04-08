package com.todolist.Controller

import com.todolist.Service.ListService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ListController {

    @Autowired
    lateinit var service : ListService

    @GetMapping("/addNote")
    fun addNote(@RequestParam Note : String): ResponseEntity<String> {
        service.addNote(Note)
        return ResponseEntity.ok("Note Added!!!!")
    }


}