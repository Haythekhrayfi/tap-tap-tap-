package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ab extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f11818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f11819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f11821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ar f11822e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ar arVar, com.google.android.play.core.tasks.i iVar, List list, Map map, com.google.android.play.core.tasks.i iVar2, List list2) {
        super(iVar);
        this.f11822e = arVar;
        this.f11818a = list;
        this.f11819b = map;
        this.f11820c = iVar2;
        this.f11821d = list2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        ArrayList arrayListA = ar.a((Collection) this.f11818a);
        try {
            com.google.android.play.core.internal.s sVar = (com.google.android.play.core.internal.s) this.f11822e.f11872e.b();
            String str = this.f11822e.f11870c;
            Bundle bundleB = ar.b(this.f11819b);
            ar arVar = this.f11822e;
            sVar.a(str, arrayListA, bundleB, new aq(arVar, this.f11820c, arVar.f11871d, this.f11821d));
        } catch (RemoteException e10) {
            ar.f11868a.a(e10, "startDownload(%s)", this.f11818a);
            this.f11820c.b((Exception) new RuntimeException(e10));
        }
    }
}
