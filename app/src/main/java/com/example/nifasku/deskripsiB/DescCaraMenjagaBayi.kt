package com.example.nifasku.deskripsiB

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescCaraMenjagaBayi : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_cara_menjaga_bayi)

        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("", resources.getString(R.string.cara_menjaga_bayi_pertama), null, null),
            RuleContent("", resources.getString(R.string.cara_menjaga_bayi_kedua), null, null),
            RuleContent("", resources.getString(R.string.cara_menjaga_bayi_ketiga), null, null),
            RuleContent("", resources.getString(R.string.cara_menjaga_bayi_keempat), null, null),
            RuleContent("", resources.getString(R.string.cara_menjaga_bayi_kelima), null, null)
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescCaraMenjagaBayi
            )
        }
    }
}
