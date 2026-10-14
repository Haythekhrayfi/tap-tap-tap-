package com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix;

import com.yandex.mobile.ads.impl.ea1;
import fd.j0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kc.k;
import org.slf4j.Marker;
import qd.b0;
import qd.f;
import qd.l;
import qd.n;
import qd.o;
import qd.p;
import qd.u;
import y8.c0;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f18401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f18402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final PublicSuffixDatabase f18403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f18404h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f18405a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f18406b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f18407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f18408d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static PublicSuffixDatabase a() {
            return PublicSuffixDatabase.f18403g;
        }

        public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int iA;
            int iA2;
            int i12 = PublicSuffixDatabase.f18404h;
            int length = bArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr[i14] != 10) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i11 = i15 + i16;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i16++;
                }
                int i17 = i11 - i15;
                int i18 = i10;
                boolean z11 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        iA = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        iA = ea1.a(bArr2[i18][i19]);
                    }
                    iA2 = iA - ea1.a(bArr[i15 + i20]);
                    if (iA2 != 0) {
                        break;
                    }
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    }
                    if (bArr2[i18].length != i19) {
                        z11 = z10;
                    } else {
                        if (i18 == bArr2.length - 1) {
                            break;
                        }
                        i18++;
                        i19 = -1;
                        z11 = true;
                    }
                }
                if (iA2 >= 0) {
                    if (iA2 <= 0) {
                        int i21 = i17 - i20;
                        int length2 = bArr2[i18].length - i19;
                        int length3 = bArr2.length;
                        for (int i22 = i18 + 1; i22 < length3; i22++) {
                            length2 += bArr2[i22].length;
                        }
                        if (length2 >= i21) {
                            if (length2 <= i21) {
                                Charset charset = StandardCharsets.UTF_8;
                                j0.h(charset, "UTF_8");
                                return new String(bArr, i15, i17, charset);
                            }
                        }
                    }
                    i13 = i11 + 1;
                }
                length = i15 - 1;
            }
            return null;
        }
    }

    static {
        new a(0);
        f18401e = new byte[]{42};
        f18402f = k.a(Marker.ANY_MARKER);
        f18403g = new PublicSuffixDatabase();
    }

    private final void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = p.f34912a;
        f fVarC = o.c(new l(new n(resourceAsStream, new b0())));
        try {
            u uVar = (u) fVarC;
            byte[] bArrB = uVar.b(uVar.readInt());
            byte[] bArrB2 = uVar.b(uVar.readInt());
            c0.g(fVarC, null);
            synchronized (this) {
                this.f18407c = bArrB;
                this.f18408d = bArrB2;
            }
            this.f18406b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(fVarC, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r9 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r9 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }
}
