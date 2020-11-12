package bezi.amine.thinkitchallenge.ui.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import bezi.amine.thinkitchallenge.R
import bezi.amine.thinkitchallenge.ui.main.adapter.ListAdapter
import bezi.amine.thinkitchallenge.ui.main.model.ListEntity
import bezi.amine.thinkitchallenge.utils.Constants
import bezi.amine.thinkitchallenge.utils.SharedPreferences
import kotlinx.android.synthetic.main.fragment_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        tv_first.text = Calendar.getInstance().time.toString(Constants.FORMAT_DATE)
        tv_second.text = context!!.getString(R.string.welcome) + " " + SharedPreferences(context!!).getString(Constants.SHARED_USERNAME,"") + "!"
        rv_main.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ListAdapter(view?.context,Constants.getList())
        }
    }

    private fun Date.toString(format: String, locale: Locale = Locale.getDefault()): String {
        return SimpleDateFormat(format, locale).format(this)
    }

}