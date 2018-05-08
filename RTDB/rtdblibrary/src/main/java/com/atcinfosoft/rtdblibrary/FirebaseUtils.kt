package com.atcinfosoft.rtdblibrary

import com.google.firebase.database.FirebaseDatabase
import java.util.*

fun writeData(node: String, url :String, value :Any){

    val mDatabase = FirebaseDatabase.getInstance().getReference(node)
    val key = mDatabase.child(url).push().key

    val childUpdates = HashMap<String,Any>()
    childUpdates.put("/$url/$key", value)

    mDatabase.updateChildren(childUpdates)

}
