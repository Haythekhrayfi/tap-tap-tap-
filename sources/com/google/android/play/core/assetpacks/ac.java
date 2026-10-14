package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ac extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f11823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ar f11825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ar arVar, com.google.android.play.core.tasks.i iVar, List list, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f11825c = arVar;
        this.f11823a = list;
        this.f11824b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.s) this.f11825c.f11872e.b()).b(this.f11825c.f11870c, ar.a((Collection) this.f11823a), ar.e(), new ak(this.f11825c, this.f11824b, (byte[]) null));
        } catch (RemoteException e10) {
            ar.f11868a.a(e10, "cancelDownloads(%s)", this.f11823a);
        }
    }
}
