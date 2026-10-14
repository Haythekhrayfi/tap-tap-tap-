package com.applovin.exoplayer2.k;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class s extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f7490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f7491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7493d;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static class b extends j {
        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }

        public b(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public s() {
        super(false);
    }

    private static RandomAccessFile a(Uri uri) throws b {
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) com.applovin.exoplayer2.l.a.b(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
            }
            if (ai.f7595a < 21 || !a.b(e10.getCause())) {
                i10 = 2005;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        if (this.f7492c == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) ai.a(this.f7490a)).read(bArr, i10, (int) Math.min(this.f7492c, i11));
            if (i12 > 0) {
                this.f7492c -= (long) i12;
                a(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws b {
        Uri uri = lVar.f7392a;
        this.f7491b = uri;
        b(lVar);
        RandomAccessFile randomAccessFileA = a(uri);
        this.f7490a = randomAccessFileA;
        try {
            randomAccessFileA.seek(lVar.f7398g);
            long length = lVar.f7399h;
            if (length == -1) {
                length = this.f7490a.length() - lVar.f7398g;
            }
            this.f7492c = length;
            if (length < 0) {
                throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            this.f7493d = true;
            c(lVar);
            return this.f7492c;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f7491b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.applovin.exoplayer2.k.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() throws com.applovin.exoplayer2.k.s.b {
        /*
            r5 = this;
            r0 = 0
            r5.f7491b = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.f7490a     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f7490a = r0
            boolean r0 = r5.f7493d
            if (r0 == 0) goto L16
            r5.f7493d = r1
            r5.d()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.applovin.exoplayer2.k.s$b r3 = new com.applovin.exoplayer2.k.s$b     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f7490a = r0
            boolean r0 = r5.f7493d
            if (r0 == 0) goto L2d
            r5.f7493d = r1
            r5.d()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.k.s.c():void");
    }
}
