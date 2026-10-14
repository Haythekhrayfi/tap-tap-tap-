package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class aq extends ak<AssetPackStates> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f11866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bz f11867d;

    public aq(ar arVar, com.google.android.play.core.tasks.i<AssetPackStates> iVar, bz bzVar, List<String> list) {
        super(arVar, iVar);
        this.f11867d = bzVar;
        this.f11866c = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.assetpacks.ak, com.google.android.play.core.internal.u
    public final void a(int i10, Bundle bundle) {
        super.a(i10, bundle);
        this.f11856a.b((T) AssetPackStates.a(bundle, this.f11867d, this.f11866c));
    }
}
