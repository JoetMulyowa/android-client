/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
plugins {
    alias(libs.plugins.mifos.android.feature)
    alias(libs.plugins.mifos.android.library.compose)
    alias(libs.plugins.mifos.android.library.jacoco)
}

android {
    namespace = "com.mifos.feature.path.tracking"
}

dependencies {
    implementation(projects.core.domain)

    implementation(libs.androidx.material)
    implementation(libs.accompanist.permission)

    implementation(libs.coil.kt.compose)
    testImplementation(libs.hilt.android.testing)
    testImplementation(projects.core.testing)
    androidTestImplementation(projects.core.testing)

    implementation(libs.maps.compose)
}