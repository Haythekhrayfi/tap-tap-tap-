package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzaaq {
    private final zzaap zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzaaq(zzaap zzaapVar) {
        this.zza = zzaapVar;
    }

    public final zzaaw zza(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.zzb) {
            if (this.zzb.get()) {
                constructorZza = null;
            } else {
                try {
                    constructorZza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                    constructorZza = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (zzaaw) constructorZza.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }
}
