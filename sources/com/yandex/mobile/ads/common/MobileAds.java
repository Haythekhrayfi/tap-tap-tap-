package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.impl.bu0;
import com.yandex.mobile.ads.impl.cf0;
import com.yandex.mobile.ads.impl.i01;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.pc;
import com.yandex.mobile.ads.impl.t90;

/* JADX INFO: loaded from: classes2.dex */
public final class MobileAds {
    public static void enableDebugErrorIndicator(boolean z10) {
        i01.b().a(z10);
    }

    public static void enableLogging(boolean z10) {
        bu0.a(z10);
        o60.a(z10);
    }

    public static String getLibraryVersion() {
        return BuildConfigFieldProvider.getVersion();
    }

    public static void initialize(Context context, InitializationListener initializationListener) {
        if (new pc().a()) {
            return;
        }
        new t90(context).a();
        cf0.b().a(context, initializationListener);
    }

    public static void setAgeRestrictedUser(boolean z10) {
        i01.b().b(z10);
    }

    public static void setLocationConsent(boolean z10) {
        i01.b().c(z10);
    }

    public static void setUserConsent(boolean z10) {
        i01.b().d(z10);
    }

    public static void setVideoPoolSize(int i10) {
        i01.b().a(i10);
    }
}
