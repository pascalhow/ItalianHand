package com.pascalhow.greetings

class GreetingsPresenter: GreetingsContract.Presenter {

    private var internalView: GreetingsContract.View? = null

    private val view: GreetingsContract.View
        get() {
            return internalView ?: throw IllegalStateException("Accessing view while detached")
        }

    override fun attach(view: GreetingsContract.View) {
        internalView = view
    }

    override fun detach() {
        internalView = null
    }

    override fun offerPineapplePizza() {
        view.showItalianHand()
        view.showOfferPizza()
    }

    override fun eatPineapplePizza() {
        view.showHandItalian()
        view.showPizzaHate()
    }
}