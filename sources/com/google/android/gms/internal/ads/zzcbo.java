package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.o;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzcbo extends FrameLayout implements zzcbf {
    public final zzccc zza;
    private final zzcca zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbce zze;
    private final long zzf;
    private final zzcbg zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbo(Context context, zzcca zzccaVar, int i10, boolean z10, zzbce zzbceVar, zzcbz zzcbzVar) {
        super(context);
        this.zzb = zzccaVar;
        this.zze = zzbceVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzccaVar.zzj());
        zzcbh zzcbhVar = zzccaVar.zzj().zza;
        zzcbg zzccsVar = i10 == 2 ? new zzccs(context, new zzccb(context, zzccaVar.zzn(), zzccaVar.zzbm(), zzbceVar, zzccaVar.zzk()), zzccaVar, z10, zzcbh.zza(zzccaVar), zzcbzVar) : new zzcbe(context, zzccaVar, z10, zzcbh.zza(zzccaVar), zzcbzVar, new zzccb(context, zzccaVar.zzn(), zzccaVar.zzbm(), zzbceVar, zzccaVar.zzk()));
        this.zzg = zzccsVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzccsVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzC)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzI)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzE)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbceVar != null) {
            zzbceVar.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzccc(this);
        zzccsVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", map);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcbg zzcbgVar = this.zzg;
            if (zzcbgVar != null) {
                zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbgVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        zzccc zzcccVar = this.zza;
        if (z10) {
            zzcccVar.zzb();
        } else {
            zzcccVar.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbf
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbn(this, z10));
    }

    public final void zzA(int i10) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzz(i10);
    }

    public final void zzB(int i10) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzA(i10);
    }

    public final void zzC(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzB(i10);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sbA = o.a("Set video bounds to x:", i10, ";y:", i11, ";w:");
            sbA.append(i12);
            sbA.append(";h:");
            sbA.append(i13);
            com.google.android.gms.ads.internal.util.zze.zza(sbA.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f10) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzb.zze(f10);
        zzcbgVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar != null) {
            zzcbgVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzb.zzd(false);
        zzcbgVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbL)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbL)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z10 = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzf() {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar != null && this.zzm == 0) {
            zzK("canplaythrough", "duration", String.valueOf(zzcbgVar.zzc() / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbl(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbm(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbbe zzbbeVar = zzbbm.zzH;
            int iMax = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.zzf) {
            zzbzr.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbce zzbceVar = this.zze;
            if (zzbceVar != null) {
                zzbceVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar != null) {
            return zzcbgVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        TextView textView = new TextView(zzcbgVar.getContext());
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        textView.setText(String.valueOf(resourcesZzd == null ? "AdMob - " : resourcesZzd.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar != null) {
            zzcbgVar.zzt();
        }
        zzJ();
    }

    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzq(boolean z10) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzb.zzd(true);
        zzcbgVar.zzn();
    }

    public final void zzt() {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        long jZza = zzcbgVar.zza();
        if (this.zzl == jZza || jZza <= 0) {
            return;
        }
        float f10 = jZza / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = jZza;
    }

    public final void zzu() {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzo();
    }

    public final void zzv() {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzp();
    }

    public final void zzw(int i10) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzq(i10);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i10) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzx(i10);
    }

    public final void zzz(int i10) {
        zzcbg zzcbgVar = this.zzg;
        if (zzcbgVar == null) {
            return;
        }
        zzcbgVar.zzy(i10);
    }
}
