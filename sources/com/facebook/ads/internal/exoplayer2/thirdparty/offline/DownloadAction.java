package com.facebook.ads.internal.exoplayer2.thirdparty.offline;

import android.net.Uri;
import com.facebook.ads.redexgen.X.C0812Df;
import com.facebook.ads.redexgen.X.E0;
import com.facebook.ads.redexgen.X.E1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class DownloadAction {
    public static byte[] A05;
    public static String[] A06 = {"rioDbOPisI2lObkrg", "HqGy0pVWnyd8l", "sDlfjK1mcdTGk7oVG", "mnEvh5174kCJVlEDm0Rw7iq", "ClBBH82fF2jT6vh9l8cKtoXFSGTBjgtf", "NMS2YXe6IaRC3vuTaM57gvmNWhbGPWDq", "1PqTNppN8upa7DaDefT0EtvKqWynEgO8", "Em9wzOZ6oFVi7KZxnKF7BLu26oheixHK"};
    public final int A00;
    public final Uri A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-53, -65, -81, -48, -127, -59, -58, -44, -58, -45, -54, -62, -51, -54, -37, -58, -45, -127, -57, -48, -42, -49, -59, -127, -57, -48, -45, -101};
    }

    public abstract E0 A07(E1 e10);

    public abstract void A08(DataOutputStream dataOutputStream) throws IOException;

    public static abstract class Deserializer {
        public final int A00;
        public final String A01;

        public abstract DownloadAction A01(int i10, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i10) {
            this.A01 = str;
            this.A00 = i10;
        }
    }

    static {
        A02();
    }

    public DownloadAction(String str, int i10, Uri uri, boolean z10, byte[] bArr) {
        this.A02 = str;
        this.A00 = i10;
        this.A01 = uri;
        this.A03 = z10;
        this.A04 = bArr == null ? new byte[0] : bArr;
    }

    public static DownloadAction A00(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String utf = dataInputStream.readUTF();
        int i10 = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (utf.equals(deserializer.A01) && deserializer.A00 >= i10) {
                return deserializer.A01(i10, dataInputStream);
            }
        }
        String type = A01(2, 26, 4) + utf + A01(0, 2, 66) + i10;
        throw new C0812Df(type);
    }

    public static void A03(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.A02);
        dataOutputStream.writeInt(downloadAction.A00);
        downloadAction.A08(dataOutputStream);
        dataOutputStream.flush();
    }

    public boolean A09(DownloadAction downloadAction) {
        return this.A01.equals(downloadAction.A01);
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAction downloadAction = (DownloadAction) obj;
        if (!this.A02.equals(downloadAction.A02) || this.A00 != downloadAction.A00) {
            return false;
        }
        boolean zEquals = this.A01.equals(downloadAction.A01);
        String[] strArr = A06;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[7] = "4NKYloqF0A4Br3hn5ebth7b5fJZTHePp";
        strArr2[6] = "zMmkfX235E3rhNvPYqi4qjPXmWI9ghno";
        return zEquals && this.A03 == downloadAction.A03 && Arrays.equals(this.A04, downloadAction.A04);
    }

    public int hashCode() {
        return (((this.A01.hashCode() * 31) + (this.A03 ? 1 : 0)) * 31) + Arrays.hashCode(this.A04);
    }
}
