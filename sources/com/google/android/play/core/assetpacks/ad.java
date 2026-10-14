package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ad extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f11826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ar f11828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ar arVar, com.google.android.play.core.tasks.i iVar, Map map, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f11828c = arVar;
        this.f11826a = map;
        this.f11827b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.s) this.f11828c.f11872e.b()).a(this.f11828c.f11870c, ar.b(this.f11826a), new am(this.f11828c, this.f11827b));
        } catch (RemoteException e10) {
            ar.f11868a.a(e10, "syncPacks", new Object[0]);
            this.f11827b.b((Exception) new RuntimeException(e10));
        }
    }
}
