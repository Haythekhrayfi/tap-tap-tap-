package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkp {
    private final zzatp zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfkp(zzatp zzatpVar, File file, File file2, File file3) {
        this.zza = zzatpVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzatp zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j10) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] zze() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzA;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i10 = 0;
                        while (i10 < iMin) {
                            int i11 = fileInputStream.read(bArr, i10, iMin - i10);
                            if (i11 == -1) {
                                break;
                            }
                            i10 += i11;
                        }
                        zzgoe zzgoeVarZzv = i10 == 0 ? null : zzgoe.zzv(bArr, 0, i10);
                        if (zzgoeVarZzv == null) {
                            break;
                        }
                        arrayList.add(zzgoeVarZzv);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrZzA = zzgoe.zzu(arrayList).zzA();
                    IOUtils.closeQuietly(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrZzA = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.zze = bArrZzA;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}
