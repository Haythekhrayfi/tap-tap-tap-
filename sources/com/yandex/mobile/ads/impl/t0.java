package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements m0 {
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // com.yandex.mobile.ads.impl.m0
    public final l0 a(Context context, RelativeLayout relativeLayout, a1 a1Var, q0 q0Var, Intent intent, Window window) {
        Long lValueOf;
        try {
            if (intent.hasExtra("data_identifier")) {
                lValueOf = Long.valueOf(intent.getLongExtra("data_identifier", -1L));
                try {
                    if (lValueOf.longValue() == -1) {
                        lValueOf = null;
                    }
                } catch (Exception unused) {
                    x60.c("Failed to get data identifier from intent's extras", new Object[0]);
                }
            } else {
                lValueOf = null;
            }
        } catch (Exception unused2) {
            lValueOf = null;
        }
        o0 o0VarA = lValueOf != null ? p0.a().a(lValueOf.longValue()) : null;
        if (o0VarA == null) {
            return null;
        }
        AdResponse<String> adResponseA = o0VarA.a();
        NativeAd nativeAdB = o0VarA.b();
        dl1 dl1VarD = o0VarA.d();
        String strC = adResponseA.C();
        if (dl1VarD == null || TextUtils.isEmpty(strC)) {
            if (nativeAdB instanceof com.yandex.mobile.ads.nativeads.u) {
                return new w0(context, relativeLayout, window, (com.yandex.mobile.ads.nativeads.u) nativeAdB, adResponseA, a1Var, q0Var, o0VarA.c());
            }
            return null;
        }
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return new s0(context, relativeLayout, a1Var, window, new sw(adResponseA, dl1VarD));
    }
}
