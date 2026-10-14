package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.tasks.i;

/* JADX INFO: loaded from: classes2.dex */
final class g extends f<ReviewInfo> {
    public g(h hVar, i iVar) {
        super(hVar, new af("OnRequestInstallCallback"), iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.review.f, com.google.android.play.core.internal.ad
    public final void a(Bundle bundle) throws RemoteException {
        super.a(bundle);
        this.f12328b.b((T) ReviewInfo.a((PendingIntent) bundle.get("confirmation_intent")));
    }
}
