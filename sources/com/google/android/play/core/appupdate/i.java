package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cn;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements cn<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f11744a;

    public i(g gVar) {
        this.f11744a = gVar;
    }

    @Override // com.google.android.play.core.internal.cn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Context a() {
        Context contextA = this.f11744a.a();
        bq.b(contextA);
        return contextA;
    }
}
