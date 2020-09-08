package id.asrorul.tenseshandbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AdapterTenses(val tenses: ArrayList<ModelTenses>): RecyclerView.Adapter<AdapterTenses.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var item: LinearLayout= itemView.findViewById(R.id.cardView)
        var tv_tenses: TextView = itemView.findViewById(R.id.tv_tenses)
        var imgPhoto: ImageView = itemView.findViewById(R.id.icontenses)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_tenses, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tenses.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val myTenses:ModelTenses = tenses[position]
        holder.tv_tenses.text= myTenses.tenses
        Glide.with(holder.itemView.context)
            .load(myTenses.photo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.imgPhoto)

        holder.item.setOnClickListener { onItemClickCallback.onItemClicked(tenses[holder.adapterPosition]) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ModelTenses)
    }
}