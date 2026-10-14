package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.bu;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ah extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ av f12399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(av avVar, com.google.android.play.core.tasks.i iVar, List list, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f12399c = avVar;
        this.f12397a = list;
        this.f12398b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((bu) this.f12399c.f12415a.b()).d(this.f12399c.f12416d, av.b((Collection) this.f12397a), av.b(), new ao(this.f12399c, this.f12398b));
        } catch (RemoteException e10) {
            av.f12413b.a(e10, "deferredLanguageInstall(%s)", this.f12397a);
            this.f12398b.b((Exception) new RuntimeException(e10));
        }
    }
}
