package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BR implements VS, InterfaceC0774Ba, InterfaceC0895Gm<VW>, InterfaceC0898Gp, InterfaceC0849Eq {
    public static byte[] A0c;
    public static String[] A0d = {"uM3", "HhtEoeszujhq2hqW803X6wAUFNr2yIvk", "llgRlYE2HHrDKVr9Tlv1gg4sawaKL", "gd26Zevc0BeMQVnsPvgEWj4kMHitbDqE", "B56DgxYfwXnRdFUWoxgY8ZwWxUmrPQlR", "o6X9hbG4Io42IRbcZylLcsRNIhbJFPRA", "SBfu1SOz9uKNnyoy8", "5PtJb97AhuhjIJJCziWFyl83Esr9CMYA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public InterfaceC0779Bh A07;
    public VT A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final EQ A0S;
    public final ER A0T;
    public final C0840Eh A0U;
    public final GS A0V;
    public final InterfaceC0885Ga A0W;
    public final String A0b;
    public final C1258Us A0X = new C1258Us(A07(0, 27, 27));
    public final HM A0Y = new HM();
    public final Runnable A0Z = new EO(this);
    public final Runnable A0a = new EP(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public VR[] A0K = new VR[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0c, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{78, 109, 99, 102, 103, 112, 56, 71, 122, 118, 112, 99, 97, 118, 109, 112, 79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.VS
    public final long AEq(GM[] gmArr, boolean[] zArr, InterfaceC0850Er[] interfaceC0850ErArr, boolean[] zArr2, long j10) {
        HG.A04(this.A0F);
        int i10 = this.A01;
        int i11 = 0;
        while (true) {
            int i12 = 0;
            if (i11 >= gmArr.length) {
                boolean z10 = !this.A0I ? j10 == 0 : i10 != 0;
                for (int i13 = 0; i13 < gmArr.length; i13++) {
                    if (interfaceC0850ErArr[i13] == null && gmArr[i13] != null) {
                        GM gm = gmArr[i13];
                        HG.A04(gm.length() == 1);
                        HG.A04(gm.A74(0) == 0);
                        int iA00 = this.A09.A00(gm.A80());
                        HG.A04(!this.A0L[iA00]);
                        this.A01++;
                        this.A0L[iA00] = true;
                        interfaceC0850ErArr[i13] = new VV(this, iA00);
                        zArr2[i13] = true;
                        if (!z10) {
                            VR vr = this.A0K[iA00];
                            vr.A0J();
                            z10 = vr.A0D(j10, true, true) == -1 && vr.A0B() != 0;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0E = false;
                    this.A0D = false;
                    if (this.A0X.A08()) {
                        VR[] vrArr = this.A0K;
                        int length = vrArr.length;
                        while (i12 < length) {
                            vrArr[i12].A0H();
                            i12++;
                        }
                        this.A0X.A05();
                    } else {
                        VR[] vrArr2 = this.A0K;
                        int length2 = vrArr2.length;
                        while (i12 < length2) {
                            vrArr2[i12].A0I();
                            i12++;
                        }
                    }
                } else if (z10) {
                    j10 = AEp(j10);
                    for (int i14 = 0; i14 < interfaceC0850ErArr.length; i14++) {
                        if (interfaceC0850ErArr[i14] != null) {
                            zArr2[i14] = true;
                        }
                    }
                }
                this.A0I = true;
                return j10;
            }
            InterfaceC0850Er interfaceC0850Er = interfaceC0850ErArr[i11];
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            A0d[2] = "mg4ta7ka0nUwB4FGZ9fOP";
            if (interfaceC0850Er != null && (gmArr[i11] == null || !zArr[i11])) {
                int i15 = ((VV) interfaceC0850ErArr[i11]).A00;
                HG.A04(this.A0L[i15]);
                this.A01--;
                this.A0L[i15] = false;
                interfaceC0850ErArr[i11] = null;
            }
            i11++;
        }
    }

    static {
        A0B();
    }

    public BR(Uri uri, InterfaceC0885Ga interfaceC0885Ga, BY[] byArr, int i10, C0840Eh c0840Eh, ER er, GS gs, String str, int i11) {
        this.A0Q = uri;
        this.A0W = interfaceC0885Ga;
        this.A0O = i10;
        this.A0U = c0840Eh;
        this.A0T = er;
        this.A0V = gs;
        this.A0b = str;
        this.A0P = i11;
        this.A0S = new EQ(byArr, this);
        this.A00 = i10 == -1 ? 3 : i10;
        c0840Eh.A03();
    }

    private int A00() {
        int i10 = 0;
        for (VR vr : this.A0K) {
            int extractedSamplesCount = vr.A0C();
            i10 += extractedSamplesCount;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0895Gm
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int ABh(VW vw, long j10, long j11, IOException iOException) {
        boolean isErrorFatal = A0N(iOException);
        this.A0U.A0H(vw.A03, 1, -1, null, 0, null, vw.A02, this.A03, j10, j11, vw.A00, iOException, isErrorFatal);
        A0E(vw);
        if (isErrorFatal) {
            return 3;
        }
        int iA00 = A00();
        boolean madeProgress = iA00 > this.A02;
        if (A0L(vw, iA00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long jMax = Long.MIN_VALUE;
        for (VR vr : this.A0K) {
            long largestQueuedTimestampUs = vr.A0F();
            jMax = Math.max(jMax, largestQueuedTimestampUs);
        }
        return jMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (VR vr : this.A0K) {
            if (vr.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6j();
        int i10 = 0;
        while (true) {
            boolean isAudioVideo = true;
            if (i10 >= length) {
                break;
            }
            Format formatA0G = this.A0K[i10].A0G();
            trackGroupArr[i10] = new TrackGroup(formatA0G);
            String str = formatA0G.A0O;
            if (!HY.A0B(str) && !HY.A09(str)) {
                isAudioVideo = false;
            }
            this.A0N[i10] = isAudioVideo;
            this.A0A |= isAudioVideo;
            i10++;
        }
        this.A09 = new TrackGroupArray(trackGroupArr);
        if (this.A0O == -1 && this.A05 == -1 && this.A07.A6j() == -9223372036854775807L) {
            String[] strArr = A0d;
            String str2 = strArr[4];
            String str3 = strArr[5];
            int iCharAt = str2.charAt(19);
            int trackCount = str3.charAt(19);
            if (iCharAt == trackCount) {
                throw new RuntimeException();
            }
            A0d[2] = "7a3gC0RfnKvRSexgB6r2d4KLSEZ";
            this.A00 = 6;
        }
        this.A0F = true;
        this.A0T.ACn(this.A03, this.A07.A93());
        this.A08.ACL(this);
    }

    private void A0A() {
        VW vw = new VW(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            HG.A04(A0I());
            long j10 = this.A03;
            if (j10 != -9223372036854775807L && this.A06 >= j10) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            } else {
                vw.A04(this.A07.A7k(this.A06).A00.A00, this.A06);
                this.A06 = -9223372036854775807L;
            }
        }
        this.A02 = A00();
        this.A0U.A0E(vw.A03, 1, -1, null, 0, null, vw.A02, this.A03, this.A0X.A04(vw, this, this.A00));
    }

    private void A0C(int i10) {
        if (!this.A0M[i10]) {
            Format formatA01 = this.A09.A01(i10).A01(0);
            this.A0U.A06(HY.A01(formatA01.A0O), formatA01, 0, null, this.A04);
            boolean[] zArr = this.A0M;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            A0d[2] = "eh27oOHcwVOmHzYfi8kDTS";
            zArr[i10] = true;
        }
    }

    private void A0D(int i10) {
        if (this.A0E && this.A0N[i10] && !this.A0K[i10].A0M()) {
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "sgNFiq5UDquEcD4Be";
            strArr2[0] = "0a9";
            this.A06 = 0L;
            this.A0E = false;
            this.A0D = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (VR vr : this.A0K) {
                vr.A0I();
            }
            this.A08.AAm(this);
        }
    }

    private void A0E(VW vw) {
        if (this.A05 != -1) {
            return;
        }
        this.A05 = vw.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0895Gm
    /* JADX INFO: renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final void ABg(VW vw, long j10, long j11) {
        long j12;
        if (this.A03 == -9223372036854775807L) {
            long jA02 = A02();
            if (jA02 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = AbstractComponentTracker.LINGERING_TIMEOUT + jA02;
            }
            this.A03 = j12;
            this.A0T.ACn(j12, this.A07.A93());
        }
        this.A0U.A0G(vw.A03, 1, -1, null, 0, null, vw.A02, this.A03, j10, j11, vw.A00);
        A0E(vw);
        this.A0B = true;
        this.A08.AAm(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0895Gm
    /* JADX INFO: renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final void ABe(VW vw, long j10, long j11, boolean z10) {
        this.A0U.A0F(vw.A03, 1, -1, null, 0, null, vw.A02, this.A03, j10, j11, vw.A00);
        if (!z10) {
            A0E(vw);
            for (VR vr : this.A0K) {
                vr.A0I();
            }
            if (this.A01 > 0) {
                this.A08.AAm(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j10) {
        int length = this.A0K.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return true;
            }
            VR vr = this.A0K[i10];
            vr.A0J();
            int i11 = vr.A0D(j10, true, false);
            boolean seekInsideQueue = i11 != -1;
            if (!seekInsideQueue) {
                if (!this.A0N[i10]) {
                    boolean z10 = this.A0A;
                    String[] strArr = A0d;
                    String str = strArr[4];
                    String str2 = strArr[5];
                    int i12 = str.charAt(19);
                    int trackCount = str2.charAt(19);
                    if (i12 == trackCount) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0d;
                    strArr2[7] = "iCn5X7g6PoYVWCe4GwpQYWYt9drfTGBT";
                    strArr2[1] = "IDd3eJ2NBG0wgz78gdspZyWtrcrofueQ";
                    if (!z10) {
                    }
                }
                return false;
            }
            i10++;
        }
    }

    private boolean A0L(VW vw, int i10) {
        InterfaceC0779Bh interfaceC0779Bh;
        if (this.A05 != -1 || ((interfaceC0779Bh = this.A07) != null && interfaceC0779Bh.A6j() != -9223372036854775807L)) {
            this.A02 = i10;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[6] = "F1SGTXFlfQdsRtCv2";
            strArr[0] = "c29";
            return true;
        }
        if (this.A0F && !A0J()) {
            this.A0E = true;
            return false;
        }
        this.A0D = this.A0F;
        this.A04 = 0L;
        this.A02 = 0;
        for (VR vr : this.A0K) {
            vr.A0I();
        }
        vw.A04(0L, 0L);
        return true;
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof VP;
    }

    public final int A0O(int i10, long j10) {
        int iA0D;
        if (A0J()) {
            return 0;
        }
        VR vr = this.A0K[i10];
        if (this.A0B && j10 > vr.A0F()) {
            iA0D = vr.A0A();
        } else {
            iA0D = vr.A0D(j10, true, true);
            String[] strArr = A0d;
            String str = strArr[4];
            String str2 = strArr[5];
            int skipCount = str.charAt(19);
            if (skipCount == str2.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "NIYG9FQCzFZSe10IE";
            strArr2[0] = "6cN";
            if (iA0D == -1) {
                iA0D = 0;
            }
        }
        if (iA0D > 0) {
            A0C(i10);
        } else {
            A0D(i10);
        }
        return iA0D;
    }

    public final int A0P(int i10, C9V c9v, X0 x10, boolean z10) {
        if (A0J()) {
            return -3;
        }
        int iA0E = this.A0K[i10].A0E(c9v, x10, z10, this.A0B, this.A04);
        if (iA0E == -4) {
            A0C(i10);
        } else if (iA0E == -3) {
            A0D(i10);
        }
        return iA0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (VR vr : this.A0K) {
                vr.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i10) {
        return !A0J() && (this.A0B || this.A0K[i10].A0M());
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final boolean A4P(long j10) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean zA02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return zA02;
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void A54(long j10, boolean z10) {
        int length = this.A0K.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.A0K[i10].A0K(j10, z10, this.A0L[i10]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0774Ba
    public final void A5S() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long A5r(long j10, C07429t c07429t) {
        if (!this.A07.A93()) {
            return 0L;
        }
        C0778Bg c0778BgA7k = this.A07.A7k(j10);
        return C0930Hv.A0I(j10, c07429t, c0778BgA7k.A00.A01, c0778BgA7k.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long A67() {
        long jA02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j10 = this.A06;
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A0d[3] = "ld4wWqv9tK9nTvU7QEEl8vpde5wWqGSi";
            return j10;
        }
        if (this.A0A) {
            jA02 = RecyclerView.FOREVER_NS;
            int i10 = this.A0K.length;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.A0N[i11]) {
                    jA02 = Math.min(jA02, this.A0K[i11].A0F());
                }
            }
        } else {
            jA02 = A02();
        }
        if (jA02 == Long.MIN_VALUE) {
            return this.A04;
        }
        return jA02;
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long A7L() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A67();
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final TrackGroupArray A81() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void A9s() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Gp
    public final void ABl() {
        for (VR vr : this.A0K) {
            vr.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0849Eq
    public final void AD7(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void ADj(VT vt, long j10) {
        this.A08 = vt;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long AE2() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        boolean z10 = this.A0D;
        String[] strArr = A0d;
        if (strArr[6].length() != strArr[0].length()) {
            A0d[2] = "";
            if (z10 && (this.A0B || A00() > this.A02)) {
                this.A0D = false;
                return this.A04;
            }
            String[] strArr2 = A0d;
            if (strArr2[7].charAt(26) == strArr2[1].charAt(26)) {
                String[] strArr3 = A0d;
                strArr3[4] = "a8TiTKBNhx8jXxPRrcAgh1BUcIw96G2f";
                strArr3[5] = "NHpS1UqcJuZi4hHtySMRiLK65X8yfSYb";
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void AE9(long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0774Ba
    public final void AEm(InterfaceC0779Bh interfaceC0779Bh) {
        this.A07 = interfaceC0779Bh;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long AEp(long j10) {
        if (!this.A07.A93()) {
            j10 = 0;
        }
        this.A04 = j10;
        this.A0D = false;
        if (!A0I()) {
            boolean zA0K = A0K(j10);
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[4] = "4t4h1X84Q9aXzP6i3O1IFqP61fZwJyic";
            strArr2[5] = "YchhDxV7HDCpyjRy2lVbypcIuIxdt4SR";
            if (zA0K) {
                return j10;
            }
        }
        this.A0E = false;
        this.A06 = j10;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (VR vr : this.A0K) {
                vr.A0I();
            }
        }
        return j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0774Ba
    public final InterfaceC0782Bk AFm(int i10, int i11) {
        int length = this.A0K.length;
        for (int i12 = 0; i12 < length; i12++) {
            int trackCount = this.A0J[i12];
            if (trackCount == i10) {
                return this.A0K[i12];
            }
        }
        VR vr = new VR(this.A0V);
        vr.A0L(this);
        int trackCount2 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J = iArrCopyOf;
        iArrCopyOf[length] = i10;
        int trackCount3 = length + 1;
        VR[] vrArr = (VR[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K = vrArr;
        vrArr[length] = vr;
        return vr;
    }
}
