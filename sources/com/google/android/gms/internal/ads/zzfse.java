package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfse {
    public Object[] zza;
    public int zzb;
    public zzfsd zzc;

    public zzfse() {
        this(4);
    }

    public zzfse(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzfrw.zze(length, i11));
        }
    }

    public final zzfse zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfqz.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfse zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfsf zzc() {
        zzfsd zzfsdVar = this.zzc;
        if (zzfsdVar != null) {
            throw zzfsdVar.zza();
        }
        zzftr zzftrVarZzj = zzftr.zzj(this.zzb, this.zza, this);
        zzfsd zzfsdVar2 = this.zzc;
        if (zzfsdVar2 == null) {
            return zzftrVarZzj;
        }
        throw zzfsdVar2.zza();
    }
}
