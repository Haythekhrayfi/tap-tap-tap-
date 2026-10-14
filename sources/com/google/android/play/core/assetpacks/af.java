package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class af extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ar f11839f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ar arVar, com.google.android.play.core.tasks.i iVar, int i10, String str, String str2, int i11, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f11839f = arVar;
        this.f11834a = i10;
        this.f11835b = str;
        this.f11836c = str2;
        this.f11837d = i11;
        this.f11838e = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.s) this.f11839f.f11872e.b()).a(this.f11839f.f11870c, ar.c(this.f11834a, this.f11835b, this.f11836c, this.f11837d), ar.e(), new ak(this.f11839f, this.f11838e, (char[]) null));
        } catch (RemoteException e10) {
            ar.f11868a.a(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
