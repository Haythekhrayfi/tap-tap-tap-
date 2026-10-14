package com.yandex.mobile.ads.impl;

import android.view.View;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fe1 implements fg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ac1 f20675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cg1 f20676b;

    public fe1(ac1 ac1Var, cg1 cg1Var) {
        fd.j0.i(ac1Var, "videoAd");
        fd.j0.i(cg1Var, "eventsTracker");
        this.f20675a = ac1Var;
        this.f20676b = cg1Var;
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(float f10) {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(long j10) {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(View view, List<qc1> list) {
        fg1.a.a(view, list);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(eg1.a aVar) {
        fg1.a.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(pd1 pd1Var) {
        int i10;
        fd.j0.i(pd1Var, "error");
        switch (a6.a(pd1Var.a())) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i10 = 405;
                break;
            case 7:
                i10 = 402;
                break;
            case 8:
            case 12:
            case 28:
                i10 = 900;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i10 = 400;
                break;
            case 19:
                i10 = 401;
                break;
            case 23:
                i10 = 403;
                break;
            case 29:
                i10 = 901;
                break;
            case 30:
                i10 = 902;
                break;
            default:
                throw new jc.g();
        }
        this.f20676b.a(this.f20675a, "error", kc.e0.b(new jc.h("[ERRORCODE]", String.valueOf(i10))));
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(String str) {
        fg1.a.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void d() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void e() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void f() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void h() {
        this.f20676b.a(this.f20675a, "render_impression");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void i() {
        this.f20676b.a(pc1.a(this.f20675a), "renderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void j() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void k() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void l() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void m() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void n() {
        this.f20676b.a(this.f20675a, AdSDKNotificationListener.IMPRESSION_EVENT);
    }
}
