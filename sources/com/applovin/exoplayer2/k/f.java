package com.applovin.exoplayer2.k;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.l.ai;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f7375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f7376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetFileDescriptor f7377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileInputStream f7378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7380f;

    public static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    public static class b extends j {
        public b(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public f(Context context) {
        super(false);
        this.f7375a = context.getContentResolver();
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7379e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) ai.a(this.f7378d)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f7379e;
        if (j11 != -1) {
            this.f7379e = j11 - ((long) i12);
        }
        a(i12);
        return i12;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws b {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = lVar.f7392a;
            this.f7376b = uri;
            b(lVar);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(lVar.f7392a.getScheme())) {
                Bundle bundle = new Bundle();
                if (ai.f7595a >= 31) {
                    a.a(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = this.f7375a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f7375a.openAssetFileDescriptor(uri, "r");
            }
            this.f7377c = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f7378d = fileInputStream;
            if (length != -1 && lVar.f7398g > length) {
                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(lVar.f7398g + startOffset) - startOffset;
            if (jSkip != lVar.f7398g) {
                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f7379e = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f7379e = jPosition;
                    if (jPosition < 0) {
                        throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f7379e = j10;
                if (j10 < 0) {
                    throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = lVar.f7399h;
            if (jMin != -1) {
                long j11 = this.f7379e;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f7379e = jMin;
            }
            this.f7380f = true;
            c(lVar);
            long j12 = lVar.f7399h;
            return j12 != -1 ? j12 : this.f7379e;
        } catch (b e10) {
            throw e10;
        } catch (IOException e11) {
            throw new b(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f7376b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.applovin.exoplayer2.k.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() throws com.applovin.exoplayer2.k.f.b {
        /*
            r5 = this;
            r0 = 0
            r5.f7376b = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f7378d     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f7378d = r0
            android.content.res.AssetFileDescriptor r3 = r5.f7377c     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f7377c = r0
            boolean r0 = r5.f7380f
            if (r0 == 0) goto L21
            r5.f7380f = r2
            r5.d()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.applovin.exoplayer2.k.f$b r4 = new com.applovin.exoplayer2.k.f$b     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f7377c = r0
            boolean r0 = r5.f7380f
            if (r0 == 0) goto L36
            r5.f7380f = r2
            r5.d()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.applovin.exoplayer2.k.f$b r4 = new com.applovin.exoplayer2.k.f$b     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f7378d = r0
            android.content.res.AssetFileDescriptor r4 = r5.f7377c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f7377c = r0
            boolean r0 = r5.f7380f
            if (r0 == 0) goto L54
            r5.f7380f = r2
            r5.d()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.applovin.exoplayer2.k.f$b r4 = new com.applovin.exoplayer2.k.f$b     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f7377c = r0
            boolean r0 = r5.f7380f
            if (r0 == 0) goto L69
            r5.f7380f = r2
            r5.d()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.k.f.c():void");
    }
}
