package com.techlads.composemultiplatformplayground

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.techlads.composemultiplatformplayground.contacts.domain.Contact
import com.techlads.composemultiplatformplayground.contacts.presentation.ContactListEvent
import com.techlads.composemultiplatformplayground.contacts.presentation.ContactListState
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactListViewModel: ViewModel() {

    private val _state = MutableStateFlow(
        ContactListState(
        contacts = contacts
    )
    )
    val state = _state.asStateFlow()

    var newContact: Contact? by mutableStateOf(null)
        private set

    fun onEvent(event: ContactListEvent) {

    }
}

private val contacts = (1 ..50).map {
    Contact(
        id = it.toLong(),
        firstName = "First$it",
        lastName = "Last$it",
        email = "johnDoe@gmail.com",
        phoneNumber = "00000000000",
        photoBytes = null
    )
}