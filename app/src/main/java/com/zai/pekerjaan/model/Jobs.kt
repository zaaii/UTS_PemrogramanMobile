package com.zai.pekerjaan.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Jobs(
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId2: Int,
    @StringRes val stringResourceId3: Int) {
}