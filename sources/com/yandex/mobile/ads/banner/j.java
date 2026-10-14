package com.yandex.mobile.ads.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.fh1;
import com.yandex.mobile.ads.impl.l6;
import com.yandex.mobile.ads.impl.mz;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.w3;
import com.yandex.mobile.ads.impl.x60;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends mz implements fh1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final b f18150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g f18151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Runnable f18152z;

    @SuppressLint({"VisibleForTests"})
    public j(Context context, g gVar, w3 w3Var) {
        super(context, l6.f22627b, w3Var);
        this.f18152z = new l(this);
        this.f18149w = true;
        this.f18150x = new b(gVar);
        this.f18151y = gVar;
        gVar.addVisibilityChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        x60.d("Ad will be loaded soon by ad-refresher", new Object[0]);
        b(f());
    }

    private void v() {
        x60.d("scheduleAdRefreshTimer()", new Object[0]);
        this.f18883a.removeCallbacks(this.f18152z);
        x60.d("Refresh timer was cancelled", new Object[0]);
        AdResponse<String> adResponseH = h();
        if (adResponseH != null && adResponseH.M() && this.f18149w) {
            if (l() || !this.f18150x.b()) {
                return;
            }
            this.f18883a.postDelayed(this.f18152z, adResponseH.g());
            x60.d("Refresh timer was scheduled within %d seconds", Integer.valueOf(adResponseH.h()));
        }
    }

    @Override // com.yandex.mobile.ads.impl.fh1
    public void a(int i10) {
        v();
    }

    @Override // com.yandex.mobile.ads.impl.ae, com.yandex.mobile.ads.impl.kq0.a
    public void a(Intent intent) {
        super.a(intent);
        v();
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public void b(t2 t2Var) {
        super.b(t2Var);
        if (5 == t2Var.a() || 2 == t2Var.a()) {
            return;
        }
        v();
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public void c() {
        super.c();
        this.f18151y.removeVisibilityChangeListener(this);
        x60.d("disableAutoRefresh()", new Object[0]);
        this.f18149w = false;
        this.f18883a.removeCallbacks(this.f18152z);
        x60.d("Refresh timer was cancelled", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final void n() {
        super.n();
        v();
    }
}
