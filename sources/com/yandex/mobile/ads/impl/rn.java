package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class rn implements ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f24796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oi f24797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xp0 f24798c = new xp0(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final um f24799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f24800e;

    public static class a implements yp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f24801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final oi f24802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final um f24803c;

        public a(View view, oi oiVar, um umVar) {
            this.f24801a = new WeakReference<>(view);
            this.f24802b = oiVar;
            this.f24803c = umVar;
        }

        @Override // com.yandex.mobile.ads.impl.yp0
        /* JADX INFO: renamed from: a */
        public final void mo3a() {
            View view = this.f24801a.get();
            if (view != null) {
                this.f24802b.b(view);
                this.f24803c.a(tm.f25400d);
            }
        }
    }

    public rn(View view, oi oiVar, um umVar, long j10) {
        this.f24796a = view;
        this.f24800e = j10;
        this.f24797b = oiVar;
        this.f24799d = umVar;
        oiVar.a(view);
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void a() {
        this.f24798c.d();
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void a(boolean z10) {
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void b() {
        this.f24798c.b();
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void c() {
        this.f24798c.a(this.f24800e, new a(this.f24796a, this.f24797b, this.f24799d));
        this.f24799d.a(tm.f25399c);
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final View d() {
        return this.f24796a;
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void invalidate() {
        this.f24798c.a();
    }
}
