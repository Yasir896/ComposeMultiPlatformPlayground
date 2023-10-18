package com.techlads.composemultiplatformplayground.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.techlads.composemultiplatformplayground.ui.DarkColorScheme
import com.techlads.composemultiplatformplayground.ui.LightColorScheme
import com.techlads.composemultiplatformplayground.ui.Typography

@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}