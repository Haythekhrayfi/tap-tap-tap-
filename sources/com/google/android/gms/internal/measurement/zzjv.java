package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzjv {
    private static final zzjv zzb = new zzjv(true);
    public final zzmj zza = new zzlz(16);
    private boolean zzc;
    private boolean zzd;

    private zzjv() {
    }

    private zzjv(boolean z10) {
        zzb();
        zzb();
    }

    public static zzjv zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzd(zzju zzjuVar, Object obj) {
        boolean z10;
        zzjuVar.zzb();
        zzkm.zze(obj);
        zznd zzndVar = zznd.zza;
        zzne zzneVar = zzne.INT;
        switch (r0.zza()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzjd) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzkg)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzll) || (obj instanceof zzkq)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjv zzjvVar = new zzjv();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzjvVar.zzc((zzju) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzjvVar.zzc((zzju) entry.getKey(), entry.getValue());
        }
        zzjvVar.zzd = this.zzd;
        return zzjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjv) {
            return this.zza.equals(((zzjv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzju zzjuVar, Object obj) {
        if (!zzjuVar.zzc()) {
            zzd(zzjuVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzd(zzjuVar, arrayList.get(i10));
            }
            obj = arrayList;
        }
        if (obj instanceof zzkq) {
            this.zzd = true;
        }
        this.zza.put(zzjuVar, obj);
    }
}
