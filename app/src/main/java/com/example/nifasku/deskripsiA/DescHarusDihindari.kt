package com.example.nifasku.deskripsiA

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescHarusDihindari : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_harus_dihindari)

        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("Hal pertama", resources.getString(R.string.harus_dihindari_pertama), null, "dihindar_1.png"),
            RuleContent("Hal kedua", resources.getString(R.string.harus_dihindari_kedua), null, "dihindar_2.png"),
            RuleContent("Hal ketiga", resources.getString(R.string.harus_dihindari_ketiga), null, "dihindar_3.png"),
            RuleContent("Hal keempat", resources.getString(R.string.harus_dihindari_keempat), null, "dihindar_4.png")
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescHarusDihindari
            )
        }
    }
}
