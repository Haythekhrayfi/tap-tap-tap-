package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1687hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f16288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f16294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f16295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f16296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f16298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f16299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f16300o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f16301p;

    public C1687hh() {
        this.f16286a = null;
        this.f16287b = null;
        this.f16288c = null;
        this.f16289d = null;
        this.f16290e = null;
        this.f16291f = null;
        this.f16292g = null;
        this.f16293h = null;
        this.f16294i = null;
        this.f16295j = null;
        this.f16296k = null;
        this.f16297l = null;
        this.f16298m = null;
        this.f16299n = null;
        this.f16300o = null;
        this.f16301p = null;
    }

    public C1687hh(C2120ym.a aVar) {
        this.f16286a = aVar.c("dId");
        this.f16287b = aVar.c("uId");
        this.f16288c = aVar.b("kitVer");
        this.f16289d = aVar.c("analyticsSdkVersionName");
        this.f16290e = aVar.c("kitBuildNumber");
        this.f16291f = aVar.c("kitBuildType");
        this.f16292g = aVar.c("appVer");
        this.f16293h = aVar.optString("app_debuggable", "0");
        this.f16294i = aVar.c("appBuild");
        this.f16295j = aVar.c("osVer");
        this.f16297l = aVar.c("lang");
        this.f16298m = aVar.c("root");
        this.f16301p = aVar.c("commit_hash");
        this.f16299n = aVar.optString("app_framework", B2.a());
        int iOptInt = aVar.optInt("osApiLev", -1);
        this.f16296k = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = aVar.optInt("attribution_id", 0);
        this.f16300o = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }
}
