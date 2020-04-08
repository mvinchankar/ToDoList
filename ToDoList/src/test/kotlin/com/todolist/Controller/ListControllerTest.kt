package com.todolist.Controller

import com.todolist.Service.ListService
import io.mockk.*
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test

class ListControllerTest(){

    @InjectMockKs
    var controller = ListController()

    @MockK
    lateinit var service: ListService

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun givenJsonInput_WhenCorrect_ShouldAcceptData() {
        every {service.addNote("Apples")} just Runs
        controller.addNote("Apples")
        verify{service.addNote("Apples")}
    }
}
