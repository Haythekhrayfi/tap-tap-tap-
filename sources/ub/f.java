package ub;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T, U> extends ub.a<T, U> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.c<? super T, ? extends me.a<? extends U>> f36237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36240h;

    public static final class a<T, U> extends AtomicReference<me.c> implements lb.f<U>, nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b<T, U> f36242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f36245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile sb.i<U> f36246h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f36247i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f36248j;

        public a(b<T, U> bVar, long j10) {
            this.f36241c = j10;
            this.f36242d = bVar;
            int i10 = bVar.f36255g;
            this.f36244f = i10;
            this.f36243e = i10 >> 2;
        }

        @Override // me.b
        public void a(Throwable th) {
            lazySet(ac.g.CANCELLED);
            b<T, U> bVar = this.f36242d;
            if (!bc.e.a(bVar.f36258j, th)) {
                dc.a.b(th);
                return;
            }
            this.f36245g = true;
            if (!bVar.f36253e) {
                bVar.f36262n.cancel();
                for (a aVar : bVar.f36260l.getAndSet(b.f36250u)) {
                    Objects.requireNonNull(aVar);
                    ac.g.cancel(aVar);
                }
            }
            bVar.f();
        }

        public void b(long j10) {
            if (this.f36248j != 1) {
                long j11 = this.f36247i + j10;
                if (j11 < this.f36243e) {
                    this.f36247i = j11;
                } else {
                    this.f36247i = 0L;
                    get().request(j11);
                }
            }
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.setOnce(this, cVar)) {
                if (cVar instanceof sb.f) {
                    sb.f fVar = (sb.f) cVar;
                    int iRequestFusion = fVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f36248j = iRequestFusion;
                        this.f36246h = fVar;
                        this.f36245g = true;
                        this.f36242d.f();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f36248j = iRequestFusion;
                        this.f36246h = fVar;
                    }
                }
                cVar.request(this.f36244f);
            }
        }

        @Override // me.b
        public void d(U u10) {
            ob.b bVar;
            if (this.f36248j == 2) {
                this.f36242d.f();
                return;
            }
            b<T, U> bVar2 = this.f36242d;
            if (bVar2.get() != 0 || !bVar2.compareAndSet(0, 1)) {
                sb.i aVar = this.f36246h;
                if (aVar == null) {
                    aVar = new xb.a(bVar2.f36255g);
                    this.f36246h = aVar;
                }
                if (!aVar.offer(u10)) {
                    bVar = new ob.b("Inner queue full?!");
                    bVar2.a(bVar);
                    return;
                } else {
                    if (bVar2.getAndIncrement() != 0) {
                        return;
                    }
                    bVar2.g();
                }
            }
            long j10 = bVar2.f36261m.get();
            sb.i aVar2 = this.f36246h;
            if (j10 == 0 || !(aVar2 == null || aVar2.isEmpty())) {
                if (aVar2 == null && (aVar2 = this.f36246h) == null) {
                    aVar2 = new xb.a(bVar2.f36255g);
                    this.f36246h = aVar2;
                }
                if (!aVar2.offer(u10)) {
                    bVar = new ob.b("Inner queue full?!");
                    bVar2.a(bVar);
                    return;
                }
            } else {
                bVar2.f36251c.d(u10);
                if (j10 != RecyclerView.FOREVER_NS) {
                    bVar2.f36261m.decrementAndGet();
                }
                b(1L);
            }
            if (bVar2.decrementAndGet() == 0) {
                return;
            }
            bVar2.g();
        }

        @Override // nb.b
        public void dispose() {
            ac.g.cancel(this);
        }

        @Override // me.b
        public void onComplete() {
            this.f36245g = true;
            this.f36242d.f();
        }
    }

    public static final class b<T, U> extends AtomicInteger implements lb.f<T>, me.c {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final FlowableFlatMap.InnerSubscriber<?, ?>[] f36249t = new a[0];

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final FlowableFlatMap.InnerSubscriber<?, ?>[] f36250u = new a[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super U> f36251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pb.c<? super T, ? extends me.a<? extends U>> f36252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f36253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f36255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile sb.h<U> f36256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f36257i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final bc.c f36258j = new bc.c();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f36259k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicReference<FlowableFlatMap.InnerSubscriber<?, ?>[]> f36260l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AtomicLong f36261m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public me.c f36262n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f36263o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f36264p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f36265q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f36266r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f36267s;

        public b(me.b<? super U> bVar, pb.c<? super T, ? extends me.a<? extends U>> cVar, boolean z10, int i10, int i11) {
            AtomicReference<FlowableFlatMap.InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f36260l = atomicReference;
            this.f36261m = new AtomicLong();
            this.f36251c = bVar;
            this.f36252d = cVar;
            this.f36253e = z10;
            this.f36254f = i10;
            this.f36255g = i11;
            this.f36267s = Math.max(1, i10 >> 1);
            atomicReference.lazySet(f36249t);
        }

        @Override // me.b
        public void a(Throwable th) {
            if (this.f36257i) {
                dc.a.b(th);
                return;
            }
            if (!bc.e.a(this.f36258j, th)) {
                dc.a.b(th);
                return;
            }
            this.f36257i = true;
            if (!this.f36253e) {
                for (a aVar : this.f36260l.getAndSet(f36250u)) {
                    Objects.requireNonNull(aVar);
                    ac.g.cancel(aVar);
                }
            }
            f();
        }

        public boolean b() {
            if (this.f36259k) {
                sb.h<U> hVar = this.f36256h;
                if (hVar != null) {
                    hVar.clear();
                }
                return true;
            }
            if (this.f36253e || this.f36258j.get() == null) {
                return false;
            }
            sb.h<U> hVar2 = this.f36256h;
            if (hVar2 != null) {
                hVar2.clear();
            }
            Throwable thB = bc.e.b(this.f36258j);
            if (thB != bc.e.f3505a) {
                this.f36251c.a(thB);
            }
            return true;
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f36262n, cVar)) {
                this.f36262n = cVar;
                this.f36251c.c(this);
                if (this.f36259k) {
                    return;
                }
                int i10 = this.f36254f;
                cVar.request(i10 == Integer.MAX_VALUE ? RecyclerView.FOREVER_NS : i10);
            }
        }

        @Override // me.c
        public void cancel() {
            sb.h<U> hVar;
            a[] andSet;
            if (this.f36259k) {
                return;
            }
            this.f36259k = true;
            this.f36262n.cancel();
            a[] aVarArr = this.f36260l.get();
            a[] aVarArr2 = f36250u;
            if (aVarArr != aVarArr2 && (andSet = this.f36260l.getAndSet(aVarArr2)) != aVarArr2) {
                for (a aVar : andSet) {
                    Objects.requireNonNull(aVar);
                    ac.g.cancel(aVar);
                }
                Throwable thB = bc.e.b(this.f36258j);
                if (thB != null && thB != bc.e.f3505a) {
                    dc.a.b(thB);
                }
            }
            if (getAndIncrement() != 0 || (hVar = this.f36256h) == null) {
                return;
            }
            hVar.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.b
        public void d(T t10) {
            IllegalStateException illegalStateException;
            if (this.f36257i) {
                return;
            }
            try {
                me.a<? extends U> aVarApply = this.f36252d.apply(t10);
                Objects.requireNonNull(aVarApply, "The mapper returned a null Publisher");
                me.a<? extends U> aVar = aVarApply;
                boolean z10 = false;
                if (!(aVar instanceof Callable)) {
                    long j10 = this.f36263o;
                    this.f36263o = 1 + j10;
                    FlowableFlatMap.InnerSubscriber<?, ?> aVar2 = new a<>(this, j10);
                    while (true) {
                        FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr = (a[]) this.f36260l.get();
                        if (innerSubscriberArr == f36250u) {
                            ac.g.cancel(aVar2);
                            break;
                        }
                        int length = innerSubscriberArr.length;
                        FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr2 = new a[length + 1];
                        System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                        innerSubscriberArr2[length] = aVar2;
                        if (this.f36260l.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        aVar.a(aVar2);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall == null) {
                        if (this.f36254f == Integer.MAX_VALUE || this.f36259k) {
                            return;
                        }
                        int i10 = this.f36266r + 1;
                        this.f36266r = i10;
                        int i11 = this.f36267s;
                        if (i10 == i11) {
                            this.f36266r = 0;
                            this.f36262n.request(i11);
                            return;
                        }
                        return;
                    }
                    if (get() != 0 || !compareAndSet(0, 1)) {
                        if (!h().offer(objCall)) {
                            illegalStateException = new IllegalStateException("Scalar queue full?!");
                            a(illegalStateException);
                            return;
                        } else {
                            if (getAndIncrement() != 0) {
                                return;
                            }
                            g();
                        }
                    }
                    long j11 = this.f36261m.get();
                    sb.i<U> iVarH = this.f36256h;
                    if (j11 == 0 || !(iVarH == 0 || iVarH.isEmpty())) {
                        if (iVarH == 0) {
                            iVarH = h();
                        }
                        if (!iVarH.offer(objCall)) {
                            illegalStateException = new IllegalStateException("Scalar queue full?!");
                            a(illegalStateException);
                            return;
                        }
                    } else {
                        this.f36251c.d(objCall);
                        if (j11 != RecyclerView.FOREVER_NS) {
                            this.f36261m.decrementAndGet();
                        }
                        if (this.f36254f != Integer.MAX_VALUE && !this.f36259k) {
                            int i12 = this.f36266r + 1;
                            this.f36266r = i12;
                            int i13 = this.f36267s;
                            if (i12 == i13) {
                                this.f36266r = 0;
                                this.f36262n.request(i13);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    g();
                } catch (Throwable th) {
                    c0.Q(th);
                    bc.e.a(this.f36258j, th);
                    f();
                }
            } catch (Throwable th2) {
                c0.Q(th2);
                this.f36262n.cancel();
                a(th2);
            }
        }

        public void f() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        public void g() {
            long j10;
            long j11;
            boolean z10;
            int i10;
            long j12;
            Object obj;
            me.b<? super U> bVar = this.f36251c;
            int iAddAndGet = 1;
            while (!b()) {
                sb.h<U> hVar = this.f36256h;
                long jAddAndGet = this.f36261m.get();
                boolean z11 = jAddAndGet == RecyclerView.FOREVER_NS;
                long j13 = 0;
                long j14 = 0;
                if (hVar != null) {
                    do {
                        long j15 = 0;
                        obj = null;
                        while (jAddAndGet != 0) {
                            U uPoll = hVar.poll();
                            if (b()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            bVar.d(uPoll);
                            j14++;
                            j15++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j15 != 0) {
                            jAddAndGet = z11 ? RecyclerView.FOREVER_NS : this.f36261m.addAndGet(-j15);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z12 = this.f36257i;
                sb.h<U> hVar2 = this.f36256h;
                a<T, U>[] aVarArr = (a[]) this.f36260l.get();
                int length = aVarArr.length;
                if (z12 && ((hVar2 == null || hVar2.isEmpty()) && length == 0)) {
                    Throwable thB = bc.e.b(this.f36258j);
                    if (thB != bc.e.f3505a) {
                        if (thB == null) {
                            bVar.onComplete();
                            return;
                        } else {
                            bVar.a(thB);
                            return;
                        }
                    }
                    return;
                }
                int i11 = iAddAndGet;
                if (length != 0) {
                    long j16 = this.f36264p;
                    int i12 = this.f36265q;
                    if (length <= i12 || aVarArr[i12].f36241c != j16) {
                        if (length <= i12) {
                            i12 = 0;
                        }
                        for (int i13 = 0; i13 < length && aVarArr[i12].f36241c != j16; i13++) {
                            i12++;
                            if (i12 == length) {
                                i12 = 0;
                            }
                        }
                        this.f36265q = i12;
                        this.f36264p = aVarArr[i12].f36241c;
                    }
                    int i14 = i12;
                    boolean z13 = false;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            z10 = z13;
                            break;
                        }
                        if (b()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr[i14];
                        Object obj2 = null;
                        while (!b()) {
                            sb.i<U> iVar = aVar.f36246h;
                            int i16 = length;
                            if (iVar != null) {
                                Object obj3 = obj2;
                                long j17 = j13;
                                while (jAddAndGet != j13) {
                                    try {
                                        U uPoll2 = iVar.poll();
                                        if (uPoll2 == null) {
                                            obj3 = uPoll2;
                                            j13 = 0;
                                            break;
                                        }
                                        bVar.d(uPoll2);
                                        if (b()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j17++;
                                        obj3 = uPoll2;
                                        j13 = 0;
                                    } catch (Throwable th) {
                                        c0.Q(th);
                                        ac.g.cancel(aVar);
                                        bc.e.a(this.f36258j, th);
                                        if (!this.f36253e) {
                                            this.f36262n.cancel();
                                        }
                                        if (b()) {
                                            return;
                                        }
                                        i(aVar);
                                        i15++;
                                        z13 = true;
                                        i10 = 1;
                                    }
                                }
                                if (j17 != j13) {
                                    jAddAndGet = !z11 ? this.f36261m.addAndGet(-j17) : RecyclerView.FOREVER_NS;
                                    aVar.b(j17);
                                    j12 = 0;
                                } else {
                                    j12 = j13;
                                }
                                if (jAddAndGet != j12 && obj3 != null) {
                                    length = i16;
                                    obj2 = obj3;
                                    j13 = 0;
                                }
                            }
                            boolean z14 = aVar.f36245g;
                            sb.i<U> iVar2 = aVar.f36246h;
                            if (z14 && (iVar2 == null || iVar2.isEmpty())) {
                                i(aVar);
                                if (b()) {
                                    return;
                                }
                                j14++;
                                z13 = true;
                            }
                            if (jAddAndGet == 0) {
                                z10 = z13;
                                break;
                            }
                            i14++;
                            if (i14 == i16) {
                                i14 = 0;
                            }
                            i10 = 1;
                            i15 += i10;
                            length = i16;
                            j13 = 0;
                        }
                        return;
                    }
                    this.f36265q = i14;
                    this.f36264p = aVarArr[i14].f36241c;
                    j11 = j14;
                    j10 = 0;
                } else {
                    j10 = 0;
                    j11 = j14;
                    z10 = false;
                }
                if (j11 != j10 && !this.f36259k) {
                    this.f36262n.request(j11);
                }
                if (z10) {
                    iAddAndGet = i11;
                } else {
                    iAddAndGet = addAndGet(-i11);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public sb.i<U> h() {
            sb.h<U> bVar = this.f36256h;
            if (bVar == null) {
                bVar = this.f36254f == Integer.MAX_VALUE ? new xb.b<>(this.f36255g) : new xb.a<>(this.f36254f);
                this.f36256h = bVar;
            }
            return bVar;
        }

        public void i(a<T, U> aVar) {
            FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr;
            FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (a[]) this.f36260l.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerSubscriberArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = f36249t;
                } else {
                    FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr3 = new a[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!this.f36260l.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // me.b
        public void onComplete() {
            if (this.f36257i) {
                return;
            }
            this.f36257i = true;
            f();
        }

        @Override // me.c
        public void request(long j10) {
            if (ac.g.validate(j10)) {
                h9.d.a(this.f36261m, j10);
                f();
            }
        }
    }

    public f(lb.c<T> cVar, pb.c<? super T, ? extends me.a<? extends U>> cVar2, boolean z10, int i10, int i11) {
        super(cVar);
        this.f36237e = cVar2;
        this.f36238f = z10;
        this.f36239g = i10;
        this.f36240h = i11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    @Override // lb.c
    public void h(me.b<? super U> bVar) {
        boolean z10;
        lb.c<T> cVar = this.f36195d;
        pb.c<? super T, ? extends me.a<? extends U>> cVar2 = this.f36237e;
        if (cVar instanceof Callable) {
            z10 = true;
            try {
                a1.a aVar = (Object) ((Callable) cVar).call();
                if (aVar == null) {
                    ac.d.complete(bVar);
                } else {
                    me.a<? extends U> aVarApply = cVar2.apply(aVar);
                    Objects.requireNonNull(aVarApply, "The mapper returned a null Publisher");
                    me.a<? extends U> aVar2 = aVarApply;
                    if (aVar2 instanceof Callable) {
                        Object objCall = ((Callable) aVar2).call();
                        if (objCall == null) {
                            ac.d.complete(bVar);
                        } else {
                            bVar.c(new ac.e(bVar, objCall));
                        }
                    } else {
                        aVar2.a(bVar);
                    }
                }
            } catch (Throwable th) {
                c0.Q(th);
                ac.d.error(th, bVar);
            }
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        this.f36195d.g(new b(bVar, this.f36237e, this.f36238f, this.f36239g, this.f36240h));
    }
}
