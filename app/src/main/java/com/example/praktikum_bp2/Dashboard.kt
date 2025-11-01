package com.example.praktikum_bp2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val dataList = arrayListOf(
            Mahasiswa("Nasylla Ajeng Kirani", "24.12.3105"),
            Mahasiswa("Raisha Akmala Rizqyah", "24.12.3100"),
            Mahasiswa("Calista Sasikirana", "24.12.3104"),
            Mahasiswa("Mahadewi Sabrina Putri", "24.12.3112")
        )

        val rvMahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)
        rvMahasiswa.layoutManager = GridLayoutManager(this, 2)
        val adapter = MahasiswaAdapter(dataList)
        rvMahasiswa.adapter = adapter
    }
}