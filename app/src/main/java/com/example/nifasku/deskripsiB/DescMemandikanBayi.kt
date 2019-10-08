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
            RuleContent("pertama", resources.getString(R.string.memandikan_bayi_pertama), null,"testgambar.jpg"),
            RuleContent("kedua", resources.getString(R.string.memandikan_bayi_kedua), null,"testgambar.jpg"),
            RuleContent("ketiga", resources.getString(R.string.memandikan_bayi_ketiga), null,"testgambar.jpg"),
            RuleContent("keempat", resources.getString(R.string.memandikan_bayi_keempat), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_kelima), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_keenam), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_ketujuh), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_kedelapan), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_kesembilan), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_kesepuluh), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_kesebelas), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_keduabelas), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_ketigabelas), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_keempatbelas), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_kelimabelas), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_keenambelas), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_ketujuhbelas), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_kedelapanbelas), null,"testgambar.jpg"),
            RuleContent("selanjutnya", resources.getString(R.string.memandikan_bayi_kesembilanbelas), null,"testgambar.jpg"),
            RuleContent("terakhir", resources.getString(R.string.memandikan_bayi_keduapuluh), null,"testgambar.jpg")
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
