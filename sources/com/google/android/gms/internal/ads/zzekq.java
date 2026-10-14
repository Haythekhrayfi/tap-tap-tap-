package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekq implements zzeqx {
    public final Context zza;
    public final com.google.android.gms.ads.internal.client.zzq zzb;
    public final List zzc;

    public zzekq(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, List list) {
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzbdj.zza.zze()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            com.google.android.gms.ads.internal.zzt.zzp();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    className = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", className);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.zzb.zze);
            bundle3.putInt("height", this.zzb.zzb);
            bundle2.putBundle("size", bundle3);
            if (!this.zzc.isEmpty()) {
                List list = this.zzc;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
