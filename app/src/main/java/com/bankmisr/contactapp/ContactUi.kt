package com.bankmisr.contactapp

import android.content.Intent
import android.net.Uri
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ContactUi(
    modifier: Modifier = Modifier,
    @StringRes phoneNumber: Int, // Pass resource ID for phone number
    @DrawableRes img: Int, // Pass resource ID for image
    @StringRes Contact: Int // Pass resource ID for contact name
) {
    val height =176.dp
    val width=130.dp
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color(0xFFE0E0E0))
            .wrapContentWidth()
            .wrapContentHeight()
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(id = img) ,
            contentDescription = null,
            modifier = Modifier
                .width(140.dp)
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .clickable {
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${phoneNumber}"))
                    context.startActivity(intent)
                },
        )
        Text(
            text = stringResource(id = Contact), // Add the text you want to display
            color = Color.Black,
            style = MaterialTheme.typography.titleLarge.copy(//fontSize = 16.sp,

                fontFamily = FontFamily.Default // Change this to match the desired font family
            )
        )

        SelectionContainer {
            Text(
                text = stringResource(id = phoneNumber),
                style = MaterialTheme.typography.bodySmall,
                color = Color.DarkGray
            )
        }
    }

}






@Preview
@Composable
fun ContactUiPreview() {
    ContactUi( phoneNumber =  R.string.numContact1,
        img =  R.drawable.auntie , Contact =  R.string.Contact1
    )
}