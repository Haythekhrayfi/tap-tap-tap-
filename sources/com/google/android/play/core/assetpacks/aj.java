package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class aj extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ar f11855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ar arVar, com.google.android.play.core.tasks.i iVar, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f11855b = arVar;
        this.f11854a = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.s) this.f11855b.f11873f.b()).b(this.f11855b.f11870c, ar.e(), new an(this.f11855b, this.f11854a));
        } catch (RemoteException e10) {
            ar.f11868a.a(e10, "keepAlive", new Object[0]);
        }
    }
}
