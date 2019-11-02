package com.example.nifasku.deskripsiB

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescCaraMenyusui : AppCompatActivity(), OnClickRuleListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_cara_menyusui)

        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("", resources.getString(R.string.cara_menyusui_pertama), null, null),
            RuleContent("", resources.getString(R.string.cara_menyusui_kedua), null, null),
            RuleContent("", resources.getString(R.string.cara_menyusui_ketiga), null, null),
            RuleContent("", resources.getString(R.string.cara_menyusui_keempat), null, null)
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescCaraMenyusui
            )
        }
    }
}
