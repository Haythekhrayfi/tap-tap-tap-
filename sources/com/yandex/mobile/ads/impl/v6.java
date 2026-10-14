package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class v6 {
    public static boolean a(Context context, SizeInfo sizeInfo) {
        int iB = eh1.b(context);
        int iC = eh1.c(context);
        if (sizeInfo != null) {
            int iC2 = sizeInfo.c(context);
            int iA = sizeInfo.a(context);
            if (iC2 <= iB && iA <= iC) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, SizeInfo sizeInfo, SizeInfo sizeInfo2) {
        if (b(context, sizeInfo, sizeInfo2)) {
            if (sizeInfo.c(context) <= eh1.c(context) && sizeInfo.a(context) <= eh1.b(context)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context, SizeInfo sizeInfo) {
        int iC = eh1.c(context);
        int iB = eh1.b(context);
        if (sizeInfo != null) {
            int iC2 = sizeInfo.c(context);
            int iA = sizeInfo.a(context);
            if (iC2 <= iC && iA <= iB) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public static boolean b(Context context, SizeInfo sizeInfo, SizeInfo sizeInfo2) {
        int iC = sizeInfo2.c(context);
        int iA = sizeInfo2.a(context);
        int iC2 = sizeInfo.c(context);
        int iA2 = sizeInfo.a(context);
        int iA3 = a6.a(sizeInfo2.d());
        if (iA3 != 0) {
            if (iA3 == 1) {
                if (iC2 <= iC && iC > 0 && (iA2 <= iA || iA == 0)) {
                    return true;
                }
            } else {
                if (iA3 == 2) {
                    return true;
                }
                if (iA3 == 3) {
                    if (iC2 <= iC) {
                        return true;
                    }
                }
            }
        } else if (iC2 <= iC && iC > 0 && iA2 <= iA) {
            return true;
        }
        return false;
    }
}
