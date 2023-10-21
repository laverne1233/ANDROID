package com.estenzo.activity4

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.estenzo.activity4.databinding.Activity4Binding

class Activity4 : AppCompatActivity() {
    private lateinit var binding: Activity4Binding
    private lateinit var sharedPrefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        sharedPrefs = getSharedPreferences("SettingsPrefs", MODE_PRIVATE)
        val isDarkMode = sharedPrefs.getInt("themeSelection", R.id.lightModeRadio) == R.id.darkModeRadio
        val mode = if (isDarkMode) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
        AppCompatDelegate.setDefaultNightMode(mode)

        super.onCreate(savedInstanceState)
        binding = Activity4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Activity 4" // Set the activity title

        val themeRadioGroup = binding.themeRadioGroup
        val notificationsCheckbox = binding.notificationsCheckbox
        val emailEditText = binding.emailEditText
        val nicknameEditText = binding.nicknameEditText
        val saveButton = binding.saveButton

        loadSettings(themeRadioGroup, notificationsCheckbox, emailEditText, nicknameEditText)

        saveButton.setOnClickListener {
            saveSettings(themeRadioGroup, notificationsCheckbox, emailEditText, nicknameEditText)
            recreate() // Recreate the activity to apply the new theme
        }
    }

    private fun loadSettings(themeRadioGroup: RadioGroup, notificationsCheckbox: CheckBox, emailEditText: EditText, nicknameEditText: EditText) {
        themeRadioGroup.check(sharedPrefs.getInt("themeSelection", R.id.lightModeRadio))
        notificationsCheckbox.isChecked = sharedPrefs.getBoolean("notificationsEnabled", false)
        emailEditText.setText(sharedPrefs.getString("email", ""))
        nicknameEditText.setText(sharedPrefs.getString("nickname", ""))
    }

    private fun saveSettings(themeRadioGroup: RadioGroup, notificationsCheckbox: CheckBox, emailEditText: EditText, nicknameEditText: EditText) {
        val editor = sharedPrefs.edit()
        editor.putInt("themeSelection", themeRadioGroup.checkedRadioButtonId)
        editor.putBoolean("notificationsEnabled", notificationsCheckbox.isChecked)
        editor.putString("email", emailEditText.text.toString())
        editor.putString("nickname", nicknameEditText.text.toString())
        editor.apply()
    }
}
