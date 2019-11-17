package com.kotlinhva.studentportal

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_portal.*

const val PORTAL = "PORTAL_EXTRA"
class CreatePortalActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_portal)
        initViews()
    }

    private fun initViews() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnConfirm.setOnClickListener { onConfirmClick() }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    /**
     * Create a [portal] object start the [portalActivity] and parse the [portal] object to it.
     */
    private fun onConfirmClick() {
        val profile = Portal(
            etTitle.text.toString(),
            etUrl.text.toString()
        )

        val resultIntent = Intent()
        resultIntent.putExtra(PORTAL, profile)
        setResult(Activity.RESULT_OK, resultIntent)
        finish()

    }


}
