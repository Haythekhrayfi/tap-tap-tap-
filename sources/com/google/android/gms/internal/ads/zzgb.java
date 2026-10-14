package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgb extends zzfy {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgb(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzga {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzga(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i12 = zzfj.zza;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - ((long) i13);
        }
        zzg(i13);
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws zzga {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = zzgjVar.zza.normalizeScheme();
                this.zzb = uriNormalizeScheme;
                zzi(zzgjVar);
                if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.zzc = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i10 = 2000;
                    try {
                        throw new zzga(new IOException("Could not open file descriptor for: " + String.valueOf(uriNormalizeScheme)), 2000);
                    } catch (IOException e10) {
                        e = e10;
                        if (true == (e instanceof FileNotFoundException)) {
                            i10 = 2005;
                        }
                        throw new zzga(e, i10);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzgjVar.zzf > length) {
                    throw new zzga(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(zzgjVar.zzf + startOffset) - startOffset;
                if (jSkip != zzgjVar.zzf) {
                    throw new zzga(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.zze = jPosition;
                        if (jPosition < 0) {
                            throw new zzga(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.zze = jPosition;
                    if (jPosition < 0) {
                        throw new zzga(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long jMin = zzgjVar.zzg;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.zze = jMin;
                }
                this.zzf = true;
                zzj(zzgjVar);
                long j10 = zzgjVar.zzg;
                return j10 != -1 ? j10 : this.zze;
            } catch (zzga e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i10 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zzb;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.google.android.gms.internal.ads.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzga {
        /*
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.zzd     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.zzd = r0
            android.content.res.AssetFileDescriptor r3 = r5.zzc     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L21
            r5.zzf = r2
            r5.zzh()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzga r4 = new com.google.android.gms.internal.ads.zzga     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L36
            r5.zzf = r2
            r5.zzh()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzga r4 = new com.google.android.gms.internal.ads.zzga     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.zzd = r0
            android.content.res.AssetFileDescriptor r4 = r5.zzc     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L54
            r5.zzf = r2
            r5.zzh()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzga r4 = new com.google.android.gms.internal.ads.zzga     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 != 0) goto L65
            goto L6a
        L65:
            r5.zzf = r2
            r5.zzh()
        L6a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgb.zzd():void");
    }
}
