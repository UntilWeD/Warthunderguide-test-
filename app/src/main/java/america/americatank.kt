package america

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.war_thunder_guide.MainActivity
import com.war_thunder_guide.R
import com.war_thunder_guide.TankDetail
import com.war_thunder_guide.databinding.FragmentAmericatankBinding
import java.security.AccessController.getContext


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

        rvAdapter.addData("M4A2 셔먼",4.7,R.drawable.americam4a2,18000,77000)
        rvAdapter.addData("M36 GMC",5.3,R.drawable.m36gmc,63000,200000)
        rvAdapter.addData("M4A3E2",5.3,R.drawable.m4a3e2,40000,150000)
        rvAdapter.addData("M19A1",5.0,R.drawable.m19a1,40000,150000)
        rvAdapter.addData("M4A3E2 (76) W",6.3,R.drawable.m4a3e276w,46000,170000)


        //메서드에 객체전달
        rvAdapter.setOnItemClickListener(object : AmericaTankAdapter.OnItemClickListener{
            override fun onItemClick(view: View, data : americatankdata, position: Int)
            {
               Intent(requireContext(), TankDetail::class.java).apply{
                    putExtra("tankdata", data)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }.run { startActivity(this) }
            }
        })

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
