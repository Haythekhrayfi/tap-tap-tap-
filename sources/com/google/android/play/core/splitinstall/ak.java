package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.bu;

/* JADX INFO: loaded from: classes2.dex */
final class ak extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av f12407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(av avVar, com.google.android.play.core.tasks.i iVar, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f12407b = avVar;
        this.f12406a = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((bu) this.f12407b.f12415a.b()).a(this.f12407b.f12416d, new as(this.f12407b, this.f12406a));
        } catch (RemoteException e10) {
            av.f12413b.a(e10, "getSessionStates", new Object[0]);
            this.f12406a.b((Exception) new RuntimeException(e10));
        }
    }
}
