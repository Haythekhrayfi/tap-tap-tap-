package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f19337a = new hp();

    public final ax a(Context context, AdResponse<String> adResponse, k2 k2Var) throws xi1 {
        Context applicationContext = context.getApplicationContext();
        try {
            ax axVar = new ax(applicationContext, adResponse, k2Var);
            axVar.setId(2);
            hp hpVar = this.f19337a;
            float fR = adResponse.r();
            Objects.requireNonNull(hpVar);
            int iRound = Math.round(TypedValue.applyDimension(1, fR, applicationContext.getResources().getDisplayMetrics()));
            hp hpVar2 = this.f19337a;
            float fD = adResponse.d();
            Objects.requireNonNull(hpVar2);
            int iRound2 = Math.round(TypedValue.applyDimension(1, fD, applicationContext.getResources().getDisplayMetrics()));
            if (iRound > 0 && iRound2 > 0) {
                axVar.layout(0, 0, iRound, iRound2);
            }
            return axVar;
        } catch (Throwable unused) {
            throw new xi1();
        }
    }
}
