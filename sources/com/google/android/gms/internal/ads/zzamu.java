package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamu extends zzgvp {
    private static final zzgvw zza = zzgvw.zzb(zzamu.class);

    public zzamu(zzgvq zzgvqVar, zzamt zzamtVar) throws IOException {
        zzf(zzgvqVar, zzgvqVar.zzc(), zzamtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    public final String toString() {
        String string = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
