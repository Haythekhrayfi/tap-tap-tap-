package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes2.dex */
final class bv extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11991a;

    public bv(String str) {
        super(str);
        this.f11991a = -1;
    }

    public bv(String str, int i10) {
        super(str);
        this.f11991a = i10;
    }

    public bv(String str, Exception exc) {
        super(str, exc);
        this.f11991a = -1;
    }

    public bv(String str, Exception exc, int i10) {
        super(str, exc);
        this.f11991a = i10;
    }
}
