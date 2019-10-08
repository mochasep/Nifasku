package com.example.nifasku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class TipsKesehatanReproduksi : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_kesehatan_reproduksi)

        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("Pil KB", resources.getString(R.string.mengatasi_pertama),null, null),
            RuleContent("IUD Intrauterine Device", resources.getString(R.string.mengatasi_kedua),null, null),
            RuleContent("Implan", resources.getString(R.string.mengatasi_ketiga),null, null),
            RuleContent("Suntikan Depo Provera Cara", resources.getString(R.string.mengatasi_keempat),null, null),
            RuleContent("Metode Penghalang", resources.getString(R.string.mengatasi_kelima),null, null),
            RuleContent("Bagaimana Cara Mencegah Kehamilan ?", resources.getString(R.string.mengatasi_keenam),null, null)
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@TipsKesehatanReproduksi
            )
        }
    }
}
