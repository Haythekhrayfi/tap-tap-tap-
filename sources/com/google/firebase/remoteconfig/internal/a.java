package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d6.e;
import h6.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<String, a> f12680d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f12681e = e.f28684i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f12682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6.e f12683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task<com.google.firebase.remoteconfig.internal.b> f12684c = null;

    public static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f12685a = new CountDownLatch(1);

        public b(C0161a c0161a) {
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f12685a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f12685a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f12685a.countDown();
        }
    }

    public a(ExecutorService executorService, i6.e eVar) {
        this.f12682a = executorService;
        this.f12683b = eVar;
    }

    public static <TResult> TResult a(Task<TResult> task, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b(null);
        Executor executor = f12681e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.f12685a.await(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public synchronized Task<com.google.firebase.remoteconfig.internal.b> b() {
        Task<com.google.firebase.remoteconfig.internal.b> task = this.f12684c;
        if (task == null || (task.isComplete() && !this.f12684c.isSuccessful())) {
            ExecutorService executorService = this.f12682a;
            i6.e eVar = this.f12683b;
            Objects.requireNonNull(eVar);
            this.f12684c = Tasks.call(executorService, new i(eVar));
        }
        return this.f12684c;
    }

    public Task<com.google.firebase.remoteconfig.internal.b> c(com.google.firebase.remoteconfig.internal.b bVar) {
        return Tasks.call(this.f12682a, new d6.i(this, bVar)).onSuccessTask(this.f12682a, new i6.a(this, true, bVar));
    }
}
