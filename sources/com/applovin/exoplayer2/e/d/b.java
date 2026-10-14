package com.applovin.exoplayer2.e.d;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f5314b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f5318d;

        public a(String str, String str2, long j10, long j11) {
            this.f5315a = str;
            this.f5316b = str2;
            this.f5317c = j10;
            this.f5318d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f5313a = j10;
        this.f5314b = list;
    }

    public com.applovin.exoplayer2.g.f.b a(long j10) {
        long j11;
        if (this.f5314b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f5314b.size() - 1; size >= 0; size--) {
            a aVar = this.f5314b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f5315a) | z10;
            if (size == 0) {
                j11 = j12 - aVar.f5318d;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= aVar.f5317c;
                j11 = j17;
            }
            if (!zEquals || j12 == j11) {
                z10 = zEquals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new com.applovin.exoplayer2.g.f.b(j13, j14, this.f5313a, j15, j16);
    }
}
