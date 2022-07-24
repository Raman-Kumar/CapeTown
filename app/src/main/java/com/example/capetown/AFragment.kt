package com.example.capetown

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        Log.d("fragment lifecycle", " AFragment onCreate()");
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("fragment lifecycle", " AFragment onCreateView()");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("fragment lifecycle", " AFragment onViewCreated()");

        val buttonForNextFragment = view.findViewById<Button>(R.id.buttonForNextFragment)
        buttonForNextFragment.setOnClickListener{
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_view, BFragment.newInstance("empty", "empty"))
                commit()
            }
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("fragment lifecycle", " AFragment onConfigurationChanged()");
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("fragment lifecycle", " AFragment onAttach()");
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        Log.d("fragment lifecycle", " AFragment onAttach deprecated()");
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("fragment lifecycle", " AFragment onActivityCreated()");
    }

    override fun onStart() {
        super.onStart()
        Log.d("fragment lifecycle", " AFragment onStart()");
    }

    override fun onResume() {
        super.onResume()
        Log.d("fragment lifecycle", " AFragment onResume()");
    }

    override fun onPause() {
        super.onPause()
        Log.d("fragment lifecycle", " AFragment onPause()");
    }

    override fun onStop() {
        super.onStop()
        Log.d("fragment lifecycle", " AFragment onStop()");
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("fragment lifecycle", " AFragment onDestroyView()");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("fragment lifecycle", " AFragment onDestroy()");
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("fragment lifecycle", " AFragment onDetach()");
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic // - avoid creating AClass.Companion.method(...)
        fun newInstance(param1: String, param2: String) =
            AFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}