package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ue1 f27184a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27185a;

        static {
            int[] iArr = new int[InstreamAdBreakPosition.Type.values().length];
            f27185a = iArr;
            try {
                iArr[InstreamAdBreakPosition.Type.MILLISECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27185a[InstreamAdBreakPosition.Type.PERCENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27185a[InstreamAdBreakPosition.Type.POSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public z1(ue1 ue1Var) {
        this.f27184a = ue1Var;
    }

    public final long a(InstreamAdBreakPosition instreamAdBreakPosition) {
        long value = instreamAdBreakPosition.getValue();
        int i10 = a.f27185a[instreamAdBreakPosition.getPositionType().ordinal()];
        if (i10 == 1) {
            return value;
        }
        if (i10 == 2) {
            if (value == 100) {
                return Long.MIN_VALUE;
            }
            if (value == 0) {
                return 0L;
            }
            long jA = this.f27184a.a();
            if (jA != -9223372036854775807L) {
                return (long) ((value / 100.0f) * jA);
            }
        }
        return -1L;
    }
}
