package com.example.loginbasicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Usuario y contraseña válidos para la prueba
    private val usuarioValido = "admin"
    private val passwordValido = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los elementos de la interfaz
        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener {
            val usuario = etUsuario.text.toString()
            val password = etPassword.text.toString()

            // Validación de campos
            if (usuario.isBlank() || password.isBlank()) {
                Toast.makeText(this, "Complete ambos campos", Toast.LENGTH_SHORT).show()
            } else if (usuario == usuarioValido && password == passwordValido) {
                Toast.makeText(this, "Login exitoso", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }

    }
}