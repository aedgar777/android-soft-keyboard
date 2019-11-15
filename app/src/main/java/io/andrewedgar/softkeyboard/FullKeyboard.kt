package io.andrewedgar.softkeyboard

import android.content.Context
import android.text.TextUtils
import android.util.AttributeSet
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputConnection
import android.widget.Button
import android.widget.LinearLayout



class FullKeyboard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr), View.OnClickListener {

    private lateinit var mButton1: Button
    private lateinit var mButton2: Button
    private lateinit var mButton3: Button
    private lateinit var mButton4: Button
    private lateinit var mButton5: Button
    private lateinit var mButton6: Button
    private lateinit var mButton7: Button
    private lateinit var mButton8: Button
    private lateinit var mButton9: Button
    private lateinit var mButton0: Button
    private lateinit var mButtonQ: Button
    private lateinit var mButtonW: Button
    private lateinit var mButtonE: Button
    private lateinit var mButtonR: Button
    private lateinit var mButtonT: Button
    private lateinit var mButtonY: Button
    private lateinit var mButtonU: Button
    private lateinit var mButtonI: Button
    private lateinit var mButtonO: Button
    private lateinit var mButtonP: Button
    private lateinit var mButtonA: Button
    private lateinit var mButtonS: Button
    private lateinit var mButtonD: Button
    private lateinit var mButtonF: Button
    private lateinit var mButtonG: Button
    private lateinit var mButtonH: Button
    private lateinit var mButtonJ: Button
    private lateinit var mButtonK: Button
    private lateinit var mButtonL: Button
    private lateinit var mButtonZ: Button
    private lateinit var mButtonX: Button
    private lateinit var mButtonC: Button
    private lateinit var mButtonV: Button
    private lateinit var mButtonB: Button
    private lateinit var mButtonN: Button
    private lateinit var mButtonM: Button
    private lateinit var mButtonDelete: Button

    var keyValues = SparseArray<String>(36)

    lateinit var inputConnection: InputConnection


    fun inflate(context: Context) {

        LayoutInflater.from(context).inflate(R.layout.keyboard, this, true)


        mButton1 = findViewById(R.id.button_1)
        mButton2 = findViewById(R.id.button_2)
        mButton3 = findViewById(R.id.button_3)
        mButton4 = findViewById(R.id.button_4)
        mButton5 = findViewById(R.id.button_5)
        mButton6 = findViewById(R.id.button_6)
        mButton7 = findViewById(R.id.button_7)
        mButton8 = findViewById(R.id.button_8)
        mButton9 = findViewById(R.id.button_9)
        mButton0 = findViewById(R.id.button_0)
        mButtonQ = findViewById(R.id.button_Q)
        mButtonW = findViewById(R.id.button_W)
        mButtonE = findViewById(R.id.button_E)
        mButtonR = findViewById(R.id.button_R)
        mButtonT = findViewById(R.id.button_T)
        mButtonY = findViewById(R.id.button_Y)
        mButtonU = findViewById(R.id.button_U)
        mButtonI = findViewById(R.id.button_I)
        mButtonO = findViewById(R.id.button_O)
        mButtonP = findViewById(R.id.button_P)
        mButtonA = findViewById(R.id.button_A)
        mButtonS = findViewById(R.id.button_S)
        mButtonD = findViewById(R.id.button_D)
        mButtonF = findViewById(R.id.button_F)
        mButtonG = findViewById(R.id.button_G)
        mButtonH = findViewById(R.id.button_H)
        mButtonJ = findViewById(R.id.button_J)
        mButtonK = findViewById(R.id.button_K)
        mButtonL = findViewById(R.id.button_L)
        mButtonZ = findViewById(R.id.button_Z)
        mButtonX = findViewById(R.id.button_X)
        mButtonC = findViewById(R.id.button_C)
        mButtonV = findViewById(R.id.button_V)
        mButtonB = findViewById(R.id.button_B)
        mButtonN = findViewById(R.id.button_N)
        mButtonM = findViewById(R.id.button_M)
        mButtonDelete = findViewById(R.id.button_delete)


        mButton1.setOnClickListener(this)
        mButton2.setOnClickListener(this)
        mButton3.setOnClickListener(this)
        mButton4.setOnClickListener(this)
        mButton5.setOnClickListener(this)
        mButton6.setOnClickListener(this)
        mButton7.setOnClickListener(this)
        mButton8.setOnClickListener(this)
        mButton9.setOnClickListener(this)
        mButton0.setOnClickListener(this)
        mButtonQ.setOnClickListener(this)
        mButtonW.setOnClickListener(this)
        mButtonE.setOnClickListener(this)
        mButtonR.setOnClickListener(this)
        mButtonT.setOnClickListener(this)
        mButtonY.setOnClickListener(this)
        mButtonU.setOnClickListener(this)
        mButtonI.setOnClickListener(this)
        mButtonO.setOnClickListener(this)
        mButtonP.setOnClickListener(this)
        mButtonA.setOnClickListener(this)
        mButtonS.setOnClickListener(this)
        mButtonD.setOnClickListener(this)
        mButtonF.setOnClickListener(this)
        mButtonG.setOnClickListener(this)
        mButtonH.setOnClickListener(this)
        mButtonJ.setOnClickListener(this)
        mButtonK.setOnClickListener(this)
        mButtonL.setOnClickListener(this)
        mButtonZ.setOnClickListener(this)
        mButtonX.setOnClickListener(this)
        mButtonC.setOnClickListener(this)
        mButtonV.setOnClickListener(this)
        mButtonB.setOnClickListener(this)
        mButtonN.setOnClickListener(this)
        mButtonM.setOnClickListener(this)
        mButtonDelete.setOnClickListener(this)



        keyValues.put(R.id.button_1, "1")
        keyValues.put(R.id.button_2, "2")
        keyValues.put(R.id.button_3, "3")
        keyValues.put(R.id.button_4, "4")
        keyValues.put(R.id.button_5, "5")
        keyValues.put(R.id.button_6, "6")
        keyValues.put(R.id.button_7, "7")
        keyValues.put(R.id.button_8, "8")
        keyValues.put(R.id.button_9, "9")
        keyValues.put(R.id.button_0, "0")
        keyValues.put(R.id.button_Q, "Q")
        keyValues.put(R.id.button_W, "W")
        keyValues.put(R.id.button_E, "E")
        keyValues.put(R.id.button_R, "R")
        keyValues.put(R.id.button_T, "T")
        keyValues.put(R.id.button_Y, "Y")
        keyValues.put(R.id.button_U, "U")
        keyValues.put(R.id.button_I, "I")
        keyValues.put(R.id.button_O, "O")
        keyValues.put(R.id.button_P, "P")
        keyValues.put(R.id.button_A, "A")
        keyValues.put(R.id.button_S, "S")
        keyValues.put(R.id.button_D, "D")
        keyValues.put(R.id.button_F, "F")
        keyValues.put(R.id.button_G, "G")
        keyValues.put(R.id.button_H, "H")
        keyValues.put(R.id.button_J, "J")
        keyValues.put(R.id.button_K, "K")
        keyValues.put(R.id.button_L, "L")
        keyValues.put(R.id.button_Z, "Z")
        keyValues.put(R.id.button_X, "X")
        keyValues.put(R.id.button_C, "C")
        keyValues.put(R.id.button_V, "V")
        keyValues.put(R.id.button_B, "B")
        keyValues.put(R.id.button_N, "N")
        keyValues.put(R.id.button_M, "M")


    }

    override fun onClick(v: View?) {
        if (inputConnection == null) return



        if (v?.id == R.id.button_delete) {
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