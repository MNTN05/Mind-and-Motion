package com.mindandmotion.app.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Timer
import androidx.compose.ui.graphics.vector.ImageVector
import com.mindandmotion.app.R

enum class TopLevelDestination(
    val route: String,
    @param:StringRes val labelRes: Int,
    val icon: ImageVector,
) {
    TASKS("tasks", R.string.nav_tasks, Icons.Filled.CheckCircle),
    JOURNAL("journal", R.string.nav_journal, Icons.AutoMirrored.Filled.MenuBook),
    POMODORO("pomodoro", R.string.nav_pomodoro, Icons.Filled.Timer),
    INSPIRATION("inspiration", R.string.nav_inspiration, Icons.Filled.FormatQuote),
    SETTINGS("settings", R.string.nav_settings, Icons.Filled.Settings),
}

object Routes {
    const val TASK_EDIT = "task_edit"

    const val JOURNAL_ENTRY = "journal_entry"

    const val ABOUT = "about"

    const val LOGIN = "login"

    const val REGISTER = "register"
}
