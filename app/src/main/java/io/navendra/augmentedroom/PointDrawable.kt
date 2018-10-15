package io.navendra.augmentedroom

import android.graphics.*
import android.graphics.drawable.Drawable

class PointDrawable : Drawable(){
    override fun setAlpha(alpha: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOpacity(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var paint = Paint()
    private var enabled: Boolean = true


    override fun draw(canvas: Canvas) {
        val cx : Float = canvas.width as Float/2
        val cy: Float  = canvas.height as Float /2
        if(enabled){
            paint.color = Color.GREEN
            canvas.drawCircle(cx,cy,10.0f,paint)
        }else{
            paint.color = Color.GRAY
            canvas.drawText("X",cx,cy,paint)
        }

    }


}