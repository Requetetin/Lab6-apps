package com.example.lab6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab6.databinding.FragmentStartBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [StartFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [StartFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StartFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater,container:ViewGroup?,
                              savedInstanceState: Bundle?):View? {
        val binding: FragmentStartBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_start , container, false
        )

        binding.buttonOne="Iniciar encuesta"


        binding.encuestaButton.setOnClickListener(){
            view!!.findNavController().navigate(R.id.action_startFragment_to_questionFragment)
        }

        binding.plusButton.setOnClickListener(){
            view!!.findNavController().navigate(R.id.action_startFragment_to_addFragment)
        }
        return binding.root
    }






}
