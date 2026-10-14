package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ia1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ja1 f21658b = new ja1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yb1 f21659c = new yb1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ha1 f21660d = new ha1();

    public ia1(Context context) {
        this.f21657a = context.getApplicationContext();
    }

    public final void a() {
        yb1 yb1Var = this.f21659c;
        Context context = this.f21657a;
        Objects.requireNonNull(yb1Var);
        if (u6.a(context) && this.f21660d.a(this.f21657a)) {
            Objects.requireNonNull(this.f21658b);
            Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n***************************************************************************************\n* The integrated version of the Yandex Mobile Ads SDK is outdated.                    *\n* Please update com.yandex.android:mobileads to the latest version.                   *\n* Learn more about the latest version of the SDK here:                                *\n* https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html *\n* Changelog: https://yandex.ru/dev/mobile-ads/doc/intro/changelog-android.html        *\n***************************************************************************************\n");
        }
    }
}
