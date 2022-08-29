package america

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.war_thunder_guide.databinding.AmericaTankRecyclerBinding



class AmericaTankAdapter : RecyclerView.Adapter<AmericaTankAdapter.ViewHolder>() {
    private val dataSet: ArrayList<americatankdata> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AmericaTankRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    fun addData(name: String, br:String, img:Drawable){
        dataSet.add(americatankdata(name,br,img))
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
            binding.americaTankName.text = "이름 : ${data.name}"
            binding.americaTankBr.text = "B.R : ${data.br}"
            binding.americaTankImg.setImageDrawable(data.img)
        }
    }
}




