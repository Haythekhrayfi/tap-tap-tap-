package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import n.h;
import n.i;
import n.k;
import n.l;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbcn {
    private l zza;
    private i zzb;
    private k zzc;
    private zzbcl zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(zzgws.zza(context));
                }
            }
        }
        return false;
    }

    public final l zza() {
        i iVar = this.zzb;
        l lVar = null;
        if (iVar == null) {
            this.zza = lVar;
        } else if (this.zza == null) {
            h hVar = new h(iVar, null);
            try {
                if (iVar.f33565a.x(hVar)) {
                    lVar = new l(iVar.f33565a, hVar, iVar.f33566b, null);
                }
            } catch (RemoteException unused) {
            }
            this.zza = lVar;
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzgws.zza(activity)) != null) {
            zzgwt zzgwtVar = new zzgwt(this);
            this.zzc = zzgwtVar;
            zzgwtVar.setApplicationContext(activity.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(strZza)) {
                intent.setPackage(strZza);
            }
            activity.bindService(intent, zzgwtVar, 33);
        }
    }

    public final void zzc(i iVar) {
        this.zzb = iVar;
        Objects.requireNonNull(iVar);
        try {
            iVar.f33565a.D(0L);
        } catch (RemoteException unused) {
        }
        zzbcl zzbclVar = this.zzd;
        if (zzbclVar != null) {
            zzbclVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbcl zzbclVar) {
        this.zzd = zzbclVar;
    }

    public final void zzf(Activity activity) {
        k kVar = this.zzc;
        if (kVar == null) {
            return;
        }
        activity.unbindService(kVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
