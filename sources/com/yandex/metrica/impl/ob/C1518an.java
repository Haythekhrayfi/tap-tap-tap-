package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1518an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReentrantLock f15770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1543bn f15771b;

    public C1518an(Context context, String str) {
        this(new ReentrantLock(), new C1543bn(context, str));
    }

    public C1518an(ReentrantLock reentrantLock, C1543bn c1543bn) {
        this.f15770a = reentrantLock;
        this.f15771b = c1543bn;
    }

    public void a() throws Throwable {
        this.f15770a.lock();
        this.f15771b.a();
    }

    public void b() {
        this.f15771b.b();
        this.f15770a.unlock();
    }

    public void c() {
        this.f15771b.c();
        this.f15770a.unlock();
    }
}
