package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Message;
import com.yandex.mobile.ads.impl.r80;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Handler.Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7611c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7612d;

    public /* synthetic */ b0(p pVar) {
        this.f7612d = pVar;
    }

    public /* synthetic */ b0(com.yandex.mobile.ads.exo.offline.c cVar) {
        this.f7612d = cVar;
    }

    public /* synthetic */ b0(r80 r80Var) {
        this.f7612d = r80Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f7611c) {
            case 0:
                return ((p) this.f7612d).a(message);
            case 1:
                return ((com.yandex.mobile.ads.exo.offline.c) this.f7612d).a(message);
            default:
                return ((r80) this.f7612d).a(message);
        }
    }
}
