package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahy implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzahx
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzahy.zza;
            return new zzaaw[]{new zzahy()};
        }
    };
    private final zzahz zzb = new zzahz(null);
    private final zzfa zzc = new zzfa(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        int iZza = zzaaxVar.zza(this.zzc.zzH(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(iZza);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzb.zzb(zzaazVar, new zzajv(Integer.MIN_VALUE, 0, 1));
        zzaazVar.zzC();
        zzaazVar.zzN(new zzabu(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        zzfa zzfaVar = new zzfa(10);
        int i10 = 0;
        while (true) {
            zzaam zzaamVar = (zzaam) zzaaxVar;
            zzaamVar.zzm(zzfaVar.zzH(), 0, 10, false);
            zzfaVar.zzF(0);
            if (zzfaVar.zzm() != 4801587) {
                break;
            }
            zzfaVar.zzG(3);
            int iZzj = zzfaVar.zzj();
            i10 += iZzj + 10;
            zzaamVar.zzl(iZzj, false);
        }
        zzaaxVar.zzj();
        zzaam zzaamVar2 = (zzaam) zzaaxVar;
        zzaamVar2.zzl(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            zzaamVar2.zzm(zzfaVar.zzH(), 0, 6, false);
            zzfaVar.zzF(0);
            if (zzfaVar.zzo() != 2935) {
                zzaaxVar.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzaamVar2.zzl(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iZzb = zzzx.zzb(zzfaVar.zzH());
                if (iZzb == -1) {
                    return false;
                }
                zzaamVar2.zzl(iZzb - 6, false);
            }
        }
    }
}
