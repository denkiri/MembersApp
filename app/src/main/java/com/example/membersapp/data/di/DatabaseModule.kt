package com.example.membersapp.data.di

import android.content.Context
import androidx.room.Room
import com.example.borutoapp.util.Constants.BORUTO_DATABASE
import com.example.membersapp.data.local.MembersAppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): MembersAppDatabase {
        return Room.databaseBuilder(
            context,
            MembersAppDatabase::class.java,
            BORUTO_DATABASE
        ).build()
    }

//    @Provides
//    @Singleton
//    fun provideLocalDataSource(
//        database:  MembersAppDatabase
//    ): LocalDataSource {
//        return LocalDataSourceImpl(
//            borutoDatabase = database
//        )
//    }

}