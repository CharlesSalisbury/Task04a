package com.example.task04a

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View

class ViewOne: View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    init {
// 'this' is a reference to the current class.
// Views have many properties - one is backgroundColor.
        this.setBackgroundColor(Color.argb(128,32,64,255))
    }

}