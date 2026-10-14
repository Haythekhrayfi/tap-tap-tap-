package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2104y6 implements InterfaceC2079x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G9 f17897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2120ym.a f17898c;

    public C2104y6(G9 g10, String str) {
        this.f17897b = g10;
        this.f17896a = str;
        C2120ym.a aVar = new C2120ym.a();
        try {
            String strF = g10.f(str);
            if (!TextUtils.isEmpty(strF)) {
                aVar = new C2120ym.a(strF);
            }
        } catch (Throwable unused) {
        }
        this.f17898c = aVar;
    }

    private void a(String str, Object obj) {
        try {
            this.f17898c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public C2104y6 a(long j10) {
        a("SESSION_INIT_TIME", Long.valueOf(j10));
        return this;
    }

    public C2104y6 a(boolean z10) {
        a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.valueOf(z10));
        return this;
    }

    public void a() {
        this.f17898c = new C2120ym.a();
        b();
    }

    public C2104y6 b(long j10) {
        a("SESSION_LAST_EVENT_OFFSET", Long.valueOf(j10));
        return this;
    }

    public void b() {
        this.f17897b.c(this.f17896a, this.f17898c.toString());
        this.f17897b.c();
    }

    public C2104y6 c(long j10) {
        a("SESSION_COUNTER_ID", Long.valueOf(j10));
        return this;
    }

    public Long c() {
        return this.f17898c.a("SESSION_INIT_TIME");
    }

    public C2104y6 d(long j10) {
        a("SESSION_ID", Long.valueOf(j10));
        return this;
    }

    public Long d() {
        return this.f17898c.a("SESSION_LAST_EVENT_OFFSET");
    }

    public C2104y6 e(long j10) {
        a("SESSION_SLEEP_START", Long.valueOf(j10));
        return this;
    }

    public Long e() {
        return this.f17898c.a("SESSION_COUNTER_ID");
    }

    public Long f() {
        return this.f17898c.a("SESSION_ID");
    }

    public Long g() {
        return this.f17898c.a("SESSION_SLEEP_START");
    }

    public boolean h() {
        return this.f17898c.length() > 0;
    }

    public Boolean i() {
        C2120ym.a aVar = this.f17898c;
        Objects.requireNonNull(aVar);
        try {
            return Boolean.valueOf(aVar.getBoolean("SESSION_IS_ALIVE_REPORT_NEEDED"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
