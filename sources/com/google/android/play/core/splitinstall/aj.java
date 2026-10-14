package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.bu;

/* JADX INFO: loaded from: classes2.dex */
final class aj extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ av f12405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(av avVar, com.google.android.play.core.tasks.i iVar, int i10, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f12405c = avVar;
        this.f12403a = i10;
        this.f12404b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((bu) this.f12405c.f12415a.b()).a(this.f12405c.f12416d, this.f12403a, new ar(this.f12405c, this.f12404b));
        } catch (RemoteException e10) {
            av.f12413b.a(e10, "getSessionState(%d)", Integer.valueOf(this.f12403a));
            this.f12404b.b((Exception) new RuntimeException(e10));
        }
    }
}
