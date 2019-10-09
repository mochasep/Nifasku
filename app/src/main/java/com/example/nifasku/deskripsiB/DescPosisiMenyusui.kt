package com.example.nifasku.deskripsiB

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescPosisiMenyusui : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_posisi_menyusui)

        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("pertama", resources.getString(R.string.posisi_menyusui_pertama), null, "menyusui_1.png"),
            RuleContent("kedua", resources.getString(R.string.posisi_menyusui_kedua), null, "menyusui_2.png"),
            RuleContent("ketiga", resources.getString(R.string.posisi_menyusui_ketiga), null, "menyusui_3.png"),
            RuleContent("keempat", resources.getString(R.string.posisi_menyusui_keempat), null, "menyusui_4.png"),
            RuleContent("kelima", resources.getString(R.string.posisi_menyusui_kelima), null, "menyusui_5.png"),
            RuleContent("keenam", resources.getString(R.string.posisi_menyusui_keenam), null, "menyusui_6.png"),
            RuleContent("ketujuh", resources.getString(R.string.posisi_menyusui_ketujuh), null, "menyusui_7.PNG"),
            RuleContent("kedelapan", resources.getString(R.string.posisi_menyusui_kedelapan), null, "menyusui_8.png")
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescPosisiMenyusui
            )
        }
    }
}
