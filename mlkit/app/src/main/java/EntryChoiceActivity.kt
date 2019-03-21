package com.google.firebase.samples.apps.mlkit

import android.content.Intent
import com.firebase.example.internal.BaseEntryChoiceActivity
import com.firebase.example.internal.Choice

class EntryChoiceActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return listOf(
                Choice(
                        "Java",
                        "Run the app written in Java.",
                        Intent(this,
                                com.google.firebase.samples.apps.mlkit.java.ChooserActivity::class.java))
        )
    }
}
