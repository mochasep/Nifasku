package com.example.nifasku.deskripsiD

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescBayiBaruLahir : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_bayi_baru_lahir)
        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("pertama", resources.getString(R.string.mitosBBL_1), resources.getString(R.string.faktaBBL_1), null),
            RuleContent("kedua", resources.getString(R.string.mitosBBL_2), resources.getString(R.string.faktaBBL_2), null),
            RuleContent("ketiga", resources.getString(R.string.mitosBBL_3), resources.getString(R.string.faktaBBL_3), null),
            RuleContent("keempat", resources.getString(R.string.mitosBBL_4), resources.getString(R.string.faktaBBL_4), null),
            RuleContent("kelima", resources.getString(R.string.mitosBBL_5), resources.getString(R.string.faktaBBL_5), null),
            RuleContent("keenam", resources.getString(R.string.mitosBBL_6), resources.getString(R.string.faktaBBL_6), null),
            RuleContent("ketujuh", resources.getString(R.string.mitosBBL_7), resources.getString(R.string.faktaBBL_7), null),
            RuleContent("kedelapan", resources.getString(R.string.mitosBBL_8), resources.getString(R.string.faktaBBL_8), null),
            RuleContent("kesembilan", resources.getString(R.string.mitosBBL_9), resources.getString(R.string.faktaBBL_9), null),
            RuleContent("kesepuluh", resources.getString(R.string.mitosBBL_10), resources.getString(R.string.faktaBBL_10), null),
            RuleContent("kesebelas", resources.getString(R.string.mitosBBL_11), resources.getString(R.string.faktaBBL_11), null),
            RuleContent("keduabelas", resources.getString(R.string.mitosBBL_12), resources.getString(R.string.faktaBBL_12), null)
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescBayiBaruLahir
            )
        }
    }
}
