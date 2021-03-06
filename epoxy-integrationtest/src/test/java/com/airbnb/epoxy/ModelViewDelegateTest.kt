package com.airbnb.epoxy

import com.airbnb.epoxy.integrationtest.BuildConfig
import com.airbnb.epoxy.integrationtest.ViewWithDelegateModel_
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(21))
class ModelViewDelegateTest {

    @Test
    fun propMethodIsOnModel() {
        val model = ViewWithDelegateModel_()
        model.flag(true)
    }
}
