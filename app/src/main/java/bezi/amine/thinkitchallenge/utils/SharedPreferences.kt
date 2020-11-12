package bezi.amine.thinkitchallenge.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPreferences(context: Context) {

    private val sharedPreference : SharedPreferences = context.getSharedPreferences(Constants.SHARED_PREFERENCES, Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPreference.edit()


    fun getBoolean(name: String, defaultValue: Boolean): Boolean {
        return sharedPreference.getBoolean(name, defaultValue)
    }

    fun setBoolean(name: String, value: Boolean) {
        editor.putBoolean(name, value).apply()
    }

    fun getString(name: String, defaultValue: String): String? {
        return sharedPreference.getString(name, defaultValue)
    }

    fun setString(name: String, value: String) {
        editor.putString(name, value).apply()
    }

}