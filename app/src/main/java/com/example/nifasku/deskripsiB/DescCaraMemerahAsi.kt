package com.example.nifasku.deskripsiB

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescCaraMemerahAsi : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_cara_memerah_asi)
        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("pertama",  null, null, "memerah_1.png"),
            RuleContent("kedua", null, null, "memerah_2.png"),
            RuleContent("ketiga", null, null, "memerah_3.png"),
            RuleContent("keempat",  null, null, "memerah_4.PNG"),
            RuleContent("kelima",  null, null, "memerah_5.PNG"),
            RuleContent("keenam",  null, null, "memerah_6.png"),
            RuleContent("Penyimpanan ASI perah (ASIP)", null, null, "memerah_7.PNG")
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescCaraMemerahAsi
            )
        }
    }
}
