package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzddn extends zzcrd {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdcc zze;
    private final zzdew zzf;
    private final zzcrx zzg;
    private final zzfjm zzh;
    private final zzcvt zzi;
    private boolean zzj;

    public zzddn(zzcrc zzcrcVar, Context context, @Nullable zzcez zzcezVar, zzdcc zzdccVar, zzdew zzdewVar, zzcrx zzcrxVar, zzfjm zzfjmVar, zzcvt zzcvtVar) {
        super(zzcrcVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcezVar);
        this.zze = zzdccVar;
        this.zzf = zzdewVar;
        this.zzg = zzcrxVar;
        this.zzh = zzfjmVar;
        this.zzi = zzcvtVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcez zzcezVar = (zzcez) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgy)).booleanValue()) {
                if (!this.zzj && zzcezVar != null) {
                    zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddm
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
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
    public final boolean zzc(boolean z10, @Nullable Activity activity) {
        Context context;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzbzr.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaC)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
            } else {
                if (this.zzj) {
                    zzbzr.zzj("The interstitial ad has been showed.");
                    this.zzi.zza(zzfbi.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzj) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    try {
                        this.zzf.zza(z10, context, this.zzi);
                        this.zze.zza();
                        this.zzj = true;
                        return true;
                    } catch (zzdev e10) {
                        this.zzi.zzc(e10);
                    }
                }
            }
        } else {
            if (this.zzj) {
                zzbzr.zzj("The interstitial ad has been showed.");
                this.zzi.zza(zzfbi.zzd(10, null, null));
            }
            context = activity;
            if (!this.zzj) {
                if (activity == null) {
                    context = this.zzc;
                }
                this.zzf.zza(z10, context, this.zzi);
                this.zze.zza();
                this.zzj = true;
                return true;
            }
        }
        return false;
    }
}
