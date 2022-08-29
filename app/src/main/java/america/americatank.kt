package america

import android.app.Activity
import android.graphics.drawable.Drawable
import android.graphics.drawable.VectorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
import com.war_thunder_guide.R
import com.war_thunder_guide.databinding.FragmentAmericatankBinding

class americatank : Fragment() {
    private lateinit var binding : FragmentAmericatankBinding
    private val rvAdapter = AmericaTankAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAmericatankBinding.inflate(inflater, container, false)
        binding.americaTankProfile.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binding.americaTankProfile.adapter = rvAdapter

        rvAdapter.addData("M4A2 셔먼","4.7",ContextCompat.getDrawable(requireActivity(),R.drawable.americam4a2)!!)




        return binding.root
    }


}