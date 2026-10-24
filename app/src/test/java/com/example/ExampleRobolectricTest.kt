package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.local.AppDatabase
import com.example.data.local.WorkoutLogEntity
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34])
class ExampleRobolectricTest {

    @Test
    fun readStringFromContext() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val appName = context.getString(R.string.app_name)
        assertEquals("MOTIVATEUR MARCEL+257", appName)
    }

    @Test
    fun localRoomDatabase_storesAndRetrievesWorkout() = runBlocking {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val db = AppDatabase.getDatabase(context)
        val dao = db.workoutLogDao()

        dao.insertLog(
            WorkoutLogEntity(
                exerciseName = "Pompe zisanzwe",
                repsDone = 15,
                durationSeconds = 60,
                notes = "Imyitozo y'igitondo"
            )
        )

        val logs = dao.getAllLogs().first()
        assertEquals(1, logs.size)
        assertEquals("Pompe zisanzwe", logs[0].exerciseName)
        assertEquals(15, logs[0].repsDone)
    }
}
