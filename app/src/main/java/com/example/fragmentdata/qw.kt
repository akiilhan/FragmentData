/**package com.example.emrealtunbilek.activitydenfragmentedata

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.ButtonBarLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class FragmentA : Fragment() {

    internal var hesaplaButon: Button
    internal var sonucText: TextView
    internal var sayi1 = 0
    internal var sayi2 = 0
    internal var ogr: MainActivity.Ogrenci

    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle
    ): View? {
        val v = inflater.inflate(R.layout.fragment_a, container, false)


        val bundle = arguments

        val sayi1 = bundle.getInt("birinci", 0)
        val sayi2 = bundle.getInt("ikinci", 0)


        hesaplaButon = v.findViewById(R.id.btnHesapla)
        sonucText = v.findViewById(R.id.tvSonuc)

        hesaplaButon.setOnClickListener {
            val sonuc = sayi1 + sayi2
            sonucText.text = "SONUC =$sonuc"
        }
        return v
    }

    fun sendData(birinciSayi: Int, ikinciSayi: Int) {
        this.sayi1 = birinciSayi
        this.sayi2 = ikinciSayi

    }

    fun sendOgrenci(ogrenci: MainActivity.Ogrenci) {
        this.ogr = ogrenci

    }
}*/