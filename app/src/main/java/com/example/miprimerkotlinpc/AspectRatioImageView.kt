package com.example.miprimerkotlinpc


import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class AspectRatioImageView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

     var ratio: Float = 1f

    init {
        val a = context.obtainStyledAttributes(attrs,R.styleable.AspectRatioImageView)
        ratio = a.getFloat(R.styleable.AspectRatioImageView_ratio, 1f)
        /* la variable a es muy pesada por eso tengo que reciclarla */
        a.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        /* Tomar las medidas de vista Image */
        var width = measuredWidth
        var height = measuredHeight

        /* Preguntar si la vista ya termino de cargarse
           en caso de que no se haya terminado de cargar
           regresar porque no se tiene los datos suficientes
         */
        if ( width == 0 && height == 0) {
            return
        }

        if (width>0) {
            height = (width * ratio).toInt()
        } else if(height > 0) {
            width = (height / ratio).toInt()
        }

        /* procedemos a regresar el tamaño de la vista
        de imagen modificado
         */
        setMeasuredDimension(width,height)
        }

    }
