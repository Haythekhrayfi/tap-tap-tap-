package com.applovin.impl.sdk.e;

/* JADX INFO: loaded from: classes.dex */
public class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f10575a;

    public interface a {
        void a(com.applovin.impl.sdk.utils.d.a aVar);
    }

    public i(com.applovin.impl.sdk.o oVar, a aVar) {
        super("TaskCollectAdvertisingId", oVar, true);
        this.f10575a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10575a.a(this.f10534f.K().l());
    }
}
