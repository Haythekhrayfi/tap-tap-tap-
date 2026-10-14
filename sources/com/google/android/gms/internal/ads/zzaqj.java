package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqj implements zzfkw {
    public final /* synthetic */ zzfiw zza;

    public zzaqj(zzaql zzaqlVar, zzfiw zzfiwVar) {
        this.zza = zzfiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
