package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class Y2 implements Um<Im> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f15543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15544b;

    public Y2(X2 x10, Throwable th, String str) {
        this.f15543a = th;
        this.f15544b = str;
    }

    @Override // com.yandex.metrica.impl.ob.Um
    public void b(Im im) {
        Im im2 = im;
        if (im2.c()) {
            im2.a(this.f15543a, this.f15544b);
        }
    }
}
