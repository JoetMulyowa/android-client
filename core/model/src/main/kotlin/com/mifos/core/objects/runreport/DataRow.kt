/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.objects.runreport

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by Tarun on 03-08-17.
 */
@Parcelize
data class DataRow(var row: List<String> = listOf()) : Parcelable
