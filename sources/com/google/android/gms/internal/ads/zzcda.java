package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcda implements zzbij {
    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcca zzccaVar = (zzcca) obj;
        zzcfv zzcfvVarZzq = zzccaVar.zzq();
        if (zzcfvVarZzq == null) {
            try {
                zzcfv zzcfvVar = new zzcfv(zzccaVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzccaVar.zzC(zzcfvVar);
                zzcfvVarZzq = zzcfvVar;
            } catch (NullPointerException e10) {
                e = e10;
                zzbzr.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                zzbzr.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f10 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f11 = Float.parseFloat((String) map.get("currentTime"));
        int i10 = Integer.parseInt((String) map.get("playbackState"));
        int i11 = 0;
        if (i10 >= 0 && i10 <= 3) {
            i11 = i10;
        }
        String str = (String) map.get("aspectRatio");
        float f12 = TextUtils.isEmpty(str) ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : Float.parseFloat(str);
        if (zzbzr.zzm(3)) {
            zzbzr.zze("Video Meta GMSG: currentTime : " + f11 + " , duration : " + f10 + " , isMuted : " + zEquals + " , playbackState : " + i11 + " , aspectRatio : " + str);
        }
        zzcfvVarZzq.zzc(f11, f10, i11, zEquals, f12);
    }
}
