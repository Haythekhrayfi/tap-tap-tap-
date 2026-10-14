package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f12362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplitCompat f12363b;

    public o(SplitCompat splitCompat, Set set) {
        this.f12363b = splitCompat;
        this.f12362a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f12362a.iterator();
            while (it.hasNext()) {
                this.f12363b.f12336b.f((String) it.next());
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e10);
        }
    }
}
