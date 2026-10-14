package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.developer.filepicker.model.DialogConfigs;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfx extends zzfy {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfx(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzfw {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzd;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzfw(e10, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        int i12 = zzfj.zza;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.zzd;
        if (j11 != -1) {
            this.zzd = j11 - ((long) i13);
        }
        zzg(i13);
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws zzfw {
        try {
            Uri uri = zzgjVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(DialogConfigs.DIRECTORY_SEPERATOR)) {
                path = path.substring(1);
            }
            zzi(zzgjVar);
            InputStream inputStreamOpen = this.zza.open(path, 1);
            this.zzc = inputStreamOpen;
            if (inputStreamOpen.skip(zzgjVar.zzf) < zzgjVar.zzf) {
                throw new zzfw(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j10 = zzgjVar.zzg;
            if (j10 != -1) {
                this.zzd = j10;
            } else {
                long jAvailable = this.zzc.available();
                this.zzd = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzj(zzgjVar);
            return this.zzd;
        } catch (zzfw e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzfw(e11, true != (e11 instanceof FileNotFoundException) ? 2000 : 2005);
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
    public final void zzd() throws com.google.android.gms.internal.ads.zzfw {
        /*
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 0
            java.io.InputStream r2 = r5.zzc     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.zzc = r0
            boolean r0 = r5.zze
            if (r0 == 0) goto L16
            r5.zze = r1
            r5.zzh()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfw r3 = new com.google.android.gms.internal.ads.zzfw     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.zzc = r0
            boolean r0 = r5.zze
            if (r0 != 0) goto L29
            goto L2e
        L29:
            r5.zze = r1
            r5.zzh()
        L2e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfx.zzd():void");
    }
}
