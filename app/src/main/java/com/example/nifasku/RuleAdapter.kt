package com.example.nifasku

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.expandable.view.*

interface OnClickRuleListener {
    fun onClick(position: Int)
}

data class RuleContent(
    var title: String,
    var description: String?,
    var description2: String?,
    var img: String?
)

class RuleAdapter(
    val context: Context,
    var ruleContentList: ArrayList<RuleContent>,
    val onClickRuleListener: OnClickRuleListener
) : RecyclerView.Adapter<RuleAdapter.RuleViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RuleViewHolder {
        return RuleViewHolder(context, LayoutInflater.from(context).inflate(R.layout.expandable, p0, false))
    }

    override fun onBindViewHolder(viewHolder: RuleViewHolder, position: Int) {
        viewHolder.apply {
            setData(ruleContentList[position])
            card.setOnClickListener {
                onClickRuleListener.onClick(position)
                checkVisibility()
            }
        }
    }

    override fun getItemCount(): Int = ruleContentList.size

    class RuleViewHolder(val context: Context, view: View) : RecyclerView.ViewHolder(view) {
        val card = view.expand_card
        val description = view.description
        val description2 = view.description2
        val descWrapper = view.description_wrapper
        val img = view.img
        var isDescHidden = true

        fun checkVisibility() {
            descWrapper.visibility = if (isDescHidden) View.VISIBLE else View.GONE
            isDescHidden = !isDescHidden
        }

        fun setData(ruleContent: RuleContent) {
            this.card.text = ruleContent.title

            if (ruleContent.description != null) {
                this.description.text = ruleContent.description
            } else {
                this.description.visibility = View.GONE
            }

            if (ruleContent.description2 != null) {
                this.description2.text = ruleContent.description2
            } else {
                this.description2.visibility = View.GONE
            }

            if (ruleContent.img != null) {
                try {
                    this.img.setImageBitmap(BitmapFactory.decodeStream(context.assets.open(ruleContent.img!!)))
                } catch (e: Exception) {
                    Toast.makeText(context, "There is a problem when loading image ${ruleContent.img}", Toast.LENGTH_LONG).show()
                }
            } else {
                this.img.visibility = View.GONE
            }
        }
    }
}