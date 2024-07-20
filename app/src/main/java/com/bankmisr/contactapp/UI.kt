package com.bankmisr.contactapp

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UI(modifier: Modifier = Modifier) {
    val homenum= stringResource(id = R.string.Homenum)
    val context = LocalContext.current
    var contacts= ContactRepository.getContacts()
    Column( modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar(
            title = { Text(stringResource(id = R.string.title)) },
            actions = {
                IconButton(onClick ={
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${homenum}"))
                    context.startActivity(intent)
                }) {
                    Icon(painter = painterResource(id = R.drawable.baseline_home_24), contentDescription = "Home")
                }
            })
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 132.dp)
        ) {
            items(contacts) {
                    contact ->
                ContactUi(modifier,contact.phonenumber,  contact.image ,contact.name)
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun UIPreview() {
    UI()
}