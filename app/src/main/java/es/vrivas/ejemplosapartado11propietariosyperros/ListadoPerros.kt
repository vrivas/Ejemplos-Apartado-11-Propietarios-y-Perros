package es.vrivas.ejemplosapartado11propietariosyperros

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_listado_perros.*

/**
 * A simple [Fragment] subclass.
 */
class ListadoPerros : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fr_listado_perros
        return inflater.inflate(R.layout.fragment_listado_perros, container, false)
    } // Devuelve el View del fragmento para que pueda ser usado por la actividad


    override fun onResume() {
        super.onResume()
        tv_perros.text= datos.perros.toString()
    }
}