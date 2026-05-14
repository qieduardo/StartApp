package com.example.startapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = Intent(this, PainelActivity::class.java)
        val homeButtonLogin = findViewById<Button>(R.id.homeButtonLogin)
        val editTextEmailLogin = findViewById<EditText>(R.id.editTextEmailLogin)
        val editTextSenhaLogin = findViewById<EditText>(R.id.editTextSenhaLogin)
        homeButtonLogin.setOnClickListener {
            if (editTextEmailLogin.text.isEmpty() || editTextSenhaLogin.text.isEmpty()) {
                Toast.makeText(
                    this, "Ops! Parece que você esqueceu de digitar algo", Toast.LENGTH_LONG
                ).show()
            } else {
                if (editTextEmailLogin.text.toString().equals("teste@teste.com") && editTextSenhaLogin.text.toString().equals("123"))
                    startActivity(intent)
                else{
                    Toast.makeText(this, "Usuário ou senha invalida",  Toast.LENGTH_LONG).show()
            }
        }
    }
            val intent2 = Intent(this, CadastroActivity::class.java)
            val homeButtonCadastro = findViewById<Button>(R.id.homeButtonCadastro)
            homeButtonCadastro.setOnClickListener {
                startActivity(intent2)
            }
        }
    }
