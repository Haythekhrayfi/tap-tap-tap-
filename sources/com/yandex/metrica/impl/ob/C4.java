package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f13756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CounterConfiguration.b f13758e;

    public C4(String str, String str2, Integer num, String str3, CounterConfiguration.b bVar) {
        this.f13754a = str;
        this.f13755b = str2;
        this.f13756c = num;
        this.f13757d = str3;
        this.f13758e = bVar;
    }

    public static C4 a(T3 t10) {
        return new C4(t10.b().c(), t10.a().f(), t10.a().g(), t10.a().h(), CounterConfiguration.b.a(t10.b().f13444c.getAsString("CFG_REPORTER_TYPE")));
    }

    public String a() {
        return this.f13754a;
    }

    public String b() {
        return this.f13755b;
    }

    public Integer c() {
        return this.f13756c;
    }

    public String d() {
        return this.f13757d;
    }

    public CounterConfiguration.b e() {
        return this.f13758e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4.class != obj.getClass()) {
            return false;
        }
        C4 c10 = (C4) obj;
        String str = this.f13754a;
        if (str == null ? c10.f13754a != null : !str.equals(c10.f13754a)) {
            return false;
        }
        if (!this.f13755b.equals(c10.f13755b)) {
            return false;
        }
        Integer num = this.f13756c;
        if (num == null ? c10.f13756c != null : !num.equals(c10.f13756c)) {
            return false;
        }
        String str2 = this.f13757d;
        if (str2 == null ? c10.f13757d == null : str2.equals(c10.f13757d)) {
            return this.f13758e == c10.f13758e;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f13754a;
        int iA = l1.e.a(this.f13755b, (str != null ? str.hashCode() : 0) * 31, 31);
        Integer num = this.f13756c;
        int iHashCode = (iA + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f13757d;
        return this.f13758e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ClientDescription{mApiKey='");
        l1.c.a(sbA, this.f13754a, CoreConstants.SINGLE_QUOTE_CHAR, ", mPackageName='");
        l1.c.a(sbA, this.f13755b, CoreConstants.SINGLE_QUOTE_CHAR, ", mProcessID=");
        sbA.append(this.f13756c);
        sbA.append(", mProcessSessionID='");
        l1.c.a(sbA, this.f13757d, CoreConstants.SINGLE_QUOTE_CHAR, ", mReporterType=");
        sbA.append(this.f13758e);
        sbA.append('}');
        return sbA.toString();
    }
}
