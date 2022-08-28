package america

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.war_thunder_guide.R
import com.war_thunder_guide.databinding.FragmentAmericaplaneBinding


class americaplane : Fragment() {
    lateinit var binding: FragmentAmericaplaneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentAmericaplaneBinding.inflate(inflater,container,false)
        return binding.root
    }

}