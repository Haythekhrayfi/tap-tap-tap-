package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.bu;

/* JADX INFO: loaded from: classes2.dex */
final class al extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ av f12410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(av avVar, com.google.android.play.core.tasks.i iVar, int i10, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f12410c = avVar;
        this.f12408a = i10;
        this.f12409b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((bu) this.f12410c.f12415a.b()).a(this.f12410c.f12416d, this.f12408a, av.b(), new am(this.f12410c, this.f12409b));
        } catch (RemoteException e10) {
            av.f12413b.a(e10, "cancelInstall(%d)", Integer.valueOf(this.f12408a));
            this.f12409b.b((Exception) new RuntimeException(e10));
        }
    }
}
