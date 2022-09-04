package america

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.war_thunder_guide.databinding.AmericaTankRecyclerBinding
import java.util.concurrent.RecursiveAction

class AmericaTankAdapter(private val context: Context) : RecyclerView.Adapter<AmericaTankAdapter.ViewHolder>() {
    private val dataSet: ArrayList<americatankdata> = arrayListOf()

    //전달할 객체를 저장할 변수 정의
    private lateinit var itemClickListener : OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AmericaTankRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    //커스텀 인터페이스 정의
    interface OnItemClickListener {
        fun onItemClick(view: View, data: americatankdata ,position: Int)
    }

    //리스너 인터페이스 객체를 전달하는 메서드 선언
    fun setOnItemClickListener(onItemClickListener: OnItemClickListener){
        itemClickListener = onItemClickListener
    }

    fun addData(name: String, br:Double, img:Int, research:Int, price:Int){
        dataSet.add(americatankdata(name,br,img,research,price))
        notifyItemInserted(dataSet.size)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    inner class ViewHolder(val binding: AmericaTankRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {
        //뷰홀더안에 있는 아이템 클릭리스너에서 인터페이스 객체의 메서드 호출 (이때 아이템뷰, position 전달)

        fun bind(data:americatankdata) {
            binding.americaTankName.text = "이름 : ${data.name}"
            binding.americaTankBr.text = "B.R : ${data.br}"
            binding.americaTankResearch.text = "연구비용: ${data.research}"
            binding.americaTankPrice.text = "비용 :${data.price}"
            Glide.with(context).load(data.img).into(binding.americaTankImg)

            val pos = adapterPosition
            if (pos !=RecyclerView.NO_POSITION){
                itemView.setOnClickListener{
                    itemClickListener?.onItemClick(itemView,data,pos)
                }
            }
        }
    }

}






