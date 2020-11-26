package com.example.copiaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // para añadir el "nav_items" hemos de crear una carpeta menu, en esa carpeta tenemos que crear un nuevo archivo que se llamara "nav_items"
        // despues es ir poniendo las imagenes en drawable y poniendo los id's, luego insertamos:
        // app:menu="@menu/nav_items"
    }
}