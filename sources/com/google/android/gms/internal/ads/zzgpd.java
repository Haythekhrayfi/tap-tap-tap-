package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpd {
    private static final zzgpd zzb = new zzgpd(true);
    public final zzgsc zza = new zzgrs(16);
    private boolean zzc;
    private boolean zzd;

    private zzgpd() {
    }

    private zzgpd(boolean z10) {
        zzb();
        zzb();
    }

    public static zzgpd zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzd(zzgpc zzgpcVar, Object obj) {
        boolean z10;
        zzgpcVar.zzb();
        byte[] bArr = zzgpw.zzd;
        Objects.requireNonNull(obj);
        zzgsw zzgswVar = zzgsw.zza;
        zzgsx zzgsxVar = zzgsx.INT;
        switch (r0.zza()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzgoe) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzgpo)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzgqw) || (obj instanceof zzgqb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgpcVar.zza()), zzgpcVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgpd zzgpdVar = new zzgpd();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzgpdVar.zzc((zzgpc) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgpdVar.zzc((zzgpc) entry.getKey(), entry.getValue());
        }
        zzgpdVar.zzd = this.zzd;
        return zzgpdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgpd) {
            return this.zza.equals(((zzgpd) obj).zza);
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
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            if (entryZzg.getValue() instanceof zzgpm) {
                ((zzgpm) entryZzg.getValue()).zzaS();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzgpc zzgpcVar, Object obj) {
        if (!zzgpcVar.zzc()) {
            zzd(zzgpcVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzd(zzgpcVar, arrayList.get(i10));
            }
            obj = arrayList;
        }
        if (obj instanceof zzgqb) {
            this.zzd = true;
        }
        this.zza.put(zzgpcVar, obj);
    }
}
