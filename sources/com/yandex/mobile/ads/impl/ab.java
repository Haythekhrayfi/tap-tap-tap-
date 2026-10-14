package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.developer.filepicker.model.DialogConfigs;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ab extends ee {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f18826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f18827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f18828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18830i;

    public static final class a extends mm {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public ab(Context context) {
        super(false);
        this.f18826e = context.getAssets();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws a {
        try {
            Uri uri = pmVar.f24101a;
            this.f18827f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(DialogConfigs.DIRECTORY_SEPERATOR)) {
                path = path.substring(1);
            }
            b(pmVar);
            InputStream inputStreamOpen = this.f18826e.open(path, 1);
            this.f18828g = inputStreamOpen;
            if (inputStreamOpen.skip(pmVar.f24106f) < pmVar.f24106f) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j10 = pmVar.f24107g;
            if (j10 != -1) {
                this.f18829h = j10;
            } else {
                long jAvailable = this.f18828g.available();
                this.f18829h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f18829h = -1L;
                }
            }
            this.f18830i = true;
            c(pmVar);
            return this.f18829h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.yandex.mobile.ads.impl.lm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.yandex.mobile.ads.impl.ab.a {
        /*
            r5 = this;
            r0 = 0
            r5.f18827f = r0
            r1 = 0
            java.io.InputStream r2 = r5.f18828g     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f18828g = r0
            boolean r0 = r5.f18830i
            if (r0 == 0) goto L16
            r5.f18830i = r1
            r5.f()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.yandex.mobile.ads.impl.ab$a r3 = new com.yandex.mobile.ads.impl.ab$a     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f18828g = r0
            boolean r0 = r5.f18830i
            if (r0 == 0) goto L2d
            r5.f18830i = r1
            r5.f()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ab.close():void");
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f18827f;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18829h;
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
        InputStream inputStream = this.f18828g;
        int i12 = da1.f19803a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f18829h;
        if (j11 != -1) {
            this.f18829h = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
