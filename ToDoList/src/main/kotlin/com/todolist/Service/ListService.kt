package com.todolist.Service

import com.todolist.Model.ListData
import com.todolist.Repository.ListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ListService {

    @Autowired
    lateinit var repository : ListRepository

    fun addNote(note : String) {
        var data = ListData()
        data.note = note
        repository.save(data)
    }


}
