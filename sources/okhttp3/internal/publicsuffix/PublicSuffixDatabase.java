package okhttp3.internal.publicsuffix;

import ch.qos.logback.core.CoreConstants;
import dd.q;
import ed.u;
import fd.j0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kc.k;
import kc.t;
import kc.w;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.slf4j.Marker;
import qd.b0;
import qd.f;
import qd.l;
import qd.n;
import qd.o;
import qd.p;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = k.a(Marker.ANY_MARKER);
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int iAnd;
            int iAnd2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iAnd = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        iAnd = Util.and(bArr2[i17][i18], 255);
                    }
                    iAnd2 = iAnd - Util.and(bArr[i14 + i19], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        i18 = -1;
                        z11 = true;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset charset = StandardCharsets.UTF_8;
                                j0.h(charset, "UTF_8");
                                return new String(bArr, i14, i16, charset);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String strBinarySearch;
        String strBinarySearch2;
        String strBinarySearch3;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            Charset charset = StandardCharsets.UTF_8;
            j0.h(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            j0.h(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                strBinarySearch = null;
                break;
            }
            int i12 = i11 + 1;
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                j0.r("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i11);
            if (strBinarySearch != null) {
                break;
            }
            i11 = i12;
        }
        if (size <= 1) {
            strBinarySearch2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                strBinarySearch2 = null;
                break;
            }
            int i14 = i13 + 1;
            bArr3[i13] = WILDCARD_LABEL;
            Companion companion2 = Companion;
            byte[] bArr4 = this.publicSuffixListBytes;
            if (bArr4 == null) {
                j0.r("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i13);
            if (strBinarySearch2 != null) {
                break;
            }
            i13 = i14;
        }
        if (strBinarySearch2 == null) {
            strBinarySearch3 = null;
            break;
        }
        int i15 = size - 1;
        int i16 = 0;
        while (true) {
            if (i16 >= i15) {
                strBinarySearch3 = null;
                break;
            }
            int i17 = i16 + 1;
            Companion companion3 = Companion;
            byte[] bArr5 = this.publicSuffixExceptionListBytes;
            if (bArr5 == null) {
                j0.r("publicSuffixExceptionListBytes");
                throw null;
            }
            strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i16);
            if (strBinarySearch3 != null) {
                break;
            }
            i16 = i17;
        }
        if (strBinarySearch3 != null) {
            return u.Q(j0.p("!", strBinarySearch3), new char[]{CoreConstants.DOT}, false, 0, 6);
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listQ = strBinarySearch == null ? null : u.Q(strBinarySearch, new char[]{CoreConstants.DOT}, false, 0, 6);
        if (listQ == null) {
            listQ = w.f32009c;
        }
        List<String> listQ2 = strBinarySearch2 != null ? u.Q(strBinarySearch2, new char[]{CoreConstants.DOT}, false, 0, 6) : null;
        if (listQ2 == null) {
            listQ2 = w.f32009c;
        }
        return listQ.size() > listQ2.size() ? listQ : listQ2;
    }

    private final void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = p.f34912a;
        f fVarC = o.c(new l(new n(resourceAsStream, new b0())));
        try {
            qd.u uVar = (qd.u) fVarC;
            byte[] bArrB = uVar.b(uVar.readInt());
            byte[] bArrB2 = uVar.b(uVar.readInt());
            c0.g(fVarC, null);
            synchronized (this) {
                j0.f(bArrB);
                this.publicSuffixListBytes = bArrB;
                j0.f(bArrB2);
                this.publicSuffixExceptionListBytes = bArrB2;
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(fVarC, th);
                throw th2;
            }
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> listQ = u.Q(str, new char[]{CoreConstants.DOT}, false, 0, 6);
        return j0.d(t.x(listQ), "") ? t.o(listQ, 1) : listQ;
    }

    public final String getEffectiveTldPlusOne(String str) {
        j0.i(str, "domain");
        String unicode = IDN.toUnicode(str);
        j0.h(unicode, "unicodeDomain");
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        char cCharAt = listFindMatchingRule.get(0).charAt(0);
        int size = listSplitDomain.size();
        int size2 = listFindMatchingRule.size();
        if (cCharAt != '!') {
            size2++;
        }
        return q.e(q.c(t.n(splitDomain(str)), size - size2), ".", null, null, 0, null, null, 62);
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        j0.i(bArr, "publicSuffixListBytes");
        j0.i(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
