package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgro extends zzgoe {
    public static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogConstants.LOG_LOCAL2, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgoe zzd;
    private final zzgoe zze;
    private final int zzf;
    private final int zzg;

    private zzgro(zzgoe zzgoeVar, zzgoe zzgoeVar2) {
        this.zzd = zzgoeVar;
        this.zze = zzgoeVar2;
        int iZzd = zzgoeVar.zzd();
        this.zzf = iZzd;
        this.zzc = zzgoeVar2.zzd() + iZzd;
        this.zzg = Math.max(zzgoeVar.zzf(), zzgoeVar2.zzf()) + 1;
    }

    public static zzgoe zzC(zzgoe zzgoeVar, zzgoe zzgoeVar2) {
        if (zzgoeVar2.zzd() == 0) {
            return zzgoeVar;
        }
        if (zzgoeVar.zzd() == 0) {
            return zzgoeVar2;
        }
        int iZzd = zzgoeVar2.zzd() + zzgoeVar.zzd();
        if (iZzd < 128) {
            return zzD(zzgoeVar, zzgoeVar2);
        }
        if (zzgoeVar instanceof zzgro) {
            zzgro zzgroVar = (zzgro) zzgoeVar;
            if (zzgoeVar2.zzd() + zzgroVar.zze.zzd() < 128) {
                return new zzgro(zzgroVar.zzd, zzD(zzgroVar.zze, zzgoeVar2));
            }
            if (zzgroVar.zzd.zzf() > zzgroVar.zze.zzf() && zzgroVar.zzg > zzgoeVar2.zzf()) {
                return new zzgro(zzgroVar.zzd, new zzgro(zzgroVar.zze, zzgoeVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzgoeVar.zzf(), zzgoeVar2.zzf()) + 1) ? new zzgro(zzgoeVar, zzgoeVar2) : zzgrk.zza(new zzgrk(null), zzgoeVar, zzgoeVar2);
    }

    private static zzgoe zzD(zzgoe zzgoeVar, zzgoe zzgoeVar2) {
        int iZzd = zzgoeVar.zzd();
        int iZzd2 = zzgoeVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzgoeVar.zzz(bArr, 0, 0, iZzd);
        zzgoeVar2.zzz(bArr, 0, iZzd, iZzd2);
        return new zzgoa(bArr);
    }

    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgoe)) {
            return false;
        }
        zzgoe zzgoeVar = (zzgoe) obj;
        if (this.zzc != zzgoeVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzgoeVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        zzgrl zzgrlVar = null;
        zzgrm zzgrmVar = new zzgrm(this, zzgrlVar);
        zzgnz zzgnzVarZza = zzgrmVar.next();
        zzgrm zzgrmVar2 = new zzgrm(zzgoeVar, zzgrlVar);
        zzgnz zzgnzVarZza2 = zzgrmVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iZzd = zzgnzVarZza.zzd() - i10;
            int iZzd2 = zzgnzVarZza2.zzd() - i11;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i10 == 0 ? zzgnzVarZza.zzg(zzgnzVarZza2, i11, iMin) : zzgnzVarZza2.zzg(zzgnzVarZza, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzgnzVarZza = zzgrmVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == iZzd2) {
                zzgnzVarZza = zzgnzVarZza;
                zzgnzVarZza2 = zzgrmVar2.next();
                i11 = 0;
            } else {
                zzgnzVarZza = zzgnzVarZza;
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoe, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgri(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final byte zza(int i10) {
        zzgoe.zzy(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final zzgoe zzk(int i10, int i11) {
        int iZzq = zzgoe.zzq(i10, i11, this.zzc);
        if (iZzq == 0) {
            return zzgoe.zzb;
        }
        if (iZzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgoe zzgoeVar = this.zzd;
        return new zzgro(zzgoeVar.zzk(i10, zzgoeVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgoe
    public final zzgom zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzgrm zzgrmVar = new zzgrm(this, null);
        while (zzgrmVar.hasNext()) {
            arrayList.add(zzgrmVar.next().zzn());
        }
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new zzgoi(arrayList, iRemaining, true, objArr == true ? 1 : 0) : zzgom.zzH(new zzgpz(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final void zzo(zzgnt zzgntVar) throws IOException {
        this.zzd.zzo(zzgntVar);
        this.zze.zzo(zzgntVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final boolean zzp() {
        int iZzj = this.zzd.zzj(0, 0, this.zzf);
        zzgoe zzgoeVar = this.zze;
        return zzgoeVar.zzj(iZzj, 0, zzgoeVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    /* JADX INFO: renamed from: zzs */
    public final zzgny iterator() {
        return new zzgri(this);
    }
}
