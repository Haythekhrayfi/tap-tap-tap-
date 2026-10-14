package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmm extends zzcrd {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdew zze;
    private final zzdcc zzf;
    private final zzcvt zzg;
    private final zzcxa zzh;
    private final zzcrx zzi;
    private final zzbvk zzj;
    private final zzfjm zzk;
    private final zzfab zzl;
    private boolean zzm;

    public zzdmm(zzcrc zzcrcVar, Context context, zzcez zzcezVar, zzdew zzdewVar, zzdcc zzdccVar, zzcvt zzcvtVar, zzcxa zzcxaVar, zzcrx zzcrxVar, zzezn zzeznVar, zzfjm zzfjmVar, zzfab zzfabVar) {
        super(zzcrcVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdewVar;
        this.zzd = new WeakReference(zzcezVar);
        this.zzf = zzdccVar;
        this.zzg = zzcvtVar;
        this.zzh = zzcxaVar;
        this.zzi = zzcrxVar;
        this.zzk = zzfjmVar;
        zzbvg zzbvgVar = zzeznVar.zzm;
        this.zzj = new zzbwe(zzbvgVar != null ? zzbvgVar.zza : "", zzbvgVar != null ? zzbvgVar.zzb : 1);
        this.zzl = zzfabVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcez zzcezVar = (zzcez) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgy)).booleanValue()) {
                if (!this.zzm && zzcezVar != null) {
                    zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdml
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcezVar.destroy();
                        }
                    });
                }
            } else if (zzcezVar != null) {
                zzcezVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbvk zzc() {
        return this.zzj;
    }

    public final zzfab zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcez zzcezVar = (zzcez) this.zzd.get();
        return (zzcezVar == null || zzcezVar.zzaB()) ? false : true;
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
    public final boolean zzh(boolean z10, Activity activity) {
        Context context;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzbzr.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaC)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzbzr.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfbi.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            this.zze.zza(z10, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdev e10) {
            this.zzg.zzc(e10);
            return false;
        }
    }
}
