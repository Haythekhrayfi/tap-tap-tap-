package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzuy {
    private final zzfa zza = new zzfa(32);
    private zzux zzb;
    private zzux zzc;
    private zzux zzd;
    private long zze;
    private final zzxp zzf;

    public zzuy(zzxp zzxpVar) {
        this.zzf = zzxpVar;
        zzux zzuxVar = new zzux(0L, 65536);
        this.zzb = zzuxVar;
        this.zzc = zzuxVar;
        this.zzd = zzuxVar;
    }

    private final int zzi(int i10) {
        zzux zzuxVar = this.zzd;
        if (zzuxVar.zzc == null) {
            zzxi zzxiVarZzb = this.zzf.zzb();
            zzux zzuxVar2 = new zzux(this.zzd.zzb, 65536);
            zzuxVar.zzc = zzxiVarZzb;
            zzuxVar.zzd = zzuxVar2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzux zzj(zzux zzuxVar, long j10) {
        while (j10 >= zzuxVar.zzb) {
            zzuxVar = zzuxVar.zzd;
        }
        return zzuxVar;
    }

    private static zzux zzk(zzux zzuxVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzux zzuxVarZzj = zzj(zzuxVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzuxVarZzj.zzb - j10));
            byteBuffer.put(zzuxVarZzj.zzc.zza, zzuxVarZzj.zza(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == zzuxVarZzj.zzb) {
                zzuxVarZzj = zzuxVarZzj.zzd;
            }
        }
        return zzuxVarZzj;
    }

    private static zzux zzl(zzux zzuxVar, long j10, byte[] bArr, int i10) {
        zzux zzuxVarZzj = zzj(zzuxVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (zzuxVarZzj.zzb - j10));
            System.arraycopy(zzuxVarZzj.zzc.zza, zzuxVarZzj.zza(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == zzuxVarZzj.zzb) {
                zzuxVarZzj = zzuxVarZzj.zzd;
            }
        }
        return zzuxVarZzj;
    }

    private static zzux zzm(zzux zzuxVar, zzhp zzhpVar, zzva zzvaVar, zzfa zzfaVar) {
        zzux zzuxVarZzl;
        if (zzhpVar.zzl()) {
            long j10 = zzvaVar.zzb;
            int iZzo = 1;
            zzfaVar.zzC(1);
            zzux zzuxVarZzl2 = zzl(zzuxVar, j10, zzfaVar.zzH(), 1);
            long j11 = j10 + 1;
            byte b10 = zzfaVar.zzH()[0];
            int i10 = b10 & 128;
            int i11 = b10 & Ascii.DEL;
            zzhm zzhmVar = zzhpVar.zza;
            byte[] bArr = zzhmVar.zza;
            if (bArr == null) {
                zzhmVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i10 != 0;
            zzuxVarZzl = zzl(zzuxVarZzl2, j11, zzhmVar.zza, i11);
            long j12 = j11 + ((long) i11);
            if (z10) {
                zzfaVar.zzC(2);
                zzuxVarZzl = zzl(zzuxVarZzl, j12, zzfaVar.zzH(), 2);
                j12 += 2;
                iZzo = zzfaVar.zzo();
            }
            int i12 = iZzo;
            int[] iArr = zzhmVar.zzd;
            if (iArr == null || iArr.length < i12) {
                iArr = new int[i12];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhmVar.zze;
            if (iArr3 == null || iArr3.length < i12) {
                iArr3 = new int[i12];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i13 = i12 * 6;
                zzfaVar.zzC(i13);
                zzuxVarZzl = zzl(zzuxVarZzl, j12, zzfaVar.zzH(), i13);
                j12 += (long) i13;
                zzfaVar.zzF(0);
                for (int i14 = 0; i14 < i12; i14++) {
                    iArr2[i14] = zzfaVar.zzo();
                    iArr4[i14] = zzfaVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvaVar.zza - ((int) (j12 - zzvaVar.zzb));
            }
            zzaby zzabyVar = zzvaVar.zzc;
            int i15 = zzfj.zza;
            zzhmVar.zzc(i12, iArr2, iArr4, zzabyVar.zzb, zzhmVar.zza, zzabyVar.zza, zzabyVar.zzc, zzabyVar.zzd);
            long j13 = zzvaVar.zzb;
            int i16 = (int) (j12 - j13);
            zzvaVar.zzb = j13 + ((long) i16);
            zzvaVar.zza -= i16;
        } else {
            zzuxVarZzl = zzuxVar;
        }
        if (!zzhpVar.zze()) {
            zzhpVar.zzj(zzvaVar.zza);
            return zzk(zzuxVarZzl, zzvaVar.zzb, zzhpVar.zzb, zzvaVar.zza);
        }
        zzfaVar.zzC(4);
        zzux zzuxVarZzl3 = zzl(zzuxVarZzl, zzvaVar.zzb, zzfaVar.zzH(), 4);
        int iZzn = zzfaVar.zzn();
        zzvaVar.zzb += 4;
        zzvaVar.zza -= 4;
        zzhpVar.zzj(iZzn);
        zzux zzuxVarZzk = zzk(zzuxVarZzl3, zzvaVar.zzb, zzhpVar.zzb, iZzn);
        zzvaVar.zzb += (long) iZzn;
        int i17 = zzvaVar.zza - iZzn;
        zzvaVar.zza = i17;
        ByteBuffer byteBuffer = zzhpVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            zzhpVar.zze = ByteBuffer.allocate(i17);
        } else {
            zzhpVar.zze.clear();
        }
        return zzk(zzuxVarZzk, zzvaVar.zzb, zzhpVar.zze, zzvaVar.zza);
    }

    private final void zzn(int i10) {
        long j10 = this.zze + ((long) i10);
        this.zze = j10;
        zzux zzuxVar = this.zzd;
        if (j10 == zzuxVar.zzb) {
            this.zzd = zzuxVar.zzd;
        }
    }

    public final int zza(zzt zztVar, int i10, boolean z10) throws IOException {
        int iZzi = zzi(i10);
        zzux zzuxVar = this.zzd;
        int iZza = zztVar.zza(zzuxVar.zzc.zza, zzuxVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j10) {
        zzux zzuxVar;
        if (j10 != -1) {
            while (true) {
                zzuxVar = this.zzb;
                if (j10 < zzuxVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzuxVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzuxVar.zza) {
                this.zzc = zzuxVar;
            }
        }
    }

    public final void zzd(zzhp zzhpVar, zzva zzvaVar) {
        zzm(this.zzc, zzhpVar, zzvaVar, this.zza);
    }

    public final void zze(zzhp zzhpVar, zzva zzvaVar) {
        this.zzc = zzm(this.zzc, zzhpVar, zzvaVar, this.zza);
    }

    public final void zzf() {
        zzux zzuxVar = this.zzb;
        if (zzuxVar.zzc != null) {
            this.zzf.zzd(zzuxVar);
            zzuxVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzux zzuxVar2 = this.zzb;
        this.zzc = zzuxVar2;
        this.zzd = zzuxVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfa zzfaVar, int i10) {
        while (i10 > 0) {
            int iZzi = zzi(i10);
            zzux zzuxVar = this.zzd;
            zzfaVar.zzB(zzuxVar.zzc.zza, zzuxVar.zza(this.zze), iZzi);
            i10 -= iZzi;
            zzn(iZzi);
        }
    }
}
