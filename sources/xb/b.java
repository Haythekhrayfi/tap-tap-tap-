package xb;

import h9.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements h<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f37588k = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f37589l = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f37590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray<Object> f37594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AtomicReferenceArray<Object> f37596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f37597j;

    public b(int i10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f37590c = atomicLong;
        this.f37597j = new AtomicLong();
        int iR = d.r(Math.max(8, i10));
        int i11 = iR - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iR + 1);
        this.f37594g = atomicReferenceArray;
        this.f37593f = i11;
        this.f37591d = Math.min(iR / 4, f37588k);
        this.f37596i = atomicReferenceArray;
        this.f37595h = i11;
        this.f37592e = i11 - 1;
        atomicLong.lazySet(0L);
    }

    @Override // sb.i
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // sb.i
    public boolean isEmpty() {
        return this.f37590c.get() == this.f37597j.get();
    }

    @Override // sb.i
    public boolean offer(T t10) {
        Objects.requireNonNull(t10, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f37594g;
        long j10 = this.f37590c.get();
        int i10 = this.f37593f;
        int i11 = ((int) j10) & i10;
        if (j10 < this.f37592e) {
            atomicReferenceArray.lazySet(i11, t10);
            this.f37590c.lazySet(j10 + 1);
            return true;
        }
        long j11 = ((long) this.f37591d) + j10;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            this.f37592e = j11 - 1;
            atomicReferenceArray.lazySet(i11, t10);
            this.f37590c.lazySet(j10 + 1);
            return true;
        }
        long j12 = j10 + 1;
        if (atomicReferenceArray.get(((int) j12) & i10) == null) {
            atomicReferenceArray.lazySet(i11, t10);
            this.f37590c.lazySet(j12);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f37594g = atomicReferenceArray2;
        this.f37592e = (((long) i10) + j10) - 1;
        atomicReferenceArray2.lazySet(i11, t10);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i11, f37589l);
        this.f37590c.lazySet(j12);
        return true;
    }

    @Override // sb.h, sb.i
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f37596i;
        long j10 = this.f37597j.get();
        int i10 = this.f37595h;
        int i11 = ((int) j10) & i10;
        T t10 = (T) atomicReferenceArray.get(i11);
        boolean z10 = t10 == f37589l;
        if (t10 != null && !z10) {
            atomicReferenceArray.lazySet(i11, null);
            this.f37597j.lazySet(j10 + 1);
            return t10;
        }
        if (!z10) {
            return null;
        }
        int i12 = i10 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
        atomicReferenceArray.lazySet(i12, null);
        this.f37596i = atomicReferenceArray2;
        T t11 = (T) atomicReferenceArray2.get(i11);
        if (t11 != null) {
            atomicReferenceArray2.lazySet(i11, null);
            this.f37597j.lazySet(j10 + 1);
        }
        return t11;
    }
}
