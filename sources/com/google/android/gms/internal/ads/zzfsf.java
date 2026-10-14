package com.google.android.gms.internal.ads;

import ch.qos.logback.core.util.FileSize;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfsf implements Map, Serializable {

    @CheckForNull
    private transient zzfsh zza;

    @CheckForNull
    private transient zzfsh zzb;

    @CheckForNull
    private transient zzfrx zzc;

    public static zzfsf zzc(Map map) {
        Set setEntrySet = map.entrySet();
        zzfse zzfseVar = new zzfse(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzfseVar.zzb(setEntrySet);
        return zzfseVar.zzc();
    }

    public static zzfsf zzd() {
        return zzftr.zza;
    }

    public static zzfsf zze(Object obj, Object obj2) {
        zzfqz.zzb("dialog_not_shown_reason", obj2);
        return zzftr.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfsx.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfty.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfqz.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, FileSize.GB_COEFFICIENT));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public abstract zzfrx zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfrx values() {
        zzfrx zzfrxVar = this.zzc;
        if (zzfrxVar != null) {
            return zzfrxVar;
        }
        zzfrx zzfrxVarZza = zza();
        this.zzc = zzfrxVarZza;
        return zzfrxVarZza;
    }

    public abstract zzfsh zzf();

    public abstract zzfsh zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfsh entrySet() {
        zzfsh zzfshVar = this.zza;
        if (zzfshVar != null) {
            return zzfshVar;
        }
        zzfsh zzfshVarZzf = zzf();
        this.zza = zzfshVarZzf;
        return zzfshVarZzf;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfsh keySet() {
        zzfsh zzfshVar = this.zzb;
        if (zzfshVar != null) {
            return zzfshVar;
        }
        zzfsh zzfshVarZzg = zzg();
        this.zzb = zzfshVarZzg;
        return zzfshVarZzg;
    }
}
