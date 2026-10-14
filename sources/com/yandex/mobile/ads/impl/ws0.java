package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ws0 implements ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f26352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProgressBar f26353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oi f26354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yi f26355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final um f26356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f26357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xp0 f26358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yp0 f26359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y61 f26360i;

    public static final class a implements y61 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yi f26361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f26362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<ProgressBar> f26363c;

        public a(ProgressBar progressBar, yi yiVar, long j10) {
            fd.j0.i(progressBar, "progressView");
            fd.j0.i(yiVar, "closeProgressAppearanceController");
            this.f26361a = yiVar;
            this.f26362b = j10;
            this.f26363c = new WeakReference<>(progressBar);
        }

        @Override // com.yandex.mobile.ads.impl.y61
        public final void a(long j10) {
            ProgressBar progressBar = this.f26363c.get();
            if (progressBar != null) {
                yi yiVar = this.f26361a;
                long j11 = this.f26362b;
                yiVar.a(progressBar, j11, j11 - j10);
            }
        }
    }

    public static final class b implements yp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final oi f26364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final um f26365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<View> f26366c;

        public b(View view, qr qrVar, um umVar) {
            fd.j0.i(view, "closeView");
            fd.j0.i(qrVar, "closeAppearanceController");
            fd.j0.i(umVar, "debugEventsReporter");
            this.f26364a = qrVar;
            this.f26365b = umVar;
            this.f26366c = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.yp0
        /* JADX INFO: renamed from: a */
        public final void mo3a() {
            View view = this.f26366c.get();
            if (view != null) {
                this.f26364a.b(view);
                this.f26365b.a(tm.f25400d);
            }
        }
    }

    public ws0(View view, ProgressBar progressBar, qr qrVar, yi yiVar, um umVar, long j10) {
        fd.j0.i(view, "closeButton");
        fd.j0.i(progressBar, "closeProgressView");
        fd.j0.i(qrVar, "closeAppearanceController");
        fd.j0.i(yiVar, "closeProgressAppearanceController");
        fd.j0.i(umVar, "debugEventsReporter");
        this.f26352a = view;
        this.f26353b = progressBar;
        this.f26354c = qrVar;
        this.f26355d = yiVar;
        this.f26356e = umVar;
        this.f26357f = j10;
        this.f26358g = new xp0(true);
        this.f26359h = new b(view, qrVar, umVar);
        this.f26360i = new a(progressBar, yiVar, j10);
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void a() {
        this.f26358g.d();
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void a(boolean z10) {
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void b() {
        this.f26358g.b();
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void c() {
        yi yiVar = this.f26355d;
        ProgressBar progressBar = this.f26353b;
        int i10 = (int) this.f26357f;
        Objects.requireNonNull(yiVar);
        yi.a(progressBar, i10);
        this.f26354c.a(this.f26352a);
        this.f26358g.a(this.f26360i);
        this.f26358g.a(this.f26357f, this.f26359h);
        this.f26356e.a(tm.f25399c);
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final View d() {
        return this.f26352a;
    }

    @Override // com.yandex.mobile.ads.impl.ri
    public final void invalidate() {
        this.f26358g.a();
    }
}
