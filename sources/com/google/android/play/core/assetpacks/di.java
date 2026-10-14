package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class di implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bb f12125a;

    private di(bb bbVar) {
        this.f12125a = bbVar;
    }

    public static Runnable a(bb bbVar) {
        return new di(bbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12125a.c();
    }
}
