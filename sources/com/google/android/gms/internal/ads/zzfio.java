package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfio extends zzfip {
    public final HashSet zza;
    public final JSONObject zzb;
    public final long zzc;

    public zzfio(zzfih zzfihVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfihVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
