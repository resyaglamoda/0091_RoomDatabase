package com.example.myapplication9.repositori

import com.example.myapplication9.room.Siswa
import com.example.myapplication9.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

