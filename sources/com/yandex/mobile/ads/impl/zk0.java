package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdType;

/* JADX INFO: loaded from: classes3.dex */
public final class zk0 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27354b;

        static {
            int[] iArr = new int[NativeAdType.values().length];
            f27354b = iArr;
            try {
                iArr[NativeAdType.APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27354b[NativeAdType.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27354b[NativeAdType.MEDIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a6.b(3).length];
            f27353a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27353a[0] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27353a[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static int a(NativeAdType nativeAdType) {
        int i10 = a.f27354b[nativeAdType.ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 != 3) ? 1 : 3;
        }
        return 2;
    }
}
