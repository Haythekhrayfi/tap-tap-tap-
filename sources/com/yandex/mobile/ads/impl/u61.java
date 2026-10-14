package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u61<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f25562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f25563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25565d;

    public u61() {
        this(0);
    }

    public u61(int i10) {
        this.f25562a = new long[10];
        this.f25563b = (V[]) b();
    }

    private static Object[] b() {
        return new Object[10];
    }

    public final synchronized V a(long j10) {
        V v10;
        long j11 = RecyclerView.FOREVER_NS;
        v10 = null;
        while (true) {
            int i10 = this.f25565d;
            if (i10 <= 0) {
                break;
            }
            long j12 = j10 - this.f25562a[this.f25564c];
            if (j12 < 0 && (-j12) >= j11) {
                break;
            }
            pa.b(i10 > 0);
            V[] vArr = this.f25563b;
            int i11 = this.f25564c;
            V v11 = vArr[i11];
            vArr[i11] = null;
            this.f25564c = (i11 + 1) % vArr.length;
            this.f25565d--;
            v10 = v11;
            j11 = j12;
        }
        return v10;
    }

    public final synchronized void a() {
        this.f25564c = 0;
        this.f25565d = 0;
        Arrays.fill(this.f25563b, (Object) null);
    }

    public final synchronized void a(Object obj, long j10) {
        int i10 = this.f25565d;
        if (i10 > 0) {
            if (j10 <= this.f25562a[((this.f25564c + i10) - 1) % this.f25563b.length]) {
                a();
            }
        }
        int length = this.f25563b.length;
        if (this.f25565d >= length) {
            int i11 = length * 2;
            long[] jArr = new long[i11];
            V[] vArr = (V[]) new Object[i11];
            int i12 = this.f25564c;
            int i13 = length - i12;
            System.arraycopy(this.f25562a, i12, jArr, 0, i13);
            System.arraycopy(this.f25563b, this.f25564c, vArr, 0, i13);
            int i14 = this.f25564c;
            if (i14 > 0) {
                System.arraycopy(this.f25562a, 0, jArr, i13, i14);
                System.arraycopy(this.f25563b, 0, vArr, i13, this.f25564c);
            }
            this.f25562a = jArr;
            this.f25563b = vArr;
            this.f25564c = 0;
        }
        int i15 = this.f25564c;
        int i16 = this.f25565d;
        Object[] objArr = (V[]) this.f25563b;
        int length2 = (i15 + i16) % objArr.length;
        this.f25562a[length2] = j10;
        objArr[length2] = obj;
        this.f25565d = i16 + 1;
    }

    public final synchronized V b(long j10) {
        V v10;
        v10 = null;
        while (true) {
            int i10 = this.f25565d;
            if (i10 <= 0 || j10 - this.f25562a[this.f25564c] < 0) {
                break;
                break;
            }
            pa.b(i10 > 0);
            V[] vArr = this.f25563b;
            int i11 = this.f25564c;
            V v11 = vArr[i11];
            vArr[i11] = null;
            this.f25564c = (i11 + 1) % vArr.length;
            this.f25565d--;
            v10 = v11;
        }
        return v10;
    }

    public final synchronized V c() {
        V v10;
        int i10 = this.f25565d;
        v10 = null;
        if (i10 != 0) {
            pa.b(i10 > 0);
            V[] vArr = this.f25563b;
            int i11 = this.f25564c;
            V v11 = vArr[i11];
            vArr[i11] = null;
            this.f25564c = (i11 + 1) % vArr.length;
            this.f25565d--;
            v10 = v11;
        }
        return v10;
    }

    public final synchronized int d() {
        return this.f25565d;
    }
}
