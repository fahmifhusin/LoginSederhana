package com.jelasteknologiblogspot.loginsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email:String = "user@gmail.com"
        val password:String = "12345"

        //inisiasi atribut pada tampilan login
        val etEmail:EditText= findViewById(R.id.et_email)
        val etPassword:EditText = findViewById(R.id.et_password)
        val btLoginSubmit:Button = findViewById(R.id.bt_login_submit)

        //menambahkan action button pada form login
        btLoginSubmit.setOnClickListener(View.OnClickListener {
            if (etEmail.text.isEmpty()||//aksi jika email atau password kosong
                etPassword.text.isEmpty()){
               Toast.makeText(this,"Isi data pengguna dengan benar", Toast.LENGTH_SHORT).show()
            }
            else if(etEmail.text.toString().equals(email)&&// aksi jika email dan password sesuai
                     etPassword.text.toString().equals(password)){
                Toast.makeText(this,"Login berhasil", Toast.LENGTH_SHORT).show()
            }
            else{//aksi jika email atau password tidak sesuai
                Toast.makeText(this,"Login gagal", Toast.LENGTH_SHORT).show()
            }
        })
    }
}