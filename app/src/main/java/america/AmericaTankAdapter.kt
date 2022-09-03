package america

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.war_thunder_guide.databinding.AmericaTankRecyclerBinding
import java.util.concurrent.RecursiveAction

class AmericaTankAdapter : RecyclerView.Adapter<AmericaTankAdapter.ViewHolder>() {
    private val dataSet: ArrayList<americatankdata> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AmericaTankRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    fun addData(name: String, br:Double, img:Drawable, research:Int, price:Int){
        dataSet.add(americatankdata(name,br,img,research,price))
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
            binding.americaTankResearch.text = "연구비용: ${data.research}"
            binding.americaTankPrice.text = "비용 :${data.price}"
            binding.americaTankImg.setImageDrawable(data.img)
        }
    }
}






