package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;

/* JADX INFO: loaded from: classes2.dex */
final class k extends ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, com.google.android.play.core.tasks.i iVar, String str, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f11748c = pVar;
        this.f11746a = str;
        this.f11747b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.n) this.f11748c.f11759a.b()).a(this.f11748c.f11760d, p.a(this.f11748c, this.f11746a), new o(this.f11748c, this.f11747b, this.f11746a));
        } catch (RemoteException e10) {
            p.f11757b.a(e10, "requestUpdateInfo(%s)", this.f11746a);
            this.f11747b.b((Exception) new RuntimeException(e10));
        }
    }
}
