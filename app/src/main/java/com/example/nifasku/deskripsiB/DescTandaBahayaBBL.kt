package com.example.nifasku.deskripsiB

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescTandaBahayaBBL : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_tanda_bahaya_bbl)
        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("", null, null, "tanda_bahaya_bbl.png")
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_pertama), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_kedua), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_ketiga), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_keempat), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_kelima), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_keenam), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_ketujuh), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_kedelapan), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_kesembilan), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_kesepuluh), null, null),
//            RuleContent("", resources.getString(R.string.tanda_bahaya_bbl_kesebelas), null, null)
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescTandaBahayaBBL
            )
        }
    }
}
