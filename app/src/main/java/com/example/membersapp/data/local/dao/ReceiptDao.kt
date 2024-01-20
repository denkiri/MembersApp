package com.example.membersapp.data.local.dao
import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.membersapp.domain.model.Receipt
@Dao
interface ReceiptDao {
    @Query("SELECT * FROM receipt_table ORDER BY contribution_id ASC")
    fun getAllReceipt(): PagingSource<Int, Receipt>
    @Query("SELECT * FROM receipt_table WHERE contribution_id=:receiptId")
    fun getSelectedReceipt(receiptId: Int): Receipt
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addReceipt(heroes: List<Receipt>)
    @Query("DELETE FROM receipt_table")
    suspend fun deleteAllReceipt()

}