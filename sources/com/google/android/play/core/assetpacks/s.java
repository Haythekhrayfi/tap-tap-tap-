package com.google.android.play.core.assetpacks;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements com.google.android.play.core.internal.cn<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f12219a;

    public s(n nVar) {
        this.f12219a = nVar;
    }

    public static Context a(n nVar) {
        Context contextA = nVar.a();
        com.google.android.play.core.internal.bq.b(contextA);
        return contextA;
    }

    @Override // com.google.android.play.core.internal.cn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Context a() {
        return a(this.f12219a);
    }
}
