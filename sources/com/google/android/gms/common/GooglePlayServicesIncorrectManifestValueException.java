package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import j1.e;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i10) {
        super(i10, e.a("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, " but found ", i10, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
    }
}
