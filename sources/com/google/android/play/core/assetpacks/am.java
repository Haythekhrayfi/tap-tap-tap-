package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class am extends ak<List<String>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ar f11858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ar arVar, com.google.android.play.core.tasks.i<List<String>> iVar) {
        super(arVar, iVar);
        this.f11858c = arVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.assetpacks.ak, com.google.android.play.core.internal.u
    public final void a(List<Bundle> list) {
        super.a(list);
        this.f11856a.b((T) ar.a(this.f11858c, list));
    }
}
