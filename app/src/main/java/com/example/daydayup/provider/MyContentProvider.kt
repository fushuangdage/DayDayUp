//package com.example.daydayup.provider
//
//import android.content.ContentProvider
//import android.content.ContentValues
//import android.database.Cursor
//import android.net.Uri
//
//class MyContentProvider : ContentProvider() {
//
//
//
//    override fun insert(uri: Uri, values: ContentValues?): Uri? {
//        TODO("Implement this to handle requests to insert a new row.")
//    }
//
//    override fun onCreate(): Boolean {
//    }
//
//    override fun query(
//        uri: Uri, projection: Array<String>?, selection: String?,
//        selectionArgs: Array<String>?, sortOrder: String?
//    ): Cursor? {
//    }
//
//    override fun update(
//        uri: Uri, values: ContentValues?, selection: String?,
//        selectionArgs: Array<String>?
//    ): Int {
//    }
//
//
//    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
//
//    }
//
//    override fun getType(uri: Uri): String? {
//        TODO("Not yet implemented")
//    }
//}
