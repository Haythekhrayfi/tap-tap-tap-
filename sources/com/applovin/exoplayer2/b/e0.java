package com.applovin.exoplayer2.b;

import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.ac;
import com.yandex.mobile.ads.impl.sg1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4433c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4435e;

    public /* synthetic */ e0(ViewGroup viewGroup, boolean z10) {
        this.f4434d = viewGroup;
        this.f4435e = z10;
    }

    public /* synthetic */ e0(g.a aVar, boolean z10) {
        this.f4434d = aVar;
        this.f4435e = z10;
    }

    public /* synthetic */ e0(ac.a aVar, boolean z10) {
        this.f4434d = aVar;
        this.f4435e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4433c) {
            case 0:
                ((g.a) this.f4434d).b(this.f4435e);
                break;
            case 1:
                ((ac.a) this.f4434d).a(this.f4435e);
                break;
            default:
                sg1.b((ViewGroup) this.f4434d, this.f4435e);
                break;
        }
    }
}
