package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designhomework.R
import com.example.myapplication.account.AccountFragment
import com.example.myapplication.payment.PaymentFragment
import com.example.myapplication.samokatus.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_main ->
                    supportFragmentManager.beginTransaction().replace(
                        container.id, ThirdFragment()
                    ).commit()
                R.id.nav_payment -> supportFragmentManager.beginTransaction().replace(
                    container.id, PaymentFragment()
                ).commit()
                R.id.nav_settings -> supportFragmentManager.beginTransaction().replace(
                    container.id, AccountFragment()
                ).commit()
            }
            true
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, AccountFragment())
            .commit()
    }
}
