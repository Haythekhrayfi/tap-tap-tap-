package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaba {
    public static int zza(zzaax zzaaxVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iZzb = zzaaxVar.zzb(bArr, i10 + i12, i11 - i12);
            if (iZzb == -1) {
                break;
            }
            i12 += iZzb;
        }
        return i12;
    }

    @Pure
    public static void zzb(boolean z10, String str) throws zzcd {
        if (!z10) {
            throw zzcd.zza(str, null);
        }
    }

    public static boolean zzc(zzaax zzaaxVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return zzaaxVar.zzm(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean zzd(zzaax zzaaxVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            ((zzaam) zzaaxVar).zzn(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzaax zzaaxVar, int i10) throws IOException {
        try {
            ((zzaam) zzaaxVar).zzo(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
