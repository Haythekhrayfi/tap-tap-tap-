package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.developer.filepicker.model.DialogConfigs;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ou0 extends ee {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resources f23917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f23919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f23920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private FileInputStream f23921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23923k;

    public static class a extends mm {
        public a(int i10, String str, Exception exc) {
            super(i10, str, exc);
        }
    }

    public ou0(Context context) {
        super(false);
        this.f23917e = context.getResources();
        this.f23918f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws a {
        int identifier;
        Uri uri = pmVar.f24101a;
        this.f23919g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme())) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                Objects.requireNonNull(lastPathSegment);
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new a(1004, "Resource identifier must be an integer.", null);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                Objects.requireNonNull(lastPathSegment2);
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    Objects.requireNonNull(lastPathSegment3);
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a(1004, "URI must either use scheme rawresource or android.resource", null);
            }
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith(DialogConfigs.DIRECTORY_SEPERATOR)) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            identifier = this.f23917e.getIdentifier(androidx.activity.k.a(new StringBuilder(), TextUtils.isEmpty(host) ? "" : fn1.a(host, ":"), path), "raw", this.f23918f);
            if (identifier == 0) {
                throw new a(2005, "Resource not found.", null);
            }
        }
        b(pmVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f23917e.openRawResourceFd(identifier);
            this.f23920h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a(2000, androidx.appcompat.widget.q0.a("Resource is compressed: ", uri), null);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f23921i = fileInputStream;
            if (length != -1) {
                try {
                    if (pmVar.f24106f > length) {
                        throw new a(AdError.REMOTE_ADS_SERVICE_ERROR, null, null);
                    }
                } catch (a e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new a(2000, null, e11);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(pmVar.f24106f + startOffset) - startOffset;
            if (jSkip != pmVar.f24106f) {
                throw new a(AdError.REMOTE_ADS_SERVICE_ERROR, null, null);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f23922j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f23922j = size;
                    if (size < 0) {
                        throw new a(AdError.REMOTE_ADS_SERVICE_ERROR, null, null);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f23922j = j10;
                if (j10 < 0) {
                    throw new mm(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = pmVar.f24107g;
            if (jMin != -1) {
                long j11 = this.f23922j;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f23922j = jMin;
            }
            this.f23923k = true;
            c(pmVar);
            long j12 = pmVar.f24107g;
            return j12 != -1 ? j12 : this.f23922j;
        } catch (Resources.NotFoundException e12) {
            throw new a(2005, null, e12);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.yandex.mobile.ads.impl.lm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.yandex.mobile.ads.impl.ou0.a {
        /*
            r5 = this;
            r0 = 0
            r5.f23919g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f23921i     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f23921i = r0
            android.content.res.AssetFileDescriptor r3 = r5.f23920h     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f23920h = r0
            boolean r0 = r5.f23923k
            if (r0 == 0) goto L21
            r5.f23923k = r2
            r5.f()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.yandex.mobile.ads.impl.ou0$a r4 = new com.yandex.mobile.ads.impl.ou0$a     // Catch: java.lang.Throwable -> L22
            r4.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f23920h = r0
            boolean r0 = r5.f23923k
            if (r0 == 0) goto L36
            r5.f23923k = r2
            r5.f()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.yandex.mobile.ads.impl.ou0$a r4 = new com.yandex.mobile.ads.impl.ou0$a     // Catch: java.lang.Throwable -> L37
            r4.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f23921i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f23920h     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f23920h = r0
            boolean r0 = r5.f23923k
            if (r0 == 0) goto L54
            r5.f23923k = r2
            r5.f()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.yandex.mobile.ads.impl.ou0$a r4 = new com.yandex.mobile.ads.impl.ou0$a     // Catch: java.lang.Throwable -> L55
            r4.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f23920h = r0
            boolean r0 = r5.f23923k
            if (r0 == 0) goto L69
            r5.f23923k = r2
            r5.f()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ou0.close():void");
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f23919g;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f23922j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(2000, null, e10);
            }
        }
        FileInputStream fileInputStream = this.f23921i;
        int i12 = da1.f19803a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f23922j == -1) {
                return -1;
            }
            throw new a(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j11 = this.f23922j;
        if (j11 != -1) {
            this.f23922j = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
