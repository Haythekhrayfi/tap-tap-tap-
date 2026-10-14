package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ConsentForm {

    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}
