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
            RuleContent("pertama", resources.getString(R.string.posisi_menyusui_pertama), null, "testgambar.jpg"),
            RuleContent("kedua", resources.getString(R.string.posisi_menyusui_kedua), null, "testgambar.jpg"),
            RuleContent("ketiga", resources.getString(R.string.posisi_menyusui_ketiga), null, "testgambar.jpg"),
            RuleContent("keempat", resources.getString(R.string.posisi_menyusui_keempat), null, "testgambar.jpg"),
            RuleContent("kelima", resources.getString(R.string.posisi_menyusui_kelima), null, "testgambar.jpg"),
            RuleContent("keenam", resources.getString(R.string.posisi_menyusui_keenam), null, "testgambar.jpg"),
            RuleContent("ketujuh", resources.getString(R.string.posisi_menyusui_ketujuh), null, "testgambar.jpg"),
            RuleContent("kedelapan", resources.getString(R.string.posisi_menyusui_kedelapan), null, "testgambar.jpg")
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
