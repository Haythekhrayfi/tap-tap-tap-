package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class D9 extends H9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2112ye f13804c = new C2112ye("LAST_SATELLITE_CLIDS_DIAGNOSTICS_SENT_TIME", null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2112ye f13805d = new C2112ye("LAST_PRELOAD_INFO_DIAGNOSTICS_SENT_TIME", null);

    public D9(InterfaceC2131z8 interfaceC2131z8) {
        super(interfaceC2131z8);
    }

    public long b(long j10) {
        return a(f13804c.a(), j10);
    }

    public long c(long j10) {
        return a(f13805d.a(), j10);
    }

    public D9 d(long j10) {
        return (D9) b(f13804c.a(), j10);
    }

    public D9 e(long j10) {
        return (D9) b(f13805d.a(), j10);
    }
}
