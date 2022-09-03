package america

import android.app.Activity
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.graphics.drawable.VectorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        binding.americaTankProfile.addItemDecoration(AmericaTankAdapterDecoration())

        rvAdapter.addData("M4A2 셔먼",4.7,ContextCompat.getDrawable(requireActivity(),R.drawable.americam4a2)!!,18000,77000)
        rvAdapter.addData("M36 GMC",5.3,ContextCompat.getDrawable(requireContext(),R.drawable.m36gmc)!!,63000,200000)
        rvAdapter.addData("M4A3E2",5.3,ContextCompat.getDrawable(requireContext(),R.drawable.m4a3e2)!!,40000,150000)
        rvAdapter.addData("M19A1",5.0,ContextCompat.getDrawable(requireContext(),R.drawable.m19a1)!!,40000,150000)
        rvAdapter.addData("M4A3E2 (76) W",6.3,ContextCompat.getDrawable(requireContext(),R.drawable.m4a3e276w)!!,46000,170000)



        return binding.root
    }


}


class AmericaTankAdapterDecoration : RecyclerView.ItemDecoration(){
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val position = parent.getChildAdapterPosition(view)
        val count = state.itemCount // 아이템 카운트
        val offset = 20

        if(position == 0){
            outRect.top = offset
        } else if (position == count-1){
            outRect.bottom = offset
        } else{
            outRect.top = offset
            outRect.bottom = offset
        }
    }
    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)

        val paint = Paint()
        paint.color = Color.BLUE

        val left = parent.paddingStart.toFloat()
        val right = (parent.width - parent.paddingEnd).toFloat()

        for(i in 0 until parent.childCount) {
            val child = parent.getChildAt(i)
            val layoutParams = child.layoutParams as RecyclerView.LayoutParams
            val top = (child.bottom + layoutParams.bottomMargin + 20).toFloat()
            val bottom = top + 1f

            c.drawRect(left, top, right, bottom, paint)
        }
    }
}
