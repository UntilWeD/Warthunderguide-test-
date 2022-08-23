package america

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



class ProfileAdapter(private val dataSet: ArrayList<List<String>>): RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = AmericaTankRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ViewHolder(private val binding: AmericaTankRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data:List<String>) {
            binding.americaTankName.text = data[0]
            binding.americaTankBr.text = data[1]
        }
    }
}




