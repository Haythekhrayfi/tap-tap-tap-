package com.google.android.play.core.review;

import android.os.RemoteException;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.internal.ab;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.tasks.i;

/* JADX INFO: loaded from: classes2.dex */
final class e extends ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f12325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f12326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, i iVar, i iVar2) {
        super(iVar);
        this.f12326b = hVar;
        this.f12325a = iVar2;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        try {
            ((ab) this.f12326b.f12331a.b()).a(this.f12326b.f12332c, PlayCoreVersion.a(), new g(this.f12326b, this.f12325a));
        } catch (RemoteException e10) {
            h.f12330b.a(e10, "error requesting in-app review for %s", this.f12326b.f12332c);
            this.f12325a.b((Exception) new RuntimeException(e10));
        }
    }
}
