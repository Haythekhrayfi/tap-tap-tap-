package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.bu;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ai extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ av f12402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(av avVar, com.google.android.play.core.tasks.i iVar, List list, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f12402c = avVar;
        this.f12400a = list;
        this.f12401b = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((bu) this.f12402c.f12415a.b()).e(this.f12402c.f12416d, av.b((Collection) this.f12400a), av.b(), new ap(this.f12402c, this.f12401b));
        } catch (RemoteException e10) {
            av.f12413b.a(e10, "deferredLanguageUninstall(%s)", this.f12400a);
            this.f12401b.b((Exception) new RuntimeException(e10));
        }
    }
}
