package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ae extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f11829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f11830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az f11832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ar f11833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ar arVar, com.google.android.play.core.tasks.i iVar, List list, Map map, com.google.android.play.core.tasks.i iVar2, az azVar) {
        super(iVar);
        this.f11833e = arVar;
        this.f11829a = list;
        this.f11830b = map;
        this.f11831c = iVar2;
        this.f11832d = azVar;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        ArrayList arrayListA = ar.a((Collection) this.f11829a);
        try {
            com.google.android.play.core.internal.s sVar = (com.google.android.play.core.internal.s) this.f11833e.f11872e.b();
            String str = this.f11833e.f11870c;
            Bundle bundleB = ar.b(this.f11830b);
            ar arVar = this.f11833e;
            sVar.c(str, arrayListA, bundleB, new ap(arVar, this.f11831c, arVar.f11871d, this.f11832d));
        } catch (RemoteException e10) {
            ar.f11868a.a(e10, "getPackStates(%s)", this.f11829a);
            this.f11831c.b((Exception) new RuntimeException(e10));
        }
    }
}
