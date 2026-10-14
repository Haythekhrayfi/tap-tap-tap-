package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class an extends ak<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ar f11859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ar arVar, com.google.android.play.core.tasks.i<Void> iVar) {
        super(arVar, iVar);
        this.f11859c = arVar;
    }

    @Override // com.google.android.play.core.assetpacks.ak, com.google.android.play.core.internal.u
    public final void a(Bundle bundle, Bundle bundle2) {
        super.a(bundle, bundle2);
        if (!this.f11859c.f11874g.compareAndSet(true, false)) {
            ar.f11868a.d("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f11859c.a();
        }
    }
}
