package com.applovin.impl.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f11356a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f11357b;

    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f11362d;

        a(int i10) {
            this.f11362d = i10;
        }

        public static a a(int i10) {
            if (i10 != 0 && i10 == 1) {
                return V2;
            }
            return DEFAULT;
        }

        public int a() {
            return this.f11362d;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f11357b = bArr;
        System.arraycopy(new byte[]{18, 12, Ascii.FS, 20, 17, 23, Ascii.SUB, 9, 21, 3, 14, Ascii.GS, 4, 0, 2, 7, 10, Ascii.GS, 6, 20, 1}, 0, bArr, 0, 21);
    }

    private static int a(byte[] bArr, byte b10) {
        if (bArr != null && bArr.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] == b10) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public static a a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return a.NONE;
        }
        char c10 = (char) bArr[0];
        if (c10 == '2') {
            return a.V2;
        }
        return c10 == '{' ? a.NONE : a.DEFAULT;
    }

    public static String a(String str, long j10, a aVar, String str2, com.applovin.impl.sdk.o oVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 80) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] bArrA = a.V2 == aVar ? a(str, j10, true, str2, oVar) : a(str, j10, str2, oVar);
        if (bArrA != null) {
            return new String(bArrA);
        }
        return null;
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.o oVar) {
        String str3;
        String[] strArrSplit = str.split(":");
        char c10 = 0;
        try {
            try {
                if (!"1".equals(strArrSplit[0]) || strArrSplit.length != 4) {
                    return null;
                }
                String str4 = strArrSplit[1];
                String str5 = strArrSplit[2];
                byte[] bArrA = a(strArrSplit[3]);
                if (!str2.endsWith(str5)) {
                    return null;
                }
                byte[] bArr = f11356a;
                if (!a(bArr, oVar).equals(str4)) {
                    return null;
                }
                char c11 = ' ';
                byte[] bArrA2 = a(str2.substring(0, 32), bArr, oVar);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA);
                char c12 = '\b';
                try {
                    long j10 = (((long) ((byteArrayInputStream.read() ^ bArrA2[1]) & 255)) << 8) | (((long) ((byteArrayInputStream.read() ^ bArrA2[0]) & 255)) << 0) | (((long) ((byteArrayInputStream.read() ^ bArrA2[2]) & 255)) << 16) | (((long) ((byteArrayInputStream.read() ^ bArrA2[3]) & 255)) << 24) | (((long) ((byteArrayInputStream.read() ^ bArrA2[4]) & 255)) << 32) | (((long) ((byteArrayInputStream.read() ^ bArrA2[5]) & 255)) << 40) | (((long) ((byteArrayInputStream.read() ^ bArrA2[6]) & 255)) << 48) | (((long) ((byteArrayInputStream.read() ^ bArrA2[7]) & 255)) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int i10 = byteArrayInputStream.read(bArr2);
                    int i11 = 0;
                    while (i10 >= 0) {
                        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        long j11 = ((long) i11) + j10;
                        long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                        long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                        long j14 = j13 ^ (j13 >> c11);
                        byteArrayOutputStream.write((byte) (((long) (bArr2[c10] ^ bArrA2[(i11 + 0) % bArrA2.length])) ^ ((j14 >> c10) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i11 + 1) % bArrA2.length] ^ bArr2[1])) ^ ((j14 >> c12) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i11 + 2) % bArrA2.length] ^ bArr2[2])) ^ ((j14 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[3] ^ bArrA2[(i11 + 3) % bArrA2.length])) ^ ((j14 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i11 + 4) % bArrA2.length] ^ bArr2[4])) ^ ((j14 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i11 + 5) % bArrA2.length] ^ bArr2[5])) ^ ((j14 >> 40) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i11 + 6) % bArrA2.length] ^ bArr2[6])) ^ ((j14 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[7] ^ bArrA2[(i11 + 7) % bArrA2.length])) ^ ((j14 >> 56) & 255)));
                        i11 += 8;
                        byteArrayInputStream = byteArrayInputStream2;
                        i10 = byteArrayInputStream2.read(bArr2);
                        j10 = j10;
                        c12 = '\b';
                        c10 = 0;
                        c11 = ' ';
                    }
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                } catch (IOException e10) {
                    e = e10;
                    str3 = null;
                    com.applovin.impl.sdk.y.d("AppLovinSdk", "Failed to read bytes", e);
                    oVar.ag().a("AppLovinSdk", "decode", e);
                    return str3;
                }
            } catch (UnsupportedEncodingException e11) {
                oVar.ag().a("AppLovinSdk", "decode", e11);
                throw new RuntimeException("UTF-8 encoding not found", e11);
            }
        } catch (IOException e12) {
            e = e12;
            str3 = null;
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.o oVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            oVar.ag().a("AppLovinSdk", "SHA1", e10);
            throw new RuntimeException("SHA-1 algorithm not found", e10);
        }
    }

    public static String a(byte[] bArr, String str, com.applovin.impl.sdk.o oVar) {
        if (str == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str.length() < 80) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        a aVarA = a(bArr);
        if (a.NONE == aVarA) {
            return new String(bArr);
        }
        return aVarA == a.V2 ? b(bArr, str, oVar) : a(new String(bArr), str, oVar);
    }

    private static byte[] a(String str) {
        return Base64.decode(b(str), 0);
    }

    private static byte[] a(String str, long j10, String str2, com.applovin.impl.sdk.o oVar) {
        String str3 = "UTF-8";
        char c10 = ' ';
        try {
            String strSubstring = str2.substring(32);
            byte b10 = 0;
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bArrA = a(strSubstring2, f11356a, oVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) ((j10 >> 0) & 255)) ^ bArrA[0]);
            byteArrayOutputStream.write(((byte) ((j10 >> 8) & 255)) ^ bArrA[1]);
            byteArrayOutputStream.write(((byte) ((j10 >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j10 >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j10 >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j10 >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j10 >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j10 >> 56) & 255)) ^ bArrA[7]);
            int i10 = 0;
            while (i10 < bytes.length) {
                long j11 = j10 + ((long) i10);
                long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                long j14 = j13 ^ (j13 >> c10);
                int i11 = i10 + 0;
                String str4 = str3;
                byteArrayOutputStream.write((byte) (((long) ((i11 >= bytes.length ? b10 : bytes[i11]) ^ bArrA[i11 % bArrA.length])) ^ ((j14 >> b10) & 255)));
                int i12 = i10 + 1;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i12 % bArrA.length] ^ (i12 >= bytes.length ? b10 : bytes[i12]))) ^ ((j14 >> 8) & 255)));
                int i13 = i10 + 2;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i13 % bArrA.length] ^ (i13 >= bytes.length ? b10 : bytes[i13]))) ^ ((j14 >> 16) & 255)));
                int i14 = i10 + 3;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i14 % bArrA.length] ^ (i14 >= bytes.length ? (byte) 0 : bytes[i14]))) ^ ((j14 >> 24) & 255)));
                int i15 = i10 + 4;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i15 % bArrA.length] ^ (i15 >= bytes.length ? (byte) 0 : bytes[i15]))) ^ ((j14 >> 32) & 255)));
                int i16 = i10 + 5;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i16 % bArrA.length] ^ (i16 >= bytes.length ? (byte) 0 : bytes[i16]))) ^ ((j14 >> 40) & 255)));
                int i17 = i10 + 6;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i17 % bArrA.length] ^ (i17 >= bytes.length ? (byte) 0 : bytes[i17]))) ^ ((j14 >> 48) & 255)));
                int i18 = i10 + 7;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i18 % bArrA.length] ^ (i18 >= bytes.length ? (byte) 0 : bytes[i18]))) ^ ((j14 >> 56) & 255)));
                i10 += 8;
                str3 = str4;
                c10 = ' ';
                b10 = 0;
            }
            String str5 = str3;
            String strB = b(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f11356a, oVar) + ":" + strSubstring + ":" + strB).getBytes(str5);
        } catch (UnsupportedEncodingException e10) {
            oVar.ag().a("AppLovinSdk", "encode", e10);
            return null;
        }
    }

    private static byte[] a(String str, long j10, boolean z10, String str2, com.applovin.impl.sdk.o oVar) {
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f11357b;
            byte[] bArrA = a(strSubstring2, bArr, oVar);
            long jD = w.d(bArrA) ^ j10;
            byte[] bytes2 = String.format("2:%s:%s:", a(bArr, oVar), strSubstring).getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong(length);
            byteBufferAllocate2.putLong(jD);
            byteBufferAllocate2.flip();
            byte[] bArrA2 = a(w.b(bytes), j10, bArrA);
            if (z10) {
                byte[] bytes3 = b(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = b(bArrA2).getBytes();
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrA2.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrA2);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (UnsupportedEncodingException e10) {
            oVar.ag().a("AppLovinSdk", "encode2", e10);
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            oVar.ag().a("AppLovinSdk", "encode2", e11);
            return null;
        }
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.o oVar) throws UnsupportedEncodingException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            oVar.ag().a("AppLovinSdk", "SHA256", e10);
            throw new RuntimeException("SHA-256 algorithm not found", e10);
        }
    }

    private static byte[] a(byte[] bArr, long j10, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j11 = j10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 % 8;
            if (i11 == 0) {
                long j12 = ((long) i10) + j10;
                long j13 = (j12 ^ (j12 >>> 33)) * (-4417276706812531889L);
                long j14 = (j13 ^ (j13 >>> 29)) * (-8796714831421723037L);
                j11 = j14 ^ (j14 >>> 32);
            }
            bArrCopyOf[i10] = (byte) (((long) bArrCopyOf[i10]) ^ (((j11 >> (i11 * 8)) & 255) ^ ((long) bArr2[i10 % bArr2.length])));
        }
        return bArrCopyOf;
    }

    private static String b(String str) {
        return str.replace(CoreConstants.DASH_CHAR, '+').replace('_', '/').replace('*', '=');
    }

    private static String b(byte[] bArr) throws UnsupportedEncodingException {
        return c(Base64.encode(bArr, 2));
    }

    private static String b(byte[] bArr, String str, com.applovin.impl.sdk.o oVar) {
        try {
            int iC = c(bArr, str, oVar);
            if (iC == 0) {
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iC, bArr.length);
            long jA = w.a(bArrCopyOfRange, 8);
            byte[] bArrA = a(str.substring(0, 32), f11357b, oVar);
            return new String(w.c(a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jA ^ w.d(bArrA), bArrA)), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            oVar.ag().a("AppLovinSdk", "decode2", e10);
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            com.applovin.impl.sdk.y.d("AppLovinSdk", "Failed to ungzip decode", e11);
            oVar.ag().a("AppLovinSdk", "decode2", e11);
            return null;
        }
    }

    public static byte[] b(String str, long j10, a aVar, String str2, com.applovin.impl.sdk.o oVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 80) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (!TextUtils.isEmpty(str) && a.NONE != aVar) {
            return a.V2 == aVar ? a(str, j10, false, str2, oVar) : a(str, j10, str2, oVar);
        }
        return str.getBytes();
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.o oVar) {
        int iA;
        int i10;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (iA = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f11357b, oVar).getBytes();
        int i11 = iA + 1;
        int length = bytes.length + i11;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i10 = length + 54 + 1) || bArr[i10] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i11, bytes.length + i11), bytes)) {
            return 0;
        }
        int i12 = i10 + 1;
        if (i12 + 8 > bArr.length) {
            return 0;
        }
        return i12;
    }

    private static String c(byte[] bArr) throws UnsupportedEncodingException {
        return new String(bArr, "UTF-8").replace('+', CoreConstants.DASH_CHAR).replace('/', '_').replace('=', '*');
    }
}
