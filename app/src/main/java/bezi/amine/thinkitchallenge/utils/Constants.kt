package bezi.amine.thinkitchallenge.utils

import bezi.amine.thinkitchallenge.R
import bezi.amine.thinkitchallenge.ui.main.model.ListEntity

object Constants {

    const val SHARED_PREFERENCES : String = "SharedPreferences"
    const val SHARED_FIRST_LAUNCH : String = "FirstLaunch"
    const val SHARED_USERNAME : String = "Username"
    const val FORMAT_DATE : String = "MMMM dd ,yyyy"

    fun getList() : List<ListEntity>{
        return listOf(
               ListEntity("Living Room","4 Devices",R.drawable.livingroom),
               ListEntity("Media Room","6 Devices",R.drawable.mediaroom),
               ListEntity("Bathroom","1 Device",R.drawable.bathroom),
               ListEntity("Bedroom","3 Devices",R.drawable.bedroom))
    }
}