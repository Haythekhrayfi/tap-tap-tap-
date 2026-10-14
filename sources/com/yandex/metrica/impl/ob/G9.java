package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class G9 extends H9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2112ye f14073c = new C2112ye("IDENTITY_SEND_TIME", null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2112ye f14074d = new C2112ye("PERMISSIONS_CHECK_TIME", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2112ye f14075e = new C2112ye("USER_INFO", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2112ye f14076f = new C2112ye("PROFILE_ID", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C2112ye f14077g = new C2112ye("APP_ENVIRONMENT", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C2112ye f14078h = new C2112ye("APP_ENVIRONMENT_REVISION", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C2112ye f14079i = new C2112ye("LAST_MIGRATION_VERSION", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C2112ye f14080j = new C2112ye("LAST_APP_VERSION_WITH_FEATURES", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C2112ye f14081k = new C2112ye("APPLICATION_FEATURES", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C2112ye f14082l = new C2112ye("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C2112ye f14083m = new C2112ye("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2112ye f14084n = new C2112ye("DEPRECATED_NATIVE_CRASHES_CHECKED", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C2112ye f14085o = new C2112ye("REFERRER_HANDLED", null);

    public G9(InterfaceC2131z8 interfaceC2131z8) {
        super(interfaceC2131z8);
    }

    public G9 a(int i10) {
        return (G9) b(f14080j.a(), i10);
    }

    public G9 a(A.a aVar) {
        synchronized (this) {
            b(f14077g.a(), aVar.f13617a);
            b(f14078h.a(), aVar.f13618b);
        }
        return this;
    }

    public G9 a(List<String> list) {
        return (G9) b(f14083m.a(), list);
    }

    public long b(long j10) {
        return a(f14073c.a(), j10);
    }

    public G9 c(long j10) {
        return (G9) b(f14073c.a(), j10);
    }

    public G9 c(String str, String str2) {
        return (G9) b(new C2112ye("SESSION_", str).a(), str2);
    }

    public G9 d(long j10) {
        return (G9) b(f14082l.a(), j10);
    }

    public A.a e() {
        A.a aVar;
        synchronized (this) {
            aVar = new A.a(a(f14077g.a(), "{}"), a(f14078h.a(), 0L));
        }
        return aVar;
    }

    public G9 e(long j10) {
        return (G9) b(f14074d.a(), j10);
    }

    public String f() {
        return a(f14081k.a(), "");
    }

    public String f(String str) {
        return a(new C2112ye("SESSION_", str).a(), "");
    }

    public G9 g(String str) {
        return (G9) b(f14081k.a(), str);
    }

    public List<String> g() {
        return a(f14083m.a(), Collections.emptyList());
    }

    public int h() {
        return a(f14080j.a(), -1);
    }

    public G9 h(String str) {
        return (G9) b(f14076f.a(), str);
    }

    public G9 i(String str) {
        return (G9) b(f14075e.a(), str);
    }

    @Deprecated
    public Integer i() {
        C2112ye c2112ye = f14079i;
        if (b(c2112ye.a())) {
            return Integer.valueOf((int) a(c2112ye.a(), 0L));
        }
        return null;
    }

    public long j() {
        return a(f14082l.a(), 0L);
    }

    public long k() {
        return a(f14074d.a(), 0L);
    }

    public String l() {
        return d(f14076f.a());
    }

    public String m() {
        return a(f14075e.a(), (String) null);
    }

    public boolean n() {
        return a(f14084n.a(), false);
    }

    public G9 o() {
        return (G9) b(f14084n.a(), true);
    }

    @Deprecated
    public G9 p() {
        return (G9) b(f14085o.a(), true);
    }

    @Deprecated
    public G9 q() {
        return (G9) e(f14079i.a());
    }

    @Deprecated
    public G9 r() {
        return (G9) e(f14085o.a());
    }

    @Deprecated
    public Boolean s() {
        C2112ye c2112ye = f14085o;
        if (b(c2112ye.a())) {
            return Boolean.valueOf(a(c2112ye.a(), false));
        }
        return null;
    }
}
