package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.bu;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ag extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ av f12396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(av avVar, com.google.android.play.core.tasks.i iVar, List list, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f12396c = avVar;
        this.f12394a = list;
        this.f12395b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((bu) this.f12396c.f12415a.b()).c(this.f12396c.f12416d, av.a((Collection) this.f12394a), av.b(), new an(this.f12396c, this.f12395b));
        } catch (RemoteException e10) {
            av.f12413b.a(e10, "deferredInstall(%s)", this.f12394a);
            this.f12395b.b((Exception) new RuntimeException(e10));
        }
    }
}
