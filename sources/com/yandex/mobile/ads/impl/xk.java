package com.yandex.mobile.ads.impl;

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

/* JADX INFO: loaded from: classes3.dex */
public final class xk extends ee {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f26528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f26529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f26530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f26531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26533j;

    public static class a extends mm {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public xk(Context context) {
        super(false);
        this.f26528e = context.getContentResolver();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = pmVar.f24101a;
            this.f26529f = uri;
            b(pmVar);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(pmVar.f24101a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f26528e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f26528e.openAssetFileDescriptor(uri, "r");
            }
            this.f26530g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f26531h = fileInputStream;
            if (length != -1 && pmVar.f24106f > length) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(pmVar.f24106f + startOffset) - startOffset;
            if (jSkip != pmVar.f24106f) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f26532i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f26532i = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f26532i = j10;
                if (j10 < 0) {
                    throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = pmVar.f24107g;
            if (jMin != -1) {
                long j11 = this.f26532i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f26532i = jMin;
            }
            this.f26533j = true;
            c(pmVar);
            long j12 = pmVar.f24107g;
            return j12 != -1 ? j12 : this.f26532i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.yandex.mobile.ads.impl.lm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.yandex.mobile.ads.impl.xk.a {
        /*
            r5 = this;
            r0 = 0
            r5.f26529f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f26531h     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f26531h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f26530g     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f26530g = r0
            boolean r0 = r5.f26533j
            if (r0 == 0) goto L21
            r5.f26533j = r2
            r5.f()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.yandex.mobile.ads.impl.xk$a r4 = new com.yandex.mobile.ads.impl.xk$a     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f26530g = r0
            boolean r0 = r5.f26533j
            if (r0 == 0) goto L36
            r5.f26533j = r2
            r5.f()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.yandex.mobile.ads.impl.xk$a r4 = new com.yandex.mobile.ads.impl.xk$a     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f26531h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f26530g     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f26530g = r0
            boolean r0 = r5.f26533j
            if (r0 == 0) goto L54
            r5.f26533j = r2
            r5.f()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.yandex.mobile.ads.impl.xk$a r4 = new com.yandex.mobile.ads.impl.xk$a     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f26530g = r0
            boolean r0 = r5.f26533j
            if (r0 == 0) goto L69
            r5.f26533j = r2
            r5.f()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xk.close():void");
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f26529f;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f26532i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f26531h;
        int i12 = da1.f19803a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f26532i;
        if (j11 != -1) {
            this.f26532i = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
