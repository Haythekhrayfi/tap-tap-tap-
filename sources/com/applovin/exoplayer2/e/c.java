package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f5261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f5262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f5263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f5264f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f5260b = iArr;
        this.f5261c = jArr;
        this.f5262d = jArr2;
        this.f5263e = jArr3;
        int length = iArr.length;
        this.f5259a = length;
        if (length > 0) {
            this.f5264f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f5264f = 0L;
        }
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        int iB = b(j10);
        w wVar = new w(this.f5263e[iB], this.f5261c[iB]);
        if (wVar.f6140b >= j10 || iB == this.f5259a - 1) {
            return new v.a(wVar);
        }
        int i10 = iB + 1;
        return new v.a(wVar, new w(this.f5263e[i10], this.f5261c[i10]));
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    public int b(long j10) {
        return ai.a(this.f5263e, j10, true, true);
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f5264f;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ChunkIndex(length=");
        sbA.append(this.f5259a);
        sbA.append(", sizes=");
        sbA.append(Arrays.toString(this.f5260b));
        sbA.append(", offsets=");
        sbA.append(Arrays.toString(this.f5261c));
        sbA.append(", timeUs=");
        sbA.append(Arrays.toString(this.f5263e));
        sbA.append(", durationsUs=");
        sbA.append(Arrays.toString(this.f5262d));
        sbA.append(")");
        return sbA.toString();
    }
}
