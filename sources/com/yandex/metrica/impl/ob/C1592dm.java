package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1592dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f15977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1542bm f15978b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dm$a */
    public static class a {
    }

    public C1592dm(C1542bm c1542bm, W0 w10) {
        this.f15978b = c1542bm;
        this.f15977a = w10;
    }

    public void a(String str, Throwable th) {
        if (this.f15978b.f15851f) {
            this.f15977a.reportError(str, th);
        }
    }
}
