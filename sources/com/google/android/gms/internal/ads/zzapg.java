package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
final class zzapg implements Runnable {
    private zzapg() {
    }

    public /* synthetic */ zzapg(zzapf zzapfVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzaph.zzd = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } finally {
            zzaph.zzb.countDown();
        }
    }
}
