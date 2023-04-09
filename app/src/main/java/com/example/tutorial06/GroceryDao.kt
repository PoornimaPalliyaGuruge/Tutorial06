package com.example.tutorial06

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
@Entity
interface GroceryDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insert(item:GroceryItems)

    @Delete
    suspend fun delete(item:GroceryItems)

    @Query("SELECT * FROM grocery_items")
    fun getAllGroceryItems() : LiveData<List<GroceryItems>>


}