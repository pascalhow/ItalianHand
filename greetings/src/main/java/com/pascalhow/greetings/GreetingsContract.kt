package com.pascalhow.greetings

interface GreetingsContract {

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