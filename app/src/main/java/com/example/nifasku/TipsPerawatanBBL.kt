package com.example.nifasku

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nifasku.deskripsiB.*
import kotlinx.android.synthetic.main.content_tips_perawatan_bbl.*

class TipsPerawatanBBL : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_perawatan_bbl)

        pemberian_asi.setOnClickListener {
            startActivity(Intent(this, DescPemberianAsi::class.java))
        }

        cara_menyusui.setOnClickListener {
            startActivity(Intent(this, DescCaraMenyusui::class.java))
        }

        cara_menjaga_bayi.setOnClickListener {
            startActivity(Intent(this, DescCaraMenjagaBayi::class.java))
        }

        posisi_menyusui.setOnClickListener {
            startActivity(Intent(this, DescPosisiMenyusui::class.java))
        }

        cara_memerah_asi.setOnClickListener {
            startActivity(Intent(this, DescCaraMemerahAsi::class.java))
        }

        memandikan_bayi.setOnClickListener {
            startActivity(Intent(this, DescMemandikanBayi::class.java))
        }

        perawatan_tali_pusar.setOnClickListener {
            startActivity(Intent(this, DescPerawatanTaliPusat::class.java))
        }

        tanda_bahaya_bbl.setOnClickListener {
            startActivity(Intent(this, DescTandaBahayaBBL::class.java))
        }

        informasi_imunisasi.setOnClickListener {
            startActivity(Intent(this, DescInformasiImunisasi::class.java))
        }
    }
}
