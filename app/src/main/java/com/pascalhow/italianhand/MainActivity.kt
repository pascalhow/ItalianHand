package com.pascalhow.italianhand

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter().apply {
            attach(this@MainActivity)
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

    companion object {
        fun getCallingIntent(context: Context) = Intent(context, MainActivity::class.java)
    }
}
