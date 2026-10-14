package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1252Um implements InterfaceC0885Ga {
    public static byte[] A0L;
    public static String[] A0M = {"BZiYu5nwNf87X3b9kN", "UgTeeMN2jxyMd9Kylf", "PJ", "CPqLt3pCFfCSwfi", "XN4Dvc1", "tWEaaCCiJhgiXtacO5se5vgeqa", "S002dfR", "J7ycXdK5d"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0885Ga A07;
    public H4 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0885Ga A0D;
    public final InterfaceC0885Ga A0E;
    public final InterfaceC0885Ga A0F;
    public final H0 A0G;
    public final H2 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0L = new byte[]{-92, -93, 120, -106, -104, -99, -102, -103, 119, -82, -87, -102, -88, -121, -102, -106, -103};
    }

    static {
        A06();
    }

    public C1252Um(H0 h10, InterfaceC0885Ga interfaceC0885Ga, InterfaceC0885Ga interfaceC0885Ga2, GY gy, int i10, H2 h11) {
        this.A0G = h10;
        this.A0D = interfaceC0885Ga2;
        this.A0I = (i10 & 1) != 0;
        this.A0K = (i10 & 2) != 0;
        this.A0J = (i10 & 4) != 0;
        this.A0F = interfaceC0885Ga;
        if (gy != null) {
            this.A0E = new C1255Up(interfaceC0885Ga, gy);
        } else {
            this.A0E = null;
        }
        this.A0H = h11;
    }

    private int A00(C0889Ge c0889Ge) {
        if (this.A0K) {
            boolean z10 = this.A0C;
            String[] strArr = A0M;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "r97zDVaaptRGknr";
            strArr2[6] = "AimjfMN";
            if (z10) {
                if (A0M[7].length() != 14) {
                    A0M[7] = "lgdHkpCnxjAeRqVRog4eGXXV3TVVS";
                    return 0;
                }
                A0M[4] = "GvTYan8nqvP";
                return 0;
            }
        }
        if (this.A0J && c0889Ge.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(H0 h10, String str, Uri uri) {
        HA contentMetadata = h10.A6Q(str);
        Uri uriA01 = HB.A01(contentMetadata);
        return uriA01 == null ? uri : uriA01;
    }

    private void A03() throws IOException {
        InterfaceC0885Ga interfaceC0885Ga = this.A07;
        if (interfaceC0885Ga == null) {
            return;
        }
        try {
            interfaceC0885Ga.close();
            this.A07 = null;
            this.A0A = false;
            H4 h10 = this.A08;
            if (A0M[5].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "f78PdfdQFRIsoy9";
            strArr[6] = "Xl8bArW";
            if (h10 != null) {
                this.A0G.AEH(h10);
                this.A08 = null;
            }
        } catch (Throwable th) {
            this.A07 = null;
            this.A0A = false;
            H4 h11 = this.A08;
            if (h11 != null) {
                this.A0G.AEH(h11);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A69();
            throw new NullPointerException(A02(0, 17, 18));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AF2(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof C0907Gy)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z10) throws IOException {
        H4 h4AFZ;
        long jMin;
        C0889Ge c0889Ge;
        InterfaceC0885Ga nextDataSource;
        long j10;
        if (this.A0B) {
            h4AFZ = null;
        } else if (this.A0I) {
            try {
                h4AFZ = this.A0G.AFZ(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            h4AFZ = this.A0G.AFa(this.A09, this.A03);
        }
        if (h4AFZ == null) {
            nextDataSource = this.A0F;
            c0889Ge = new C0889Ge(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (h4AFZ.A05) {
            Uri uriFromFile = Uri.fromFile(h4AFZ.A03);
            long filePosition = this.A03 - h4AFZ.A02;
            long length = h4AFZ.A01 - filePosition;
            long j11 = this.A01;
            if (j11 != -1) {
                length = Math.min(length, j11);
            }
            c0889Ge = new C0889Ge(uriFromFile, this.A03, filePosition, length, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (h4AFZ.A02()) {
                jMin = this.A01;
            } else {
                jMin = h4AFZ.A01;
                long length2 = this.A01;
                if (length2 != -1) {
                    jMin = Math.min(jMin, length2);
                }
            }
            c0889Ge = new C0889Ge(this.A06, this.A03, jMin, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AEH(h4AFZ);
                h4AFZ = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            j10 = this.A03 + 102400;
        } else {
            j10 = RecyclerView.FOREVER_NS;
        }
        this.A02 = j10;
        if (z10) {
            HG.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (h4AFZ.A01()) {
                    this.A0G.AEH(h4AFZ);
                }
                throw th;
            }
        }
        if (h4AFZ != null && h4AFZ.A01()) {
            this.A08 = h4AFZ;
        }
        this.A07 = nextDataSource;
        this.A0A = c0889Ge.A02 == -1;
        long jADQ = nextDataSource.ADQ(c0889Ge);
        HC hc2 = new HC();
        if (this.A0A) {
            if (A0M[2].length() != 2) {
                throw new RuntimeException();
            }
            A0M[7] = "GQ8HbidAJ3";
            if (jADQ != -1) {
                this.A01 = jADQ;
                HB.A05(hc2, this.A03 + jADQ);
            }
        }
        if (A0B()) {
            Uri uriA84 = this.A07.A84();
            this.A05 = uriA84;
            if (true ^ this.A06.equals(uriA84)) {
                Uri uri = this.A05;
                if (A0M[5].length() != 26) {
                    HB.A06(hc2, uri);
                } else {
                    A0M[4] = "mDcPGOd9V6d2O";
                    HB.A06(hc2, uri);
                }
            } else {
                HB.A04(hc2);
            }
        }
        if (A0C()) {
            this.A0G.A3V(this.A09, hc2);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    public static boolean A0D(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C0886Gb) && ((C0886Gb) cause).A00 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final Uri A84() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final long ADQ(C0889Ge c0889Ge) throws IOException {
        try {
            this.A09 = H6.A02(c0889Ge);
            Uri uri = c0889Ge.A04;
            this.A06 = uri;
            this.A05 = A01(this.A0G, this.A09, uri);
            this.A00 = c0889Ge.A00;
            this.A03 = c0889Ge.A03;
            this.A0B = A00(c0889Ge) != -1;
            if (c0889Ge.A02 != -1 || this.A0B) {
                this.A01 = c0889Ge.A02;
            } else {
                long jA6P = this.A0G.A6P(this.A09);
                this.A01 = jA6P;
                if (jA6P != -1) {
                    long j10 = jA6P - c0889Ge.A03;
                    this.A01 = j10;
                    if (j10 <= 0) {
                        throw new C0886Gb(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e10) {
            A07(e10);
            throw e10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e10) {
            A07(e10);
            throw e10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int i12 = this.A07.read(bArr, i10, i11);
            if (i12 != -1) {
                if (A0A()) {
                    this.A04 += (long) i12;
                }
                this.A03 += (long) i12;
                long j10 = this.A01;
                if (j10 != -1) {
                    this.A01 = j10 - ((long) i12);
                }
            } else if (this.A0A) {
                A05();
            } else {
                long j11 = this.A01;
                if (j11 <= 0) {
                    if (j11 == -1) {
                    }
                }
                A03();
                A08(false);
                return read(bArr, i10, i11);
            }
            return i12;
        } catch (IOException e10) {
            if (this.A0A && A0D(e10)) {
                A05();
                return -1;
            }
            A07(e10);
            throw e10;
        }
    }
}
