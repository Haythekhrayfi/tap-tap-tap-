package com.applovin.exoplayer2.k;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.widget.q0;
import com.applovin.exoplayer2.l.ai;
import com.developer.filepicker.model.DialogConfigs;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class x extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f7530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f7532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f7533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f7534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f7535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7536g;

    public static class a extends j {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public x(Context context) {
        super(false);
        this.f7530a = context.getResources();
        this.f7531b = context.getPackageName();
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7535f;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) ai.a(this.f7534e)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f7535f == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f7535f;
        if (j11 != -1) {
            this.f7535f = j11 - ((long) i12);
        }
        a(i12);
        return i12;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        int identifier;
        Uri uri = lVar.f7392a;
        this.f7532c = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) com.applovin.exoplayer2.l.a.b(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String strSubstring = (String) com.applovin.exoplayer2.l.a.b(uri.getPath());
            if (strSubstring.startsWith(DialogConfigs.DIRECTORY_SEPERATOR)) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            identifier = this.f7530a.getIdentifier(androidx.activity.k.a(new StringBuilder(), TextUtils.isEmpty(host) ? "" : i.f.a(host, ":"), strSubstring), "raw", this.f7531b);
            if (identifier == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        b(lVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f7530a.openRawResourceFd(identifier);
            this.f7533d = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a(q0.a("Resource is compressed: ", uri), null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f7534e = fileInputStream;
            if (length != -1) {
                try {
                    if (lVar.f7398g > length) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                } catch (a e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(lVar.f7398g + startOffset) - startOffset;
            if (jSkip != lVar.f7398g) {
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f7535f = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f7535f = size;
                    if (size < 0) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f7535f = j10;
                if (j10 < 0) {
                    throw new j(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = lVar.f7399h;
            if (jMin != -1) {
                long j11 = this.f7535f;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f7535f = jMin;
            }
            this.f7536g = true;
            c(lVar);
            long j12 = lVar.f7399h;
            return j12 != -1 ? j12 : this.f7535f;
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, 2005);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f7532c;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.applovin.exoplayer2.k.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() throws com.applovin.exoplayer2.k.x.a {
        /*
            r5 = this;
            r0 = 0
            r5.f7532c = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f7534e     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f7534e = r0
            android.content.res.AssetFileDescriptor r3 = r5.f7533d     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f7533d = r0
            boolean r0 = r5.f7536g
            if (r0 == 0) goto L21
            r5.f7536g = r2
            r5.d()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.applovin.exoplayer2.k.x$a r4 = new com.applovin.exoplayer2.k.x$a     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f7533d = r0
            boolean r0 = r5.f7536g
            if (r0 == 0) goto L36
            r5.f7536g = r2
            r5.d()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.applovin.exoplayer2.k.x$a r4 = new com.applovin.exoplayer2.k.x$a     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f7534e = r0
            android.content.res.AssetFileDescriptor r4 = r5.f7533d     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f7533d = r0
            boolean r0 = r5.f7536g
            if (r0 == 0) goto L54
            r5.f7536g = r2
            r5.d()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.applovin.exoplayer2.k.x$a r4 = new com.applovin.exoplayer2.k.x$a     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f7533d = r0
            boolean r0 = r5.f7536g
            if (r0 == 0) goto L69
            r5.f7536g = r2
            r5.d()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.k.x.c():void");
    }
}
