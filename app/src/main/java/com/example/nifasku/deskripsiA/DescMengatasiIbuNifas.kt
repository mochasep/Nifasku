package com.example.nifasku.deskripsiA

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescMengatasiIbuNifas : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_mengatasi_ibu_nifas)

        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("Langkah pertama", resources.getString(R.string.mengatasi_pertama), null, null),
            RuleContent("Langkah kedua", resources.getString(R.string.mengatasi_kedua), null, null),
            RuleContent("Langkah ketiga", resources.getString(R.string.mengatasi_ketiga), null, null),
            RuleContent("Langkah keempat", resources.getString(R.string.mengatasi_keempat), null, null),
            RuleContent("Langkah kelima", resources.getString(R.string.mengatasi_kelima), null, null),
            RuleContent("Langkah keenam", resources.getString(R.string.mengatasi_keenam), null, null),
            RuleContent("Langkah ketujuh", resources.getString(R.string.mengatasi_ketujuh), null, null),
            RuleContent("Langkah kedelapan", resources.getString(R.string.mengatasi_kedelapan), null, null),
            RuleContent("Langkah kesembilan", resources.getString(R.string.mengatasi_kesembilan), null, null),
            RuleContent("Langkah kesepuluh", resources.getString(R.string.mengatasi_kesepuluh), null, null),
            RuleContent("Langkah kesebelas", resources.getString(R.string.mengatasi_kesebelas), null, null)
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescMengatasiIbuNifas
            )
        }
    }
}
