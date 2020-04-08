package com.todolist.Model

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class ListData() {


    constructor(note: String) : this() {
        this.note = note
    }

    @Id
    @GeneratedValue
    var id : Int = 0

    var note : String = ""

    override fun toString(): String {
        return "ListData(id=$id, note='$note')"
    }


}