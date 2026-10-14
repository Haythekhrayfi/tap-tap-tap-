package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class ag extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ar f11844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ar arVar, com.google.android.play.core.tasks.i iVar, int i10, String str, com.google.android.play.core.tasks.i iVar2, int i11) {
        super(iVar);
        this.f11844e = arVar;
        this.f11840a = i10;
        this.f11841b = str;
        this.f11842c = iVar2;
        this.f11843d = i11;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.s) this.f11844e.f11872e.b()).b(this.f11844e.f11870c, ar.c(this.f11840a, this.f11841b), ar.e(), new ao(this.f11844e, this.f11842c, this.f11840a, this.f11841b, this.f11843d));
        } catch (RemoteException e10) {
            ar.f11868a.a(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
