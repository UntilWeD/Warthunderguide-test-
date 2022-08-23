package america

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.war_thunder_guide.R
import com.war_thunder_guide.databinding.ActivityMainBinding
import com.war_thunder_guide.databinding.FragmentAmericatankBinding

class americatank : Fragment() {
    private val dataSet: ArrayList<List<String>> = arrayListOf()

    private lateinit var binding : FragmentAmericatankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding= FragmentAmericatankBinding.inflate(inflater, container, false)
        binding.americaTankProfile.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binding.americaTankProfile.adapter = ProfileAdapter(dataSet)
        addData()
        return binding.root
    }

    private fun addData() {
        for (i in 0..99) {
            dataSet.add(listOf("$i th main", "$i th sub"))
        }
    }

}