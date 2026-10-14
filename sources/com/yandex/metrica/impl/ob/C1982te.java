package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C1982te extends AbstractC1932re {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2112ye f17456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2112ye f17457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2112ye f17458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C2112ye f17459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C2112ye f17460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C2112ye f17461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C2112ye f17462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C2112ye f17463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2112ye f17464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C2112ye f17465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C2112ye f17466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C2112ye f17467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C2112ye f17468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C2112ye f17469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C2112ye f17470t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final C2112ye f17450u = new C2112ye("SESSION_SLEEP_START_", null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final C2112ye f17451v = new C2112ye("SESSION_ID_", null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final C2112ye f17452w = new C2112ye("SESSION_COUNTER_ID_", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final C2112ye f17453x = new C2112ye("SESSION_INIT_TIME_", null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final C2112ye f17454y = new C2112ye("SESSION_ALIVE_TIME_", null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final C2112ye f17455z = new C2112ye("SESSION_IS_ALIVE_REPORT_NEEDED_", null);
    private static final C2112ye A = new C2112ye("BG_SESSION_ID_", null);
    private static final C2112ye B = new C2112ye("BG_SESSION_SLEEP_START_", null);
    private static final C2112ye C = new C2112ye("BG_SESSION_COUNTER_ID_", null);
    private static final C2112ye D = new C2112ye("BG_SESSION_INIT_TIME_", null);
    private static final C2112ye E = new C2112ye("IDENTITY_SEND_TIME_", null);
    private static final C2112ye F = new C2112ye("USER_INFO_", null);
    private static final C2112ye G = new C2112ye("REFERRER_", null);

    @Deprecated
    public static final C2112ye H = new C2112ye("APP_ENVIRONMENT", null);

    @Deprecated
    public static final C2112ye I = new C2112ye("APP_ENVIRONMENT_REVISION", null);
    private static final C2112ye J = new C2112ye("APP_ENVIRONMENT_", null);
    private static final C2112ye K = new C2112ye("APP_ENVIRONMENT_REVISION_", null);

    public C1982te(Context context, String str) {
        super(context, str);
        this.f17456f = new C2112ye(f17450u.b(), c());
        this.f17457g = new C2112ye(f17451v.b(), c());
        this.f17458h = new C2112ye(f17452w.b(), c());
        this.f17459i = new C2112ye(f17453x.b(), c());
        this.f17460j = new C2112ye(f17454y.b(), c());
        this.f17461k = new C2112ye(f17455z.b(), c());
        this.f17462l = new C2112ye(A.b(), c());
        this.f17463m = new C2112ye(B.b(), c());
        this.f17464n = new C2112ye(C.b(), c());
        this.f17465o = new C2112ye(D.b(), c());
        this.f17466p = new C2112ye(E.b(), c());
        this.f17467q = new C2112ye(F.b(), c());
        this.f17468r = new C2112ye(G.b(), c());
        this.f17469s = new C2112ye(J.b(), c());
        this.f17470t = new C2112ye(K.b(), c());
        a(-1);
        c(0);
        b(0);
    }

    private void a(int i10) {
        C1694i.a(this.f17243b, this.f17460j.a(), i10);
    }

    private void b(int i10) {
        C1694i.a(this.f17243b, this.f17458h.a(), i10);
    }

    private void c(int i10) {
        C1694i.a(this.f17243b, this.f17456f.a(), i10);
    }

    public long a(long j10) {
        return this.f17243b.getLong(this.f17465o.a(), j10);
    }

    public C1982te a(A.a aVar) {
        synchronized (this) {
            a(this.f17469s.a(), aVar.f13617a);
            a(this.f17470t.a(), Long.valueOf(aVar.f13618b));
        }
        return this;
    }

    public Boolean a(boolean z10) {
        return Boolean.valueOf(this.f17243b.getBoolean(this.f17461k.a(), z10));
    }

    public long b(long j10) {
        return this.f17243b.getLong(this.f17464n.a(), j10);
    }

    public String b(String str) {
        return this.f17243b.getString(this.f17467q.a(), null);
    }

    public long c(long j10) {
        return this.f17243b.getLong(this.f17462l.a(), j10);
    }

    public long d(long j10) {
        return this.f17243b.getLong(this.f17463m.a(), j10);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1932re
    public String d() {
        return "_boundentrypreferences";
    }

    public long e(long j10) {
        return this.f17243b.getLong(this.f17459i.a(), j10);
    }

    public long f(long j10) {
        return this.f17243b.getLong(this.f17458h.a(), j10);
    }

    public A.a f() {
        synchronized (this) {
            if (!this.f17243b.contains(this.f17469s.a()) || !this.f17243b.contains(this.f17470t.a())) {
                return null;
            }
            return new A.a(this.f17243b.getString(this.f17469s.a(), "{}"), this.f17243b.getLong(this.f17470t.a(), 0L));
        }
    }

    public long g(long j10) {
        return this.f17243b.getLong(this.f17457g.a(), j10);
    }

    public boolean g() {
        return this.f17243b.contains(this.f17459i.a()) || this.f17243b.contains(this.f17460j.a()) || this.f17243b.contains(this.f17461k.a()) || this.f17243b.contains(this.f17456f.a()) || this.f17243b.contains(this.f17457g.a()) || this.f17243b.contains(this.f17458h.a()) || this.f17243b.contains(this.f17465o.a()) || this.f17243b.contains(this.f17463m.a()) || this.f17243b.contains(this.f17462l.a()) || this.f17243b.contains(this.f17464n.a()) || this.f17243b.contains(this.f17469s.a()) || this.f17243b.contains(this.f17467q.a()) || this.f17243b.contains(this.f17468r.a()) || this.f17243b.contains(this.f17466p.a());
    }

    public long h(long j10) {
        return this.f17243b.getLong(this.f17456f.a(), j10);
    }

    public void h() {
        this.f17243b.edit().remove(this.f17465o.a()).remove(this.f17464n.a()).remove(this.f17462l.a()).remove(this.f17463m.a()).remove(this.f17459i.a()).remove(this.f17458h.a()).remove(this.f17457g.a()).remove(this.f17456f.a()).remove(this.f17461k.a()).remove(this.f17460j.a()).remove(this.f17467q.a()).remove(this.f17469s.a()).remove(this.f17470t.a()).remove(this.f17468r.a()).remove(this.f17466p.a()).apply();
    }

    public long i(long j10) {
        return this.f17243b.getLong(this.f17466p.a(), j10);
    }

    public C1982te i() {
        return (C1982te) a(this.f17468r.a());
    }
}
