package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class ah extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ar f11847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ar arVar, com.google.android.play.core.tasks.i iVar, int i10, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f11847c = arVar;
        this.f11845a = i10;
        this.f11846b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.s) this.f11847c.f11872e.b()).c(this.f11847c.f11870c, ar.c(this.f11845a), ar.e(), new ak(this.f11847c, this.f11846b, (int[]) null));
        } catch (RemoteException e10) {
            ar.f11868a.a(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
