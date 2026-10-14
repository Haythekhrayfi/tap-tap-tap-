package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.bu;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class af extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ av f12393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(av avVar, com.google.android.play.core.tasks.i iVar, List list, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f12393c = avVar;
        this.f12391a = list;
        this.f12392b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((bu) this.f12393c.f12415a.b()).b(this.f12393c.f12416d, av.a((Collection) this.f12391a), av.b(), new aq(this.f12393c, this.f12392b));
        } catch (RemoteException e10) {
            av.f12413b.a(e10, "deferredUninstall(%s)", this.f12391a);
            this.f12392b.b((Exception) new RuntimeException(e10));
        }
    }
}
