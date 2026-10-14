package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yn1 implements tk, nb0.f, wf.a, yt, r80.b, n10.a, vx, lm.a, r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26944d = new yn1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26945e = new yn1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26946f = new yn1(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26947g = new yn1(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26948h = new yn1(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26949i = new yn1(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26950j = new yn1(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26951k = new yn1(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26952l = new yn1(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26953m = new yn1(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26954n = new yn1(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26955o = new yn1(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26956p = new yn1(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26957q = new yn1(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26958r = new yn1(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26959s = new yn1(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26960t = new yn1(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26961u = new yn1(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26962v = new yn1(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26963w = new yn1(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26964x = new yn1(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26965y = new yn1(21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ yn1 f26966z = new yn1(22);
    public static final /* synthetic */ yn1 A = new yn1(23);
    public static final /* synthetic */ yn1 B = new yn1(24);
    public static final /* synthetic */ yn1 C = new yn1(25);
    public static final /* synthetic */ yn1 D = new yn1(26);
    public static final /* synthetic */ yn1 E = new yn1(27);
    public static final /* synthetic */ yn1 F = new yn1(28);
    public static final /* synthetic */ yn1 G = new yn1(29);

    public /* synthetic */ yn1(int i10) {
        this.f26967c = i10;
    }

    @Override // com.yandex.mobile.ads.impl.nb0.f
    public int a(Object obj) {
        return nb0.a((ib0) obj);
    }

    @Override // com.yandex.mobile.ads.impl.lm.a
    public lm a() {
        return oq0.f();
    }

    @Override // com.yandex.mobile.ads.impl.r80.b
    public void a(Object obj, qv qvVar) {
        kn.a((x8) obj, qvVar);
    }

    @Override // com.yandex.mobile.ads.impl.n10.a
    public boolean a(int i10, int i11, int i12, int i13, int i14) {
        return n10.b(i10, i11, i12, i13, i14);
    }

    @Override // com.yandex.mobile.ads.impl.yt
    /* JADX INFO: renamed from: a */
    public ut[] mo2a() {
        switch (this.f26967c) {
            case 10:
                return g.a();
            case 12:
                return i7.a();
            case 15:
                return ma0.d();
            case 16:
                return mf0.b();
            case 23:
                return ri1.a();
            case 25:
                return tn0.a();
            default:
                return v8.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.tk
    public void accept(Object obj) {
        ez0.a((ez0.b) obj);
    }

    @Override // com.yandex.mobile.ads.impl.vx
    public Object apply(Object obj) {
        switch (this.f26967c) {
            case 18:
                return nf0.a((e71) obj);
            default:
                return new kn((ki) obj);
        }
    }

    @Override // com.yandex.mobile.ads.impl.wf.a
    public wf fromBundle(Bundle bundle) {
        switch (this.f26967c) {
            case 2:
                return am.a(bundle);
            case 3:
                return bc0.b.a(bundle);
            case 4:
                return bc0.h.a(bundle);
            case 5:
                return c4.a(bundle);
            case 6:
                return cm.a(bundle);
            case 7:
                return dp.a(bundle);
            case 8:
                return dr0.c.a(bundle);
            case 9:
                return e81.a.a(bundle);
            case 10:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            default:
                return new wq0(bundle);
            case 11:
                return h71.a(bundle);
            case 14:
                return m71.a(bundle);
            case 19:
                return ns.b(bundle);
            case 22:
                return po.d.a(bundle);
            case 26:
                return ub.a(bundle);
            case 27:
                return v61.b.a(bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public void invoke(Object obj) {
        ((dr0.b) obj).onRenderedFirstFrame();
    }
}
