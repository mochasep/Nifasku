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
            RuleContent("pertama", resources.getString(R.string.mengatasi_pertama), null, null),
            RuleContent("kedua", resources.getString(R.string.mengatasi_kedua), null, null),
            RuleContent("ketiga", resources.getString(R.string.mengatasi_ketiga), null, null),
            RuleContent("keempat", resources.getString(R.string.mengatasi_keempat), null, null),
            RuleContent("kelima", resources.getString(R.string.mengatasi_kelima), null, null),
            RuleContent("keenam", resources.getString(R.string.mengatasi_keenam), null, null),
            RuleContent("ketujuh", resources.getString(R.string.mengatasi_ketujuh), null, null),
            RuleContent("kedelapan", resources.getString(R.string.mengatasi_kedelapan), null, null),
            RuleContent("kesembilan", resources.getString(R.string.mengatasi_kesembilan), null, null),
            RuleContent("kesepuluh", resources.getString(R.string.mengatasi_kesepuluh), null, null),
            RuleContent("kesebelas", resources.getString(R.string.mengatasi_kesebelas), null, null)
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
