package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzftz extends zzfsh {
    public final transient Object zza;

    public zzftz(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfsh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfsh, com.google.android.gms.internal.ads.zzfrx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfsk(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j.a("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zza(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh, com.google.android.gms.internal.ads.zzfrx
    public final zzfsc zzd() {
        return zzfsc.zzm(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsh, com.google.android.gms.internal.ads.zzfrx
    /* JADX INFO: renamed from: zze */
    public final zzfuc iterator() {
        return new zzfsk(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final boolean zzf() {
        throw null;
    }
}
