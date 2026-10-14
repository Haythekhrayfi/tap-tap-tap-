package com.applovin.impl.adview.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.w;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f8345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8349e;

    public b(Activity activity) {
        this.f8345a = activity;
        int iC = w.c(activity);
        this.f8347c = iC;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.f8348d = zIsTablet;
        this.f8346b = a(iC, zIsTablet);
        this.f8349e = zIsTablet && 2 == a(activity);
    }

    private int a(int i10, boolean z10) {
        if (z10 && this.f8349e) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 1) {
                return 9;
            }
            if (i10 == 2) {
                return 8;
            }
            return i10 == 3 ? 1 : -1;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 9;
        }
        return i10 == 3 ? 8 : -1;
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i10) {
        try {
            this.f8345a.setRequestedOrientation(i10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0046  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r6 != 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.applovin.impl.sdk.ad.e.b r6) {
        /*
            r5 = this;
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.ad.e.b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r6 != r0) goto L2d
            boolean r6 = r5.f8348d
            r0 = 9
            if (r6 == 0) goto L1e
            boolean r6 = r5.f8349e
            if (r6 == 0) goto L1e
            int r6 = r5.f8347c
            if (r6 == r3) goto L18
            if (r6 == r1) goto L18
            goto L24
        L18:
            if (r6 != r3) goto L24
        L1a:
            r5.a(r0)
            goto L55
        L1e:
            int r6 = r5.f8347c
            if (r6 == 0) goto L28
            if (r6 == r2) goto L28
        L24:
            r5.a(r3)
            goto L55
        L28:
            if (r6 != 0) goto L2b
            goto L24
        L2b:
            r3 = r0
            goto L24
        L2d:
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.ad.e.b.ACTIVITY_LANDSCAPE
            if (r6 != r0) goto L55
            boolean r6 = r5.f8348d
            r0 = 8
            r4 = 0
            if (r6 == 0) goto L48
            boolean r6 = r5.f8349e
            if (r6 == 0) goto L48
            int r6 = r5.f8347c
            if (r6 == 0) goto L43
            if (r6 == r2) goto L43
            goto L4e
        L43:
            if (r6 != r2) goto L46
            goto L1a
        L46:
            r0 = r4
            goto L1a
        L48:
            int r6 = r5.f8347c
            if (r6 == r3) goto L52
            if (r6 == r1) goto L52
        L4e:
            r5.a(r4)
            goto L55
        L52:
            if (r6 != r3) goto L1a
            goto L46
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.b.a(com.applovin.impl.sdk.ad.e$b):void");
    }

    public void a(e eVar) {
        int i10;
        if (!eVar.F() || (i10 = this.f8346b) == -1) {
            a(eVar.p());
        } else {
            a(i10);
        }
    }
}
