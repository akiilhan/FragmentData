package com.example.fragmentdata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*
import java.util.zip.Inflater

class Fragment_A : Fragment() {
    var hesaplabuton: Button? = null

    var sonuc = tvSonuc
    var sayi1 = 0
    var sayi2 = 0



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var inflater: View = inflater.inflate(R.layout.fragment_a, container, false)


//        val sayi1 = bundle?.getInt("birinci", 0)
  //      val sayi2 = bundle?.getInt("ikinci", 0)

        hesaplabuton = inflater.findViewById<Button>(R.id.btnHesapla)
        sonuc = inflater.findViewById(R.id.tvSonuc)



        hesaplabuton?.setOnClickListener {
            var sonuc1 = sayi1 +sayi2
            sonuc.text = "SONUC =$sonuc1"


        }
        return inflater

    }

    fun sendData(birinciSayi: Int, ikinciSayi: Int) {
        this.sayi1=birinciSayi
        this.sayi2=ikinciSayi

    }




}


