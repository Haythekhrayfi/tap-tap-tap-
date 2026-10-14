package com.google.android.play.core.ktx;

import com.google.android.play.core.tasks.Task;
import jc.w;
import uc.a;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1 extends l implements uc.l<Throwable, w> {
    public final /* synthetic */ a $onCanceled$inlined;
    public final /* synthetic */ Task $task$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1(a aVar, Task task) {
        super(1);
        this.$onCanceled$inlined = aVar;
        this.$task$inlined = task;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$onCanceled$inlined.invoke();
    }
}
