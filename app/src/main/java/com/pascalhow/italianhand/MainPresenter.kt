package com.pascalhow.italianhand

class MainPresenter : MainContract.Presenter {

    private var internalView: MainContract.View? = null

    private val view: MainContract.View
        get() {
            return internalView ?: throw IllegalStateException("Accessing view while detached")
        }

    override fun attach(view: MainContract.View) {
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
