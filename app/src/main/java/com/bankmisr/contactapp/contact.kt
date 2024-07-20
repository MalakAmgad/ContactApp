package com.bankmisr.contactapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class contact(
    @StringRes val name: Int,
    @StringRes val phonenumber:Int,
    @DrawableRes val image:Int
)