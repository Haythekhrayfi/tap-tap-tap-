package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class u extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8010a;

    public u(int i10) {
        super(a(i10));
        this.f8010a = i10;
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
