package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes2.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f12105a;

    public static int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static AssetLocation a(String str, String str2) throws IOException {
        Long lValueOf;
        int i10;
        com.google.android.play.core.internal.av.a(str != null, "Attempted to get file location from a null apk path.");
        com.google.android.play.core.internal.av.a(str2 != null, String.format("Attempted to get file location in apk %s with a null file path.", str));
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        byte[] bArr = new byte[22];
        randomAccessFile.seek(randomAccessFile.length() - 22);
        randomAccessFile.readFully(bArr);
        bj bjVarA = a(bArr, 0) == 1347093766 ? a(bArr) : null;
        byte b10 = 5;
        if (bjVarA == null) {
            long length = randomAccessFile.length() - 22;
            long j10 = (-65536) + length;
            if (j10 < 0) {
                j10 = 0;
            }
            int iMin = (int) Math.min(1024L, randomAccessFile.length());
            byte[] bArr2 = new byte[iMin];
            byte[] bArr3 = new byte[22];
            loop0: while (true) {
                long jMax = Math.max(3 + (length - ((long) iMin)), j10);
                randomAccessFile.seek(jMax);
                randomAccessFile.readFully(bArr2);
                for (int i11 = iMin - 4; i11 >= 0; i11 -= 4) {
                    byte b11 = bArr2[i11];
                    if (b11 == b10) {
                        i10 = 2;
                    } else if (b11 == 6) {
                        i10 = 3;
                    } else if (b11 != 75) {
                        i10 = b11 != 80 ? -1 : 0;
                    } else {
                        i10 = 1;
                    }
                    if (i10 >= 0 && i11 >= i10 && a(bArr2, i11 - i10) == 1347093766) {
                        randomAccessFile.seek((jMax + ((long) i11)) - ((long) i10));
                        randomAccessFile.readFully(bArr3);
                        bjVarA = a(bArr3);
                        break loop0;
                    }
                    b10 = 5;
                }
                if (jMax == j10) {
                    throw new ZipException(String.format("End Of Central Directory signature not found in APK %s", str));
                }
                length = jMax;
            }
        }
        long jC = bjVarA.f11934a;
        byte[] bytes = str2.getBytes("UTF-8");
        byte[] bArr4 = new byte[46];
        byte[] bArr5 = new byte[str2.length()];
        int i12 = 0;
        while (true) {
            if (i12 >= bjVarA.f11935b) {
                lValueOf = null;
                break;
            }
            randomAccessFile.seek(jC);
            randomAccessFile.readFully(bArr4);
            int iA = a(bArr4, 0);
            if (iA != 1347092738) {
                throw new ZipException(String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", str2, str, Integer.valueOf(i12), Integer.valueOf(bjVarA.f11935b), Integer.valueOf(iA), 1347092738));
            }
            randomAccessFile.seek(jC + 28);
            int iC = c(bArr4, 28);
            if (iC == str2.length()) {
                randomAccessFile.seek(46 + jC);
                randomAccessFile.read(bArr5);
                if (Arrays.equals(bArr5, bytes)) {
                    lValueOf = Long.valueOf(b(bArr4, 42));
                    break;
                }
            }
            jC += (long) (c(bArr4, 32) + c(bArr4, 30) + iC + 46);
            i12++;
        }
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        byte[] bArr6 = new byte[8];
        randomAccessFile.seek(22 + jLongValue);
        randomAccessFile.readFully(bArr6);
        return AssetLocation.a(str, jLongValue + 30 + ((long) c(bArr6, 4)) + ((long) c(bArr6, 6)), b(bArr6, 0));
    }

    public static synchronized a a(Context context) {
        if (f12105a == null) {
            bq bqVar = new bq(null);
            bqVar.a(new n(com.google.android.play.core.splitcompat.p.a(context)));
            f12105a = bqVar.a();
        }
        return f12105a;
    }

    private static bj a(byte[] bArr) {
        int iC = c(bArr, 10);
        b(bArr, 12);
        return new bj(b(bArr, 16), iC);
    }

    public static String a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int i10;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream(it.next());
            do {
                try {
                    i10 = fileInputStream.read(bArr);
                    if (i10 > 0) {
                        messageDigest.update(bArr, 0, i10);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        com.google.android.play.core.internal.ci.a(th, th2);
                    }
                    throw th;
                }
            } while (i10 != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static boolean a(@AssetPackStatus int i10) {
        return i10 == 1 || i10 == 7 || i10 == 2 || i10 == 3;
    }

    public static boolean a(@AssetPackStatus int i10, @AssetPackStatus int i11) {
        if (i10 == 5) {
            if (i11 != 5) {
                return true;
            }
            i10 = 5;
        }
        if (i10 == 6 && i11 != 6 && i11 != 5) {
            return true;
        }
        if (i10 == 4 && i11 != 4) {
            return true;
        }
        if (i10 == 3 && (i11 == 2 || i11 == 7 || i11 == 1 || i11 == 8)) {
            return true;
        }
        if (i10 == 2) {
            return i11 == 1 || i11 == 8;
        }
        return false;
    }

    public static long b(byte[] bArr, int i10) {
        return ((long) ((c(bArr, i10 + 2) << 16) | c(bArr, i10))) & 4294967295L;
    }

    public static boolean b(@AssetPackStatus int i10) {
        return i10 == 5 || i10 == 6 || i10 == 4;
    }

    public static int c(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public static boolean c(@AssetPackStatus int i10) {
        return i10 == 2 || i10 == 7 || i10 == 3;
    }
}
