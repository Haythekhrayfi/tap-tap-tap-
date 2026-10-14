package com.google.android.play.core.appupdate;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static y f11799a;

    public static synchronized y a(Context context) {
        if (f11799a == null) {
            x xVar = new x(null);
            xVar.a(new g(com.google.android.play.core.splitcompat.p.a(context)));
            f11799a = xVar.a();
        }
        return f11799a;
    }
}
