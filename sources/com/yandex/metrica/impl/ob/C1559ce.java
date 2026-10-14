package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1559ce {
    public static final boolean a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }
}
