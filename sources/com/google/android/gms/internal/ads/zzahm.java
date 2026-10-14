package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahm implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzahl
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzahm.zza;
            return new zzaaw[]{new zzahm()};
        }
    };
    private zzaaz zzb;
    private zzahu zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zze(zzaax zzaaxVar) throws IOException {
        zzahu zzahqVar;
        zzaho zzahoVar = new zzaho();
        if (zzahoVar.zzb(zzaaxVar, true) && (zzahoVar.zza & 2) == 2) {
            int iMin = Math.min(zzahoVar.zze, 8);
            zzfa zzfaVar = new zzfa(iMin);
            ((zzaam) zzaaxVar).zzm(zzfaVar.zzH(), 0, iMin, false);
            zzfaVar.zzF(0);
            if (zzfaVar.zza() >= 5 && zzfaVar.zzk() == 127 && zzfaVar.zzs() == 1179402563) {
                zzahqVar = new zzahk();
            } else {
                zzfaVar.zzF(0);
                try {
                    if (zzacf.zzd(1, zzfaVar, true)) {
                        zzahqVar = new zzahw();
                    } else {
                        zzfaVar.zzF(0);
                        if (zzahq.zzd(zzfaVar)) {
                            zzahqVar = new zzahq();
                        }
                    }
                } catch (zzcd unused) {
                }
            }
            this.zzc = zzahqVar;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        zzdy.zzb(this.zzb);
        if (this.zzc == null) {
            if (!zze(zzaaxVar)) {
                throw zzcd.zza("Failed to determine bitstream type", null);
            }
            zzaaxVar.zzj();
        }
        if (!this.zzd) {
            zzabz zzabzVarZzv = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzabzVarZzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzaaxVar, zzabsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzb = zzaazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        zzahu zzahuVar = this.zzc;
        if (zzahuVar != null) {
            zzahuVar.zzj(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        try {
            return zze(zzaaxVar);
        } catch (zzcd unused) {
            return false;
        }
    }
}
