package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class vf0 implements ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f25973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f25974b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w91 f25975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25976d;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<View> f25977b;

        public a(View view) {
            this.f25977b = new WeakReference<>(view);
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f25977b.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public vf0(FrameLayout frameLayout, w91 w91Var) {
        this.f25973a = frameLayout;
        frameLayout.setVisibility(8);
        this.f25975c = w91Var;
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void a(boolean z10) {
        this.f25976d = true;
        this.f25974b.removeCallbacksAndMessages(null);
        w91 w91Var = this.f25975c;
        View view = this.f25973a;
        Objects.requireNonNull(w91Var);
        view.setVisibility(z10 ? 8 : 0);
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void c() {
        if (this.f25976d) {
            return;
        }
        this.f25974b.postDelayed(new a(this.f25973a), 200L);
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final View d() {
        return this.f25973a;
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void invalidate() {
    }
}
