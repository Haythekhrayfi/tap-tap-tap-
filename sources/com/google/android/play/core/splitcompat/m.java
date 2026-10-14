package com.google.android.play.core.splitcompat;

import android.content.Context;
import com.google.android.play.core.splitinstall.t;

/* JADX INFO: loaded from: classes2.dex */
final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12360a;

    public m(Context context) {
        this.f12360a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.a(this.f12360a).a(true);
    }
}
