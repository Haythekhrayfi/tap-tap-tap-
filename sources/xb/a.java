package xb;

import h9.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a<E> extends AtomicReferenceArray<E> implements h<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Integer f37582h = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f37584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f37586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37587g;

    public a(int i10) {
        super(d.r(i10));
        this.f37583c = length() - 1;
        this.f37584d = new AtomicLong();
        this.f37586f = new AtomicLong();
        this.f37587g = Math.min(i10 / 4, f37582h.intValue());
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
        return this.f37584d.get() == this.f37586f.get();
    }

    @Override // sb.i
    public boolean offer(E e10) {
        Objects.requireNonNull(e10, "Null is not a valid element");
        int i10 = this.f37583c;
        long j10 = this.f37584d.get();
        int i11 = ((int) j10) & i10;
        if (j10 >= this.f37585e) {
            long j11 = ((long) this.f37587g) + j10;
            if (get(i10 & ((int) j11)) == null) {
                this.f37585e = j11;
            } else if (get(i11) != null) {
                return false;
            }
        }
        lazySet(i11, e10);
        this.f37584d.lazySet(j10 + 1);
        return true;
    }

    @Override // sb.h, sb.i
    public E poll() {
        long j10 = this.f37586f.get();
        int i10 = ((int) j10) & this.f37583c;
        E e10 = get(i10);
        if (e10 == null) {
            return null;
        }
        this.f37586f.lazySet(j10 + 1);
        lazySet(i10, null);
        return e10;
    }
}
