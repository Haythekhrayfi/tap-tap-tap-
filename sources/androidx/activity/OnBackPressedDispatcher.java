package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.m;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<f> f479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0.a<Boolean> f480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnBackInvokedCallback f481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f483f;

    public class LifecycleOnBackPressedCancellable implements n, androidx.activity.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.lifecycle.i f484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.activity.a f486e;

        public LifecycleOnBackPressedCancellable(androidx.lifecycle.i iVar, f fVar) {
            this.f484c = iVar;
            this.f485d = fVar;
            iVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f484c.c(this);
            this.f485d.f497b.remove(this);
            androidx.activity.a aVar = this.f486e;
            if (aVar != null) {
                aVar.cancel();
                this.f486e = null;
            }
        }

        @Override // androidx.lifecycle.n
        public void g(p pVar, androidx.lifecycle.i.b bVar) {
            if (bVar == androidx.lifecycle.i.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                f fVar = this.f485d;
                onBackPressedDispatcher.f479b.add(fVar);
                b bVar2 = onBackPressedDispatcher.new b(fVar);
                fVar.f497b.add(bVar2);
                if (l0.a.c()) {
                    onBackPressedDispatcher.c();
                    fVar.f498c = onBackPressedDispatcher.f480c;
                }
                this.f486e = bVar2;
                return;
            }
            if (bVar != androidx.lifecycle.i.b.ON_STOP) {
                if (bVar == androidx.lifecycle.i.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f486e;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    public static class a {
        public static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new g(runnable, 0);
        }

        public static void b(Object obj, int i10, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class b implements androidx.activity.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f488c;

        public b(f fVar) {
            this.f488c = fVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f479b.remove(this.f488c);
            this.f488c.f497b.remove(this);
            if (l0.a.c()) {
                this.f488c.f498c = null;
                OnBackPressedDispatcher.this.c();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f479b = new ArrayDeque<>();
        this.f483f = false;
        this.f478a = runnable;
        if (l0.a.c()) {
            this.f480c = new m(this);
            this.f481d = a.a(new c(this));
        }
    }

    @SuppressLint({"LambdaLast"})
    public void a(p pVar, f fVar) {
        androidx.lifecycle.i lifecycle = pVar.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.i.c.DESTROYED) {
            return;
        }
        fVar.f497b.add(new LifecycleOnBackPressedCancellable(lifecycle, fVar));
        if (l0.a.c()) {
            c();
            fVar.f498c = this.f480c;
        }
    }

    public void b() {
        Iterator<f> itDescendingIterator = this.f479b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            f next = itDescendingIterator.next();
            if (next.f496a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f478a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void c() {
        boolean z10;
        Iterator<f> itDescendingIterator = this.f479b.descendingIterator();
        while (true) {
            if (!itDescendingIterator.hasNext()) {
                z10 = false;
                break;
            } else if (itDescendingIterator.next().f496a) {
                z10 = true;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f482e;
        if (onBackInvokedDispatcher != null) {
            if (z10 && !this.f483f) {
                a.b(onBackInvokedDispatcher, 0, this.f481d);
                this.f483f = true;
            } else {
                if (z10 || !this.f483f) {
                    return;
                }
                a.c(onBackInvokedDispatcher, this.f481d);
                this.f483f = false;
            }
        }
    }
}
