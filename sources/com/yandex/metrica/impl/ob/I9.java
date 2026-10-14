package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class I9 extends H9 implements Ph {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2112ye f14189c = new C2112ye("LOCATION_TRACKING_ENABLED", null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2112ye f14190d = new C2112ye("PREF_KEY_OFFSET", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2112ye f14191e = new C2112ye("UNCHECKED_TIME", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2112ye f14192f = new C2112ye("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2112ye f14193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2112ye f14194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2112ye f14195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2112ye f14196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2112ye f14197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2112ye f14198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C2112ye f14199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C2112ye f14200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2112ye f14201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2112ye f14202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C2112ye f14203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C2112ye f14204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C2112ye f14205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C2112ye f14206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C2112ye f14207u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C2112ye f14208v;

    static {
        new C2112ye("SDKFCE", null);
        new C2112ye("FST", null);
        new C2112ye("LSST", null);
        new C2112ye("FSDKFCO", null);
        new C2112ye("SRSDKFC", null);
        new C2112ye("LSDKFCAT", null);
        f14193g = new C2112ye("LAST_IDENTITY_LIGHT_SEND_TIME", null);
        f14194h = new C2112ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
        f14195i = new C2112ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
        f14196j = new C2112ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
        f14197k = new C2112ye("LAST_REPORT_SEND_ATTEMPT_TIME", null);
        f14198l = new C2112ye("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
        f14199m = new C2112ye("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
        f14200n = new C2112ye("LAST_MIGRATION_VERSION", null);
        f14201o = new C2112ye("LAST_WIFI_SCANNING_ATTEMPT_TIME", null);
        f14202p = new C2112ye("LAST_LBS_SCANNING_ATTEMPT_TIME", null);
        f14203q = new C2112ye("LAST_GPS_SCANNING_ATTEMPT_TIME", null);
        f14204r = new C2112ye("LAST_FUSED_SCANNING_ATTEMPT_TIME", null);
        f14205s = new C2112ye("SATELLITE_PRELOAD_INFO_CHECKED", null);
        f14206t = new C2112ye("SATELLITE_CLIDS_CHECKED", null);
        f14207u = new C2112ye("CERTIFICATE_REQUEST_ETAG", null);
        f14208v = new C2112ye("CERTIFICATE_REQUEST_NEXT_ATTEMPT_TIME", null);
    }

    public I9(InterfaceC2131z8 interfaceC2131z8) {
        super(interfaceC2131z8);
    }

    private C2112ye a(T1.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return f14197k;
        }
        if (iOrdinal == 1) {
            return f14198l;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return f14199m;
    }

    private C2112ye b(T1.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return f14194h;
        }
        if (iOrdinal == 1) {
            return f14195i;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return f14196j;
    }

    @Deprecated
    public int a(int i10) {
        return a(f14200n.a(), i10);
    }

    public int a(T1.a aVar, int i10) {
        C2112ye c2112yeB = b(aVar);
        return c2112yeB == null ? i10 : a(c2112yeB.a(), i10);
    }

    @Override // com.yandex.metrica.impl.ob.Ph
    public long a() {
        return a(f14208v.a(), 0L);
    }

    public long a(T1.a aVar, long j10) {
        C2112ye c2112yeA = a(aVar);
        return c2112yeA == null ? j10 : a(c2112yeA.a(), j10);
    }

    public I9 a(String str, String str2, String str3) {
        return (I9) b(new C2112ye(androidx.fragment.app.w.a("LAST_SOCKET_REPORT_TIMES_", str, "_", str2), null).a(), str3);
    }

    @Override // com.yandex.metrica.impl.ob.Ph
    public Ph a(long j10) {
        return (Ph) b(f14208v.a(), j10);
    }

    @Override // com.yandex.metrica.impl.ob.Ph
    public Ph a(String str) {
        return (Ph) b(f14207u.a(), str);
    }

    public boolean a(boolean z10) {
        return a(f14191e.a(), z10);
    }

    public long b(int i10) {
        return a(f14190d.a(), i10);
    }

    public long b(long j10) {
        return a(f14204r.a(), j10);
    }

    public I9 b(T1.a aVar, int i10) {
        C2112ye c2112yeB = b(aVar);
        return c2112yeB != null ? (I9) b(c2112yeB.a(), i10) : this;
    }

    public I9 b(T1.a aVar, long j10) {
        C2112ye c2112yeA = a(aVar);
        return c2112yeA != null ? (I9) b(c2112yeA.a(), j10) : this;
    }

    public I9 b(boolean z10) {
        return (I9) b(f14192f.a(), z10);
    }

    @Override // com.yandex.metrica.impl.ob.Ph
    public String b() {
        return a(f14207u.a(), (String) null);
    }

    public long c(long j10) {
        return a(f14203q.a(), j10);
    }

    public I9 c(boolean z10) {
        return (I9) b(f14191e.a(), z10);
    }

    public long d(long j10) {
        return a(f14193g.a(), j10);
    }

    public void d(boolean z10) {
        b(f14189c.a(), z10).c();
    }

    public long e(long j10) {
        return a(f14202p.a(), j10);
    }

    public Boolean e() {
        C2112ye c2112ye = f14192f;
        if (b(c2112ye.a())) {
            return Boolean.valueOf(a(c2112ye.a(), true));
        }
        return null;
    }

    public long f(long j10) {
        return a(f14201o.a(), j10);
    }

    public boolean f() {
        return a(f14189c.a(), false);
    }

    public I9 g() {
        return (I9) b(f14206t.a(), true);
    }

    public I9 g(long j10) {
        return (I9) b(f14204r.a(), j10);
    }

    public I9 h() {
        return (I9) b(f14205s.a(), true);
    }

    public I9 h(long j10) {
        return (I9) b(f14203q.a(), j10);
    }

    @Deprecated
    public I9 i() {
        return (I9) e(f14200n.a());
    }

    public I9 i(long j10) {
        return (I9) b(f14193g.a(), j10);
    }

    public I9 j(long j10) {
        return (I9) b(f14202p.a(), j10);
    }

    public boolean j() {
        return a(f14205s.a(), false);
    }

    public I9 k(long j10) {
        return (I9) b(f14201o.a(), j10);
    }

    public boolean k() {
        return a(f14206t.a(), false);
    }

    public I9 l(long j10) {
        return (I9) b(f14190d.a(), j10);
    }
}
