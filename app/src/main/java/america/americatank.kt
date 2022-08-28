package america

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.war_thunder_guide.R
import com.war_thunder_guide.databinding.ActivityMainBinding
import com.war_thunder_guide.databinding.FragmentAmericatankBinding

class americatank : Fragment() {
    private lateinit var binding : FragmentAmericatankBinding
    private val rvAdapter = ProfileAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAmericatankBinding.inflate(inflater, container, false)
        binding.americaTankProfile.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binding.americaTankProfile.adapter = rvAdapter

        rvAdapter.addData("탱크","없음")






        return binding.root
    }


}