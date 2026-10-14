package com.yandex.metrica.impl.ob;

import android.os.SystemClock;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1875p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1624f4 f17038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2079x6 f17039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1924r6 f17040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicLong f17043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile a f17045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f17046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f17047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Nm f17048k;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p6$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f17051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f17052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f17053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f17054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f17055g;

        public a(JSONObject jSONObject) {
            this.f17049a = jSONObject.optString("analyticsSdkVersionName", null);
            this.f17050b = jSONObject.optString("kitBuildNumber", null);
            this.f17051c = jSONObject.optString("appVer", null);
            this.f17052d = jSONObject.optString("appBuild", null);
            this.f17053e = jSONObject.optString("osVer", null);
            this.f17054f = jSONObject.optInt("osApiLev", -1);
            this.f17055g = jSONObject.optInt("attribution_id", 0);
        }

        public boolean a(C1736jh c1736jh) {
            Objects.requireNonNull(c1736jh);
            return TextUtils.equals("5.0.0", this.f17049a) && TextUtils.equals("45001354", this.f17050b) && TextUtils.equals(c1736jh.f(), this.f17051c) && TextUtils.equals(c1736jh.b(), this.f17052d) && TextUtils.equals(c1736jh.p(), this.f17053e) && this.f17054f == c1736jh.o() && this.f17055g == c1736jh.D();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("SessionRequestParams{mKitVersionName='");
            l1.c.a(sbA, this.f17049a, CoreConstants.SINGLE_QUOTE_CHAR, ", mKitBuildNumber='");
            l1.c.a(sbA, this.f17050b, CoreConstants.SINGLE_QUOTE_CHAR, ", mAppVersion='");
            l1.c.a(sbA, this.f17051c, CoreConstants.SINGLE_QUOTE_CHAR, ", mAppBuild='");
            l1.c.a(sbA, this.f17052d, CoreConstants.SINGLE_QUOTE_CHAR, ", mOsVersion='");
            l1.c.a(sbA, this.f17053e, CoreConstants.SINGLE_QUOTE_CHAR, ", mApiLevel=");
            sbA.append(this.f17054f);
            sbA.append(", mAttributionId=");
            return h0.f.a(sbA, this.f17055g, '}');
        }
    }

    public C1875p6(C1624f4 c1624f4, InterfaceC2079x6 interfaceC2079x6, C1924r6 c1924r6, Nm nm) {
        this.f17038a = c1624f4;
        this.f17039b = interfaceC2079x6;
        this.f17040c = c1924r6;
        this.f17048k = nm;
        g();
    }

    private boolean a() {
        if (this.f17045h == null) {
            synchronized (this) {
                if (this.f17045h == null) {
                    try {
                        String asString = this.f17038a.i().a(this.f17041d, this.f17040c.a()).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            this.f17045h = new a(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        a aVar = this.f17045h;
        if (aVar != null) {
            return aVar.a(this.f17038a.m());
        }
        return false;
    }

    private void g() {
        C1924r6 c1924r6 = this.f17040c;
        Objects.requireNonNull(this.f17048k);
        this.f17042e = c1924r6.a(SystemClock.elapsedRealtime());
        this.f17041d = this.f17040c.c(-1L);
        this.f17043f = new AtomicLong(this.f17040c.b(0L));
        this.f17044g = this.f17040c.a(true);
        long jE = this.f17040c.e(0L);
        this.f17046i = jE;
        this.f17047j = this.f17040c.d(jE - this.f17042e);
    }

    public long a(long j10) {
        InterfaceC2079x6 interfaceC2079x6 = this.f17039b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j10 - this.f17042e);
        this.f17047j = seconds;
        ((C2104y6) interfaceC2079x6).b(seconds);
        return this.f17047j;
    }

    public void a(boolean z10) {
        if (this.f17044g != z10) {
            this.f17044g = z10;
            ((C2104y6) this.f17039b).a(z10).b();
        }
    }

    public long b() {
        return Math.max(this.f17046i - TimeUnit.MILLISECONDS.toSeconds(this.f17042e), this.f17047j);
    }

    public boolean b(long j10) {
        boolean z10 = this.f17041d >= 0;
        boolean zA = a();
        Objects.requireNonNull(this.f17048k);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f17046i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return z10 && zA && ((((timeUnit.toSeconds(jElapsedRealtime) > j11 ? 1 : (timeUnit.toSeconds(jElapsedRealtime) == j11 ? 0 : -1)) < 0) || ((timeUnit.toSeconds(j10) - j11) > ((long) this.f17040c.a(this.f17038a.m().O())) ? 1 : ((timeUnit.toSeconds(j10) - j11) == ((long) this.f17040c.a(this.f17038a.m().O())) ? 0 : -1)) >= 0 || (timeUnit.toSeconds(j10 - this.f17042e) > C1949s6.f17280b ? 1 : (timeUnit.toSeconds(j10 - this.f17042e) == C1949s6.f17280b ? 0 : -1)) >= 0) ^ true);
    }

    public long c() {
        return this.f17041d;
    }

    public void c(long j10) {
        InterfaceC2079x6 interfaceC2079x6 = this.f17039b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j10);
        this.f17046i = seconds;
        ((C2104y6) interfaceC2079x6).e(seconds).b();
    }

    public long d() {
        return this.f17047j;
    }

    public long e() {
        long andIncrement = this.f17043f.getAndIncrement();
        ((C2104y6) this.f17039b).c(this.f17043f.get()).b();
        return andIncrement;
    }

    public EnumC2129z6 f() {
        return this.f17040c.a();
    }

    public boolean h() {
        return this.f17044g && this.f17041d > 0;
    }

    public synchronized void i() {
        ((C2104y6) this.f17039b).a();
        this.f17045h = null;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Session{mId=");
        sbA.append(this.f17041d);
        sbA.append(", mInitTime=");
        sbA.append(this.f17042e);
        sbA.append(", mCurrentReportId=");
        sbA.append(this.f17043f);
        sbA.append(", mSessionRequestParams=");
        sbA.append(this.f17045h);
        sbA.append(", mSleepStartSeconds=");
        return o2.a.a(sbA, this.f17046i, '}');
    }
}
