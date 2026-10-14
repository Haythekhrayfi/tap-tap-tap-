package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcov extends zzcrd {
    private final zzcez zzc;
    private final int zzd;
    private final Context zze;
    private final zzcok zzf;
    private final zzdew zzg;
    private final zzdcc zzh;
    private final zzcvt zzi;
    private final boolean zzj;
    private boolean zzk;

    public zzcov(zzcrc zzcrcVar, Context context, zzcez zzcezVar, int i10, zzcok zzcokVar, zzdew zzdewVar, zzdcc zzdccVar, zzcvt zzcvtVar) {
        super(zzcrcVar);
        this.zzk = false;
        this.zzc = zzcezVar;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzcokVar;
        this.zzg = zzdewVar;
        this.zzh = zzdccVar;
        this.zzi = zzcvtVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfa)).booleanValue();
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcrd
    public final void zzb() {
        super.zzb();
        zzcez zzcezVar = this.zzc;
        if (zzcezVar != null) {
            zzcezVar.destroy();
        }
    }

    public final void zzc(zzavn zzavnVar) {
        zzcez zzcezVar = this.zzc;
        if (zzcezVar != null) {
            zzcezVar.zzah(zzavnVar);
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
    public final void zzd(Activity activity, zzawa zzawaVar, boolean z10) throws RemoteException {
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(context)) {
                zzbzr.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaC)).booleanValue()) {
                    new zzfjm(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (this.zzk) {
            zzbzr.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzfbi.zzd(10, null, null));
        }
        if (this.zzk) {
            return;
        }
        try {
            this.zzg.zza(z10, context, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzk = true;
        } catch (zzdev e10) {
            this.zzi.zzc(e10);
        }
    }

    public final void zze(long j10, int i10) {
        this.zzf.zza(j10, i10);
    }
}
