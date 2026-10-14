package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class ao extends ak<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ar f11863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(ar arVar, com.google.android.play.core.tasks.i<Void> iVar, int i10, String str, int i11) {
        super(arVar, iVar);
        this.f11863f = arVar;
        this.f11860c = i10;
        this.f11861d = str;
        this.f11862e = i11;
    }

    @Override // com.google.android.play.core.assetpacks.ak, com.google.android.play.core.internal.u
    public final void a(Bundle bundle) {
        this.f11863f.f11872e.a();
        ar.f11868a.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i10 = this.f11862e;
        if (i10 > 0) {
            this.f11863f.a(this.f11860c, this.f11861d, i10 - 1);
        }
    }
}
