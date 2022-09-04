package america

import android.graphics.drawable.Drawable
import java.io.Serializable

data class americatankdata(
        var name: String,
        var  br : Double,
        var img : Int,
        val research : Int,
        val price : Int
) : Serializable