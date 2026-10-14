package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyh {
    private final Class zza;
    private zzfyi zzd;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zzghn zze = zzghn.zza;

    public /* synthetic */ zzfyh(Class cls, zzfyg zzfygVar) {
        this.zza = cls;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    private final zzfyh zze(@Nullable Object obj, @Nullable Object obj2, zzgkw zzgkwVar, boolean z10) throws GeneralSecurityException {
        zzfyi zzfyiVar;
        ByteBuffer byteBufferPut;
        byte[] bArrArray;
        ConcurrentMap concurrentMap;
        zzfyk zzfykVar;
        List list;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (zzgkwVar.zzk() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer numValueOf = Integer.valueOf(zzgkwVar.zza());
        if (zzgkwVar.zzf() == zzglq.RAW) {
            numValueOf = null;
        }
        zzfxn zzfxnVarZza = zzgeg.zzc().zza(zzgfa.zza(zzgkwVar.zzc().zzg(), zzgkwVar.zzc().zzf(), zzgkwVar.zzc().zzc(), zzgkwVar.zzf(), numValueOf), zzfyq.zza());
        int iOrdinal = zzgkwVar.zzf().ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    bArrArray = zzfxm.zza;
                } else if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
                zzfyiVar = new zzfyi(obj, obj2, bArrArray, zzgkwVar.zzk(), zzgkwVar.zzf(), zzgkwVar.zza(), zzgkwVar.zzc().zzg(), zzfxnVarZza);
                concurrentMap = this.zzb;
                List list2 = this.zzc;
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzfyiVar);
                zzfykVar = new zzfyk(zzfyiVar.zzg(), null);
                list = (List) concurrentMap.put(zzfykVar, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(zzfyiVar);
                    concurrentMap.put(zzfykVar, Collections.unmodifiableList(arrayList2));
                }
                list2.add(zzfyiVar);
                if (z10) {
                    if (this.zzd == null) {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                    this.zzd = zzfyiVar;
                }
                return this;
            }
            byteBufferPut = ByteBuffer.allocate(5).put((byte) 0);
        } else {
            byteBufferPut = ByteBuffer.allocate(5).put((byte) 1);
        }
        bArrArray = byteBufferPut.putInt(zzgkwVar.zza()).array();
        zzfyiVar = new zzfyi(obj, obj2, bArrArray, zzgkwVar.zzk(), zzgkwVar.zzf(), zzgkwVar.zza(), zzgkwVar.zzc().zzg(), zzfxnVarZza);
        concurrentMap = this.zzb;
        List list3 = this.zzc;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(zzfyiVar);
        zzfykVar = new zzfyk(zzfyiVar.zzg(), null);
        list = (List) concurrentMap.put(zzfykVar, Collections.unmodifiableList(arrayList3));
        if (list != null) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(list);
            arrayList4.add(zzfyiVar);
            concurrentMap.put(zzfykVar, Collections.unmodifiableList(arrayList4));
        }
        list3.add(zzfyiVar);
        if (z10) {
            if (this.zzd == null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzfyiVar;
        }
        return this;
    }

    public final zzfyh zza(@Nullable Object obj, @Nullable Object obj2, zzgkw zzgkwVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgkwVar, false);
        return this;
    }

    public final zzfyh zzb(@Nullable Object obj, @Nullable Object obj2, zzgkw zzgkwVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgkwVar, true);
        return this;
    }

    public final zzfyh zzc(zzghn zzghnVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzghnVar;
        return this;
    }

    public final zzfym zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzfym zzfymVar = new zzfym(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzfymVar;
    }
}
