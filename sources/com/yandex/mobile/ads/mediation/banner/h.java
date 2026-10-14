package com.yandex.mobile.ads.mediation.banner;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f27527a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<ViewGroup> f27528b;

    public interface a {
    }

    public h(com.yandex.mobile.ads.banner.g gVar) {
        this.f27528b = new WeakReference<>(gVar);
    }

    public final void a(View view, com.yandex.mobile.ads.mediation.banner.a.C0213a c0213a) {
        this.f27527a.post(new f(this, view, c0213a));
    }
}
