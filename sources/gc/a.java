package gc;

import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lb.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0281a[] f30423e = new C0281a[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0281a[] f30424f = new C0281a[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<PublishSubject.PublishDisposable<T>[]> f30425c = new AtomicReference<>(f30424f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f30426d;

    /* JADX INFO: renamed from: gc.a$a, reason: collision with other inner class name */
    public static final class C0281a<T> extends AtomicBoolean implements nb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k<? super T> f30427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a<T> f30428d;

        public C0281a(k<? super T> kVar, a<T> aVar) {
            this.f30427c = kVar;
            this.f30428d = aVar;
        }

        @Override // nb.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f30428d.A(this);
            }
        }
    }

    public void A(C0281a<T> c0281a) {
        PublishSubject.PublishDisposable<T>[] publishDisposableArr;
        C0281a[] c0281aArr;
        do {
            publishDisposableArr = (C0281a[]) this.f30425c.get();
            if (publishDisposableArr == f30423e || publishDisposableArr == f30424f) {
                return;
            }
            int length = publishDisposableArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (publishDisposableArr[i10] == c0281a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0281aArr = f30424f;
            } else {
                C0281a[] c0281aArr2 = new C0281a[length - 1];
                System.arraycopy(publishDisposableArr, 0, c0281aArr2, 0, i10);
                System.arraycopy(publishDisposableArr, i10 + 1, c0281aArr2, i10, (length - i10) - 1);
                c0281aArr = c0281aArr2;
            }
        } while (!this.f30425c.compareAndSet(publishDisposableArr, c0281aArr));
    }

    @Override // lb.k
    public void a(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishSubject.PublishDisposable<T>[] publishDisposableArr = this.f30425c.get();
        PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = f30423e;
        if (publishDisposableArr == publishDisposableArr2) {
            dc.a.b(th);
            return;
        }
        this.f30426d = th;
        for (C0281a c0281a : this.f30425c.getAndSet(publishDisposableArr2)) {
            if (c0281a.get()) {
                dc.a.b(th);
            } else {
                c0281a.f30427c.a(th);
            }
        }
    }

    @Override // lb.k
    public void b(nb.b bVar) {
        if (this.f30425c.get() == f30423e) {
            bVar.dispose();
        }
    }

    @Override // lb.k
    public void d(T t10) {
        Objects.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C0281a c0281a : this.f30425c.get()) {
            if (!c0281a.get()) {
                c0281a.f30427c.d(t10);
            }
        }
    }

    @Override // lb.k
    public void onComplete() {
        PublishSubject.PublishDisposable<T>[] publishDisposableArr = this.f30425c.get();
        PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = f30423e;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (C0281a c0281a : this.f30425c.getAndSet(publishDisposableArr2)) {
            if (!c0281a.get()) {
                c0281a.f30427c.onComplete();
            }
        }
    }

    @Override // lb.i
    public void t(k<? super T> kVar) {
        boolean z10;
        PublishSubject.PublishDisposable<T> c0281a = new C0281a<>(kVar, this);
        kVar.b(c0281a);
        while (true) {
            PublishSubject.PublishDisposable<T>[] publishDisposableArr = (C0281a[]) this.f30425c.get();
            z10 = false;
            if (publishDisposableArr == f30423e) {
                break;
            }
            int length = publishDisposableArr.length;
            PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = new C0281a[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = c0281a;
            if (this.f30425c.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            if (c0281a.get()) {
                A(c0281a);
            }
        } else {
            Throwable th = this.f30426d;
            if (th != null) {
                kVar.a(th);
            } else {
                kVar.onComplete();
            }
        }
    }
}
