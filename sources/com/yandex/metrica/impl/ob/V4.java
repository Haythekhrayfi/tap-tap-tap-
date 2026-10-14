package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class V4 extends X1<C1811mh, C2018v0.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Y4 f15206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C1744k0 f15207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Z4 f15208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final W4.b f15209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Om f15210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C2045vm f15211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f15212u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final I8 f15213v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private X4 f15214w;

    public V4(Y4 y10, C1744k0 c1744k0, Z4 z10, I8 i10) {
        this(y10, c1744k0, z10, i10, new W4.b(), new Nm(), new C2045vm(), new C1811mh(), new C1968t0());
    }

    public V4(Y4 y10, C1744k0 c1744k0, Z4 z10, I8 i10, W4.b bVar, Om om, C2045vm c2045vm, C1811mh c1811mh, C1968t0 c1968t0) {
        super(c1968t0, c1811mh);
        this.f15206o = y10;
        this.f15207p = c1744k0;
        this.f15208q = z10;
        this.f15213v = i10;
        this.f15209r = bVar;
        this.f15210s = om;
        this.f15211t = c2045vm;
        this.f15212u = V4.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean A() {
        return super.A() & (!m());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public String a() {
        return this.f15212u;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(Uri.Builder builder) {
        C1811mh c1811mh = (C1811mh) this.f15044j;
        X4 x10 = this.f15214w;
        Objects.requireNonNull(c1811mh);
        builder.appendPath("diagnostic");
        builder.appendQueryParameter("deviceid", x10.g());
        builder.appendQueryParameter("uuid", x10.x());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("analytics_sdk_version_name", "5.0.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45001354");
        builder.appendQueryParameter("analytics_sdk_build_type", x10.k());
        if (x10.k().contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter("app_version_name", x10.f());
        builder.appendQueryParameter("app_build_number", x10.b());
        builder.appendQueryParameter("model", x10.n());
        builder.appendQueryParameter("manufacturer", x10.m());
        builder.appendQueryParameter("os_version", x10.p());
        builder.appendQueryParameter("os_api_level", String.valueOf(x10.o()));
        builder.appendQueryParameter("screen_width", String.valueOf(x10.v()));
        builder.appendQueryParameter("screen_height", String.valueOf(x10.u()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(x10.t()));
        builder.appendQueryParameter("scalefactor", String.valueOf(x10.s()));
        builder.appendQueryParameter("locale", x10.l());
        builder.appendQueryParameter("device_type", x10.j());
        builder.appendQueryParameter("app_id", x10.q());
        builder.appendQueryParameter("api_key_128", x10.C());
        builder.appendQueryParameter("app_debuggable", x10.A());
        builder.appendQueryParameter("is_rooted", x10.i());
        builder.appendQueryParameter("app_framework", x10.c());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public T1.a b() {
        return T1.a.DIAGNOSTIC;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void b(Throwable th) {
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean o() {
        X4 x4A = this.f15206o.a();
        this.f15214w = x4A;
        if (!(x4A.y() && !U2.b(this.f15214w.D()))) {
            return false;
        }
        a(this.f15214w.D());
        W4.b bVar = this.f15209r;
        C1744k0 c1744k0 = this.f15207p;
        X4 x10 = this.f15214w;
        Z4 z10 = this.f15208q;
        I8 i10 = this.f15213v;
        Objects.requireNonNull(bVar);
        byte[] bArrA = new W4(c1744k0, x10, z10, new C1699i4(i10), new Mn(1024, "diagnostic event name", AbstractC2145zm.a()), new Mn(204800, "diagnostic event value", AbstractC2145zm.a()), new Nm()).a();
        byte[] bArrB = null;
        try {
            Objects.requireNonNull(this.f15211t);
            bArrB = V0.b(bArrA);
        } catch (Throwable unused) {
        }
        if (!U2.a(bArrB)) {
            a("Content-Encoding", "gzip");
            bArrA = bArrB;
        }
        a(bArrA);
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean p() {
        boolean zP = super.p();
        a(this.f15210s.a());
        return zP;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean r() {
        C2018v0.a aVarB = B();
        return aVarB != null && "accepted".equals(aVarB.f17589a);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void t() {
    }
}
