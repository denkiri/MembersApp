package com.example.membersapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.membersapp.data.local.dao.ReceiptDao
import com.example.membersapp.data.local.dao.HeroRemoteKeysDao
import com.example.membersapp.domain.model.Receipt
import com.example.membersapp.domain.model.ReceiptRemoteKeys
@Database(entities = [Receipt::class, ReceiptRemoteKeys::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class MembersAppDatabase : RoomDatabase() {

    companion object {
        fun create(context: Context, useInMemory: Boolean): MembersAppDatabase {
            val databaseBuilder = if (useInMemory) {
                Room.inMemoryDatabaseBuilder(context, MembersAppDatabase::class.java)
            } else {
                Room.databaseBuilder(context, MembersAppDatabase::class.java, "test_database.db")
            }
            return databaseBuilder
                .fallbackToDestructiveMigration()
                .build()
        }
    }

    abstract fun heroDao(): ReceiptDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao

}