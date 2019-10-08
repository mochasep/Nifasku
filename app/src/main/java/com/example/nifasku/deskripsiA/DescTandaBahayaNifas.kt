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
            RuleContent("Langkah pertama", resources.getString(R.string.tanda_bahaya_pertama), null, "testgambar.jpg"),
            RuleContent("Langkah kedua", resources.getString(R.string.tanda_bahaya_kedua), null, "testgambar.jpg"),
            RuleContent("Langkah ketiga", resources.getString(R.string.tanda_bahaya_ketiga), null, "testgambar.jpg"),
            RuleContent("Langkah keempat", resources.getString(R.string.tanda_bahaya_keempat), null, "testgambar.jpg"),
            RuleContent("Langkah kelima", resources.getString(R.string.tanda_bahaya_kelima), null, "testgambar.jpg"),
            RuleContent("Langkah keenam", resources.getString(R.string.tanda_bahaya_keenam), null, "testgambar.jpg")
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

