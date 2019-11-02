package com.example.nifasku

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nifasku.deskripsiC.DescInformasiKB
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tips_pertama.setOnClickListener {
            startActivity( Intent(this, TipsMasaNifas::class.java))
        }

        tips_kedua.setOnClickListener {
            startActivity(Intent(this, TipsPerawatanBBL::class.java))
        }

        tips_ketiga.setOnClickListener {
            startActivity(Intent(this, DescInformasiKB::class.java))
        }

        tips_keempat.setOnClickListener {
            startActivity(Intent(this, MitosDanFaktaActivity::class.java))
        }

        tanya_bidan.setOnClickListener {
            startActivity(Intent(this, TanyaBidanActivity::class.java))
        }
    }
}
