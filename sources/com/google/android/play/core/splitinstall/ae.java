package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.bu;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
final class ae extends com.google.android.play.core.internal.ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f12387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f12388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.tasks.i f12389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av f12390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(av avVar, com.google.android.play.core.tasks.i iVar, Collection collection, Collection collection2, com.google.android.play.core.tasks.i iVar2) {
        super(iVar);
        this.f12390d = avVar;
        this.f12387a = collection;
        this.f12388b = collection2;
        this.f12389c = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        ArrayList arrayListA = av.a(this.f12387a);
        arrayListA.addAll(av.b(this.f12388b));
        try {
            ((bu) this.f12390d.f12415a.b()).a(this.f12390d.f12416d, arrayListA, av.b(), new at(this.f12390d, this.f12389c));
        } catch (RemoteException e10) {
            av.f12413b.a(e10, "startInstall(%s,%s)", this.f12387a, this.f12388b);
            this.f12389c.b((Exception) new RuntimeException(e10));
        }
    }
}
