package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaib implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzaia
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzaib.zza;
            return new zzaaw[]{new zzaib()};
        }
    };
    private final zzaic zzb = new zzaic(null);
    private final zzfa zzc = new zzfa(Http2.INITIAL_MAX_FRAME_SIZE);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        int iZza = zzaaxVar.zza(this.zzc.zzH(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
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
        int i10;
        zzfa zzfaVar = new zzfa(10);
        int i11 = 0;
        while (true) {
            zzaam zzaamVar = (zzaam) zzaaxVar;
            zzaamVar.zzm(zzfaVar.zzH(), 0, 10, false);
            zzfaVar.zzF(0);
            if (zzfaVar.zzm() != 4801587) {
                break;
            }
            zzfaVar.zzG(3);
            int iZzj = zzfaVar.zzj();
            i11 += iZzj + 10;
            zzaamVar.zzl(iZzj, false);
        }
        zzaaxVar.zzj();
        zzaam zzaamVar2 = (zzaam) zzaaxVar;
        zzaamVar2.zzl(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzaamVar2.zzm(zzfaVar.zzH(), 0, 7, false);
            zzfaVar.zzF(0);
            int iZzo = zzfaVar.zzo();
            if (iZzo == 44096 || iZzo == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrZzH = zzfaVar.zzH();
                if (bArrZzH.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArrZzH[2] & 255) << 8) | (bArrZzH[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArrZzH[4] & 255) << 16) | ((bArrZzH[5] & 255) << 8) | (bArrZzH[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iZzo == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzaamVar2.zzl(i10 - 7, false);
            } else {
                zzaaxVar.zzj();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzaamVar2.zzl(i13, false);
                i12 = 0;
            }
        }
    }
}
