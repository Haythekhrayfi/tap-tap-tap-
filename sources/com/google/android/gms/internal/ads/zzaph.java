package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzaph {
    public static boolean zza;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    public static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrZzg;
        Vector vectorZzb = zzb(bArr, 255);
        if (vectorZzb == null || vectorZzb.size() == 0) {
            bArrZzg = zzg(zzf(4096).zzax(), str, true);
        } else {
            zzaoz zzaozVarZza = zzapa.zza();
            int size = vectorZzb.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzaozVarZza.zza(zzgoe.zzv(zzg((byte[]) vectorZzb.get(i10), str, false), 0, 256));
            }
            byte[] bArrZze = zze(bArr);
            zzgoe zzgoeVar = zzgoe.zzb;
            zzaozVarZza.zzb(zzgoe.zzv(bArrZze, 0, bArrZze.length));
            bArrZzg = ((zzapa) zzaozVarZza.zzal()).zzax();
        }
        return zzapd.zza(bArrZzg, true);
    }

    public static Vector zzb(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / 255; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzapg(null)).start();
            }
        }
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            zzd();
            MessageDigest messageDigest2 = null;
            try {
                if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = zzd.digest();
        }
        return bArrDigest;
    }

    public static zzaon zzf(int i10) {
        zzanq zzanqVarZza = zzaon.zza();
        zzanqVarZza.zzD(4096L);
        return (zzaon) zzanqVarZza.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer byteBufferPut;
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        if (length > i10) {
            bArr = zzf(4096).zzax();
        }
        int length2 = bArr.length;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length2).put(bArr).put(bArr2);
        } else {
            byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length2).put(bArr);
        }
        byte[] bArrArray = byteBufferPut.array();
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzapi[] zzapiVarArr = new zzaqh().zzcG;
        int length3 = zzapiVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            zzapiVarArr[i11].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzapb(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
