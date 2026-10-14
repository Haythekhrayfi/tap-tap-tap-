package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResultReceiver f24925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<com.yandex.mobile.ads.nativeads.k> f24926b;

    public s3(com.yandex.mobile.ads.nativeads.k kVar) {
        this.f24926b = new WeakReference<>(kVar);
        AdResultReceiver adResultReceiver = new AdResultReceiver(new Handler(Looper.getMainLooper()));
        this.f24925a = adResultReceiver;
        adResultReceiver.a(this);
    }

    public final AdResultReceiver a() {
        return this.f24925a;
    }

    @Override // com.yandex.mobile.ads.impl.o2
    public final void onReceiveResult(int i10, Bundle bundle) {
        com.yandex.mobile.ads.nativeads.k kVar = this.f24926b.get();
        if (kVar != null) {
            if (i10 == 19) {
                kVar.g();
            }
            if (i10 == 20) {
                kVar.f();
                return;
            }
            switch (i10) {
                case 6:
                    kVar.e();
                    break;
                case 7:
                    kVar.d();
                    break;
                case 8:
                    kVar.c();
                    break;
                case 9:
                    kVar.b();
                    break;
            }
        }
    }
}
