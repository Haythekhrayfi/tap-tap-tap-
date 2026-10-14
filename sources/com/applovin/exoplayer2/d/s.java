package com.applovin.exoplayer2.d;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.exoplayer2.k.l f5168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f5169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f5170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5171d;

    public s(com.applovin.exoplayer2.k.l lVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f5168a = lVar;
        this.f5169b = uri;
        this.f5170c = map;
        this.f5171d = j10;
    }
}
