package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C1957se extends AbstractC1932re {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C2112ye f17296l = new C2112ye("UUID", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C2112ye f17297m = new C2112ye("DEVICEID_3", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C2112ye f17298n = new C2112ye("AD_URL_GET", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C2112ye f17299o = new C2112ye("AD_URL_REPORT", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final C2112ye f17300p = new C2112ye("HOST_URL", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final C2112ye f17301q = new C2112ye("SERVER_TIME_OFFSET", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final C2112ye f17302r = new C2112ye("CLIDS", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2112ye f17303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2112ye f17304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2112ye f17305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C2112ye f17306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C2112ye f17307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C2112ye f17308k;

    public C1957se(Context context) {
        super(context, null);
        this.f17303f = new C2112ye(f17296l.b());
        this.f17304g = new C2112ye(f17297m.b());
        this.f17305h = new C2112ye(f17298n.b());
        this.f17306i = new C2112ye(f17299o.b());
        new C2112ye(f17300p.b());
        this.f17307j = new C2112ye(f17301q.b());
        this.f17308k = new C2112ye(f17302r.b());
    }

    public long a(long j10) {
        return this.f17243b.getLong(this.f17307j.b(), j10);
    }

    public String b(String str) {
        return this.f17243b.getString(this.f17305h.a(), null);
    }

    public String c(String str) {
        return this.f17243b.getString(this.f17306i.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1932re
    public String d() {
        return "_startupinfopreferences";
    }

    public String d(String str) {
        return this.f17243b.getString(this.f17308k.a(), null);
    }

    public String e(String str) {
        return this.f17243b.getString(this.f17304g.a(), null);
    }

    public C1957se f() {
        return (C1957se) e();
    }

    public String f(String str) {
        return this.f17243b.getString(this.f17303f.a(), null);
    }

    public Map<String, ?> g() {
        return this.f17243b.getAll();
    }
}
