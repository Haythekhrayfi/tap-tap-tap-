package com.google.android.gms.internal.ads;

import android.support.v4.media.j;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import n1.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgoe implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgoe zzb = new zzgoa(zzgpw.zzd);
    private static final zzgod zzd;
    private int zzc = 0;

    static {
        int i10 = zzgnp.zza;
        zzd = new zzgod(null);
        zza = new zzgnv();
    }

    private static zzgoe zzc(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (zzgoe) it.next();
        }
        int i11 = i10 >>> 1;
        zzgoe zzgoeVarZzc = zzc(it, i11);
        zzgoe zzgoeVarZzc2 = zzc(it, i10 - i11);
        if (Integer.MAX_VALUE - zzgoeVarZzc.zzd() >= zzgoeVarZzc2.zzd()) {
            return zzgro.zzC(zzgoeVarZzc, zzgoeVarZzc2);
        }
        throw new IllegalArgumentException(c.a("ByteString would be too long: ", zzgoeVarZzc.zzd(), "+", zzgoeVarZzc2.zzd()));
    }

    public static int zzq(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(j.a("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(c.a("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(c.a("End index: ", i11, " >= ", i12));
    }

    public static zzgob zzt() {
        return new zzgob(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgoe zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgoe zzv(byte[] bArr, int i10, int i11) {
        zzq(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgoa(bArr2);
    }

    public static zzgoe zzw(String str) {
        return new zzgoa(str.getBytes(zzgpw.zzb));
    }

    public static void zzy(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(c.a("Index > length: ", i10, ", ", i11));
            }
            throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.a("Index < 0: ", i10));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zzc;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zzc = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgse.zza(this) : zzgse.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgpw.zzd;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i10, int i11, int i12);

    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzgoe zzk(int i10, int i11);

    public abstract zzgom zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgnt zzgntVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgny iterator() {
        return new zzgnu(this);
    }

    public final String zzx(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i10, int i11, int i12) {
        zzq(0, i12, zzd());
        zzq(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }
}
