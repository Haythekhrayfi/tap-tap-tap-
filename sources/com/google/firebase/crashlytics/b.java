package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import f5.p0;
import f5.q0;
import f5.w;
import f5.x;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import m5.g;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Callable<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f12560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f12561e;

    public b(boolean z10, x xVar, g gVar) {
        this.f12559c = z10;
        this.f12560d = xVar;
        this.f12561e = gVar;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        if (!this.f12559c) {
            return null;
        }
        x xVar = this.f12560d;
        g gVar = this.f12561e;
        ExecutorService executorService = xVar.f29362l;
        w wVar = new w(xVar, gVar);
        ExecutorService executorService2 = q0.f29336a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new p0(wVar, taskCompletionSource));
        taskCompletionSource.getTask();
        return null;
    }
}
