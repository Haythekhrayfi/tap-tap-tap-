package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.IReporter;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1695i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f16312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2097y.b f16313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2097y f16314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IReporter f16315d;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i0$a */
    public static final class a implements C2097y.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C2097y.b
        public final void a(Activity activity, C2097y.a aVar) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 1) {
                C1695i0.this.f16315d.resumeSession();
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                C1695i0.this.f16315d.pauseSession();
            }
        }
    }

    public C1695i0(C2097y c2097y) {
        this(c2097y, null, 2);
    }

    public C1695i0(C2097y c2097y, IReporter iReporter) {
        this.f16314c = c2097y;
        this.f16315d = iReporter;
        this.f16313b = new a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1695i0(C2097y c2097y, IReporter iReporter, int i10) {
        W0 w0A;
        if ((i10 & 2) != 0) {
            w0A = Oh.a();
            fd.j0.h(w0A, "YandexMetricaSelfReportFacade.getReporter()");
        } else {
            w0A = null;
        }
        this(c2097y, w0A);
    }

    public final synchronized void a(Context context) {
        if (this.f16312a == null) {
            Context applicationContext = context.getApplicationContext();
            this.f16314c.a(applicationContext);
            this.f16314c.a(this.f16313b, C2097y.a.RESUMED, C2097y.a.PAUSED);
            this.f16312a = applicationContext;
        }
    }
}
