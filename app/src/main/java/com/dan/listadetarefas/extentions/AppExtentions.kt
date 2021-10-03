package com.dan.listadetarefas.extentions

import java.text.SimpleDateFormat
import java.util.*
import com.google.android.material.textfield.TextInputLayout

private val locale = Locale("pt", "BR")

fun Date.format() : String {
    return SimpleDateFormat("dd/MM/yyyy", locale).format(this)
}

var TextInputLayout.text : String
    get() = editText?.text?.toString() ?: ""
    set(value) {
        editText?.setText(value)
    }