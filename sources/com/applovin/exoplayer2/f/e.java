package com.applovin.exoplayer2.f;

import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6221c;

    private long a(long j10) {
        return Math.max(0L, ((this.f6220b - 529) * 1000000) / j10) + this.f6219a;
    }

    public long a(v vVar) {
        return a(vVar.f8212z);
    }

    public long a(v vVar, com.applovin.exoplayer2.c.g gVar) {
        if (this.f6220b == 0) {
            this.f6219a = gVar.f4754d;
        }
        if (this.f6221c) {
            return gVar.f4754d;
        }
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(gVar.f4752b);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int iB = com.applovin.exoplayer2.b.r.b(i10);
        if (iB != -1) {
            long jA = a(vVar.f8212z);
            this.f6220b += (long) iB;
            return jA;
        }
        this.f6221c = true;
        this.f6220b = 0L;
        this.f6219a = gVar.f4754d;
        com.applovin.exoplayer2.l.q.c("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return gVar.f4754d;
    }

    public void a() {
        this.f6219a = 0L;
        this.f6220b = 0L;
        this.f6221c = false;
    }
}
