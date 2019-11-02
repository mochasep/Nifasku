package com.example.nifasku.deskripsiA

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescTandaBahayaNifas : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_tanda_bahaya_nifas)
        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("", null, null, "bahaya_nifas_1.PNG"),
            RuleContent("", null, null, "bahaya_nifas_2.PNG"),
            RuleContent("", null, null, "bahaya_nifas_3.PNG"),
            RuleContent("", null, null, "bahaya_nifas_4.PNG"),
            RuleContent("", null, null, "bahaya_nifas_5.PNG"),
            RuleContent("", null, null, "bahaya_nifas_6.PNG")
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescTandaBahayaNifas
            )
        }
    }
}

