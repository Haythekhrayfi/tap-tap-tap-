package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqt extends zzbqw {
    private final Map zza;
    private final Context zzb;

    public zzbqt(zzcez zzcezVar, Map map) {
        super(zzcezVar, "storePicture");
        this.zza = map;
        this.zzb = zzcezVar.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbaw(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzp();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(this.zzb);
        builderZzG.setTitle(resourcesZzd != null ? resourcesZzd.getString(R.string.f11711s1) : "Save image");
        builderZzG.setMessage(resourcesZzd != null ? resourcesZzd.getString(R.string.f11712s2) : "Allow Ad to store image in Picture gallery?");
        builderZzG.setPositiveButton(resourcesZzd != null ? resourcesZzd.getString(R.string.f11713s3) : "Accept", new zzbqr(this, str, lastPathSegment));
        builderZzG.setNegativeButton(resourcesZzd != null ? resourcesZzd.getString(R.string.f11714s4) : "Decline", new zzbqs(this));
        builderZzG.create().show();
    }
}
