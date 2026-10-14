package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzain {
    private final zzabz zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzain(zzabz zzabzVar) {
        this.zza = zzabzVar;
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        if (this.zzc) {
            int i12 = this.zzf;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.zzf = (i11 - i10) + i12;
            } else {
                this.zzd = ((bArr[i13] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
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
    public final void zzb(long j10, int i10, boolean z10) {
        if (this.zze == 182 && z10 && this.zzb) {
            long j11 = this.zzh;
            if (j11 != -9223372036854775807L) {
                long j12 = j10 - this.zzg;
                this.zza.zzs(j11, this.zzd ? 1 : 0, (int) j12, i10, null);
            }
        }
        if (this.zze != 179) {
            this.zzg = j10;
        }
    }

    public final void zzc(int i10, long j10) {
        boolean z10;
        this.zze = i10;
        this.zzd = false;
        if (i10 == 182) {
            z10 = true;
        } else if (i10 == 179) {
            i10 = 179;
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
        this.zzc = i10 == 182;
        this.zzf = 0;
        this.zzh = j10;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
