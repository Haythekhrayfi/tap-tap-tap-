package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.av;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <ResultT> Task<ResultT> a(Exception exc) {
        m mVar = new m();
        mVar.a(exc);
        return mVar;
    }

    public static <ResultT> Task<ResultT> a(ResultT resultt) {
        m mVar = new m();
        mVar.a(resultt);
        return mVar;
    }

    private static <ResultT> ResultT a(Task<ResultT> task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    private static void a(Task<?> task, n nVar) {
        Executor executor = TaskExecutors.f12528a;
        task.addOnSuccessListener(executor, nVar);
        task.addOnFailureListener(executor, nVar);
    }

    public static <ResultT> ResultT await(Task<ResultT> task) throws ExecutionException, InterruptedException {
        av.a(task, "Task must not be null");
        if (task.isComplete()) {
            return (ResultT) a((Task) task);
        }
        n nVar = new n(null);
        a(task, nVar);
        nVar.a();
        return (ResultT) a((Task) task);
    }

    public static <ResultT> ResultT await(Task<ResultT> task, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        av.a(task, "Task must not be null");
        av.a(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (ResultT) a((Task) task);
        }
        n nVar = new n(null);
        a(task, nVar);
        if (nVar.a(j10, timeUnit)) {
            return (ResultT) a((Task) task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
