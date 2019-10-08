package com.example.nifasku.deskripsiA

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescSenamNifas : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_senam_nifas)
        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("Persiapan", resources.getString(R.string.senam_1), null, "testgambar.jpg"),
            RuleContent("Langkah Kegiatan", resources.getString(R.string.senam_2), null, "testgambar.jpg"),
            RuleContent("Gerakan Pergelangan Kaki", resources.getString(R.string.senam_3), null, "testgambar.jpg"),
            RuleContent("Latihan kontraksi ringan otot perut dan otot bokong", resources.getString(R.string.senam_4), null, "testgambar.jpg"),
            RuleContent("Latihan otot perut", resources.getString(R.string.senam_5), null, "testgambar.jpg"),
            RuleContent("Latihan kaki", resources.getString(R.string.senam_6), null, "testgambar.jpg"),
            RuleContent("Latihan untuk mengembalikan Rahim pada posisi semula", resources.getString(R.string.senam_7), null, "testgambar.jpg"),
            RuleContent("Latihan untuk menguatkan otot dada", resources.getString(R.string.senam_8), null, "testgambar.jpg"),
            RuleContent("Latihan menguatkan otot perut", resources.getString(R.string.senam_9), null, "testgambar.jpg"),
            RuleContent("Latihan mempertahankan sikap baik", resources.getString(R.string.senam_10), null, "testgambar.jpg")
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescSenamNifas
            )
        }
    }
}
