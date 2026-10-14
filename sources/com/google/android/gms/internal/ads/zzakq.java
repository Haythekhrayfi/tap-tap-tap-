package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.activity.j;
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
import n1.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakq {
    public static X509Certificate[][] zza(String str) throws zzakn, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairZzc = zzakr.zzc(randomAccessFile);
            if (pairZzc == null) {
                throw new zzakn("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
            long jLongValue = ((Long) pairZzc.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzakn("ZIP64 APK not supported");
                }
            }
            long jZza = zzakr.zza(byteBuffer);
            if (jZza >= jLongValue) {
                throw new zzakn("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (zzakr.zzb(byteBuffer) + jZza != jLongValue) {
                throw new zzakn("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jZza < 32) {
                throw new zzakn("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jZza - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzakn("No APK Signing Block before ZIP Central Directory");
            }
            int i10 = 0;
            long j11 = byteBufferAllocate.getLong(0);
            if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
                throw new zzakn("APK Signing Block size out of range: " + j11);
            }
            int i11 = (int) (8 + j11);
            long j12 = jZza - ((long) i11);
            if (j12 < 0) {
                throw new zzakn("APK Signing Block offset out of range: " + j12);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j13 = byteBufferAllocate2.getLong(0);
            if (j13 != j11) {
                throw new zzakn("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
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
                        throw new zzakn("Insufficient data to read size of APK Signing Block entry #" + i10);
                    }
                    long j14 = byteBufferSlice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        throw new zzakn("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                    }
                    int i12 = (int) j14;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        throw new zzakn("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrZzl = zzl(randomAccessFile.getChannel(), new zzakm(zze(byteBufferSlice, i12 - 4), jLongValue2, jZza, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return x509CertificateArrZzl;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new zzakn("No APK Signature Scheme v2 block in APK Signing Block");
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

    private static int zzb(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown content digest algorthm: ", i10));
    }

    private static int zzc(int i10) {
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
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    private static String zzd(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown content digest algorthm: ", i10));
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
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

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(android.support.v4.media.a.a("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return zze(byteBuffer, i10);
        }
        throw new IOException(c.a("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzakk zzakkVar = new zzakk(fileChannel, 0L, j10);
        zzakk zzakkVar2 = new zzakk(fileChannel, j11, j12 - j11);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzakr.zzd(byteBufferDuplicate, j10);
        zzaki zzakiVar = new zzaki(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new zzakj[]{zzakkVar, zzakkVar2, zzakiVar});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrZzk[i11])) {
                    throw new SecurityException(zzd(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e10) {
            throw new SecurityException("Failed to compute digest(s) of contents", e10);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 > byteBuffer.remaining()) {
            throw new IOException(c.a("Underflow while reading length-prefixed value. Length: ", i10, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:107:0x020a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0212  */
    /* JADX WARN: Code duplicated, block: B:111:0x021a  */
    /* JADX WARN: Code duplicated, block: B:149:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0120 A[Catch: SignatureException -> 0x022a, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x022c, InvalidKeyException -> 0x022e, InvalidKeySpecException -> 0x0230, NoSuchAlgorithmException -> 0x0232, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x022c, blocks: (B:60:0x010a, B:62:0x0120, B:63:0x0123), top: B:130:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x014a A[Catch: IOException | BufferUnderflowException -> 0x0164, IOException -> 0x0166, TryCatch #8 {IOException | BufferUnderflowException -> 0x0164, blocks: (B:69:0x0140, B:71:0x014a, B:73:0x0157, B:74:0x015c, B:75:0x0163), top: B:128:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x018b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2  */
    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        String str2;
        Pair pairCreate;
        String str3;
        AlgorithmParameterSpec algorithmParameterSpec;
        Signature signature;
        ByteBuffer byteBufferZzf;
        ArrayList arrayList;
        int i10;
        byte[] bArr;
        ByteBuffer byteBufferZzf2;
        ArrayList arrayList2;
        int i11;
        ByteBuffer byteBufferZzf3;
        int i12;
        PSSParameterSpec pSSParameterSpec;
        String str4;
        ByteBuffer byteBufferZzf4 = zzf(byteBuffer);
        ByteBuffer byteBufferZzf5 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList3 = new ArrayList();
        byte[] bArrZzi2 = null;
        int i13 = 0;
        int i14 = -1;
        byte[] bArrZzi3 = null;
        while (byteBufferZzf5.hasRemaining()) {
            i13++;
            try {
                ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf5);
                if (byteBufferZzf6.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i15 = byteBufferZzf6.getInt();
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
                    int iZzc = zzc(i15);
                    int iZzc2 = zzc(i14);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf6);
                i14 = i15;
            } catch (IOException | BufferUnderflowException e10) {
                throw new SecurityException(android.support.v4.media.a.a("Failed to parse signature record #", i13), e10);
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
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i14))));
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
                        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
                        signature = Signature.getInstance(str3);
                        signature.initVerify(publicKeyGeneratePublic);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(byteBufferZzf4);
                        if (!signature.verify(bArrZzi3)) {
                            throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
                        }
                        byteBufferZzf4.clear();
                        byteBufferZzf = zzf(byteBufferZzf4);
                        arrayList = new ArrayList();
                        i10 = 0;
                        while (byteBufferZzf.hasRemaining()) {
                            i10++;
                            try {
                                byteBufferZzf3 = zzf(byteBufferZzf);
                                if (byteBufferZzf3.remaining() < 8) {
                                    throw new IOException("Record too short");
                                }
                                i12 = byteBufferZzf3.getInt();
                                arrayList.add(Integer.valueOf(i12));
                                if (i12 == i14) {
                                    bArrZzi2 = zzi(byteBufferZzf3);
                                }
                            } catch (IOException | BufferUnderflowException e11) {
                                throw new IOException(android.support.v4.media.a.a("Failed to parse digest record #", i10), e11);
                            }
                        }
                        if (!arrayList3.equals(arrayList)) {
                            throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                        }
                        int iZzc3 = zzc(i14);
                        bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
                        if (bArr == null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                            throw new SecurityException(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                        byteBufferZzf2 = zzf(byteBufferZzf4);
                        arrayList2 = new ArrayList();
                        i11 = 0;
                        while (byteBufferZzf2.hasRemaining()) {
                            i11++;
                            byte[] bArrZzi4 = zzi(byteBufferZzf2);
                            try {
                                arrayList2.add(new zzako((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                            } catch (CertificateException e12) {
                                throw new SecurityException(android.support.v4.media.a.a("Failed to decode certificate #", i11), e12);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            throw new SecurityException("No certificates listed");
                        }
                        if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList2.toArray(new X509Certificate[arrayList2.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    case 258:
                        pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                        str4 = "SHA512withRSA/PSS";
                        pairCreate = Pair.create(str4, pSSParameterSpec);
                        str3 = (String) pairCreate.first;
                        algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
                        PublicKey publicKeyGeneratePublic2 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
                        signature = Signature.getInstance(str3);
                        signature.initVerify(publicKeyGeneratePublic2);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(byteBufferZzf4);
                        if (!signature.verify(bArrZzi3)) {
                            throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
                        }
                        byteBufferZzf4.clear();
                        byteBufferZzf = zzf(byteBufferZzf4);
                        arrayList = new ArrayList();
                        i10 = 0;
                        while (byteBufferZzf.hasRemaining()) {
                            i10++;
                            byteBufferZzf3 = zzf(byteBufferZzf);
                            if (byteBufferZzf3.remaining() < 8) {
                                throw new IOException("Record too short");
                            }
                            i12 = byteBufferZzf3.getInt();
                            arrayList.add(Integer.valueOf(i12));
                            if (i12 == i14) {
                                bArrZzi2 = zzi(byteBufferZzf3);
                            }
                        }
                        if (!arrayList3.equals(arrayList)) {
                            throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                        }
                        int iZzc4 = zzc(i14);
                        bArr = (byte[]) map.put(Integer.valueOf(iZzc4), bArrZzi2);
                        if (bArr == null) {
                            break;
                        }
                        byteBufferZzf2 = zzf(byteBufferZzf4);
                        arrayList2 = new ArrayList();
                        i11 = 0;
                        while (byteBufferZzf2.hasRemaining()) {
                            i11++;
                            byte[] bArrZzi5 = zzi(byteBufferZzf2);
                            arrayList2.add(new zzako((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi5)), bArrZzi5));
                        }
                        if (arrayList2.isEmpty()) {
                            throw new SecurityException("No certificates listed");
                        }
                        if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
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
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i14))));
                }
            } else {
                str2 = "SHA256withDSA";
            }
            PublicKey publicKeyGeneratePublic3 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
            signature = Signature.getInstance(str3);
            signature.initVerify(publicKeyGeneratePublic3);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf4);
            if (!signature.verify(bArrZzi3)) {
                throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
            }
            byteBufferZzf4.clear();
            byteBufferZzf = zzf(byteBufferZzf4);
            arrayList = new ArrayList();
            i10 = 0;
            while (byteBufferZzf.hasRemaining()) {
                i10++;
                byteBufferZzf3 = zzf(byteBufferZzf);
                if (byteBufferZzf3.remaining() < 8) {
                    throw new IOException("Record too short");
                }
                i12 = byteBufferZzf3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 == i14) {
                    bArrZzi2 = zzi(byteBufferZzf3);
                }
            }
            if (!arrayList3.equals(arrayList)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzc5 = zzc(i14);
            bArr = (byte[]) map.put(Integer.valueOf(iZzc5), bArrZzi2);
            if (bArr == null) {
            }
            byteBufferZzf2 = zzf(byteBufferZzf4);
            arrayList2 = new ArrayList();
            i11 = 0;
            while (byteBufferZzf2.hasRemaining()) {
                i11++;
                byte[] bArrZzi6 = zzi(byteBufferZzf2);
                arrayList2.add(new zzako((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi6)), bArrZzi6));
            }
            if (arrayList2.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList2.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList2.toArray(new X509Certificate[arrayList2.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e13) {
            throw new SecurityException(j.a("Failed to verify ", str3, " signature"), e13);
        }
        pairCreate = Pair.create(str2, null);
        str3 = (String) pairCreate.first;
        algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
    }

    private static byte[][] zzk(int[] iArr, zzakj[] zzakjVarArr) throws DigestException {
        int length;
        long j10 = 0;
        int i10 = 0;
        long jZza = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            jZza += (zzakjVarArr[i11].zza() + 1048575) / FileSize.MB_COEFFICIENT;
        }
        if (jZza >= 2097151) {
            throw new DigestException(androidx.viewpager2.adapter.a.a("Too many chunks: ", jZza));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            zzg(i13, bArr2, 1);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String strZzd = zzd(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(strZzd);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strZzd.concat(" digest not supported"), e10);
            }
        }
        int i15 = 3;
        long j11 = 1048576;
        int i16 = 0;
        int i17 = 0;
        while (i10 < i15) {
            zzakj zzakjVar = zzakjVarArr[i10];
            int i18 = i10;
            byte[][] bArr4 = bArr;
            long jZza2 = zzakjVar.zza();
            long j12 = j11;
            int i19 = i17;
            long j13 = j10;
            while (jZza2 > j10) {
                int iMin = (int) Math.min(jZza2, j12);
                zzg(iMin, bArr3, 1);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    zzakjVar.zzb(messageDigestArr, j13, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr5 = bArr4[i21];
                        int iZzb = zzb(i22);
                        byte[] bArr6 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i19 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i21++;
                        bArr3 = bArr6;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j14 = iMin;
                    j13 += j14;
                    jZza2 -= j14;
                    i19++;
                    j10 = 0;
                    j12 = FileSize.MB_COEFFICIENT;
                } catch (IOException e11) {
                    throw new DigestException(c.a("Failed to digest chunk #", i19, " of section #", i16), e11);
                }
            }
            i16++;
            i10 = i18 + 1;
            j10 = 0;
            i15 = 3;
            i17 = i19;
            j11 = 1048576;
            bArr = bArr4;
            bArr3 = bArr3;
        }
        byte[][] bArr7 = bArr;
        byte[][] bArr8 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr9 = bArr7[i23];
            String strZzd2 = zzd(i24);
            try {
                bArr8[i23] = MessageDigest.getInstance(strZzd2).digest(bArr9);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strZzd2.concat(" digest not supported"), e12);
            }
        }
        return bArr8;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzakm zzakmVar) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzf = zzf(zzakmVar.zza);
                int i10 = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException(android.support.v4.media.j.a("Failed to parse/verify signer #", i10, " block"), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzh(map, fileChannel, zzakmVar.zzb, zzakmVar.zzc, zzakmVar.zzd, zzakmVar.zze);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}
