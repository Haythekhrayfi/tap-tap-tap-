package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class x41 {
    public static String a(Context context, String str) {
        nz0 nz0VarA = i01.b().a(context);
        tr trVarI = nz0VarA != null ? nz0VarA.i() : null;
        if (trVarI == null) {
            return null;
        }
        byte[] bArrA = new ue0(trVarI.b(), trVarI.a()).a(str.getBytes());
        if (bArrA != null) {
            return Base64.encodeToString(bArrA, 2);
        }
        return null;
    }
}
