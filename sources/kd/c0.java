package kd;

import fd.j0;
import fd.y0;
import java.lang.Comparable;
import java.util.Arrays;
import kd.d0;

/* JADX INFO: loaded from: classes3.dex */
public class c0<T extends d0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f32026a;

    public final void a(T t10) {
        y0.c cVar = (y0.c) t10;
        cVar.b(this);
        T[] tArr = this.f32026a;
        if (tArr == null) {
            tArr = (T[]) new d0[4];
            this.f32026a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, this._size * 2);
            j0.h(objArrCopyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((d0[]) objArrCopyOf);
            this.f32026a = tArr;
        }
        int i10 = this._size;
        this._size = i10 + 1;
        tArr[i10] = t10;
        cVar.f29644d = i10;
        f(i10);
    }

    public final T b() {
        T[] tArr = this.f32026a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final boolean c() {
        return this._size == 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[LOOP:0: B:9:0x0033->B:20:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[EDGE_INSN: B:23:0x0072->B:21:0x0072 BREAK  A[LOOP:0: B:9:0x0033->B:20:0x006d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0072 A[EDGE_INSN: B:24:0x0072->B:21:0x0072 BREAK  A[LOOP:0: B:9:0x0033->B:20:0x006d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:? A[SYNTHETIC] */
    public final T d(int i10) {
        int i11;
        T[] tArr;
        int i12;
        T t10;
        T t11;
        T t12;
        T t13;
        T[] tArr2 = this.f32026a;
        j0.f(tArr2);
        this._size--;
        if (i10 < this._size) {
            g(i10, this._size);
            int i13 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t14 = tArr2[i10];
                j0.f(t14);
                T t15 = tArr2[i13];
                j0.f(t15);
                if (((Comparable) t14).compareTo(t15) < 0) {
                    g(i10, i13);
                    f(i13);
                } else {
                    while (true) {
                        i11 = (i10 * 2) + 1;
                        if (i11 >= this._size) {
                            break;
                        }
                        tArr = this.f32026a;
                        j0.f(tArr);
                        i12 = i11 + 1;
                        if (i12 < this._size) {
                            t12 = tArr[i12];
                            j0.f(t12);
                            t13 = tArr[i11];
                            j0.f(t13);
                            if (((Comparable) t12).compareTo(t13) < 0) {
                                i11 = i12;
                            }
                        }
                        t10 = tArr[i10];
                        j0.f(t10);
                        t11 = tArr[i11];
                        j0.f(t11);
                        if (((Comparable) t10).compareTo(t11) <= 0) {
                            break;
                        }
                        g(i10, i11);
                        i10 = i11;
                    }
                }
            } else {
                while (true) {
                    i11 = (i10 * 2) + 1;
                    if (i11 >= this._size) {
                        break;
                        break;
                    }
                    tArr = this.f32026a;
                    j0.f(tArr);
                    i12 = i11 + 1;
                    if (i12 < this._size) {
                        t12 = tArr[i12];
                        j0.f(t12);
                        t13 = tArr[i11];
                        j0.f(t13);
                        if (((Comparable) t12).compareTo(t13) < 0) {
                            i11 = i12;
                        }
                    }
                    t10 = tArr[i10];
                    j0.f(t10);
                    t11 = tArr[i11];
                    j0.f(t11);
                    if (((Comparable) t10).compareTo(t11) <= 0) {
                        break;
                        break;
                    }
                    g(i10, i11);
                    i10 = i11;
                }
            }
        }
        T t16 = tArr2[this._size];
        j0.f(t16);
        t16.b(null);
        t16.c(-1);
        tArr2[this._size] = null;
        return t16;
    }

    public final T e() {
        T t10;
        synchronized (this) {
            t10 = this._size > 0 ? (T) d(0) : null;
        }
        return t10;
    }

    public final void f(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f32026a;
            j0.f(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            j0.f(t10);
            T t11 = tArr[i10];
            j0.f(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            g(i10, i11);
            i10 = i11;
        }
    }

    public final void g(int i10, int i11) {
        T[] tArr = this.f32026a;
        j0.f(tArr);
        T t10 = tArr[i11];
        j0.f(t10);
        T t11 = tArr[i10];
        j0.f(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.c(i10);
        t11.c(i11);
    }
}
