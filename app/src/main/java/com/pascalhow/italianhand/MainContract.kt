package com.pascalhow.italianhand

interface MainContract {

    interface View {
        fun showHandItalian()
        fun showItalianHand()
        fun showOfferPizza()
        fun showPizzaHate()
    }

    interface Presenter {
        fun attach(view: View)
        fun detach()
        fun offerPineapplePizza()
        fun eatPineapplePizza()
    }
}
