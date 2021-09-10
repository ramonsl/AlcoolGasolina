package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btnCalcular.setOnClickListener{
            val precoAlcool=  bind.txtAlcool.text.toString().toDouble()
            val precoGasolina =bind.txtGasolina.text.toString().toDouble()
            val combustivel = Combustivel(precoGasolina,precoAlcool);
        //    Toast.makeText(this,combustivel.calcular(),Toast.LENGTH_LONG).show();
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("TAG",combustivel)
            startActivity(intent)
        }




    }
}