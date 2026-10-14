package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.play.core.internal.bq;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f12339a;

    public a(c cVar) {
        this.f12339a = cVar;
    }

    public static final synchronized void b(Context context, Set<File> set) {
        AssetManager assets = context.getAssets();
        Iterator<File> it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) bq.a(assets, "addAssetPath", Integer.class, (Class<String>) String.class, it.next().getPath())).intValue();
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("addAssetPath completed with ");
            sb2.append(iIntValue);
            Log.d("SplitCompat", sb2.toString());
        }
    }

    public final synchronized boolean a(Context context, Set<String> set) {
        StrictMode.ThreadPolicy threadPolicy;
        boolean z10;
        try {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                } catch (Exception e10) {
                    e = e10;
                    Log.i("SplitCompat", "Unable to set up strict mode.", e);
                }
            } catch (Exception e11) {
                e = e11;
                threadPolicy = null;
            }
            try {
                try {
                    HashSet hashSet = new HashSet();
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        hashSet.add(this.f12339a.b(it.next()));
                    }
                    b(context, hashSet);
                    if (threadPolicy != null) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (threadPolicy != null) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    throw th;
                }
            } catch (Exception e12) {
                Log.e("SplitCompat", "Error installing additional splits", e12);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                z10 = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }
}
