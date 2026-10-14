package com.google.android.play.core.internal;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ar implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.splitinstall.d f12265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ as f12266c;

    public ar(as asVar, List list, com.google.android.play.core.splitinstall.d dVar) {
        this.f12266c = asVar;
        this.f12264a = list;
        this.f12265b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f12266c.f12269c.a(this.f12264a)) {
                as.a(this.f12266c, this.f12265b);
            } else {
                as.a(this.f12266c, this.f12264a, this.f12265b);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error checking verified files.", e10);
            this.f12265b.a(-11);
        }
    }
}
