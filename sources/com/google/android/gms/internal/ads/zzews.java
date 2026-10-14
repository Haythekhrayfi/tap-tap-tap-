package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzews {
    public static void zza(AtomicReference atomicReference, zzewr zzewrVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzewrVar.zza(obj);
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            zzbzr.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
