package com.todolist.Repository

import com.todolist.Model.ListData
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ListRepository : JpaRepository<ListData,Long>{
}
