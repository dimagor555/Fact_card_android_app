package ru.dimagor555.factcard.data.file

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.*

@Entity(tableName = "files")
data class File(
    @PrimaryKey(autoGenerate = true) var idFile: Long = 0,
    val name: String,
    var lastUseTime: Long,
) {
    val lastUseTimeStr: String
        get() = formatter.format(Date(lastUseTime))

    companion object {
        private val formatter = SimpleDateFormat.getDateTimeInstance()
    }

    override fun toString(): String {
        return  "idFile = $idFile\n" +
                "name = $name\n" +
                "color = $name\n" +
                "lastUseTime = $lastUseTimeStr\n"
    }
}
