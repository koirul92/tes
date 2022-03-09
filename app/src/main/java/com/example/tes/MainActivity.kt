package com.example.tes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val akun = findViewById<ImageButton>(R.id.accountcircle)
        val bayar = findViewById<ImageButton>(R.id.buttonbayar)
        val isi = findViewById<ImageButton>(R.id.buttonisi)
        val eksplor = findViewById<ImageButton>(R.id.buttoneksplor)
        val goride = findViewById<ImageButton>(R.id.goride_i)
        val gocar = findViewById<ImageButton>(R.id.gocar_i)
        val gofood = findViewById<ImageButton>(R.id.gofood_i)
        val gosend = findViewById<ImageButton>(R.id.gosend_i)
        val gomart = findViewById<ImageButton>(R.id.gomart_i)
        val gopulsa = findViewById<ImageButton>(R.id.gopulsa_i)
        val checkin = findViewById<ImageButton>(R.id.checkin_i)
        val lainnya = findViewById<ImageButton>(R.id.lainnya_i)
        val forwardxp = findViewById<ImageButton>(R.id.forwardxp)
        val morevouch = findViewById<ImageButton>(R.id.more_voucher)
        val morenearby = findViewById<ImageButton>(R.id.more_nearby)
        val promoo = findViewById<ImageButton>(R.id.promooo)
        val home = findViewById<ImageButton>(R.id.buttonhome)
        val discount = findViewById<ImageButton>(R.id.buttondisc)
        val pesanan = findViewById<ImageButton>(R.id.buttonorder)
        val chat = findViewById<ImageButton>(R.id.buttonchat)

        akun.setOnClickListener {
            message()
        }
        bayar.setOnClickListener {
            message()
        }
        isi.setOnClickListener {
            message()
        }
        eksplor.setOnClickListener {
            message()
        }
        goride.setOnClickListener {
            message()
        }
        gocar.setOnClickListener {
            message()
        }
        gofood.setOnClickListener {
            message()
        }
        gosend.setOnClickListener {
            message()
        }
        gomart.setOnClickListener {
            message()
        }
        gopulsa.setOnClickListener {
            message()
        }
        checkin.setOnClickListener {
            message()
        }
        lainnya.setOnClickListener {
            message()
        }
        forwardxp.setOnClickListener {
            message()
        }
        morevouch.setOnClickListener {
            message()
        }
        morenearby.setOnClickListener {
            message()
        }
        promoo.setOnClickListener {
            setContentView(R.layout.fragment_first)
        }
        home.setOnClickListener {
            message()
        }
        discount.setOnClickListener {
            message()
        }
        pesanan.setOnClickListener {
            message()
        }
        chat.setOnClickListener {
            message()
        }
    }
    private fun message(){
        Toast.makeText(applicationContext, "Cuma coba coba", Toast.LENGTH_SHORT).show()
    }
}