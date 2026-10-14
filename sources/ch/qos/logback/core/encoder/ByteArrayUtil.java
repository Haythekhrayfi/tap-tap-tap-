package ch.qos.logback.core.encoder;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ByteArrayUtil {
    public static byte[] hexStringToByteArray(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (Integer.parseInt(str.substring(i11, i11 + 2), 16) & 255);
        }
        return bArr;
    }

    public static int readInt(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            i11 += (bArr[i10 + i12] & 255) << (24 - (i12 * 8));
        }
        return i11;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static void writeInt(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            byteArrayOutputStream.write((byte) (i10 >>> (24 - (i11 * 8))));
        }
    }

    public static void writeInt(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i10 + i12] = (byte) (i11 >>> (24 - (i12 * 8)));
        }
    }
}
