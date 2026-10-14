package vb;

import io.reactivex.internal.operators.observable.ObservableFlatMap;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class k<T, U> extends vb.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb.c<? super T, ? extends lb.j<? extends U>> f36887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36890g;

    public static final class a<T, U> extends AtomicReference<nb.b> implements lb.k<U> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b<T, U> f36892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f36893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile sb.i<U> f36894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36895g;

        public a(b<T, U> bVar, long j10) {
            this.f36891c = j10;
            this.f36892d = bVar;
        }

        @Override // lb.k
        public void a(Throwable th) {
            if (!bc.e.a(this.f36892d.f36905j, th)) {
                dc.a.b(th);
                return;
            }
            b<T, U> bVar = this.f36892d;
            if (!bVar.f36900e) {
                bVar.e();
            }
            this.f36893e = true;
            this.f36892d.f();
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.setOnce(this, bVar) && (bVar instanceof sb.d)) {
                sb.d dVar = (sb.d) bVar;
                int iRequestFusion = dVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f36895g = iRequestFusion;
                    this.f36894f = dVar;
                    this.f36893e = true;
                    this.f36892d.f();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f36895g = iRequestFusion;
                    this.f36894f = dVar;
                }
            }
        }

        @Override // lb.k
        public void d(U u10) {
            if (this.f36895g != 0) {
                this.f36892d.f();
                return;
            }
            b<T, U> bVar = this.f36892d;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                bVar.f36898c.d(u10);
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                sb.i bVar2 = this.f36894f;
                if (bVar2 == null) {
                    bVar2 = new xb.b(bVar.f36902g);
                    this.f36894f = bVar2;
                }
                bVar2.offer(u10);
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.g();
        }

        @Override // lb.k
        public void onComplete() {
            this.f36893e = true;
            this.f36892d.f();
        }
    }

    public static final class b<T, U> extends AtomicInteger implements nb.b, lb.k<T> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final ObservableFlatMap.InnerObserver<?, ?>[] f36896s = new a[0];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final ObservableFlatMap.InnerObserver<?, ?>[] f36897t = new a[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super U> f36898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super T, ? extends lb.j<? extends U>> f36899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f36900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f36902g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile sb.h<U> f36903h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f36904i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final bc.c f36905j = new bc.c();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f36906k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicReference<ObservableFlatMap.InnerObserver<?, ?>[]> f36907l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public nb.b f36908m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f36909n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f36910o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f36911p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Queue<lb.j<? extends U>> f36912q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f36913r;

        public b(lb.k<? super U> kVar, pb.c<? super T, ? extends lb.j<? extends U>> cVar, boolean z10, int i10, int i11) {
            this.f36898c = kVar;
            this.f36899d = cVar;
            this.f36900e = z10;
            this.f36901f = i10;
            this.f36902g = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f36912q = new ArrayDeque(i10);
            }
            this.f36907l = new AtomicReference<>(f36896s);
        }

        @Override // lb.k
        public void a(Throwable th) {
            if (this.f36904i) {
                dc.a.b(th);
            } else if (!bc.e.a(this.f36905j, th)) {
                dc.a.b(th);
            } else {
                this.f36904i = true;
                f();
            }
        }

        @Override // lb.k
        public void b(nb.b bVar) {
            if (qb.b.validate(this.f36908m, bVar)) {
                this.f36908m = bVar;
                this.f36898c.b(this);
            }
        }

        public boolean c() {
            if (this.f36906k) {
                return true;
            }
            Throwable th = this.f36905j.get();
            if (this.f36900e || th == null) {
                return false;
            }
            e();
            Throwable thB = bc.e.b(this.f36905j);
            if (thB != bc.e.f3505a) {
                this.f36898c.a(thB);
            }
            return true;
        }

        @Override // lb.k
        public void d(T t10) {
            if (this.f36904i) {
                return;
            }
            try {
                lb.j<? extends U> jVarApply = this.f36899d.apply(t10);
                Objects.requireNonNull(jVarApply, "The mapper returned a null ObservableSource");
                lb.j<? extends U> jVar = jVarApply;
                if (this.f36901f != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i10 = this.f36913r;
                        if (i10 == this.f36901f) {
                            this.f36912q.offer(jVar);
                            return;
                        }
                        this.f36913r = i10 + 1;
                    }
                }
                i(jVar);
            } catch (Throwable th) {
                c0.Q(th);
                this.f36908m.dispose();
                a(th);
            }
        }

        @Override // nb.b
        public void dispose() {
            Throwable thB;
            if (this.f36906k) {
                return;
            }
            this.f36906k = true;
            if (!e() || (thB = bc.e.b(this.f36905j)) == null || thB == bc.e.f3505a) {
                return;
            }
            dc.a.b(thB);
        }

        public boolean e() {
            a[] andSet;
            this.f36908m.dispose();
            a[] aVarArr = this.f36907l.get();
            a[] aVarArr2 = f36897t;
            if (aVarArr == aVarArr2 || (andSet = this.f36907l.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a aVar : andSet) {
                Objects.requireNonNull(aVar);
                qb.b.dispose(aVar);
            }
            return true;
        }

        public void f() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        /* JADX WARN: Code duplicated, block: B:112:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:0x00fd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:90:0x00fc A[PHI: r4
  0x00fc: PHI (r4v7 int) = (r4v5 int), (r4v8 int) binds: [B:77:0x00db, B:89:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
        public void g() {
            int size;
            boolean z10;
            lb.k<? super U> kVar = this.f36898c;
            int iAddAndGet = 1;
            while (!c()) {
                sb.h<U> hVar = this.f36903h;
                int i10 = 0;
                if (hVar != null) {
                    while (!c()) {
                        U uPoll = hVar.poll();
                        if (uPoll != null) {
                            kVar.d(uPoll);
                            i10++;
                        }
                    }
                    return;
                }
                if (i10 == 0) {
                    boolean z11 = this.f36904i;
                    sb.h<U> hVar2 = this.f36903h;
                    a<T, U>[] aVarArr = (a[]) this.f36907l.get();
                    int length = aVarArr.length;
                    if (this.f36901f != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.f36912q.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z11 && ((hVar2 == null || hVar2.isEmpty()) && length == 0 && size == 0)) {
                        Throwable thB = bc.e.b(this.f36905j);
                        if (thB != bc.e.f3505a) {
                            if (thB == null) {
                                kVar.onComplete();
                                return;
                            } else {
                                kVar.a(thB);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j10 = this.f36910o;
                        int i11 = this.f36911p;
                        if (length <= i11 || aVarArr[i11].f36891c != j10) {
                            if (length <= i11) {
                                i11 = 0;
                            }
                            for (int i12 = 0; i12 < length && aVarArr[i11].f36891c != j10; i12++) {
                                i11++;
                                if (i11 == length) {
                                    i11 = 0;
                                }
                            }
                            this.f36911p = i11;
                            this.f36910o = aVarArr[i11].f36891c;
                        }
                        for (int i13 = 0; i13 < length; i13++) {
                            if (c()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[i11];
                            sb.i<U> iVar = aVar.f36894f;
                            if (iVar != null) {
                                do {
                                    try {
                                        U uPoll2 = iVar.poll();
                                        if (uPoll2 == null) {
                                            z10 = aVar.f36893e;
                                            sb.i<U> iVar2 = aVar.f36894f;
                                            if (z10 && (iVar2 == null || iVar2.isEmpty())) {
                                                h(aVar);
                                                if (c()) {
                                                    return;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                            i11++;
                                            if (i11 == length) {
                                                i11 = 0;
                                            }
                                        } else {
                                            kVar.d(uPoll2);
                                        }
                                    } catch (Throwable th) {
                                        c0.Q(th);
                                        qb.b.dispose(aVar);
                                        bc.e.a(this.f36905j, th);
                                        if (c()) {
                                            return;
                                        }
                                        h(aVar);
                                        i10++;
                                        i11++;
                                        if (i11 == length) {
                                        }
                                    }
                                } while (!c());
                                return;
                            }
                            z10 = aVar.f36893e;
                            sb.i<U> iVar3 = aVar.f36894f;
                            if (z10) {
                                h(aVar);
                                if (c()) {
                                    return;
                                } else {
                                    i10++;
                                }
                            }
                            i11++;
                            if (i11 == length) {
                                i11 = 0;
                            }
                        }
                        this.f36911p = i11;
                        this.f36910o = aVarArr[i11].f36891c;
                    }
                    if (i10 == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.f36901f != Integer.MAX_VALUE) {
                        j(i10);
                    }
                } else if (this.f36901f != Integer.MAX_VALUE) {
                    j(i10);
                }
            }
        }

        public void h(a<T, U> aVar) {
            ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr;
            ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = (a[]) this.f36907l.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerObserverArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = f36896s;
                } else {
                    ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr3 = new a[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i10);
                    System.arraycopy(innerObserverArr, i10 + 1, innerObserverArr3, i10, (length - i10) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!this.f36907l.compareAndSet(innerObserverArr, innerObserverArr2));
        }

        /* JADX WARN: Code duplicated, block: B:28:0x005c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v8, types: [sb.i] */
        public void i(lb.j<? extends U> jVar) {
            boolean z10;
            boolean z11;
            do {
                z10 = false;
                if (!(jVar instanceof Callable)) {
                    long j10 = this.f36909n;
                    this.f36909n = 1 + j10;
                    ObservableFlatMap.InnerObserver<?, ?> aVar = new a<>(this, j10);
                    while (true) {
                        ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr = (a[]) this.f36907l.get();
                        if (innerObserverArr == f36897t) {
                            qb.b.dispose(aVar);
                            break;
                        }
                        int length = innerObserverArr.length;
                        ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr2 = new a[length + 1];
                        System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                        innerObserverArr2[length] = aVar;
                        if (this.f36907l.compareAndSet(innerObserverArr, innerObserverArr2)) {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        jVar.c(aVar);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) jVar).call();
                    if (objCall == null) {
                        z11 = true;
                    } else if (get() == 0 && compareAndSet(0, 1)) {
                        this.f36898c.d(objCall);
                        if (decrementAndGet() != 0) {
                            g();
                        }
                        z11 = true;
                    } else {
                        sb.h<U> hVar = this.f36903h;
                        ?? r10 = hVar;
                        if (hVar == false) {
                            sb.h<U> bVar = this.f36901f == Integer.MAX_VALUE ? new xb.b(this.f36902g) : new xb.a(this.f36901f);
                            this.f36903h = bVar;
                            r10 = bVar;
                        }
                        if (!r10.offer(objCall)) {
                            a(new IllegalStateException("Scalar queue full?!"));
                            z11 = true;
                        } else if (getAndIncrement() != 0) {
                            z11 = false;
                        } else {
                            g();
                            z11 = true;
                        }
                    }
                } catch (Throwable th) {
                    c0.Q(th);
                    bc.e.a(this.f36905j, th);
                    f();
                }
                if (!z11 || this.f36901f == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    jVar = this.f36912q.poll();
                    if (jVar == null) {
                        this.f36913r--;
                        z10 = true;
                    }
                }
            } while (!z10);
            f();
        }

        public void j(int i10) {
            while (true) {
                int i11 = i10 - 1;
                if (i10 == 0) {
                    return;
                }
                synchronized (this) {
                    lb.j<? extends U> jVarPoll = this.f36912q.poll();
                    if (jVarPoll == null) {
                        this.f36913r--;
                    } else {
                        i(jVarPoll);
                    }
                }
                i10 = i11;
            }
        }

        @Override // lb.k
        public void onComplete() {
            if (this.f36904i) {
                return;
            }
            this.f36904i = true;
            f();
        }
    }

    public k(lb.j<T> jVar, pb.c<? super T, ? extends lb.j<? extends U>> cVar, boolean z10, int i10, int i11) {
        super(jVar);
        this.f36887d = cVar;
        this.f36888e = z10;
        this.f36889f = i10;
        this.f36890g = i11;
    }

    @Override // lb.i
    public void t(lb.k<? super U> kVar) {
        if (t.a(this.f36794c, kVar, this.f36887d)) {
            return;
        }
        this.f36794c.c(new b(kVar, this.f36887d, this.f36888e, this.f36889f, this.f36890g));
    }
}
