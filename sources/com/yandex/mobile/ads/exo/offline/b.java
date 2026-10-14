package com.yandex.mobile.ads.exo.offline;

import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.tq;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownloadRequest f18675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tq f18682h;

    public b(DownloadRequest downloadRequest, int i10, long j10, long j11, int i11) {
        this(downloadRequest, i10, j10, j11, -1L, i11, 0, new tq());
    }

    public b(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, tq tqVar) {
        pa.a(tqVar);
        pa.a((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            pa.a((i10 == 2 || i10 == 0) ? false : true);
        }
        this.f18675a = downloadRequest;
        this.f18676b = i10;
        this.f18677c = j10;
        this.f18678d = j11;
        this.f18679e = j12;
        this.f18680f = i11;
        this.f18681g = i12;
        this.f18682h = tqVar;
    }
}
