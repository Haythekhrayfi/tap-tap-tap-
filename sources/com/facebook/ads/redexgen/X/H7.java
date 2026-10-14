package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H7 {
    public static byte[] A05;
    public static String[] A06 = {"j9EfDvchdu1KqySqOAnBSG3JWHZdS12U", "q23SQ5AypNqS8oaKOX4z", "zGl30nZzPzoLIdVG6oXXe73jwI6SvYzS", "XO0PMOb8qpQh9emdWW7Vnqfuo5cp8yJy", "hg0Ynef21ksm7drJYvbGXc6C6VdsLqYq", "sq8Z8cDX36Rb5yN4ZHuInHWL1DTNPmF7", "lpBmIRRiri9NKyd9o68rlNPCbyzvIw2I", "eicGPlwUgu"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C1249Uj A00 = C1249Uj.A04;
    public final TreeSet<C1247Uh> A04 = new TreeSet<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A06[6].charAt(21) != 'N') {
                throw new RuntimeException();
            }
            A06[6] = "ipIPz5SC6v0GmkIAozZhwN70MrudeMSU";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
            i13++;
        }
    }

    public static void A02() {
        byte[] bArr = {-79, -9, -14, -6, -3, -10, -11, -65, -77, 7, 2, -77, 42, 61, 70, 57, 69, 65, 70, 63, -8, 71, 62, -8};
        String[] strArr = A06;
        if (strArr[4].charAt(2) != strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A06[5] = "8leR2nWms8A7PmFgrtQ6nLfJYqb68GHr";
        A05 = bArr;
    }

    static {
        A02();
    }

    public H7(int i10, String str) {
        this.A02 = i10;
        this.A03 = str;
    }

    public static H7 A00(int i10, DataInputStream dataInputStream) throws IOException {
        H7 h10 = new H7(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i10 < 2) {
            long j10 = dataInputStream.readLong();
            HC hc2 = new HC();
            HB.A05(hc2, j10);
            h10.A0F(hc2);
        } else {
            h10.A00 = C1249Uj.A00(dataInputStream);
        }
        return h10;
    }

    public final int A03(int i10) {
        int result = this.A02;
        int i11 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i11 + result2;
        if (i10 < 2) {
            long jA00 = HB.A00(this.A00);
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j10, long j11) {
        C1247Uh c1247UhA06 = A06(j10);
        if (c1247UhA06.A01()) {
            return -Math.min(c1247UhA06.A02() ? RecyclerView.FOREVER_NS : c1247UhA06.A01, j11);
        }
        long j12 = j10 + j11;
        long queryEndPosition = c1247UhA06.A02 + c1247UhA06.A01;
        if (queryEndPosition < j12) {
            TreeSet<C1247Uh> treeSet = this.A04;
            if (A06[1].length() != 20) {
                throw new RuntimeException();
            }
            A06[1] = "RgZ5bXDLk5KqdLdfFSHI";
            for (C1247Uh c1247Uh : treeSet.tailSet(c1247UhA06, false)) {
                long currentEndPosition = c1247Uh.A02;
                if (currentEndPosition > queryEndPosition) {
                    break;
                }
                long currentEndPosition2 = c1247Uh.A02;
                queryEndPosition = Math.max(queryEndPosition, currentEndPosition2 + c1247Uh.A01);
                if (queryEndPosition >= j12) {
                    break;
                }
            }
        }
        return Math.min(queryEndPosition - j10, j11);
    }

    public final C1249Uj A05() {
        return this.A00;
    }

    public final C1247Uh A06(long j10) {
        C1247Uh c1247UhA01 = C1247Uh.A01(this.A03, j10);
        C1247Uh c1247UhFloor = this.A04.floor(c1247UhA01);
        if (c1247UhFloor != null && c1247UhFloor.A02 + c1247UhFloor.A01 > j10) {
            return c1247UhFloor;
        }
        TreeSet<C1247Uh> treeSet = this.A04;
        String[] strArr = A06;
        if (strArr[2].charAt(22) != strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A06[6] = "nd2bgBSeUAsM9albd5et6NmdTACtd3AP";
        C1247Uh lookupSpan = treeSet.ceiling(c1247UhA01);
        if (lookupSpan == null) {
            return C1247Uh.A02(this.A03, j10);
        }
        return C1247Uh.A03(this.A03, j10, lookupSpan.A02 - j10);
    }

    public final C1247Uh A07(C1247Uh c1247Uh) throws C0907Gy {
        HG.A04(this.A04.remove(c1247Uh));
        C1247Uh c1247UhA08 = c1247Uh.A08(this.A02);
        if (c1247Uh.A03.renameTo(c1247UhA08.A03)) {
            this.A04.add(c1247UhA08);
            return c1247UhA08;
        }
        throw new C0907Gy(A01(12, 12, 116) + c1247Uh.A03 + A01(8, 4, 47) + c1247UhA08.A03 + A01(0, 8, 45));
    }

    public final TreeSet<C1247Uh> A08() {
        return this.A04;
    }

    public final void A09(C1247Uh c1247Uh) {
        this.A04.add(c1247Uh);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z10) {
        this.A01 = z10;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(H4 h10) {
        if (this.A04.remove(h10)) {
            h10.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(HC hc2) {
        C1249Uj c1249Uj = this.A00;
        C1249Uj oldMetadata = this.A00.A08(hc2);
        this.A00 = oldMetadata;
        return !oldMetadata.equals(c1249Uj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        H7 h10 = (H7) obj;
        if (this.A02 == h10.A02 && this.A03.equals(h10.A03) && this.A04.equals(h10.A04) && this.A00.equals(h10.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i10 = result * 31;
        int result2 = this.A04.hashCode();
        return i10 + result2;
    }
}
