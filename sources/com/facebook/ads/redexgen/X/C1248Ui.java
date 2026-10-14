package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1248Ui implements H0 {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"PZs3vIZtp1syVhF", "iN5G7Jyo65HiG11v5U3JAI3rcjEJu9Fh", "jWadhCo9gqYR1xuZ5eOebDdRLwIuwzoe", "5aVgPmkb9WO9SFxkSTOlcah0CKuDVehn", "Qok3N", "7mg38N8lomez8u4EtBpwlNJo", "Crj8XVI7aaG6XCZYe", "vguL8XPuWTEOQDWRTomV5"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC1250Uk A02;
    public final H8 A03;
    public final File A04;
    public final HashMap<String, ArrayList<InterfaceC0908Gz>> A05;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        String[] strArr = A08;
        if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
            throw new RuntimeException();
        }
        A08[3] = "N0vjWbyGqBS98Run3kOI6tTmnpu8bGoB";
        A07 = new byte[]{67, 108, 109, 118, 106, 103, 112, 34, 81, 107, 111, 114, 110, 103, 65, 99, 97, 106, 103, 34, 107, 108, 113, 118, 99, 108, 97, 103, 34, 119, 113, 103, 113, 34, 118, 106, 103, 34, 100, 109, 110, 102, 103, 112, 56, 34, 48, 10, 14, 19, 15, 6, 32, 2, 0, 11, 6, 121, 67, 71, 90, 70, 79, 105, 75, 73, 66, 79, 4, 67, 68, 67, 94, 67, 75, 70, 67, 80, 79, 2, 3, 96, 71, 92, 65, 90, 93, 84, 19, 90, 93, 87, 86, 75, 19, 85, 90, 95, 86, 19, 85, 82, 90, 95, 86, 87, 20, 22, 20, Ascii.US, 18, 19, 40, 20, Ascii.CAN, Ascii.EM, 3, 18, Ascii.EM, 3, 40, Ascii.RS, Ascii.EM, 19, 18, 15, 89, 18, 15, Ascii.RS};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized void A4J(File file) throws C0907Gy {
        HG.A04(!this.A01);
        C1247Uh c1247UhA00 = C1247Uh.A00(file, this.A03);
        HG.A04(c1247UhA00 != null);
        H7 h7A09 = this.A03.A09(c1247UhA00.A04);
        HG.A01(h7A09);
        HG.A04(h7A09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long jA00 = HB.A00(h7A09.A05());
            if (jA00 != -1) {
                HG.A04(c1247UhA00.A02 + c1247UhA00.A01 <= jA00);
            }
            A0A(c1247UhA00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized NavigableSet<H4> A6B(String str) {
        H7 h7A09;
        HG.A04(!this.A01);
        h7A09 = this.A03.A09(str);
        return (h7A09 == null || h7A09.A0C()) ? new TreeSet() : new TreeSet((Collection) h7A09.A08());
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public C1248Ui(File file, InterfaceC1250Uk interfaceC1250Uk) {
        this(file, interfaceC1250Uk, null, false);
    }

    public C1248Ui(File file, InterfaceC1250Uk interfaceC1250Uk, H8 h10) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC1250Uk;
            this.A03 = h10;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new HD(this, A03(57, 24, 112), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 88) + file);
    }

    public C1248Ui(File file, InterfaceC1250Uk interfaceC1250Uk, byte[] bArr, boolean z10) {
        this(file, interfaceC1250Uk, new H8(file, bArr, z10));
    }

    private C1247Uh A00(String str, long j10) throws C0907Gy {
        C1247Uh span;
        H7 h7A09 = this.A03.A09(str);
        if (h7A09 == null) {
            C1247Uh c1247UhA02 = C1247Uh.A02(str, j10);
            if (A08[7].length() == 15) {
                throw new RuntimeException();
            }
            A08[3] = "R7TEvDOiyk4OKBf9PsOT39P5pIR22NMD";
            return c1247UhA02;
        }
        while (true) {
            span = h7A09.A06(j10);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.H0
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized C1247Uh AFZ(String str, long j10) throws C0907Gy, InterruptedException {
        C1247Uh span;
        while (true) {
            span = AFa(str, j10);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.H0
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized C1247Uh AFa(String str, long j10) throws C0907Gy {
        HG.A04(!this.A01);
        C1247Uh c1247UhA00 = A00(str, j10);
        if (c1247UhA00.A05) {
            C1247Uh cacheSpan = this.A03.A09(str).A07(c1247UhA00);
            A0C(c1247UhA00, cacheSpan);
            return cacheSpan;
        }
        H7 h7A0A = this.A03.A0A(str);
        if (!h7A0A.A0D()) {
            h7A0A.A0B(true);
            return c1247UhA00;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] fileArrListFiles = this.A04.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.getName().equals(A03(106, 24, 45))) {
                C1247Uh c1247UhA00 = file.length() > 0 ? C1247Uh.A00(file, this.A03) : null;
                if (c1247UhA00 != null) {
                    A0A(c1247UhA00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (C0907Gy e10) {
            Log.e(A03(46, 11, 57), A03(81, 25, 105), e10);
        }
    }

    private void A05() throws C0907Gy {
        ArrayList arrayList = new ArrayList();
        Iterator<H7> it = this.A03.A0D().iterator();
        while (it.hasNext()) {
            for (C1247Uh c1247Uh : it.next().A08()) {
                if (!c1247Uh.A03.exists()) {
                    arrayList.add(c1247Uh);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            A08((H4) arrayList.get(i10), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(H4 h10) {
        ArrayList<InterfaceC0908Gz> arrayList = this.A05.get(h10.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ACq(this, h10);
            }
        }
        this.A02.ACq(this, h10);
    }

    private void A08(H4 h10, boolean z10) throws C0907Gy {
        H7 h7A09 = this.A03.A09(h10.A04);
        if (h7A09 == null || !h7A09.A0E(h10)) {
            return;
        }
        this.A00 -= h10.A01;
        if (z10) {
            try {
                this.A03.A0H(h7A09.A03);
                this.A03.A0G();
            } finally {
                A07(h10);
            }
        }
    }

    private void A0A(C1247Uh c1247Uh) {
        this.A03.A0A(c1247Uh.A04).A09(c1247Uh);
        this.A00 += c1247Uh.A01;
        A0B(c1247Uh);
    }

    private void A0B(C1247Uh c1247Uh) {
        ArrayList<InterfaceC0908Gz> arrayList = this.A05.get(c1247Uh.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ACp(this, c1247Uh);
            }
        }
        this.A02.ACp(this, c1247Uh);
    }

    private void A0C(C1247Uh c1247Uh, H4 h10) {
        ArrayList<InterfaceC0908Gz> arrayList = this.A05.get(c1247Uh.A04);
        if (arrayList != null) {
            int size = arrayList.size();
            String[] strArr = A08;
            if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "YjLi8Ea68WiaTq3";
            strArr2[4] = "ACi8R";
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ACr(this, c1247Uh, h10);
            }
        }
        this.A02.ACr(this, c1247Uh, h10);
    }

    public static synchronized boolean A0D(File file) {
        if (A06) {
            return true;
        }
        return A09.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized void A3V(String str, HC hc2) throws C0907Gy {
        HG.A04(!this.A01);
        this.A03.A0I(str, hc2);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized long A69() {
        HG.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized long A6A(String str, long j10, long j11) {
        H7 cachedContent;
        HG.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized long A6P(String str) {
        return HB.A00(A6Q(str));
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized HA A6Q(String str) {
        HG.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized void AEH(H4 h10) {
        HG.A04(!this.A01);
        H7 h7A09 = this.A03.A09(h10.A04);
        HG.A01(h7A09);
        HG.A04(h7A09.A0D());
        h7A09.A0B(false);
        this.A03.A0H(h7A09.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized void AEO(H4 h10) throws C0907Gy {
        HG.A04(!this.A01);
        A08(h10, true);
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized void AF2(String str, long j10) throws C0907Gy {
        HC mutations = new HC();
        HB.A05(mutations, j10);
        A3V(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final synchronized File AFX(String str, long j10, long j11) throws C0907Gy {
        H7 h7A09;
        HG.A04(!this.A01);
        h7A09 = this.A03.A09(str);
        HG.A01(h7A09);
        HG.A04(h7A09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ACs(this, str, j10, j11);
        return C1247Uh.A04(this.A04, h7A09.A02, j10, System.currentTimeMillis());
    }
}
