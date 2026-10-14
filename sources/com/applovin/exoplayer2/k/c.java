package com.applovin.exoplayer2.k;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.applovin.exoplayer2.l.ai;
import com.developer.filepicker.model.DialogConfigs;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f7359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f7360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f7361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7363e;

    public static final class a extends j {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f7359a = context.getAssets();
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7362d;
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
        int i12 = ((InputStream) ai.a(this.f7361c)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f7362d;
        if (j11 != -1) {
            this.f7362d = j11 - ((long) i12);
        }
        a(i12);
        return i12;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        try {
            Uri uri = lVar.f7392a;
            this.f7360b = uri;
            String strSubstring = (String) com.applovin.exoplayer2.l.a.b(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith(DialogConfigs.DIRECTORY_SEPERATOR)) {
                strSubstring = strSubstring.substring(1);
            }
            b(lVar);
            InputStream inputStreamOpen = this.f7359a.open(strSubstring, 1);
            this.f7361c = inputStreamOpen;
            if (inputStreamOpen.skip(lVar.f7398g) < lVar.f7398g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j10 = lVar.f7399h;
            if (j10 != -1) {
                this.f7362d = j10;
            } else {
                long jAvailable = this.f7361c.available();
                this.f7362d = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f7362d = -1L;
                }
            }
            this.f7363e = true;
            c(lVar);
            return this.f7362d;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f7360b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.applovin.exoplayer2.k.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() throws com.applovin.exoplayer2.k.c.a {
        /*
            r5 = this;
            r0 = 0
            r5.f7360b = r0
            r1 = 0
            java.io.InputStream r2 = r5.f7361c     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f7361c = r0
            boolean r0 = r5.f7363e
            if (r0 == 0) goto L16
            r5.f7363e = r1
            r5.d()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.applovin.exoplayer2.k.c$a r3 = new com.applovin.exoplayer2.k.c$a     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f7361c = r0
            boolean r0 = r5.f7363e
            if (r0 == 0) goto L2d
            r5.f7363e = r1
            r5.d()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.k.c.c():void");
    }
}
