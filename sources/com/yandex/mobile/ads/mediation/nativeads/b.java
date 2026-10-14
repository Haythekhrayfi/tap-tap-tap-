package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.x60;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27584a;

    public b(Context context) {
        this.f27584a = context.getApplicationContext();
    }

    public final String a(int i10, int i11) {
        Context context = this.f27584a;
        int i12 = eh1.f20253b;
        int iRound = Math.round(i10 / context.getResources().getDisplayMetrics().density);
        int iRound2 = Math.round(i11 / this.f27584a.getResources().getDisplayMetrics().density);
        x60.b("width = %s, height = %s, widthDip = %s, heightDip = %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(iRound), Integer.valueOf(iRound2));
        if (iRound >= 320 || iRound2 >= 240) {
            return "large";
        }
        return (iRound >= 160 || iRound2 >= 160) ? "medium" : "small";
    }
}
