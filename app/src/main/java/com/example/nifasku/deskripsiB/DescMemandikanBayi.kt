package com.example.nifasku.deskripsiB

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescMemandikanBayi : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_memandikan_bayi)
        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("pertama", resources.getString(R.string.memandikan_bayi_pertama), null,"memandikan_1.png"),
            RuleContent("kedua", resources.getString(R.string.memandikan_bayi_kedua), null,"memandikan_2.png"),
            RuleContent("ketiga", resources.getString(R.string.memandikan_bayi_ketiga), null,"memandikan_3.png"),
            RuleContent("keempat", resources.getString(R.string.memandikan_bayi_keempat), null,"memandikan_4.png"),
            RuleContent("kelima", resources.getString(R.string.memandikan_bayi_kelima), null,"memandikan_5.png"),
            RuleContent("keenam", resources.getString(R.string.memandikan_bayi_keenam), null,"memandikan_6.png"),
            RuleContent("ketujuh", resources.getString(R.string.memandikan_bayi_ketujuh), null,"memandikan_7.png"),
            RuleContent("kedelapan", resources.getString(R.string.memandikan_bayi_kedelapan), null,"memandikan_8.png"),
            RuleContent("kesembilan", resources.getString(R.string.memandikan_bayi_kesembilan), null,"memandikan_9.PNG"),
            RuleContent("kesepuluh", resources.getString(R.string.memandikan_bayi_kesepuluh), null,"memandikan_10.png"),
            RuleContent("kesebelas", resources.getString(R.string.memandikan_bayi_kesebelas), null,"memandikan_11.png"),
            RuleContent("keduabelas", resources.getString(R.string.memandikan_bayi_keduabelas), null,"memandikan_12.png"),
            RuleContent("ketigabelas", resources.getString(R.string.memandikan_bayi_ketigabelas), null,"memandikan_13.PNG"),
            RuleContent("keempatbelas", resources.getString(R.string.memandikan_bayi_keempatbelas), null,"memandikan_14.png"),
            RuleContent("kelimabelas", resources.getString(R.string.memandikan_bayi_kelimabelas), null,"memandikan_15.png"),
            RuleContent("keenambelas", resources.getString(R.string.memandikan_bayi_keenambelas), null,"memandikan_16.png"),
            RuleContent("ketujuhbelas", resources.getString(R.string.memandikan_bayi_ketujuhbelas), null,"memandikan_17.png"),
            RuleContent("kedelapanbelas", resources.getString(R.string.memandikan_bayi_kedelapanbelas), null,"memandikan_18.png"),
            RuleContent("kesembilanbelas", resources.getString(R.string.memandikan_bayi_kesembilanbelas), null,"memandikan_19.png"),
            RuleContent("keduapuluh", resources.getString(R.string.memandikan_bayi_keduapuluh), null,"memandikan_20.png")
        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescMemandikanBayi
            )
        }
    }
}
