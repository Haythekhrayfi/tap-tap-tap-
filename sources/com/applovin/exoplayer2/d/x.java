package com.applovin.exoplayer2.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5174c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5175d;

    public /* synthetic */ x(b bVar) {
        this.f5175d = bVar;
    }

    public /* synthetic */ x(c.e eVar) {
        this.f5175d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5174c) {
            case 0:
                ((c.e) this.f5175d).a();
                break;
            default:
                ((b) this.f5175d).b(null);
                break;
        }
    }
}
