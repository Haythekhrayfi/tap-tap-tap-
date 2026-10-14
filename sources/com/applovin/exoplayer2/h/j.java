package com.applovin.exoplayer2.h;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f6571h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.applovin.exoplayer2.k.l f6573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f6574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f6575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6578g;

    public j(long j10, com.applovin.exoplayer2.k.l lVar, long j11) {
        this(j10, lVar, lVar.f7392a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public j(long j10, com.applovin.exoplayer2.k.l lVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f6572a = j10;
        this.f6573b = lVar;
        this.f6574c = uri;
        this.f6575d = map;
        this.f6576e = j11;
        this.f6577f = j12;
        this.f6578g = j13;
    }

    public static long a() {
        return f6571h.getAndIncrement();
    }
}
