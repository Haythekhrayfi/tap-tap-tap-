package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class zzgvp implements Iterator, Closeable, zzamx {
    private static final zzamw zza = new zzgvo("eof ");
    private static final zzgvw zzb = zzgvw.zzb(zzgvp.class);
    public zzamt zzc;
    public zzgvq zzd;
    public zzamw zze = null;
    public long zzf = 0;
    public long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzamw zzamwVar = this.zze;
        if (zzamwVar == zza) {
            return false;
        }
        if (zzamwVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzamw) this.zzh.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzamw next() {
        zzamw zzamwVarZzb;
        zzamw zzamwVar = this.zze;
        if (zzamwVar != null && zzamwVar != zza) {
            this.zze = null;
            return zzamwVar;
        }
        zzgvq zzgvqVar = this.zzd;
        if (zzgvqVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzgvqVar) {
                this.zzd.zze(this.zzf);
                zzamwVarZzb = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzb();
            }
            return zzamwVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgvv(this.zzh, this);
    }

    public final void zzf(zzgvq zzgvqVar, long j10, zzamt zzamtVar) throws IOException {
        this.zzd = zzgvqVar;
        this.zzf = zzgvqVar.zzb();
        zzgvqVar.zze(zzgvqVar.zzb() + j10);
        this.zzg = zzgvqVar.zzb();
        this.zzc = zzamtVar;
    }
}
