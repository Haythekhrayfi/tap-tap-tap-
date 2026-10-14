package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class ap extends ak<AssetPackStates> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bz f11864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final az f11865d;

    public ap(ar arVar, com.google.android.play.core.tasks.i<AssetPackStates> iVar, bz bzVar, az azVar) {
        super(arVar, iVar);
        this.f11864c = bzVar;
        this.f11865d = azVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.assetpacks.ak, com.google.android.play.core.internal.u
    public final void c(Bundle bundle, Bundle bundle2) {
        super.c(bundle, bundle2);
        this.f11856a.b((T) AssetPackStates.a(bundle, this.f11864c, this.f11865d));
    }
}
