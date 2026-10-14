package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.activity.j;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsr implements zzuh {
    private final zzabd zza;
    private zzaaw zzb;
    private zzaax zzc;

    public zzsr(zzabd zzabdVar) {
        this.zza = zzabdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final int zza(zzabs zzabsVar) throws IOException {
        zzaaw zzaawVar = this.zzb;
        Objects.requireNonNull(zzaawVar);
        zzaax zzaaxVar = this.zzc;
        Objects.requireNonNull(zzaaxVar);
        return zzaawVar.zza(zzaaxVar, zzabsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final long zzb() {
        zzaax zzaaxVar = this.zzc;
        if (zzaaxVar != null) {
            return zzaaxVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzc() {
        zzaaw zzaawVar = this.zzb;
        if (zzaawVar instanceof zzafx) {
            ((zzafx) zzaawVar).zze();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzd(zzt zztVar, Uri uri, Map map, long j10, long j11, zzaaz zzaazVar) throws IOException {
        zzaam zzaamVar = new zzaam(zztVar, j10, j11);
        this.zzc = zzaamVar;
        if (this.zzb != null) {
            return;
        }
        zzaaw[] zzaawVarArrZza = this.zza.zza(uri, map);
        int i10 = 0;
        if (zzaawVarArrZza.length == 1) {
            this.zzb = zzaawVarArrZza[0];
        } else {
            for (zzaaw zzaawVar : zzaawVarArrZza) {
                try {
                    if (zzaawVar.zzd(zzaamVar)) {
                        this.zzb = zzaawVar;
                        zzdy.zzf(true);
                        zzaamVar.zzj();
                        break;
                    } else {
                        boolean z10 = this.zzb != null || zzaamVar.zzf() == j10;
                        zzdy.zzf(z10);
                        zzaamVar.zzj();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaamVar.zzf() == j10) {
                    }
                } catch (Throwable th) {
                    zzdy.zzf(this.zzb != null || zzaamVar.zzf() == j10);
                    zzaamVar.zzj();
                    throw th;
                }
                zzdy.zzf(z10);
                zzaamVar.zzj();
            }
            if (this.zzb == null) {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int length = zzaawVarArrZza.length;
                    if (i10 >= length) {
                        throw new zzvo(j.a("None of the available extractors (", sb2.toString(), ") could read the stream."), uri);
                    }
                    sb2.append(zzaawVarArrZza[i10].getClass().getSimpleName());
                    if (i10 < length - 1) {
                        sb2.append(", ");
                    }
                    i10++;
                }
            }
        }
        this.zzb.zzb(zzaazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzf(long j10, long j11) {
        zzaaw zzaawVar = this.zzb;
        Objects.requireNonNull(zzaawVar);
        zzaawVar.zzc(j10, j11);
    }
}
