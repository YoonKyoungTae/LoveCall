package dev.android_blog.lovecall

import android.content.Context
import android.content.Intent
import android.net.Uri

fun callToNumber(context: Context, number: String) {
    val tel = "tel:$number"
    context.startActivity(Intent("android.intent.action.CALL", Uri.parse(tel)));
}