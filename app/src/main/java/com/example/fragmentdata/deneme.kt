/**package com.example.emrealtunbilek.activitydenfragmentedata

import android.app.FragmentManager
import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.ButtonBarLayout
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    internal var sayi1: EditText
    internal var sayi2: EditText
    internal var fragmenteGonder: Button
    internal var manager: FragmentManager


    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sayi1 = findViewById(R.id.birinci_sayi)
        sayi2 = findViewById(R.id.ikinci_Sayi)
        fragmenteGonder = findViewById(R.id.btnFragmentegonder)
        manager = getFragmentManager()


    }

    fun calistir(v: View) {
        val fragmentA = FragmentA()

        val birinciSayi = Integer.parseInt(sayi1.getText().toString())
        val ikinciSayi = Integer.valueOf(sayi2.getText().toString())

        //        Bundle bundle=new Bundle();
        //
        //        bundle.putInt("birinci", birinciSayi);
        //        bundle.putInt("ikinci", ikinciSayi);

        fragmentA.sendData(birinciSayi, ikinciSayi)
        fragmentA.sendOgrenci(Ogrenci())
        val transaction = manager.beginTransaction()
        transaction.add(R.id.container, fragmentA, "fragA")
        transaction.commit()


    }

    internal inner class Ogrenci {

        var ogrNo: Int = 0
        var ad: String? = null

    }


}*/