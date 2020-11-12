package bezi.amine.thinkitchallenge.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bezi.amine.thinkitchallenge.R
import bezi.amine.thinkitchallenge.ui.main.model.ListEntity
import kotlinx.android.synthetic.main.item_home_list.view.*

class ListAdapter(
    private val context: Context?,
    private val list: List<ListEntity>
): RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: ListEntity) {
            itemView.tv_item_first.text = item.firstTitle
            itemView.tv_item_second.text = item.secondTitle
            itemView.iv_item.setImageResource(item.image!!)
        }
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bindView(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView : View = LayoutInflater.from(context).inflate(R.layout.item_home_list, parent, false)
        return ViewHolder(itemView)
    }

}