package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkx extends zzgpm implements zzgqx {
    private static final zzgkx zzb;
    private int zzd;
    private zzgpv zze = zzgpm.zzaN();

    static {
        zzgkx zzgkxVar = new zzgkx();
        zzb = zzgkxVar;
        zzgpm.zzaU(zzgkx.class, zzgkxVar);
    }

    private zzgkx() {
    }

    public static zzgku zzd() {
        return (zzgku) zzb.zzaA();
    }

    public static zzgkx zzg(InputStream inputStream, zzgoy zzgoyVar) throws IOException {
        return (zzgkx) zzgpm.zzaH(zzb, inputStream, zzgoyVar);
    }

    public static /* synthetic */ void zzj(zzgkx zzgkxVar, zzgkw zzgkwVar) {
        Objects.requireNonNull(zzgkwVar);
        zzgpv zzgpvVar = zzgkxVar.zze;
        if (!zzgpvVar.zzc()) {
            zzgkxVar.zze = zzgpm.zzaO(zzgpvVar);
        }
        zzgkxVar.zze.add(zzgkwVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgkw.class});
        }
        if (i11 == 3) {
            return new zzgkx();
        }
        zzgkt zzgktVar = null;
        if (i11 == 4) {
            return new zzgku(zzgktVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzgkw zze(int i10) {
        return (zzgkw) this.zze.get(i10);
    }

    public final List zzh() {
        return this.zze;
    }
}
