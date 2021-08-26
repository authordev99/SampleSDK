package com.example.library

import android.content.Context
import android.widget.Toast

class ToastMessage {
    companion object Factory {
        fun customToast(context: Context?, message: String?) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }

}