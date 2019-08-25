package com.example.fragmentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

public class MainActivity : AppCompatActivity() {

    var sayi1: EditText? = null
    var sayi2: EditText? = null
    //lateinit var fragmenteGonder: Button
    var manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sayi1 = findViewById(R.id.birinci_sayi)
        sayi2 = findViewById(R.id.ikinci_Sayi)
        //fragmenteGonder = findViewById(R.id.btnFragmentegonder) as Button
        //manager=supportFragmentManager
    }

    fun calistir(view: View) {

        var fragmentA = Fragment_A()
        val birinciSayi = Integer.parseInt(sayi1!!.getText().toString())
        val ikinciSayi = Integer.valueOf(sayi2!!.getText().toString())
//        var args = Bundle()
//        val birinciSayi = Integer.parseInt(sayi1!!.getText().toString())
//        val ikinciSayi = Integer.valueOf(sayi2!!.getText().toString())
//        args.putInt("birinci", birinciSayi)
//        args.putInt("ikinci", ikinciSayi)
//        fragmentA.arguments = args

        //fragmentA.setData(int birinciSayi,int:ikinciSayi)

        var transaction = manager.beginTransaction()
        transaction.add(R.id.container, fragmentA, "fragA")
        transaction.commit()
        //Log.e("aki", "calistir komutu")


    }
}
