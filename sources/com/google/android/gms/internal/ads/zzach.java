package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzach implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzacg
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzach.zza;
            return new zzaaw[]{new zzach(0)};
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzaaz zzp;
    private zzabz zzq;
    private zzabv zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i10 = zzfj.zza;
        Charset charset = zzfot.zzc;
        zzd = "#!AMR\n".getBytes(charset);
        zze = "#!AMR-WB\n".getBytes(charset);
        zzf = iArr[8];
    }

    public zzach() {
        this(0);
    }

    public zzach(int i10) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    @RequiresNonNull({"trackOutput"})
    private final int zze(zzaax zzaaxVar) throws IOException {
        int i10 = this.zzk;
        if (i10 == 0) {
            try {
                zzaaxVar.zzj();
                ((zzaam) zzaaxVar).zzm(this.zzg, 0, 1, false);
                byte b10 = this.zzg[0];
                if ((b10 & 131) > 0) {
                    throw zzcd.zza("Invalid padding bits for frame header " + ((int) b10), null);
                }
                boolean z10 = this.zzh;
                int i11 = (b10 >> 3) & 15;
                if (!z10) {
                    if (!z10) {
                        if (i11 >= 12 && i11 <= 14) {
                        }
                    }
                    throw zzcd.zza("Illegal AMR " + (true != z10 ? "NB" : "WB") + " frame type " + i11, null);
                }
                if (i11 >= 10 && i11 <= 13) {
                    if (!z10) {
                        if (i11 >= 12) {
                        }
                    }
                    if (true != z10) {
                    }
                    throw zzcd.zza("Illegal AMR " + (true != z10 ? "NB" : "WB") + " frame type " + i11, null);
                }
                i10 = z10 ? zzc[i11] : zzb[i11];
                this.zzj = i10;
                this.zzk = i10;
                int i12 = this.zzm;
                if (i12 == -1) {
                    this.zzm = i10;
                    i12 = i10;
                }
                if (i12 == i10) {
                    this.zzn++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZza = zzabx.zza(this.zzq, zzaaxVar, i10, true);
        if (iZza == -1) {
            return -1;
        }
        int i13 = this.zzk - iZza;
        this.zzk = i13;
        if (i13 > 0) {
            return 0;
        }
        this.zzq.zzs(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000;
        return 0;
    }

    private static boolean zzf(zzaax zzaaxVar, byte[] bArr) throws IOException {
        zzaaxVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzaam) zzaaxVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzaax zzaaxVar) throws IOException {
        int length;
        byte[] bArr = zzd;
        if (zzf(zzaaxVar, bArr)) {
            this.zzh = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = zze;
            if (!zzf(zzaaxVar, bArr2)) {
                return false;
            }
            this.zzh = true;
            length = bArr2.length;
        }
        ((zzaam) zzaaxVar).zzo(length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        zzdy.zzb(this.zzq);
        int i10 = zzfj.zza;
        if (zzaaxVar.zzf() == 0 && !zzg(zzaaxVar)) {
            throw zzcd.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzh;
            String str = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i11 = true != z10 ? 8000 : 16000;
            zzabz zzabzVar = this.zzq;
            zzak zzakVar = new zzak();
            zzakVar.zzS(str);
            zzakVar.zzL(zzf);
            zzakVar.zzw(1);
            zzakVar.zzT(i11);
            zzabzVar.zzk(zzakVar.zzY());
        }
        int iZze = zze(zzaaxVar);
        if (this.zzl) {
            return iZze;
        }
        zzabu zzabuVar = new zzabu(-9223372036854775807L, 0L);
        this.zzr = zzabuVar;
        this.zzp.zzN(zzabuVar);
        this.zzl = true;
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzp = zzaazVar;
        this.zzq = zzaazVar.zzv(0, 1);
        zzaazVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        return zzg(zzaaxVar);
    }
}
