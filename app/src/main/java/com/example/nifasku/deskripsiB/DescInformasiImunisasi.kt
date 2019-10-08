package com.example.nifasku.deskripsiB

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nifasku.OnClickRuleListener
import com.example.nifasku.R
import com.example.nifasku.RuleAdapter
import com.example.nifasku.RuleContent
import kotlinx.android.synthetic.main.activity_desc_mobilisasi_dini.*

class DescInformasiImunisasi : AppCompatActivity(), OnClickRuleListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc_informasi_imunisasi)
        setComponentListener()
    }

    override fun onClick(position: Int) {
//        Toast.makeText(applicationContext, "Rule Clicked", Toast.LENGTH_LONG).show()
    }

    private fun setComponentListener() {
        val ruleData = arrayListOf(
            RuleContent("Imunisasi", resources.getString(R.string.info_pengertian), null, null),
            RuleContent("Tujuan Imunisasi", resources.getString(R.string.info_tujuan), null, null),
            RuleContent("Usia 0-7 hari", resources.getString(R.string.info_jadwal_vaksin2), null, null),
            RuleContent("Usia 1 bulan", resources.getString(R.string.info_jadwal_vaksin3), null, null),
            RuleContent("Usia 2 bulan", resources.getString(R.string.info_jadwal_vaksin4), null, null),
            RuleContent("Usia 3 bulan", resources.getString(R.string.info_jadwal_vaksin5), null, null),
            RuleContent("Usia 4 bulan", resources.getString(R.string.info_jadwal_vaksin6), null, null),
            RuleContent("Usia 9 bulan", resources.getString(R.string.info_jadwal_vaksin7), null, null)

        )

        rule_list.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = RuleAdapter(
                applicationContext,
                ruleData,
                this@DescInformasiImunisasi
            )
        }
    }
}
