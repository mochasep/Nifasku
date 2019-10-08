package com.example.nifasku

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nifasku.deskripsiA.*
import kotlinx.android.synthetic.main.content_tips_masa_nifas.*

class TipsMasaNifas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_masa_nifas)

        mobilisasi_diri.setOnClickListener {
            startActivity(Intent(this, DescMobilisasiDini::class.java))
        }

        nutrisi.setOnClickListener {
            startActivity(Intent(this, DescNutrisi::class.java))
        }

        kebersihan_diri.setOnClickListener {
            startActivity(Intent(this, DescKebersihanDiri::class.java))
        }

        istirahat.setOnClickListener {
            startActivity(Intent(this, DescIstirahat::class.java))
        }

        tanda_bahaya_nifas.setOnClickListener {
            startActivity(Intent(this, DescTandaBahayaNifas::class.java))
        }

        hal_dihindari.setOnClickListener {
            startActivity(Intent(this, DescHarusDihindari::class.java))
        }

        senam_nifas.setOnClickListener {
            startActivity(Intent(this, DescSenamNifas::class.java))
        }

       mengatasi_cemas.setOnClickListener {
            startActivity(Intent(this, DescMengatasiIbuNifas::class.java))
        }
    }
}
