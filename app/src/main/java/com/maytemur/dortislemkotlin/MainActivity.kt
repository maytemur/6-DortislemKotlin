package com.maytemur.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var birinci : Double? = null
    var ikinci : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun topla (view : View){
        birinci = editText1.text.toString().toDoubleOrNull()
        ikinci=editText2.text.toString().toDoubleOrNull()
        if (birinci==null || ikinci==null){
            textSonuc.text = "Lütfen sayi giriniz !"
        } else {
            sonuc = birinci!!+ikinci!!
            textSonuc.text = "Sonuç : ${sonuc}"
        }
    }
    fun cikar (view : View) {
        birinci = editText1.text.toString().toDoubleOrNull()
        ikinci = editText2.text.toString().toDoubleOrNull()
        if (birinci == null || ikinci == null) {
            textSonuc.text = "Lütfen sayi giriniz !"
        } else {
            sonuc = birinci!! - ikinci!!
            textSonuc.text = "Sonuç : ${sonuc}"
        }
    }
    fun bol (view : View){
        birinci = editText1.text.toString().toDoubleOrNull()
        ikinci=editText2.text.toString().toDoubleOrNull()
        if (birinci==null || ikinci==null){
            textSonuc.text = "Lütfen sayi giriniz !"
        } else {
            sonuc = birinci!!/ikinci!!
            textSonuc.text = "Sonuç : ${sonuc}"
    }

    }
    fun carp (view : View){
        birinci = editText1.text.toString().toDoubleOrNull()
        ikinci=editText2.text.toString().toDoubleOrNull()
        if (birinci==null || ikinci==null){
            textSonuc.text = "Lütfen sayi giriniz !"
        } else {
            sonuc = birinci!!*ikinci!!
            textSonuc.text = "Sonuç : ${sonuc}"
    }

    }

}