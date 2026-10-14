package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;

/* JADX INFO: loaded from: classes2.dex */
final class l extends ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f11749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, com.google.android.play.core.tasks.i iVar, com.google.android.play.core.tasks.i iVar2, String str) {
        super(iVar);
        this.f11751c = pVar;
        this.f11749a = iVar2;
        this.f11750b = str;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((com.google.android.play.core.internal.n) this.f11751c.f11759a.b()).b(this.f11751c.f11760d, p.d(), new n(this.f11751c, this.f11749a));
        } catch (RemoteException e10) {
            p.f11757b.a(e10, "completeUpdate(%s)", this.f11750b);
            this.f11749a.b((Exception) new RuntimeException(e10));
        }
    }
}
