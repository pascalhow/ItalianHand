package com.pascalhow.italianhand

import io.mockk.*
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainPresenterTest {

    private lateinit var presenter: MainContract.Presenter
    private val view: MainContract.View = mockk()

    @Before
    fun setup() {
        presenter = MainPresenter()
    }

    @Test
    fun `addition is Correct`() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `test Show Hand Italian`() {
        presenter.attach(view)

        every {view.showItalianHand()} just runs
        every {view.showOfferPizza()} just runs

        presenter.offerPineapplePizza()

        verify { view.showItalianHand() }
        verify { view.showOfferPizza() }
    }
}
