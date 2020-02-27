package com.example.task04a

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View

class ViewOne: View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    // Instantiate the GestureDetector with the application context
    // and an implementation of the GestureDetector.OnGestureListener interface
    private val myGestureDetector = GestureDetector(context, myGestureListener())


    init {
// 'this' is a reference to the current class.
// Views have many properties - one is backgroundColor.
        this.setBackgroundColor(Color.argb(128,32,64,255))
    }

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        return myGestureDetector.onTouchEvent(ev) || super.onTouchEvent(ev)
    }

    inner class myGestureListener: GestureDetector.SimpleOnGestureListener() {
        // You should always include onDown() and it should always return true.
        // Otherwise the GestureListener may ignore other events.
        override fun onDown(ev: MotionEvent): Boolean {
            return true
        }
        override fun onSingleTapUp(ev: MotionEvent): Boolean {
            Log.d(LOGTAG, "SingleTapUp")
            return true
        }
    } // End of myGestureListener class

    companion object { // declare a constant (must be in the companion)
        const val LOGTAG = "MyTask"
    }


}