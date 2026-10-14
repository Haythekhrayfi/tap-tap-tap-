package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.av;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class m<ResultT> extends Task<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12549a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<ResultT> f12550b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ResultT f12552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f12553e;

    private final void a() {
        av.a(this.f12551c, "Task is not yet complete");
    }

    private final void b() {
        av.a(!this.f12551c, "Task is already complete");
    }

    private final void c() {
        synchronized (this.f12549a) {
            if (this.f12551c) {
                this.f12550b.a(this);
            }
        }
    }

    public final void a(Exception exc) {
        synchronized (this.f12549a) {
            b();
            this.f12551c = true;
            this.f12553e = exc;
        }
        this.f12550b.a(this);
    }

    public final void a(ResultT resultt) {
        synchronized (this.f12549a) {
            b();
            this.f12551c = true;
            this.f12552d = resultt;
        }
        this.f12550b.a(this);
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnCompleteListener(OnCompleteListener<ResultT> onCompleteListener) {
        this.f12550b.a(new b(TaskExecutors.MAIN_THREAD, onCompleteListener));
        c();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnCompleteListener(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        this.f12550b.a(new b(executor, onCompleteListener));
        c();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.f12550b.a(new d(executor, onFailureListener));
        c();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Task<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f12550b.a(new f(executor, onSuccessListener));
        c();
        return this;
    }

    public final boolean b(Exception exc) {
        synchronized (this.f12549a) {
            if (this.f12551c) {
                return false;
            }
            this.f12551c = true;
            this.f12553e = exc;
            this.f12550b.a(this);
            return true;
        }
    }

    public final boolean b(ResultT resultt) {
        synchronized (this.f12549a) {
            if (this.f12551c) {
                return false;
            }
            this.f12551c = true;
            this.f12552d = resultt;
            this.f12550b.a(this);
            return true;
        }
    }

    @Override // com.google.android.play.core.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f12549a) {
            exc = this.f12553e;
        }
        return exc;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final ResultT getResult() {
        ResultT resultt;
        synchronized (this.f12549a) {
            a();
            Exception exc = this.f12553e;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            resultt = this.f12552d;
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final <X extends Throwable> ResultT getResult(Class<X> cls) throws Throwable {
        ResultT resultt;
        synchronized (this.f12549a) {
            a();
            if (cls.isInstance(this.f12553e)) {
                throw cls.cast(this.f12553e);
            }
            Exception exc = this.f12553e;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            resultt = this.f12552d;
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final boolean isComplete() {
        boolean z10;
        synchronized (this.f12549a) {
            z10 = this.f12551c;
        }
        return z10;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final boolean isSuccessful() {
        boolean z10;
        synchronized (this.f12549a) {
            z10 = false;
            if (this.f12551c && this.f12553e == null) {
                z10 = true;
            }
        }
        return z10;
    }
}
