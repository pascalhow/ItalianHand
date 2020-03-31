package com.pascalhow.greetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greetings.*

class GreetingsActivity : AppCompatActivity(), GreetingsContract.View {

    private lateinit var presenter: GreetingsContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)

        presenter = GreetingsPresenter().apply {
            attach(this@GreetingsActivity)
            offerPineapplePizza()
        }

        offerPizzaButton.setOnClickListener {
            presenter.eatPineapplePizza()
        }
    }

    override fun showHandItalian() {
        italianHand.setImageResource(R.drawable.hand_italian)
    }

    override fun showItalianHand() {
        italianHand.setImageResource(R.drawable.italian_hand)
    }

    override fun showOfferPizza() {
        italianText.text = "Please have some pineapple pizza"
    }

    override fun showPizzaHate() {
        italianText.text = "I HATE pineapple pizza"
    }

    override fun onDestroy() {
        presenter.detach()
        super.onDestroy()
    }

}
