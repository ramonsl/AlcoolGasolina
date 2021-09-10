package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bind = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bind.root)
        val comb =intent.getParcelableExtra<Combustivel>("TAG")

        bind.lblAlcool.text = comb?.precoAlc.toString();
        bind.lblGasolina.text = comb?.precoGas.toString();
        bind.lblMEnsagem.text = comb?.calcular()

    }
}