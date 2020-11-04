package es.vrivas.ejemplosapartado11propietariosyperros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_add_perro.setOnClickListener(this)
        bt_add_propietario.setOnClickListener(this)

        val acerca_de_fragment = acerca_de.newInstance("Víctor Rivas", 2020)
        val visitar_pagina_web = VisitarPaginaWeb.newInstance()

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.ly_contenedor, acerca_de_fragment)
        fragmentTransaction.add(R.id.ly_contenedor, visitar_pagina_web)

        fragmentTransaction.commit()
    }


    override fun onClick(v: View?) {
        var intent: Intent?=null
        when( v ) {
            bt_add_perro -> intent= Intent( this, NuevoPerro::class.java)
            bt_add_propietario -> intent= Intent( this, NuevoPropietario::class.java)
        }
        startActivity(intent)
    }
}