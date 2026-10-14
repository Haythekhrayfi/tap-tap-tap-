package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cn;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements cn<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f12525a;

    public z(y yVar) {
        this.f12525a = yVar;
    }

    @Override // com.google.android.play.core.internal.cn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Context a() {
        Context contextB = this.f12525a.b();
        bq.b(contextB);
        return contextB;
    }
}
