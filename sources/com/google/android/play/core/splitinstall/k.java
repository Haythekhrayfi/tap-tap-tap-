package com.google.android.play.core.splitinstall;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f12441a;

    private k() {
    }

    public static synchronized m a(Context context) {
        if (f12441a == null) {
            b bVar = new b(null);
            bVar.a(new y(com.google.android.play.core.splitcompat.p.a(context)));
            f12441a = bVar.a();
        }
        return f12441a;
    }
}
