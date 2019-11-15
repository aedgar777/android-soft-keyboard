package io.andrewedgar.softkeyboard

import android.content.Context
import android.text.TextUtils
import android.util.AttributeSet
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputConnection
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.keyboard.view.*


class FullKeyboard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr), View.OnClickListener {

    var keyValues = SparseArray<String>(36)

    lateinit var inputConnection: InputConnection


    fun inflate(context: Context) {

        LayoutInflater.from(context).inflate(R.layout.keyboard, this, true)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button0.setOnClickListener(this)
        buttonQ.setOnClickListener(this)
        buttonW.setOnClickListener(this)
        buttonE.setOnClickListener(this)
        buttonR.setOnClickListener(this)
        buttonT.setOnClickListener(this)
        buttonY.setOnClickListener(this)
        buttonU.setOnClickListener(this)
        buttonI.setOnClickListener(this)
        buttonO.setOnClickListener(this)
        buttonP.setOnClickListener(this)
        buttonA.setOnClickListener(this)
        buttonS.setOnClickListener(this)
        buttonD.setOnClickListener(this)
        buttonF.setOnClickListener(this)
        buttonG.setOnClickListener(this)
        buttonH.setOnClickListener(this)
        buttonJ.setOnClickListener(this)
        buttonK.setOnClickListener(this)
        buttonL.setOnClickListener(this)
        buttonZ.setOnClickListener(this)
        buttonX.setOnClickListener(this)
        buttonC.setOnClickListener(this)
        buttonV.setOnClickListener(this)
        buttonB.setOnClickListener(this)
        buttonN.setOnClickListener(this)
        buttonM.setOnClickListener(this)
        buttonDelete.setOnClickListener(this)



        keyValues.put(R.id.button1, "1")
        keyValues.put(R.id.button2, "2")
        keyValues.put(R.id.button3, "3")
        keyValues.put(R.id.button4, "4")
        keyValues.put(R.id.button5, "5")
        keyValues.put(R.id.button6, "6")
        keyValues.put(R.id.button7, "7")
        keyValues.put(R.id.button8, "8")
        keyValues.put(R.id.button9, "9")
        keyValues.put(R.id.button0, "0")
        keyValues.put(R.id.buttonQ, "Q")
        keyValues.put(R.id.buttonW, "W")
        keyValues.put(R.id.buttonE, "E")
        keyValues.put(R.id.buttonR, "R")
        keyValues.put(R.id.buttonT, "T")
        keyValues.put(R.id.buttonY, "Y")
        keyValues.put(R.id.buttonU, "U")
        keyValues.put(R.id.buttonI, "I")
        keyValues.put(R.id.buttonO, "O")
        keyValues.put(R.id.buttonP, "P")
        keyValues.put(R.id.buttonA, "A")
        keyValues.put(R.id.buttonS, "S")
        keyValues.put(R.id.buttonD, "D")
        keyValues.put(R.id.buttonF, "F")
        keyValues.put(R.id.buttonG, "G")
        keyValues.put(R.id.buttonH, "H")
        keyValues.put(R.id.buttonJ, "J")
        keyValues.put(R.id.buttonK, "K")
        keyValues.put(R.id.buttonL, "L")
        keyValues.put(R.id.buttonZ, "Z")
        keyValues.put(R.id.buttonX, "X")
        keyValues.put(R.id.buttonC, "C")
        keyValues.put(R.id.buttonV, "V")
        keyValues.put(R.id.buttonB, "B")
        keyValues.put(R.id.buttonN, "N")
        keyValues.put(R.id.buttonM, "M")


    }

    override fun onClick(v: View?) {
        if (inputConnection == null) return



        if (v?.id == R.id.buttonDelete) {
            val selectedText: CharSequence? = inputConnection.getSelectedText(0)

            if (TextUtils.isEmpty(selectedText)) {
                inputConnection.deleteSurroundingText(1, 0)

            } else {
                inputConnection.commitText("", 1)
            }

        } else {
            val value = keyValues.get(v!!.id)
            inputConnection.commitText(value, 1)
        }
    }
}