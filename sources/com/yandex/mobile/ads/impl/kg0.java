package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class kg0 extends kp0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final zf0 f22401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final og0 f22402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private sa0 f22403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f22404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f22405o;

    public interface a {
        void a();

        void b();
    }

    public kg0(Context context) throws Throwable {
        super(context);
        this.f22405o = false;
        this.f22403m = new q11();
        zf0 zf0Var = new zf0();
        this.f22401k = zf0Var;
        this.f22402l = new og0(this, zf0Var);
    }

    @Override // com.yandex.mobile.ads.impl.kp0, com.yandex.mobile.ads.impl.zz
    public final void a() {
        super.a();
        a aVar = this.f22404n;
        if (aVar != null) {
            this.f22405o = true;
            aVar.b();
            this.f22404n = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.kp0, com.yandex.mobile.ads.impl.zz
    public final void a(int i10) {
        super.a(i10);
        if (this.f22404n != null) {
            stopLoading();
            this.f22404n.a();
            this.f22404n = null;
        }
    }

    public final void b(String str) {
        if (this.f22405o) {
            return;
        }
        this.f22402l.b(str);
    }

    @Override // com.yandex.mobile.ads.impl.kp0
    public final void h() {
        this.f22402l.a();
    }

    public final zf0 i() {
        return this.f22401k;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        sa0.a aVarA = this.f22403m.a(i10, i11);
        super.onMeasure(aVarA.f25006a, aVarA.f25007b);
    }

    public void setAspectRatio(float f10) {
        this.f22403m = new mt0(f10);
    }

    public void setClickListener(di diVar) {
        this.f22402l.a(diVar);
    }

    public void setPreloadListener(a aVar) {
        this.f22404n = aVar;
    }
}
