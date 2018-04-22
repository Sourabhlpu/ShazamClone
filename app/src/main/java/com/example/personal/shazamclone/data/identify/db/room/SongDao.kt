package com.example.personal.shazamclone.data.identify.db.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.example.personal.shazamclone.domain.Song

/**
 * Created by personal on 4/20/2018.
 */
@Dao
interface SongDao{

    @Query("SELECT * FROM songData")
     fun getAll() : List<Song>

    @Insert(onConflict = REPLACE)
     fun insert(song : Song)
}