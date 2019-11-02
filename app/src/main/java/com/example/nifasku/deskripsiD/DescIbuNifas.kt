package com.example.nifasku.deskripsiD

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescIbuNifas : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_ibu_nifas)
        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("", "MITOS", "FAKTA", null),
            RuleContent("", resources.getString(R.string.mitos_1), resources.getString(R.string.fakta_1), null),
            RuleContent("", resources.getString(R.string.mitos_2), resources.getString(R.string.fakta_2), null),
            RuleContent("", resources.getString(R.string.mitos_3), resources.getString(R.string.fakta_3), null),
            RuleContent("", resources.getString(R.string.mitos_4), resources.getString(R.string.fakta_4), null),
            RuleContent("", resources.getString(R.string.mitos_5), resources.getString(R.string.fakta_5), null),
            RuleContent("", resources.getString(R.string.mitos_6), resources.getString(R.string.fakta_6), null),
            RuleContent("", resources.getString(R.string.mitos_7), resources.getString(R.string.fakta_7), null),
            RuleContent("", resources.getString(R.string.mitos_8), resources.getString(R.string.fakta_8), null),
            RuleContent("", resources.getString(R.string.mitos_9), resources.getString(R.string.fakta_9), null),
            RuleContent("", resources.getString(R.string.mitos_10), resources.getString(R.string.fakta_10), null),
            RuleContent("", resources.getString(R.string.mitos_11), resources.getString(R.string.fakta_11), null),
            RuleContent("", resources.getString(R.string.mitos_12), resources.getString(R.string.fakta_12), null),
            RuleContent("", resources.getString(R.string.mitos_13), resources.getString(R.string.fakta_13), null),
            RuleContent("", resources.getString(R.string.mitos_14), resources.getString(R.string.fakta_14), null),
            RuleContent("", resources.getString(R.string.mitos_15), resources.getString(R.string.fakta_15), null)
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescIbuNifas
            )
        }
    }
}
