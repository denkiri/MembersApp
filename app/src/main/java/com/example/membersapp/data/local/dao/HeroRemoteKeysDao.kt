package com.example.membersapp.data.local.dao
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.membersapp.domain.model.ReceiptRemoteKeys
@Dao
interface HeroRemoteKeysDao {
    @Query("SELECT * FROM receipt_remote_keys_table WHERE id = :receiptId")
    suspend fun getRemoteKeys(receiptId: Int): ReceiptRemoteKeys?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(receiptRemoteKeys: List<ReceiptRemoteKeys>)
    @Query("DELETE FROM receipt_remote_keys_table")
    suspend fun deleteAllRemoteKeys()

}