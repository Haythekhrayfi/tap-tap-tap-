package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q60 f20514b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nh1 f20513a = new nh1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g30 f20515c = new g30();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f20516d = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.yandex.mobile.ads.nativeads.w f20517b;

        public a(com.yandex.mobile.ads.nativeads.w wVar) {
            this.f20517b = wVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View viewE = this.f20517b.e();
            if (viewE instanceof FrameLayout) {
                f30.this.f20515c.a(f30.this.f20514b.a(viewE.getContext()), (FrameLayout) viewE);
                f30 f30Var = f30.this;
                f30Var.f20516d.postDelayed(f30Var.new a(this.f20517b), 300L);
            }
        }
    }

    public f30(al0 al0Var, List<g11> list) {
        this.f20514b = r60.a(al0Var, list);
    }

    public final void a() {
        this.f20516d.removeCallbacksAndMessages(null);
    }

    public final void a(Context context, com.yandex.mobile.ads.nativeads.w wVar) {
        boolean zBooleanValue;
        Objects.requireNonNull(this.f20513a);
        i01 i01VarB = i01.b();
        nz0 nz0VarA = i01VarB.a(context);
        Boolean boolB0 = nz0VarA != null ? nz0VarA.b0() : null;
        boolean zE = i01VarB.e();
        if (boolB0 != null) {
            zBooleanValue = boolB0.booleanValue();
        } else {
            zBooleanValue = zE && u6.a(context);
        }
        if (zBooleanValue) {
            this.f20516d.post(new a(wVar));
        }
    }

    public final void a(com.yandex.mobile.ads.nativeads.w wVar) {
        a();
        View viewE = wVar.e();
        if (viewE instanceof FrameLayout) {
            this.f20515c.a((FrameLayout) viewE);
        }
    }
}
