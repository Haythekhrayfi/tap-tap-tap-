package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1498a3 implements Tm<Context, Intent, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1570d0 f15730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f15731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1523b3 f15732c;

    public C1498a3(C1523b3 c1523b3, AbstractC1570d0 abstractC1570d0, CountDownLatch countDownLatch) {
        this.f15732c = c1523b3;
        this.f15730a = abstractC1570d0;
        this.f15731b = countDownLatch;
    }

    @Override // com.yandex.metrica.impl.ob.Tm
    public Void a(Context context, Intent intent) {
        this.f15730a.a(this.f15732c.c());
        this.f15731b.countDown();
        this.f15732c.f15807k.b(this);
        return null;
    }
}
