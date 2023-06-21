package com.berivan.sehirplakabulma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.berivan.sehirplakabulma.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if(binding.editTextNumber.text.isNotEmpty()){
                var plakakodu=binding.editTextNumber.text.toString().toInt()
                when(plakakodu){
                    1-> binding.textView.text="ADANA"
                    6-> binding.textView.text="ANKARA"
                    else->{
                        binding.textView.text="bulunmadı"
                }
                }
            }else {
                binding.textView.text= "Lütfen Geçerli Bir Sayı Giriniz!"
            }
        }
    }
}