package com.example.fragmentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

 class MainActivity : AppCompatActivity() {

    lateinit var sayi1:EditText
    lateinit var sayi2:EditText


    //var sayi1: EditText = findViewById(R.id.birinci_sayi)
    //lateinit var fragmenteGonder: Button
    var manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         sayi1 = findViewById(R.id.birinci_sayi)
         sayi2 = findViewById(R.id.ikinci_Sayi)

        //fragmenteGonder = findViewById(R.id.btnFragmentegonder) as Button
        manager=supportFragmentManager
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


        fragmentA.sendData(birinciSayi,ikinciSayi)


        var transaction = manager.beginTransaction()
        transaction.add(R.id.container, fragmentA, "fragA")
        transaction.commit()
        Log.e("aki", "calistir komutu")


    }




}


