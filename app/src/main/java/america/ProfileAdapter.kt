package america

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.war_thunder_guide.R
import com.war_thunder_guide.databinding.AmericaTankRecyclerBinding



class ProfileAdapter : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {
    private val dataSet: ArrayList<americatankdata> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AmericaTankRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    fun addData(name: String, br:String){
        dataSet.add(americatankdata(name,br))
        notifyItemInserted(dataSet.size)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ViewHolder(private val binding: AmericaTankRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data:americatankdata) {
            binding.americaTankName.text = "${data.name}"
            binding.americaTankBr.text = "${data.br}"
        }
    }
}




