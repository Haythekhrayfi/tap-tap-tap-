package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
final class zzair {
    private final zzabz zza;
    private final zzfv zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzaiq zzi = new zzaiq(null);
    private final zzaiq zzj = new zzaiq(null);
    private boolean zzk = false;

    public zzair(zzabz zzabzVar, boolean z10, boolean z11) {
        this.zza = zzabzVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzfv(bArr, 0, 0);
    }

    public final void zza(zzfs zzfsVar) {
        this.zzc.append(zzfsVar.zza, zzfsVar);
    }

    public final void zzb(zzft zzftVar) {
        this.zzb.append(zzftVar.zzd, zzftVar);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j10, int i10, long j11) {
        this.zzf = i10;
        this.zzh = j11;
        this.zzg = j10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zze(long j10, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (this.zzf == 9) {
            if (z10 && this.zzk) {
                long j11 = this.zzg;
                int i11 = i10 + ((int) (j10 - j11));
                long j12 = this.zzm;
                if (j12 != -9223372036854775807L) {
                    this.zza.zzs(j12, this.zzn ? 1 : 0, (int) (j11 - this.zzl), i11, null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z13 = this.zzn;
        int i12 = this.zzf;
        if (i12 == 5 || (z11 && i12 == 1)) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        this.zzn = z14;
        return z14;
    }
}
