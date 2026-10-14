package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class p<T> extends ub.a<T, T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36340e;

    public static final class a<T> extends AtomicInteger implements lb.f<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super T> f36341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ac.f f36342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final me.a<? extends T> f36343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f36344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f36345g;

        public a(me.b<? super T> bVar, long j10, ac.f fVar, me.a<? extends T> aVar) {
            this.f36341c = bVar;
            this.f36342d = fVar;
            this.f36343e = aVar;
            this.f36344f = j10;
        }

        @Override // me.b
        public void a(Throwable th) {
            this.f36341c.a(th);
        }

        public void b() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f36342d.f345i) {
                    long j10 = this.f36345g;
                    long j11 = 0;
                    if (j10 != 0) {
                        this.f36345g = 0L;
                        ac.f fVar = this.f36342d;
                        if (!fVar.f346j) {
                            if (fVar.get() == 0 && fVar.compareAndSet(0, 1)) {
                                long j12 = fVar.f340d;
                                if (j12 != RecyclerView.FOREVER_NS) {
                                    long j13 = j12 - j10;
                                    if (j13 < 0) {
                                        ac.g.reportMoreProduced(j13);
                                    } else {
                                        j11 = j13;
                                    }
                                    fVar.f340d = j11;
                                }
                                if (fVar.decrementAndGet() != 0) {
                                    fVar.b();
                                }
                            } else {
                                h9.d.a(fVar.f343g, j10);
                                fVar.a();
                            }
                        }
                    }
                    this.f36343e.a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            ac.f fVar = this.f36342d;
            if (fVar.f345i) {
                cVar.cancel();
                return;
            }
            Objects.requireNonNull(cVar, "s is null");
            if (fVar.get() != 0 || !fVar.compareAndSet(0, 1)) {
                me.c andSet = fVar.f341e.getAndSet(cVar);
                if (andSet != null && fVar.f344h) {
                    andSet.cancel();
                }
                fVar.a();
                return;
            }
            me.c cVar2 = fVar.f339c;
            if (cVar2 != null && fVar.f344h) {
                cVar2.cancel();
            }
            fVar.f339c = cVar;
            long j10 = fVar.f340d;
            if (fVar.decrementAndGet() != 0) {
                fVar.b();
            }
            if (j10 != 0) {
                cVar.request(j10);
            }
        }

        @Override // me.b
        public void d(T t10) {
            this.f36345g++;
            this.f36341c.d(t10);
        }

        @Override // me.b
        public void onComplete() {
            long j10 = this.f36344f;
            if (j10 != RecyclerView.FOREVER_NS) {
                this.f36344f = j10 - 1;
            }
            if (j10 != 0) {
                b();
            } else {
                this.f36341c.onComplete();
            }
        }
    }

    public p(lb.c<T> cVar, long j10) {
        super(cVar);
        this.f36340e = j10;
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        ac.f fVar = new ac.f(false);
        bVar.c(fVar);
        long j10 = this.f36340e;
        long j11 = RecyclerView.FOREVER_NS;
        if (j10 != RecyclerView.FOREVER_NS) {
            j11 = j10 - 1;
        }
        new a(bVar, j11, fVar, this.f36195d).b();
    }
}
