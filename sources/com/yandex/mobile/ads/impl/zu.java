package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zu extends ee {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f27427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f27428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f27429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27430h;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class b implements lm.a {
        @Override // com.yandex.mobile.ads.impl.lm.a
        public final lm a() {
            return new zu();
        }
    }

    public static class c extends mm {
        public c(int i10, String str, FileNotFoundException fileNotFoundException) {
            super(i10, str, fileNotFoundException);
        }

        public c(Exception exc, int i10) {
            super(exc, i10);
        }
    }

    public zu() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws c {
        Uri uri = pmVar.f24101a;
        this.f27428f = uri;
        b(pmVar);
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f27427e = randomAccessFile;
            try {
                randomAccessFile.seek(pmVar.f24106f);
                long length = pmVar.f24107g;
                if (length == -1) {
                    length = this.f27427e.length() - pmVar.f24106f;
                }
                this.f27429g = length;
                if (length < 0) {
                    throw new c(AdError.REMOTE_ADS_SERVICE_ERROR, null, null);
                }
                this.f27430h = true;
                c(pmVar);
                return this.f27429g;
            } catch (IOException e10) {
                throw new c(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new c(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11);
            }
            if (da1.f19803a < 21 || !a.b(e11.getCause())) {
                i10 = 2005;
            }
            throw new c(e11, i10);
        } catch (SecurityException e12) {
            throw new c(e12, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e13) {
            throw new c(e13, 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.yandex.mobile.ads.impl.lm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.yandex.mobile.ads.impl.zu.c {
        /*
            r5 = this;
            r0 = 0
            r5.f27428f = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.f27427e     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f27427e = r0
            boolean r0 = r5.f27430h
            if (r0 == 0) goto L16
            r5.f27430h = r1
            r5.f()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.yandex.mobile.ads.impl.zu$c r3 = new com.yandex.mobile.ads.impl.zu$c     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f27427e = r0
            boolean r0 = r5.f27430h
            if (r0 == 0) goto L2d
            r5.f27430h = r1
            r5.f()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zu.close():void");
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f27428f;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws c {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f27429g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f27427e;
            int i12 = da1.f19803a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f27429g -= (long) i13;
                c(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new c(e10, 2000);
        }
    }
}
