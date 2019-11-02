package com.example.nifasku.deskripsiC

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescInformasiKB : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_informasi_kb)

        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("Pil KB", resources.getString(R.string.kb_pertama),null ,"minipil.png"),
            RuleContent("IUD Intrauterine Device", resources.getString(R.string.kb_kedua),null ,"iud.png"),
            RuleContent("Implan", resources.getString(R.string.kb_ketiga),null ,"implan.png"),
            RuleContent("Suntikan Depo Provera Cara", resources.getString(R.string.kb_keempat),null ,"suntikan.png"),
            RuleContent("Metode Penghalang", resources.getString(R.string.kb_kelima),null ,"kondom.png"),
            RuleContent("Bagaimana Cara Mencegah Kehamilan ?", resources.getString(R.string.kb_keenam),null ,null)
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescInformasiKB
            )
        }
    }
}
