package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.j;
import androidx.activity.result.c;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzalk implements Comparable {
    private final zzalv zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzalo zzf;
    private Integer zzg;
    private zzaln zzh;
    private boolean zzi;
    private zzakt zzj;
    private zzalj zzk;
    private final zzaky zzl;

    public zzalk(int i10, String str, zzalo zzaloVar) {
        Uri uri;
        String host;
        this.zza = zzalv.zza ? new zzalv() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzaloVar;
        this.zzl = new zzaky();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzalk) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        String str = this.zzc;
        Integer num = this.zzg;
        StringBuilder sbA = c.a("[ ] ", str, " ");
        sbA.append("0x".concat(strValueOf));
        sbA.append(" NORMAL ");
        sbA.append(num);
        return sbA.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzakt zzd() {
        return this.zzj;
    }

    public final zzalk zze(zzakt zzaktVar) {
        this.zzj = zzaktVar;
        return this;
    }

    public final zzalk zzf(zzaln zzalnVar) {
        this.zzh = zzalnVar;
        return this;
    }

    public final zzalk zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public abstract zzalq zzh(zzalg zzalgVar);

    public final String zzj() {
        String str = this.zzc;
        return this.zzb != 0 ? j.a(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaks {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzalv.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzalt zzaltVar) {
        zzalo zzaloVar;
        synchronized (this.zze) {
            zzaloVar = this.zzf;
        }
        zzaloVar.zza(zzaltVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzaln zzalnVar = this.zzh;
        if (zzalnVar != null) {
            zzalnVar.zzb(this);
        }
        if (zzalv.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzali(this, str, id2));
            } else {
                this.zza.zza(str, id2);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzalj zzaljVar;
        synchronized (this.zze) {
            zzaljVar = this.zzk;
        }
        if (zzaljVar != null) {
            zzaljVar.zza(this);
        }
    }

    public final void zzs(zzalq zzalqVar) {
        zzalj zzaljVar;
        synchronized (this.zze) {
            zzaljVar = this.zzk;
        }
        if (zzaljVar != null) {
            zzaljVar.zzb(this, zzalqVar);
        }
    }

    public final void zzt(int i10) {
        zzaln zzalnVar = this.zzh;
        if (zzalnVar != null) {
            zzalnVar.zzc(this, i10);
        }
    }

    public final void zzu(zzalj zzaljVar) {
        synchronized (this.zze) {
            this.zzk = zzaljVar;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaks {
        return null;
    }

    public final zzaky zzy() {
        return this.zzl;
    }
}
