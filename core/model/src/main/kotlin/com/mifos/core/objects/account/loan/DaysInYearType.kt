/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.objects.account.loan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/*
 * This project is licensed under the open source MPL V2.
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
/**
 * Created by nellyk on 2/21/2016.
 */
@Parcelize
data class DaysInYearType(
    var id: Int? = null,

    var code: Int? = null,

    var value: Int? = null,
) : Parcelable
