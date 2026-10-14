package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinMediationProvider;

/* JADX INFO: loaded from: classes.dex */
public final class Fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f14003d;

    public enum a {
        UNKNOWN(AppLovinMediationProvider.UNKNOWN),
        GP("gpl"),
        HMS("hms-content-provider");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14008a;

        a(String str) {
            this.f14008a = str;
        }
    }

    public Fg(String str, long j10, long j11, a aVar) {
        this.f14000a = str;
        this.f14001b = j10;
        this.f14002c = j11;
        this.f14003d = aVar;
    }

    private Fg(byte[] bArr) throws C1569d {
        Yf yfA = Yf.a(bArr);
        this.f14000a = yfA.f15589b;
        this.f14001b = yfA.f15591d;
        this.f14002c = yfA.f15590c;
        this.f14003d = a(yfA.f15592e);
    }

    private a a(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? a.UNKNOWN : a.HMS;
        }
        return a.GP;
    }

    public static Fg a(byte[] bArr) throws C1569d {
        if (U2.a(bArr)) {
            return null;
        }
        return new Fg(bArr);
    }

    public byte[] a() {
        Yf yf = new Yf();
        yf.f15589b = this.f14000a;
        yf.f15591d = this.f14001b;
        yf.f15590c = this.f14002c;
        int iOrdinal = this.f14003d.ordinal();
        int i10 = 2;
        if (iOrdinal == 1) {
            i10 = 1;
        } else if (iOrdinal != 2) {
            i10 = 0;
        }
        yf.f15592e = i10;
        return AbstractC1594e.a(yf);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Fg.class != obj.getClass()) {
            return false;
        }
        Fg fg = (Fg) obj;
        return this.f14001b == fg.f14001b && this.f14002c == fg.f14002c && this.f14000a.equals(fg.f14000a) && this.f14003d == fg.f14003d;
    }

    public int hashCode() {
        int iHashCode = this.f14000a.hashCode() * 31;
        long j10 = this.f14001b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f14002c;
        return this.f14003d.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ReferrerInfo{installReferrer='");
        l1.c.a(sbA, this.f14000a, CoreConstants.SINGLE_QUOTE_CHAR, ", referrerClickTimestampSeconds=");
        sbA.append(this.f14001b);
        sbA.append(", installBeginTimestampSeconds=");
        sbA.append(this.f14002c);
        sbA.append(", source=");
        sbA.append(this.f14003d);
        sbA.append('}');
        return sbA.toString();
    }
}
