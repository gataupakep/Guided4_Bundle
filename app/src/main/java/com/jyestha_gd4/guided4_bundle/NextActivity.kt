package com.jyestha_gd4.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    private lateinit var nama: TextView
    private lateinit var nim: TextView
    private lateinit var fakultas: TextView
    private lateinit var prodi: TextView
    lateinit var mBundle: Bundle

    lateinit var yNama: String
    lateinit var yNim: String
    lateinit var yFakultas: String
    lateinit var yProdi: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBundle()
        setText()
    }

    fun getBundle() {
        //mengambil bundle dari activity sebelumnya dengan menggunakan key register
        mBundle = intent.getBundleExtra("register")!!
        //mengambil data dari bundle
        yNama = mBundle.getString("nama")!!
        yNim = mBundle.getString("nim")!!
        yFakultas = mBundle.getString("fakultas")!!
        yProdi = mBundle.getString("prodi")!!
    }

    fun setText() {
        nama = findViewById(R.id.tvNama)
        nama.setText(yNama)
        nim = findViewById(R.id.tvNim)
        nim.setText(yNim)
        fakultas = findViewById(R.id.tvFakultas)
        fakultas.setText(yFakultas)
        prodi = findViewById(R.id.tvProdi)
        prodi.setText(yProdi)
    }
}