package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class n implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f12554a = new CountDownLatch(1);

    private n() {
    }

    public /* synthetic */ n(byte[] bArr) {
    }

    public final void a() throws InterruptedException {
        this.f12554a.await();
    }

    public final boolean a(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f12554a.await(j10, timeUnit);
    }

    @Override // com.google.android.play.core.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f12554a.countDown();
    }

    @Override // com.google.android.play.core.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f12554a.countDown();
    }
}
