package com.example.nifasku

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nifasku.deskripsiD.DescBayiBaruLahir
import com.example.nifasku.deskripsiD.DescIbuNifas
import kotlinx.android.synthetic.main.activity_mitos_dan_fakta.*

class MitosDanFaktaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mitos_dan_fakta)

        ibu_nifas.setOnClickListener {
            startActivity(Intent(this, DescIbuNifas::class.java))
        }

        bayi_baru_lahir.setOnClickListener {
            startActivity(Intent(this, DescBayiBaruLahir::class.java))
        }
    }
}
