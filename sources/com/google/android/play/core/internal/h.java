package com.google.android.play.core.internal;

import android.util.Pair;
import androidx.fragment.app.d0;
import ch.qos.logback.core.util.FileSize;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    private static int a(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String strValueOf = String.valueOf(Long.toHexString(i10));
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    public static long a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 16);
    }

    private static long a(ByteBuffer byteBuffer, int i10) {
        return ((long) byteBuffer.getInt(i10)) & 4294967295L;
    }

    public static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairA = a(randomAccessFile, 0);
        return pairA != null ? pairA : a(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    private static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        c(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i12 = iCapacity - 22;
            int iMin = Math.min(i12, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            int i13 = 0;
            while (true) {
                if (i13 >= iMin) {
                    i11 = -1;
                    break;
                }
                i11 = i12 - i13;
                if (byteBufferAllocate.getInt(i11) == 101010256 && ((char) byteBufferAllocate.getShort(i11 + 20)) == i13) {
                    break;
                }
                i13++;
            }
        } else {
            i11 = -1;
            break;
        }
        if (i11 == -1) {
            return null;
        }
        byteBufferAllocate.position(i11);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i11)));
    }

    public static String a(String str, String str2) {
        return d0.a(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public static String a(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        j1.d.a(sb2, str, ":", str2, ":");
        sb2.append(str3);
        return sb2.toString();
    }

    private static void a(int i10, byte[] bArr) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static void a(ByteBuffer byteBuffer, long j10) {
        c(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j10 >= 0 && j10 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("uint32 value of out range: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void a(Map<Integer, byte[]> map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        c cVar = new c(fileChannel, 0L, j10);
        c cVar2 = new c(fileChannel, j11, j12 - j11);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        a(byteBufferDuplicate, j10);
        a aVar = new a(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        try {
            byte[][] bArrA = a(iArr, new b[]{cVar, cVar2, aVar});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(i12)), bArrA[i11])) {
                    throw new SecurityException(b(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e10) {
            throw new SecurityException("Failed to compute digest(s) of contents", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:109:0x0200  */
    /* JADX WARN: Code duplicated, block: B:111:0x0215  */
    /* JADX WARN: Code duplicated, block: B:113:0x0222  */
    /* JADX WARN: Code duplicated, block: B:115:0x022a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0232  */
    /* JADX WARN: Code duplicated, block: B:119:0x023a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x013c A[Catch: SignatureException -> 0x024a, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024c, InvalidKeyException -> 0x024e, InvalidKeySpecException -> 0x0250, NoSuchAlgorithmException -> 0x0252, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024c, blocks: (B:68:0x0126, B:70:0x013c, B:71:0x013f), top: B:138:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0166 A[Catch: IOException | BufferUnderflowException -> 0x0180, IOException -> 0x0182, TryCatch #8 {IOException | BufferUnderflowException -> 0x0180, blocks: (B:77:0x015c, B:79:0x0166, B:81:0x0173, B:82:0x0178, B:83:0x017f), top: B:136:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0197  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a9  */
    private static X509Certificate[] a(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        String str2;
        Pair pairCreate;
        String str3;
        AlgorithmParameterSpec algorithmParameterSpec;
        Signature signature;
        ByteBuffer byteBufferD;
        ArrayList arrayList;
        int i10;
        byte[] bArrPut;
        ByteBuffer byteBufferD2;
        ArrayList arrayList2;
        int i11;
        ByteBuffer byteBufferD3;
        int i12;
        PSSParameterSpec pSSParameterSpec;
        String str4;
        ByteBuffer byteBufferD4 = d(byteBuffer);
        ByteBuffer byteBufferD5 = d(byteBuffer);
        byte[] bArrE = e(byteBuffer);
        ArrayList arrayList3 = new ArrayList();
        byte[] bArrE2 = null;
        int i13 = 0;
        int i14 = -1;
        byte[] bArrE3 = null;
        while (byteBufferD5.hasRemaining()) {
            i13++;
            try {
                ByteBuffer byteBufferD6 = d(byteBufferD5);
                if (byteBufferD6.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i15 = byteBufferD6.getInt();
                arrayList3.add(Integer.valueOf(i15));
                if (i15 != 513 && i15 != 514 && i15 != 769) {
                    switch (i15) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i14 != -1) {
                    int iA = a(i15);
                    int iA2 = a(i14);
                    if (iA != 1 && iA2 == 1) {
                    }
                }
                bArrE3 = e(byteBufferD6);
                i14 = i15;
            } catch (IOException | BufferUnderflowException e10) {
                throw new SecurityException(com.google.android.gms.common.data.a.a(45, "Failed to parse signature record #", i13), e10);
            }
        }
        if (i14 == -1) {
            if (i13 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i14 == 513 || i14 == 514) {
            str = "EC";
        } else if (i14 != 769) {
            switch (i14) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    String strValueOf = String.valueOf(Long.toHexString(i14));
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            str = "DSA";
        }
        try {
            if (i14 == 513) {
                str2 = "SHA256withECDSA";
            } else if (i14 == 514) {
                str2 = "SHA512withECDSA";
            } else if (i14 != 769) {
                switch (i14) {
                    case 257:
                        pSSParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
                        str4 = "SHA256withRSA/PSS";
                        pairCreate = Pair.create(str4, pSSParameterSpec);
                        str3 = (String) pairCreate.first;
                        algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
                        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrE));
                        signature = Signature.getInstance(str3);
                        signature.initVerify(publicKeyGeneratePublic);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(byteBufferD4);
                        if (!signature.verify(bArrE3)) {
                            throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
                        }
                        byteBufferD4.clear();
                        byteBufferD = d(byteBufferD4);
                        arrayList = new ArrayList();
                        i10 = 0;
                        while (byteBufferD.hasRemaining()) {
                            i10++;
                            try {
                                byteBufferD3 = d(byteBufferD);
                                if (byteBufferD3.remaining() < 8) {
                                    throw new IOException("Record too short");
                                }
                                i12 = byteBufferD3.getInt();
                                arrayList.add(Integer.valueOf(i12));
                                if (i12 == i14) {
                                    bArrE2 = e(byteBufferD3);
                                }
                            } catch (IOException | BufferUnderflowException e11) {
                                throw new IOException(com.google.android.gms.common.data.a.a(42, "Failed to parse digest record #", i10), e11);
                            }
                        }
                        if (!arrayList3.equals(arrayList)) {
                            throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                        }
                        int iA3 = a(i14);
                        bArrPut = map.put(Integer.valueOf(iA3), bArrE2);
                        if (bArrPut == null && !MessageDigest.isEqual(bArrPut, bArrE2)) {
                            throw new SecurityException(b(iA3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                        byteBufferD2 = d(byteBufferD4);
                        arrayList2 = new ArrayList();
                        i11 = 0;
                        while (byteBufferD2.hasRemaining()) {
                            i11++;
                            byte[] bArrE4 = e(byteBufferD2);
                            try {
                                arrayList2.add(new f((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrE4)), bArrE4));
                            } catch (CertificateException e12) {
                                throw new SecurityException(com.google.android.gms.common.data.a.a(41, "Failed to decode certificate #", i11), e12);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            throw new SecurityException("No certificates listed");
                        }
                        if (Arrays.equals(bArrE, ((X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList2.toArray(new X509Certificate[arrayList2.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    case 258:
                        pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                        str4 = "SHA512withRSA/PSS";
                        pairCreate = Pair.create(str4, pSSParameterSpec);
                        str3 = (String) pairCreate.first;
                        algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
                        PublicKey publicKeyGeneratePublic2 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrE));
                        signature = Signature.getInstance(str3);
                        signature.initVerify(publicKeyGeneratePublic2);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(byteBufferD4);
                        if (!signature.verify(bArrE3)) {
                            throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
                        }
                        byteBufferD4.clear();
                        byteBufferD = d(byteBufferD4);
                        arrayList = new ArrayList();
                        i10 = 0;
                        while (byteBufferD.hasRemaining()) {
                            i10++;
                            byteBufferD3 = d(byteBufferD);
                            if (byteBufferD3.remaining() < 8) {
                                throw new IOException("Record too short");
                            }
                            i12 = byteBufferD3.getInt();
                            arrayList.add(Integer.valueOf(i12));
                            if (i12 == i14) {
                                bArrE2 = e(byteBufferD3);
                            }
                        }
                        if (!arrayList3.equals(arrayList)) {
                            throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                        }
                        int iA4 = a(i14);
                        bArrPut = map.put(Integer.valueOf(iA4), bArrE2);
                        if (bArrPut == null) {
                            break;
                        }
                        byteBufferD2 = d(byteBufferD4);
                        arrayList2 = new ArrayList();
                        i11 = 0;
                        while (byteBufferD2.hasRemaining()) {
                            i11++;
                            byte[] bArrE5 = e(byteBufferD2);
                            arrayList2.add(new f((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrE5)), bArrE5));
                        }
                        if (arrayList2.isEmpty()) {
                            throw new SecurityException("No certificates listed");
                        }
                        if (Arrays.equals(bArrE, ((X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList2.toArray(new X509Certificate[arrayList2.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    case 259:
                        str2 = "SHA256withRSA";
                        break;
                    case 260:
                        str2 = "SHA512withRSA";
                        break;
                    default:
                        String strValueOf2 = String.valueOf(Long.toHexString(i14));
                        throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf2) : new String("Unknown signature algorithm: 0x"));
                }
            } else {
                str2 = "SHA256withDSA";
            }
            PublicKey publicKeyGeneratePublic3 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrE));
            signature = Signature.getInstance(str3);
            signature.initVerify(publicKeyGeneratePublic3);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferD4);
            if (!signature.verify(bArrE3)) {
                throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
            }
            byteBufferD4.clear();
            byteBufferD = d(byteBufferD4);
            arrayList = new ArrayList();
            i10 = 0;
            while (byteBufferD.hasRemaining()) {
                i10++;
                byteBufferD3 = d(byteBufferD);
                if (byteBufferD3.remaining() < 8) {
                    throw new IOException("Record too short");
                }
                i12 = byteBufferD3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 == i14) {
                    bArrE2 = e(byteBufferD3);
                }
            }
            if (!arrayList3.equals(arrayList)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iA5 = a(i14);
            bArrPut = map.put(Integer.valueOf(iA5), bArrE2);
            if (bArrPut == null) {
            }
            byteBufferD2 = d(byteBufferD4);
            arrayList2 = new ArrayList();
            i11 = 0;
            while (byteBufferD2.hasRemaining()) {
                i11++;
                byte[] bArrE6 = e(byteBufferD2);
                arrayList2.add(new f((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrE6)), bArrE6));
            }
            if (arrayList2.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrE, ((X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList2.toArray(new X509Certificate[arrayList2.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e13) {
            throw new SecurityException(d0.a(new StringBuilder(String.valueOf(str3).length() + 27), "Failed to verify ", str3, " signature"), e13);
        }
        pairCreate = Pair.create(str2, null);
        str3 = (String) pairCreate.first;
        algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
    }

    private static byte[][] a(int[] iArr, b[] bVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        long j11 = 0;
        long jA = 0;
        int i11 = 0;
        while (true) {
            j10 = FileSize.MB_COEFFICIENT;
            if (i11 >= 3) {
                break;
            }
            jA += (bVarArr[i11].a() + 1048575) / FileSize.MB_COEFFICIENT;
            i11++;
        }
        if (jA >= 2097151) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Too many chunks: ");
            sb2.append(jA);
            throw new DigestException(sb2.toString());
        }
        int i12 = (int) jA;
        byte[][] bArr = new byte[iArr.length][];
        int i13 = 0;
        while (true) {
            length = iArr.length;
            if (i13 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(c(iArr[i13]) * i12) + 5];
            bArr2[0] = 90;
            a(i12, bArr2);
            bArr[i13] = bArr2;
            i13++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String strB = b(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(strB);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strB.concat(" digest not supported"), e10);
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i15 < i10; i10 = 3) {
            b bVar = bVarArr[i15];
            long j12 = j11;
            int i18 = i15;
            long jA2 = bVar.a();
            while (jA2 > j11) {
                int iMin = (int) Math.min(jA2, j10);
                a(iMin, bArr3);
                for (int i19 = 0; i19 < length; i19++) {
                    messageDigestArr[i19].update(bArr3);
                }
                long j13 = j12;
                try {
                    bVar.a(messageDigestArr, j13, iMin);
                    int i20 = 0;
                    while (i20 < iArr.length) {
                        int i21 = iArr[i20];
                        b bVar2 = bVar;
                        byte[] bArr4 = bArr[i20];
                        int iC = c(i21);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i20];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr4, (i16 * iC) + 5, iC);
                        if (iDigest != iC) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb3.append("Unexpected output size of ");
                            sb3.append(algorithm);
                            sb3.append(" digest: ");
                            sb3.append(iDigest);
                            throw new RuntimeException(sb3.toString());
                        }
                        i20++;
                        bVar = bVar2;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    b bVar3 = bVar;
                    long j14 = iMin;
                    long j15 = j13 + j14;
                    jA2 -= j14;
                    i16++;
                    j11 = 0;
                    j10 = FileSize.MB_COEFFICIENT;
                    bVar = bVar3;
                    j12 = j15;
                    bArr3 = bArr3;
                } catch (IOException e11) {
                    StringBuilder sb4 = new StringBuilder(59);
                    sb4.append("Failed to digest chunk #");
                    sb4.append(i16);
                    sb4.append(" of section #");
                    sb4.append(i17);
                    throw new DigestException(sb4.toString(), e11);
                }
            }
            i17++;
            i15 = i18 + 1;
            j11 = 0;
            j10 = FileSize.MB_COEFFICIENT;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i22 = 0; i22 < iArr.length; i22++) {
            int i23 = iArr[i22];
            byte[] bArr7 = bArr[i22];
            String strB2 = b(i23);
            try {
                bArr6[i22] = MessageDigest.getInstance(strB2).digest(bArr7);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strB2.concat(" digest not supported"), e12);
            }
        }
        return bArr6;
    }

    public static X509Certificate[][] a(String str) throws e, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> pairA = a(randomAccessFile);
            if (pairA == null) {
                long length = randomAccessFile.length();
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb2.append(length);
                sb2.append(" bytes");
                throw new e(sb2.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
            long jLongValue = ((Long) pairA.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new e("ZIP64 APK not supported");
                }
            }
            long jA = a(byteBuffer);
            if (jA >= jLongValue) {
                StringBuilder sb3 = new StringBuilder(122);
                sb3.append("ZIP Central Directory offset out of range: ");
                sb3.append(jA);
                sb3.append(". ZIP End of Central Directory offset: ");
                sb3.append(jLongValue);
                throw new e(sb3.toString());
            }
            if (b(byteBuffer) + jA != jLongValue) {
                throw new e("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jA < 32) {
                StringBuilder sb4 = new StringBuilder(87);
                sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb4.append(jA);
                throw new e(sb4.toString());
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jA - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new e("No APK Signing Block before ZIP Central Directory");
            }
            int i10 = 0;
            long j11 = byteBufferAllocate.getLong(0);
            if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
                StringBuilder sb5 = new StringBuilder(57);
                sb5.append("APK Signing Block size out of range: ");
                sb5.append(j11);
                throw new e(sb5.toString());
            }
            int i11 = (int) (8 + j11);
            long j12 = jA - ((long) i11);
            if (j12 < 0) {
                StringBuilder sb6 = new StringBuilder(59);
                sb6.append("APK Signing Block offset out of range: ");
                sb6.append(j12);
                throw new e(sb6.toString());
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j13 = byteBufferAllocate2.getLong(0);
            if (j13 != j11) {
                StringBuilder sb7 = new StringBuilder(103);
                sb7.append("APK Signing Block sizes in header and footer do not match: ");
                sb7.append(j13);
                sb7.append(" vs ");
                sb7.append(j11);
                throw new e(sb7.toString());
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                StringBuilder sb8 = new StringBuilder(38);
                sb8.append("end < start: ");
                sb8.append(iCapacity);
                sb8.append(" < ");
                sb8.append(8);
                throw new IllegalArgumentException(sb8.toString());
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                StringBuilder sb9 = new StringBuilder(41);
                sb9.append("end > capacity: ");
                sb9.append(iCapacity);
                sb9.append(" > ");
                sb9.append(iCapacity2);
                throw new IllegalArgumentException(sb9.toString());
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                while (byteBufferSlice.hasRemaining()) {
                    i10++;
                    if (byteBufferSlice.remaining() < 8) {
                        StringBuilder sb10 = new StringBuilder(70);
                        sb10.append("Insufficient data to read size of APK Signing Block entry #");
                        sb10.append(i10);
                        throw new e(sb10.toString());
                    }
                    long j14 = byteBufferSlice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        StringBuilder sb11 = new StringBuilder(76);
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i10);
                        sb11.append(" size out of range: ");
                        sb11.append(j14);
                        throw new e(sb11.toString());
                    }
                    int i12 = (int) j14;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        int iRemaining = byteBufferSlice.remaining();
                        StringBuilder sb12 = new StringBuilder(91);
                        sb12.append("APK Signing Block entry #");
                        sb12.append(i10);
                        sb12.append(" size out of range: ");
                        sb12.append(i12);
                        sb12.append(", available: ");
                        sb12.append(iRemaining);
                        throw new e(sb12.toString());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrA = a(randomAccessFile.getChannel(), new d(b(byteBufferSlice, i12 - 4), jLongValue2, jA, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return x509CertificateArrA;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new e("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    private static X509Certificate[][] a(FileChannel fileChannel, d dVar) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferD = d(dVar.f12295a);
                int i10 = 0;
                while (byteBufferD.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(a(d(byteBufferD), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append("Failed to parse/verify signer #");
                        sb2.append(i10);
                        sb2.append(" block");
                        throw new SecurityException(sb2.toString(), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                a(map, fileChannel, dVar.f12296b, dVar.f12297c, dVar.f12298d, dVar.f12299e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }

    public static long b(ByteBuffer byteBuffer) {
        c(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 12);
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(com.google.android.gms.common.data.a.a(44, "Unknown content digest algorthm: ", i10));
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        if (i10 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.common.data.a.a(17, "size: ", i10));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static int c(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(com.google.android.gms.common.data.a.a(44, "Unknown content digest algorthm: ", i10));
    }

    private static void c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer d(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(com.google.android.gms.common.data.a.a(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return b(byteBuffer, i10);
        }
        int iRemaining = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(101);
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i10);
        sb2.append(", remaining: ");
        sb2.append(iRemaining);
        throw new IOException(sb2.toString());
    }

    private static byte[] e(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(90);
        sb2.append("Underflow while reading length-prefixed value. Length: ");
        sb2.append(i10);
        sb2.append(", available: ");
        sb2.append(iRemaining);
        throw new IOException(sb2.toString());
    }
}
