package com.example.membersapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.borutoapp.util.Constants.RECEIPT_DATABASE_TABLE
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = RECEIPT_DATABASE_TABLE)
data class Receipt(
@PrimaryKey(autoGenerate = false)
var contribution_id:Int,
var member_id:Int,
var amount: Double,
var church_id:Int,
var receipt_number: String,
var payment_type:Int,
var payment_status:Int,
var time: String,
var date: String,
var month: String,
var year: String,
var staff_id:Int,
var status: String,
var type_value: String,
var first_name: String,
var second_name: String,
var surname: String,
var registration_id:Int,
var staff_first_name: String,
var staff_last_name: String,
var contribution_name: String? = null

)
