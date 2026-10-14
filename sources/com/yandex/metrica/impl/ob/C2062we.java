package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C2062we extends AbstractC1932re {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2112ye f17792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2112ye f17793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2112ye f17794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C2112ye f17795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C2112ye f17796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C2112ye f17797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C2112ye f17798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C2112ye f17799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2112ye f17800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C2112ye f17801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2112ye f17781p = new C2112ye("PREF_KEY_DEVICE_ID_", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C2112ye f17782q = new C2112ye("PREF_KEY_UID_", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final C2112ye f17783r = new C2112ye("PREF_KEY_HOST_URL_", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final C2112ye f17784s = new C2112ye("PREF_KEY_REPORT_URL_", null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final C2112ye f17785t = new C2112ye("PREF_KEY_GET_AD_URL", null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final C2112ye f17786u = new C2112ye("PREF_KEY_REPORT_AD_URL", null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final C2112ye f17787v = new C2112ye("PREF_KEY_STARTUP_OBTAIN_TIME_", null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final C2112ye f17788w = new C2112ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final C2112ye f17789x = new C2112ye("PREF_KEY_DISTRIBUTION_REFERRER_", null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C2112ye f17790y = new C2112ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C2112ye f17791z = new C2112ye("PREF_KEY_PINNING_UPDATE_URL", null);
    private static final C2112ye A = new C2112ye("PREF_KEY_EASY_COLLECTING_ENABLED_", null);

    public C2062we(Context context) {
        this(context, null);
    }

    public C2062we(Context context, String str) {
        super(context, str);
        this.f17792f = new C2112ye(f17781p.b());
        this.f17793g = new C2112ye(f17782q.b(), c());
        this.f17794h = new C2112ye(f17783r.b(), c());
        this.f17795i = new C2112ye(f17784s.b(), c());
        this.f17796j = new C2112ye(f17785t.b(), c());
        this.f17797k = new C2112ye(f17786u.b(), c());
        this.f17798l = new C2112ye(f17787v.b(), c());
        this.f17799m = new C2112ye(f17788w.b(), c());
        this.f17800n = new C2112ye(f17789x.b(), c());
        this.f17801o = new C2112ye(A.b(), c());
    }

    public static void b(Context context) {
        C1694i.a(context, "_startupserviceinfopreferences").edit().remove(f17781p.b()).apply();
    }

    public long a(long j10) {
        return this.f17243b.getLong(this.f17798l.a(), j10);
    }

    public String b(String str) {
        return this.f17243b.getString(this.f17792f.a(), null);
    }

    public String c(String str) {
        return this.f17243b.getString(this.f17799m.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1932re
    public String d() {
        return "_startupserviceinfopreferences";
    }

    public String d(String str) {
        return this.f17243b.getString(this.f17796j.a(), null);
    }

    public String e(String str) {
        return this.f17243b.getString(this.f17794h.a(), null);
    }

    public String f(String str) {
        return this.f17243b.getString(this.f17797k.a(), null);
    }

    public void f() {
        a(this.f17792f.a()).a(this.f17793g.a()).a(this.f17794h.a()).a(this.f17795i.a()).a(this.f17796j.a()).a(this.f17797k.a()).a(this.f17798l.a()).a(this.f17801o.a()).a(this.f17799m.a()).a(this.f17800n.b()).a(f17790y.b()).a(f17791z.b()).b();
    }

    public String g(String str) {
        return this.f17243b.getString(this.f17795i.a(), null);
    }

    public String h(String str) {
        return this.f17243b.getString(this.f17793g.a(), null);
    }

    public C2062we i(String str) {
        return (C2062we) a(this.f17792f.a(), str);
    }

    public C2062we j(String str) {
        return (C2062we) a(this.f17793g.a(), str);
    }
}
