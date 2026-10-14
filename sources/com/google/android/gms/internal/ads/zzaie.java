package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaie implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzaid
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzaie.zza;
            return new zzaaw[]{new zzaie(0)};
        }
    };
    private final zzaif zzb;
    private final zzfa zzc;
    private final zzfa zzd;
    private final zzez zze;
    private zzaaz zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzaie() {
        this(0);
    }

    public zzaie(int i10) {
        this.zzb = new zzaif(true, null);
        this.zzc = new zzfa(2048);
        this.zzh = -1L;
        zzfa zzfaVar = new zzfa(10);
        this.zzd = zzfaVar;
        byte[] bArrZzH = zzfaVar.zzH();
        this.zze = new zzez(bArrZzH, bArrZzH.length);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        zzdy.zzb(this.zzf);
        int iZza = zzaaxVar.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzN(new zzabu(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(iZza);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzf = zzaazVar;
        this.zzb.zzb(zzaazVar, new zzajv(Integer.MIN_VALUE, 0, 1));
        zzaazVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j11;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        int i10 = 0;
        while (true) {
            zzaam zzaamVar = (zzaam) zzaaxVar;
            zzaamVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int iZzj = this.zzd.zzj();
            i10 += iZzj + 10;
            zzaamVar.zzl(iZzj, false);
        }
        zzaaxVar.zzj();
        zzaam zzaamVar2 = (zzaam) zzaaxVar;
        zzaamVar2.zzl(i10, false);
        if (this.zzh == -1) {
            this.zzh = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzaamVar2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (zzaif.zzf(this.zzd.zzo())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzaamVar2.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzj(14);
                int iZzd = this.zze.zzd(13);
                if (iZzd <= 6) {
                    i13++;
                    zzaaxVar.zzj();
                    zzaamVar2.zzl(i13, false);
                    i11 = 0;
                    i12 = 0;
                } else {
                    zzaamVar2.zzl(iZzd - 6, false);
                    i12 += iZzd;
                }
            } else {
                i13++;
                zzaaxVar.zzj();
                zzaamVar2.zzl(i13, false);
                i11 = 0;
                i12 = 0;
            }
        } while (i13 - i10 < 8192);
        return false;
    }
}
