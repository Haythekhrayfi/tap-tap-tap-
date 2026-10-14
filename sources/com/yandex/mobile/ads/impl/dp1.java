package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.common.InitializationListener;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dp1 implements nb0.f, r80.a, wf.a, yt, InitializationListener, n10.a, pg, yn.a.InterfaceC0211a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19945d = new dp1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19946e = new dp1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19947f = new dp1(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19948g = new dp1(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19949h = new dp1(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19950i = new dp1(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19951j = new dp1(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19952k = new dp1(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19953l = new dp1(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19954m = new dp1(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19955n = new dp1(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19956o = new dp1(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19957p = new dp1(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19958q = new dp1(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19959r = new dp1(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19960s = new dp1(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19961t = new dp1(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19962u = new dp1(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19963v = new dp1(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19964w = new dp1(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19965x = new dp1(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19966y = new dp1(21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ dp1 f19967z = new dp1(22);
    public static final /* synthetic */ dp1 A = new dp1(23);
    public static final /* synthetic */ dp1 B = new dp1(24);
    public static final /* synthetic */ dp1 C = new dp1(25);
    public static final /* synthetic */ dp1 D = new dp1(26);
    public static final /* synthetic */ dp1 E = new dp1(27);
    public static final /* synthetic */ dp1 F = new dp1(28);
    public static final /* synthetic */ dp1 G = new dp1(29);

    public /* synthetic */ dp1(int i10) {
        this.f19968c = i10;
    }

    @Override // com.yandex.mobile.ads.impl.nb0.f
    public int a(Object obj) {
        return nb0.b((ib0) obj);
    }

    @Override // com.yandex.mobile.ads.impl.pg
    public String a(pm pmVar) {
        return pg.b(pmVar);
    }

    @Override // com.yandex.mobile.ads.impl.yn.a.InterfaceC0211a
    public Constructor a() {
        return yn.b();
    }

    @Override // com.yandex.mobile.ads.impl.n10.a
    public boolean a(int i10, int i11, int i12, int i13, int i14) {
        return mf0.a(i10, i11, i12, i13, i14);
    }

    @Override // com.yandex.mobile.ads.impl.yt
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ut[] mo2a() {
        switch (this.f19968c) {
            case 6:
                return cw.a();
            case 12:
                return j.a();
            case 14:
                return kv.a();
            case 18:
                return nf0.d();
            case 23:
                return q81.a();
            default:
                return sv.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wf.a
    public wf fromBundle(Bundle bundle) {
        switch (this.f19968c) {
            case 2:
                return bc0.a(bundle);
            case 3:
                return bc0.e.a(bundle);
            case 4:
                return bq0.b(bundle);
            case 5:
                return c4.a.a(bundle);
            case 6:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 21:
            case 23:
            case 24:
            default:
                return wf1.a(bundle);
            case 7:
                return dr0.a.a(bundle);
            case 8:
                return e81.a(bundle);
            case 9:
                return ec0.a(bundle);
            case 10:
                return hu0.a(bundle);
            case 11:
                return i71.a(bundle);
            case 13:
                return k41.b(bundle);
            case 17:
                return n71.a(bundle);
            case 19:
                return nj.a(bundle);
            case 20:
                return o61.b(bundle);
            case 22:
                return po.c.b(bundle);
            case 25:
                return ty.b(bundle);
            case 26:
                return v61.a(bundle);
            case 27:
                return v61.d.a(bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public void invoke(Object obj) {
        rs.c((dr0.b) obj);
    }

    @Override // com.yandex.mobile.ads.common.InitializationListener
    public void onInitializationCompleted() {
        ma.a();
    }
}
