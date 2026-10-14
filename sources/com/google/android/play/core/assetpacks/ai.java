package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class ai extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ar f11853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ar arVar, com.google.android.play.core.tasks.i iVar, int i10, String str, String str2, int i11, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f11853f = arVar;
        this.f11848a = i10;
        this.f11849b = str;
        this.f11850c = str2;
        this.f11851d = i11;
        this.f11852e = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.s) this.f11853f.f11872e.b()).d(this.f11853f.f11870c, ar.c(this.f11848a, this.f11849b, this.f11850c, this.f11851d), ar.e(), new al(this.f11853f, this.f11852e));
        } catch (RemoteException e10) {
            ar.f11868a.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f11849b, this.f11850c, Integer.valueOf(this.f11851d), Integer.valueOf(this.f11848a));
            this.f11852e.b((Exception) new RuntimeException(e10));
        }
    }
}
