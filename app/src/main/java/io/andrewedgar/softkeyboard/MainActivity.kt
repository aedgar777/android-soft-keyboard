package io.andrewedgar.softkeyboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputEditText
import android.view.inputmethod.EditorInfo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText: TextInputEditText = findViewById(R.id.textEntryEditText)
        val keyboard: FullKeyboard = findViewById(R.id.textEntryKeyBoard)
        val inputConnection = editText.onCreateInputConnection(EditorInfo())

        keyboard.inflate(this)
        keyboard.inputConnection = inputConnection
    }
}
