package com.example.daydayup.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.daydayup.R
import com.example.daydayup.util.simpleLogMethod
import kotlinx.android.synthetic.main.fragment_life_cycler1.*
import kotlinx.android.synthetic.main.fragment_life_cycler2.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LifecyclerFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class LifecycleFragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        simpleLogMethod("onCreate")

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onAttach(context: Context) {
        simpleLogMethod("onAttach")
        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        simpleLogMethod("onActivityCreated")

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        simpleLogMethod("onStart")
        super.onStart()
    }
    var  index=1

    override fun onResume() {
        if (index == 0) {
//            tv_title.visibility = View.INVISIBLE
        }
        //通过decorView找某个id，不是相同id 的只招第一个 ，会找到LifecycleFragment1中的 textview
        var tv = activity?.window?.decorView?.findViewById<TextView>(R.id.tv_title)

        simpleLogMethod("onResume")

        index--
        super.onResume()
    }

    override fun onPause() {
        simpleLogMethod("onPause")

        super.onPause()
    }

    override fun onStop() {
        simpleLogMethod("onStop")

        super.onStop()
    }

    override fun onDestroy() {
        simpleLogMethod("onDestroy")

        super.onDestroy()
    }

    override fun onDestroyView() {
        simpleLogMethod("onDestroyView")

        super.onDestroyView()
    }

    override fun onDetach() {
        simpleLogMethod("onDetach")

        super.onDetach()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        simpleLogMethod("onCreateView")

        return inflater.inflate(R.layout.fragment_life_cycler2, container, false)
    }


}