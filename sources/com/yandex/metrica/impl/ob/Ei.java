package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Integer> f13915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f13916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f13921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f13922j;

    public Ei(long j10, String str, List<Integer> list, List<Integer> list2, long j11, int i10, long j12, long j13, long j14, long j15) {
        this.f13913a = j10;
        this.f13914b = str;
        this.f13915c = Collections.unmodifiableList(list);
        this.f13916d = Collections.unmodifiableList(list2);
        this.f13917e = j11;
        this.f13918f = i10;
        this.f13919g = j12;
        this.f13920h = j13;
        this.f13921i = j14;
        this.f13922j = j15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ei.class != obj.getClass()) {
            return false;
        }
        Ei ei = (Ei) obj;
        if (this.f13913a == ei.f13913a && this.f13917e == ei.f13917e && this.f13918f == ei.f13918f && this.f13919g == ei.f13919g && this.f13920h == ei.f13920h && this.f13921i == ei.f13921i && this.f13922j == ei.f13922j && this.f13914b.equals(ei.f13914b) && this.f13915c.equals(ei.f13915c)) {
            return this.f13916d.equals(ei.f13916d);
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f13913a;
        int iHashCode = (this.f13916d.hashCode() + ((this.f13915c.hashCode() + l1.e.a(this.f13914b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31)) * 31)) * 31;
        long j11 = this.f13917e;
        int i10 = (((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f13918f) * 31;
        long j12 = this.f13919g;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f13920h;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f13921i;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f13922j;
        return i13 + ((int) ((j15 >>> 32) ^ j15));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SocketConfig{secondsToLive=");
        sbA.append(this.f13913a);
        sbA.append(", token='");
        l1.c.a(sbA, this.f13914b, CoreConstants.SINGLE_QUOTE_CHAR, ", ports=");
        sbA.append(this.f13915c);
        sbA.append(", portsHttp=");
        sbA.append(this.f13916d);
        sbA.append(", firstDelaySeconds=");
        sbA.append(this.f13917e);
        sbA.append(", launchDelaySeconds=");
        sbA.append(this.f13918f);
        sbA.append(", openEventIntervalSeconds=");
        sbA.append(this.f13919g);
        sbA.append(", minFailedRequestIntervalSeconds=");
        sbA.append(this.f13920h);
        sbA.append(", minSuccessfulRequestIntervalSeconds=");
        sbA.append(this.f13921i);
        sbA.append(", openRetryIntervalSeconds=");
        return o2.a.a(sbA, this.f13922j, '}');
    }
}
