package kd;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class n<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f32062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f32055e = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z f32058h = new z("REMOVE_FROZEN");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32056f = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f32057g = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32063a;

        public b(int i10) {
            this.f32063a = i10;
        }
    }

    public n(int i10, boolean z10) {
        this.f32059a = i10;
        this.f32060b = z10;
        int i11 = i10 - 1;
        this.f32061c = i11;
        this.f32062d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(E e10) {
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                Objects.requireNonNull(f32055e);
                return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            a aVar = f32055e;
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f32061c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (this.f32060b || this.f32062d.get(i11 & i12) == null) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f32057g;
                Objects.requireNonNull(aVar);
                if (atomicLongFieldUpdater.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                    this.f32062d.set(i11 & i12, e10);
                    n<E> nVarE = this;
                    while ((nVarE._state & 1152921504606846976L) != 0) {
                        nVarE = nVarE.e();
                        Object obj = nVarE.f32062d.get(nVarE.f32061c & i11);
                        if ((obj instanceof b) && ((b) obj).f32063a == i11) {
                            nVarE.f32062d.set(nVarE.f32061c & i11, e10);
                        } else {
                            nVarE = null;
                        }
                        if (nVarE == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f32059a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f32057g.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j10 = this._state;
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j10 = this._state;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<E> e() {
        long j10;
        while (true) {
            j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                break;
            }
            long j11 = j10 | 1152921504606846976L;
            if (f32057g.compareAndSet(this, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            n<E> nVar = (n) this._next;
            if (nVar != null) {
                return nVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32056f;
            n nVar2 = new n(this.f32059a * 2, this.f32060b);
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.f32061c;
                int i13 = i10 & i12;
                if (i13 != (i12 & i11)) {
                    Object bVar = this.f32062d.get(i13);
                    if (bVar == null) {
                        bVar = new b(i10);
                    }
                    nVar2.f32062d.set(nVar2.f32061c & i10, bVar);
                    i10++;
                }
            }
            Objects.requireNonNull(f32055e);
            nVar2._state = (-1152921504606846977L) & j10;
            atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2);
        }
    }

    public final Object f() {
        while (true) {
            long j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return f32058h;
            }
            a aVar = f32055e;
            int i10 = (int) ((j10 & 1073741823) >> 0);
            int i11 = this.f32061c;
            int i12 = ((int) ((1152921503533105152L & j10) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.f32062d.get(i13);
            if (obj == null) {
                if (this.f32060b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f32057g;
                Objects.requireNonNull(aVar);
                long j11 = ((long) ((i10 + 1) & 1073741823)) << 0;
                if (atomicLongFieldUpdater.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    this.f32062d.set(this.f32061c & i10, null);
                    return obj;
                }
                if (this.f32060b) {
                    n<E> nVarE = this;
                    while (true) {
                        long j12 = nVarE._state;
                        a aVar2 = f32055e;
                        int i14 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            nVarE = nVarE.e();
                        } else {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f32057g;
                            Objects.requireNonNull(aVar2);
                            if (atomicLongFieldUpdater2.compareAndSet(nVarE, j12, j11 | (j12 & (-1073741824)))) {
                                nVarE.f32062d.set(nVarE.f32061c & i14, null);
                                nVarE = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVarE == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
