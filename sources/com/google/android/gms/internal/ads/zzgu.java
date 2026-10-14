package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgu extends zzfy {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgu() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzgt {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzc;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i12 = zzfj.zza;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.zzc -= (long) i13;
                zzg(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new zzgt(e10, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws zzgt {
        Uri uri = zzgjVar.zza;
        this.zzb = uri;
        zzi(zzgjVar);
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzgjVar.zzf);
                long length = zzgjVar.zzg;
                if (length == -1) {
                    length = this.zza.length() - zzgjVar.zzf;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzgt(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.zzd = true;
                zzj(zzgjVar);
                return this.zzc;
            } catch (IOException e10) {
                throw new zzgt(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgt(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, 1004);
            }
            if (zzfj.zza < 21 || !zzgs.zzb(e11.getCause())) {
                i10 = 2005;
            }
            throw new zzgt(e11, i10);
        } catch (SecurityException e12) {
            throw new zzgt(e12, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e13) {
            throw new zzgt(e13, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zzb;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.gms.internal.ads.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzgt {
        /*
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.zza     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.zza = r0
            boolean r0 = r5.zzd
            if (r0 == 0) goto L16
            r5.zzd = r1
            r5.zzh()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzgt r3 = new com.google.android.gms.internal.ads.zzgt     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.zza = r0
            boolean r0 = r5.zzd
            if (r0 != 0) goto L29
            goto L2e
        L29:
            r5.zzd = r1
            r5.zzh()
        L2e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgu.zzd():void");
    }
}
