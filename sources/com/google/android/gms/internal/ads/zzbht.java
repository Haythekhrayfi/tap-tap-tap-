package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbht implements zzbij {
    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i10;
        String str;
        zzcez zzcezVar = (zzcez) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            zzfnk zzfnkVarZzj = zzfnl.zzj();
            zzfnkVarZzj.zzb((String) map.get("appId"));
            zzfnkVarZzj.zzh(zzcezVar.getWidth());
            zzfnkVarZzj.zzg(zzcezVar.zzF().getWindowToken());
            if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                i10 = Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY"));
            } else {
                i10 = 81;
            }
            zzfnkVarZzj.zzd(i10);
            zzfnkVarZzj.zze(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                zzfnkVarZzj.zza((String) map.get("enifd"));
            }
            try {
                com.google.android.gms.ads.internal.zzt.zzj().zzj(zzcezVar, zzfnkVarZzj.zzi());
                return;
            } catch (NullPointerException e10) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str);
    }
}
