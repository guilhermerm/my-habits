package com.guilhermemagro.myhabits.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HabitDao {
    @Query("SELECT * FROM habit")
    fun getAllHabits(): LiveData<List<Habit>>

    @Insert
    suspend fun insert(habit: Habit)

    @Delete
    fun delete(habit: Habit)
}