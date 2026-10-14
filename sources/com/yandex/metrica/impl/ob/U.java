package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1646g1 f15113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1646g1 f15114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1646g1 f15115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1646g1 f15116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1646g1 f15117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1646g1 f15118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1646g1 f15119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1646g1 f15120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1646g1 f15121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1646g1 f15122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1646g1 f15123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f15124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Il f15125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xa f15126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f15127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C2091xi f15128p;

    public U(Bundle bundle) {
        this(b(bundle, "Uuid"), b(bundle, "DeviceId"), b(bundle, "DeviceIdHash"), b(bundle, "AdUrlReport"), b(bundle, "AdUrlGet"), b(bundle, "Clids"), b(bundle, "RequestClids"), b(bundle, "GAID"), b(bundle, "HOAID"), b(bundle, "YANDEX_ADV_ID"), b(bundle, "CUSTOM_SDK_HOSTS"), b(bundle), a(bundle), bundle.getLong("ServerTimeOffset"), bundle.getLong("NextStartupTime"), a(bundle, "features"));
    }

    public U(Qi qi, C1657gc c1657gc, Map<String, String> map) {
        this(a(qi.V()), a(qi.i()), a(qi.k()), a(qi.G()), a(qi.q()), a(C2120ym.a(C2120ym.a(qi.o()))), a(C2120ym.a(map)), new C1646g1(c1657gc.a().f15827a == null ? null : c1657gc.a().f15827a.f15739b, c1657gc.a().f15828b, c1657gc.a().f15829c), new C1646g1(c1657gc.b().f15827a == null ? null : c1657gc.b().f15827a.f15739b, c1657gc.b().f15828b, c1657gc.b().f15829c), new C1646g1(c1657gc.c().f15827a != null ? c1657gc.c().f15827a.f15739b : null, c1657gc.c().f15828b, c1657gc.c().f15829c), a(C2120ym.b(qi.h())), new Il(qi), qi.m(), C1694i.a(), qi.C() + ((long) qi.O().a()), a(qi.f().f17360y));
    }

    public U(C1646g1 c1646g1, C1646g1 c1646g2, C1646g1 c1646g3, C1646g1 c1646g4, C1646g1 c1646g5, C1646g1 c1646g6, C1646g1 c1646g7, C1646g1 c1646g8, C1646g1 c1646g9, C1646g1 c1646g10, C1646g1 c1646g11, Il il, Xa xa2, long j10, long j11, C2091xi c2091xi) {
        this.f15113a = c1646g1;
        this.f15114b = c1646g2;
        this.f15115c = c1646g3;
        this.f15116d = c1646g4;
        this.f15117e = c1646g5;
        this.f15118f = c1646g6;
        this.f15119g = c1646g7;
        this.f15120h = c1646g8;
        this.f15121i = c1646g9;
        this.f15122j = c1646g10;
        this.f15123k = c1646g11;
        this.f15125m = il;
        this.f15126n = xa2;
        this.f15124l = j10;
        this.f15127o = j11;
        this.f15128p = c2091xi;
    }

    private static Bundle a(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("value", parcelable);
        return bundle;
    }

    private static Parcelable a(Bundle bundle, ClassLoader classLoader) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelable("value");
    }

    private static Xa a(Bundle bundle) {
        Xa xa2 = (Xa) a(bundle.getBundle("DiagnosticsConfigsHolder"), Xa.class.getClassLoader());
        return xa2 == null ? new Xa() : xa2;
    }

    private static C1646g1 a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new C1646g1(str, zIsEmpty ? EnumC1596e1.UNKNOWN : EnumC1596e1.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    private static C2091xi a(Bundle bundle, String str) {
        C2091xi c2091xi = (C2091xi) a(bundle.getBundle(str), C2091xi.class.getClassLoader());
        return c2091xi == null ? new C2091xi(null, EnumC1596e1.UNKNOWN, "bundle serialization error") : c2091xi;
    }

    private static C2091xi a(Boolean bool) {
        boolean z10 = bool != null;
        return new C2091xi(bool, z10 ? EnumC1596e1.OK : EnumC1596e1.UNKNOWN, z10 ? null : "no identifier in startup state");
    }

    private static Il b(Bundle bundle) {
        return (Il) a(bundle.getBundle("UiAccessConfig"), Il.class.getClassLoader());
    }

    private static C1646g1 b(Bundle bundle, String str) {
        C1646g1 c1646g1 = (C1646g1) a(bundle.getBundle(str), C1646g1.class.getClassLoader());
        return c1646g1 == null ? new C1646g1(null, EnumC1596e1.UNKNOWN, "bundle serialization error") : c1646g1;
    }

    public C1646g1 a() {
        return this.f15119g;
    }

    public C1646g1 b() {
        return this.f15123k;
    }

    public C1646g1 c() {
        return this.f15114b;
    }

    public void c(Bundle bundle) {
        bundle.putBundle("Uuid", a(this.f15113a));
        bundle.putBundle("DeviceId", a(this.f15114b));
        bundle.putBundle("DeviceIdHash", a(this.f15115c));
        bundle.putBundle("AdUrlReport", a(this.f15116d));
        bundle.putBundle("AdUrlGet", a(this.f15117e));
        bundle.putBundle("Clids", a(this.f15118f));
        bundle.putBundle("RequestClids", a(this.f15119g));
        bundle.putBundle("GAID", a(this.f15120h));
        bundle.putBundle("HOAID", a(this.f15121i));
        bundle.putBundle("YANDEX_ADV_ID", a(this.f15122j));
        bundle.putBundle("CUSTOM_SDK_HOSTS", a(this.f15123k));
        bundle.putBundle("UiAccessConfig", a(this.f15125m));
        bundle.putBundle("DiagnosticsConfigsHolder", a(this.f15126n));
        bundle.putLong("ServerTimeOffset", this.f15124l);
        bundle.putLong("NextStartupTime", this.f15127o);
        bundle.putBundle("features", a(this.f15128p));
    }

    public C1646g1 d() {
        return this.f15115c;
    }

    public Xa e() {
        return this.f15126n;
    }

    public C2091xi f() {
        return this.f15128p;
    }

    public C1646g1 g() {
        return this.f15120h;
    }

    public C1646g1 h() {
        return this.f15117e;
    }

    public C1646g1 i() {
        return this.f15121i;
    }

    public long j() {
        return this.f15127o;
    }

    public C1646g1 k() {
        return this.f15116d;
    }

    public C1646g1 l() {
        return this.f15118f;
    }

    public long m() {
        return this.f15124l;
    }

    public Il n() {
        return this.f15125m;
    }

    public C1646g1 o() {
        return this.f15113a;
    }

    public C1646g1 p() {
        return this.f15122j;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ClientIdentifiersHolder{mUuidData=");
        sbA.append(this.f15113a);
        sbA.append(", mDeviceIdData=");
        sbA.append(this.f15114b);
        sbA.append(", mDeviceIdHashData=");
        sbA.append(this.f15115c);
        sbA.append(", mReportAdUrlData=");
        sbA.append(this.f15116d);
        sbA.append(", mGetAdUrlData=");
        sbA.append(this.f15117e);
        sbA.append(", mResponseClidsData=");
        sbA.append(this.f15118f);
        sbA.append(", mClientClidsForRequestData=");
        sbA.append(this.f15119g);
        sbA.append(", mGaidData=");
        sbA.append(this.f15120h);
        sbA.append(", mHoaidData=");
        sbA.append(this.f15121i);
        sbA.append(", yandexAdvIdData=");
        sbA.append(this.f15122j);
        sbA.append(", customSdkHostsData=");
        sbA.append(this.f15123k);
        sbA.append(", customSdkHosts=");
        sbA.append(this.f15123k);
        sbA.append(", mServerTimeOffset=");
        sbA.append(this.f15124l);
        sbA.append(", mUiAccessConfig=");
        sbA.append(this.f15125m);
        sbA.append(", diagnosticsConfigsHolder=");
        sbA.append(this.f15126n);
        sbA.append(", nextStartupTime=");
        sbA.append(this.f15127o);
        sbA.append(", features=");
        sbA.append(this.f15128p);
        sbA.append('}');
        return sbA.toString();
    }
}
