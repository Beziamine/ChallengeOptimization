package bezi.amine.thinkitchallenge.ui.main.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import androidx.navigation.fragment.NavHostFragment
import bezi.amine.thinkitchallenge.R
import bezi.amine.thinkitchallenge.utils.Constants
import bezi.amine.thinkitchallenge.utils.SharedPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        when {
            SharedPreferences(this).getBoolean(Constants.SHARED_FIRST_LAUNCH,true) -> {
                SharedPreferences(this).setBoolean(Constants.SHARED_FIRST_LAUNCH,false)
                setNavigation(R.navigation.navigation_mobile)
            }
            else -> {
                setNavigation(R.navigation.second_navigation_mobile)
            }
        }
    }

    private fun setNavigation(navigation : Int){
        val navHostFragment: NavHostFragment = nav_host_fragment as NavHostFragment
        navHostFragment.navController.graph = navHostFragment.navController.navInflater.inflate(navigation)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (currentFocus != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }
        return super.dispatchTouchEvent(ev)
    }
}