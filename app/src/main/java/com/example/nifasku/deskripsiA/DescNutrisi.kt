package com.example.nifasku.deskripsiA

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescNutrisi : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_nutrisi)

        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("", resources.getString(R.string.nutrisi_pertama), null, "nutrisi_1.png"),
            RuleContent("", resources.getString(R.string.nutrisi_kedua), null, "nutrisi_2.png"),
            RuleContent("", resources.getString(R.string.nutrisi_ketiga), null, "nutrisi_3.png"),
            RuleContent("", resources.getString(R.string.nutrisi_keempat), null, "nutrisi_4.png"),
            RuleContent("", resources.getString(R.string.nutrisi_kelima), null, "nutrisi_5.png"),
            RuleContent("", resources.getString(R.string.nutrisi_keenam), null, "nutrisi_6.png")
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescNutrisi
            )
        }
    }
}
