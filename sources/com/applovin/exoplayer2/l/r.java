package com.applovin.exoplayer2.l;

import androidx.appcompat.widget.r0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f7652b;

    public r() {
        this(32);
    }

    public r(int i10) {
        this.f7652b = new long[i10];
    }

    public int a() {
        return this.f7651a;
    }

    public long a(int i10) {
        if (i10 >= 0 && i10 < this.f7651a) {
            return this.f7652b[i10];
        }
        StringBuilder sbA = r0.a("Invalid index ", i10, ", size is ");
        sbA.append(this.f7651a);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public void a(long j10) {
        int i10 = this.f7651a;
        long[] jArr = this.f7652b;
        if (i10 == jArr.length) {
            this.f7652b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f7652b;
        int i11 = this.f7651a;
        this.f7651a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long[] b() {
        return Arrays.copyOf(this.f7652b, this.f7651a);
    }
}
