package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgl implements zzge {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzge zzc;
    private zzge zzd;
    private zzge zze;
    private zzge zzf;
    private zzge zzg;
    private zzge zzh;
    private zzge zzi;
    private zzge zzj;
    private zzge zzk;

    public zzgl(Context context, zzge zzgeVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgeVar;
    }

    private final zzge zzg() {
        if (this.zze == null) {
            zzfx zzfxVar = new zzfx(this.zza);
            this.zze = zzfxVar;
            zzh(zzfxVar);
        }
        return this.zze;
    }

    private final void zzh(zzge zzgeVar) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzgeVar.zzf((zzhg) this.zzb.get(i10));
        }
    }

    private static final void zzi(zzge zzgeVar, zzhg zzhgVar) {
        if (zzgeVar != null) {
            zzgeVar.zzf(zzhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        zzge zzgeVar = this.zzk;
        Objects.requireNonNull(zzgeVar);
        return zzgeVar.zza(bArr, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws IOException {
        zzge zzgeVarZzg;
        zzdy.zzf(this.zzk == null);
        String scheme = zzgjVar.zza.getScheme();
        Uri uri = zzgjVar.zza;
        int i10 = zzfj.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Action.FILE_ATTRIBUTE.equals(scheme2)) {
            String path = zzgjVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgu zzguVar = new zzgu();
                    this.zzd = zzguVar;
                    zzh(zzguVar);
                }
                zzgeVarZzg = this.zzd;
            } else {
                zzgeVarZzg = zzg();
            }
        } else if ("asset".equals(scheme)) {
            zzgeVarZzg = zzg();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            if (this.zzf == null) {
                zzgb zzgbVar = new zzgb(this.zza);
                this.zzf = zzgbVar;
                zzh(zzgbVar);
            }
            zzgeVarZzg = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzge zzgeVar = (zzge) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzgeVar;
                    zzh(zzgeVar);
                } catch (ClassNotFoundException unused) {
                    zzer.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            zzgeVarZzg = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzhi zzhiVar = new zzhi(2000);
                this.zzh = zzhiVar;
                zzh(zzhiVar);
            }
            zzgeVarZzg = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzgc zzgcVar = new zzgc();
                this.zzi = zzgcVar;
                zzh(zzgcVar);
            }
            zzgeVarZzg = this.zzi;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.zzj == null) {
                zzhe zzheVar = new zzhe(this.zza);
                this.zzj = zzheVar;
                zzh(zzheVar);
            }
            zzgeVarZzg = this.zzj;
        } else {
            zzgeVarZzg = this.zzc;
        }
        this.zzk = zzgeVarZzg;
        return this.zzk.zzb(zzgjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        zzge zzgeVar = this.zzk;
        if (zzgeVar == null) {
            return null;
        }
        return zzgeVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() throws IOException {
        zzge zzgeVar = this.zzk;
        if (zzgeVar != null) {
            try {
                zzgeVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Map zze() {
        zzge zzgeVar = this.zzk;
        return zzgeVar == null ? Collections.emptyMap() : zzgeVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzf(zzhg zzhgVar) {
        Objects.requireNonNull(zzhgVar);
        this.zzc.zzf(zzhgVar);
        this.zzb.add(zzhgVar);
        zzi(this.zzd, zzhgVar);
        zzi(this.zze, zzhgVar);
        zzi(this.zzf, zzhgVar);
        zzi(this.zzg, zzhgVar);
        zzi(this.zzh, zzhgVar);
        zzi(this.zzi, zzhgVar);
        zzi(this.zzj, zzhgVar);
    }
}
