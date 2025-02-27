/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.objects.nav

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/*
 * Created by Aditya Gupta on 22/7/23.
*/

@Parcelize
data class ClientArgs(
    var clientId: Int? = null,

    var savingsAccountNumber: Int? = null,

    var loanAccountNumber: Int? = null,
) : Parcelable
