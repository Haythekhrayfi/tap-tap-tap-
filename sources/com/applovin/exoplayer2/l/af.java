package com.applovin.exoplayer2.l;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class af<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f7587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f7588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7590d;

    public af() {
        this(10);
    }

    public af(int i10) {
        this.f7587a = new long[i10];
        this.f7588b = (V[]) a(i10);
    }

    private V a(long j10, boolean z10) {
        V vD = null;
        long j11 = RecyclerView.FOREVER_NS;
        while (this.f7590d > 0) {
            long j12 = j10 - this.f7587a[this.f7589c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vD = d();
            j11 = j12;
        }
        return vD;
    }

    private static <V> V[] a(int i10) {
        return (V[]) new Object[i10];
    }

    private void b(long j10) {
        int i10 = this.f7590d;
        if (i10 > 0) {
            if (j10 <= this.f7587a[((this.f7589c + i10) - 1) % this.f7588b.length]) {
                a();
            }
        }
    }

    private void b(long j10, V v10) {
        int i10 = this.f7589c;
        int i11 = this.f7590d;
        V[] vArr = this.f7588b;
        int length = (i10 + i11) % vArr.length;
        this.f7587a[length] = j10;
        vArr[length] = v10;
        this.f7590d = i11 + 1;
    }

    private V d() {
        a.b(this.f7590d > 0);
        V[] vArr = this.f7588b;
        int i10 = this.f7589c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f7589c = (i10 + 1) % vArr.length;
        this.f7590d--;
        return v10;
    }

    private void e() {
        int length = this.f7588b.length;
        if (this.f7590d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) a(i10);
        int i11 = this.f7589c;
        int i12 = length - i11;
        System.arraycopy(this.f7587a, i11, jArr, 0, i12);
        System.arraycopy(this.f7588b, this.f7589c, vArr, 0, i12);
        int i13 = this.f7589c;
        if (i13 > 0) {
            System.arraycopy(this.f7587a, 0, jArr, i12, i13);
            System.arraycopy(this.f7588b, 0, vArr, i12, this.f7589c);
        }
        this.f7587a = jArr;
        this.f7588b = vArr;
        this.f7589c = 0;
    }

    public synchronized V a(long j10) {
        return a(j10, true);
    }

    public synchronized void a() {
        this.f7589c = 0;
        this.f7590d = 0;
        Arrays.fill(this.f7588b, (Object) null);
    }

    public synchronized void a(long j10, V v10) {
        b(j10);
        e();
        b(j10, v10);
    }

    public synchronized int b() {
        return this.f7590d;
    }

    public synchronized V c() {
        return this.f7590d == 0 ? null : d();
    }
}
