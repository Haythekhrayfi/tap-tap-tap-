package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.activity.k;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzdsx;
import com.google.android.gms.internal.ads.zzfwn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zzas {
    private final Context zza;
    private final zzdsx zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzas(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzk = com.google.android.gms.ads.internal.zzt.zzt().zza();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzs().zza();
    }

    public zzas(Context context, String str) {
        this(context);
        this.zzc = str;
    }

    private final void zzs(Context context) {
        final int i10;
        ArrayList arrayList = new ArrayList();
        int iZzu = zzu(arrayList, "None", true);
        final int iZzu2 = zzu(arrayList, "Shake", true);
        final int iZzu3 = zzu(arrayList, "Flick", true);
        zzdst zzdstVar = zzdst.NONE;
        int iOrdinal = this.zzb.zza().ordinal();
        if (iOrdinal != 1) {
            i10 = iOrdinal != 2 ? iZzu : iZzu3;
        } else {
            i10 = iZzu2;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = zzs.zzG(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builderZzG.setTitle("Setup gesture");
        builderZzG.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        builderZzG.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.zza.zzr();
            }
        });
        builderZzG.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.zza.zzh(atomicInteger, i10, iZzu2, iZzu3, dialogInterface, i11);
            }
        });
        builderZzG.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzG.create().show();
    }

    private final boolean zzt(float f10, float f11, float f12, float f13) {
        return Math.abs(this.zzi.x - f10) < ((float) this.zzh) && Math.abs(this.zzi.y - f11) < ((float) this.zzh) && Math.abs(this.zzj.x - f12) < ((float) this.zzh) && Math.abs(this.zzj.y - f13) < ((float) this.zzh);
    }

    private static final int zzu(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.zzc);
        sb2.append(",DebugSignal: ");
        sb2.append(this.zzf);
        sb2.append(",AFMA Version: ");
        sb2.append(this.zze);
        sb2.append(",Ad Unit ID: ");
        return k.a(sb2, this.zzd, "}");
    }

    public final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzb() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzc(zzfwn zzfwnVar) {
        if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
            zzfwnVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.zza, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zzd(zzfwn zzfwnVar) {
        if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
            zzfwnVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.zza, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zze() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.zza);
    }

    public final /* synthetic */ void zzf() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.zza);
    }

    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    public final /* synthetic */ void zzh(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        zzdsx zzdsxVar;
        zzdst zzdstVar;
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                zzdsxVar = this.zzb;
                zzdstVar = zzdst.SHAKE;
            } else if (atomicInteger.get() == i12) {
                zzdsxVar = this.zzb;
                zzdstVar = zzdst.FLICK;
            } else {
                zzdsxVar = this.zzb;
                zzdstVar = zzdst.NONE;
            }
            zzdsxVar.zzk(zzdstVar);
        }
        zzr();
    }

    public final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzP(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void zzj(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                zzbzr.zze("Debug mode [Creative Preview] selected.");
                zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzac
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzl();
                    }
                });
                return;
            }
            if (i15 == i12) {
                zzbzr.zze("Debug mode [Troubleshooting] selected.");
                zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzk();
                    }
                });
                return;
            }
            if (i15 == i13) {
                final zzfwn zzfwnVar = zzcae.zze;
                zzfwn zzfwnVar2 = zzcae.zza;
                if (this.zzb.zzo()) {
                    zzfwnVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze();
                        }
                    });
                    return;
                } else {
                    zzfwnVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzao
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd(zzfwnVar);
                        }
                    });
                    return;
                }
            }
            if (i15 == i14) {
                final zzfwn zzfwnVar3 = zzcae.zze;
                zzfwn zzfwnVar4 = zzcae.zza;
                if (this.zzb.zzo()) {
                    zzfwnVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zza();
                        }
                    });
                    return;
                } else {
                    zzfwnVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc(zzfwnVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.zza instanceof Activity)) {
            zzbzr.zzi("Can not create dialog without Activity Context");
            return;
        }
        String str = this.zzc;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb2 = new StringBuilder();
            com.google.android.gms.ads.internal.zzt.zzp();
            Map mapZzL = zzs.zzL(uriBuild);
            for (String str3 : mapZzL.keySet()) {
                sb2.append(str3);
                sb2.append(" = ");
                sb2.append((String) mapZzL.get(str3));
                sb2.append("\n\n");
            }
            String strTrim = sb2.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = zzs.zzG(this.zza);
        builderZzG.setMessage(str2);
        builderZzG.setTitle("Ad Information");
        builderZzG.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
                this.zza.zzi(str2, dialogInterface2, i16);
            }
        });
        builderZzG.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzae
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
            }
        });
        builderZzG.create().show();
    }

    public final /* synthetic */ void zzk() {
        zzaw zzawVarZzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zZzm = zzawVarZzs.zzm();
        zzawVarZzs.zzh(zzawVarZzs.zzj(context, str, str2));
        if (!zzawVarZzs.zzm()) {
            zzawVarZzs.zzd(context, str, str2);
            return;
        }
        if (!zZzm && !TextUtils.isEmpty(str3)) {
            zzawVarZzs.zze(context, str2, str3, str);
        }
        zzbzr.zze("Device is linked for debug signals.");
        zzawVarZzs.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final /* synthetic */ void zzl() {
        zzaw zzawVarZzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzawVarZzs.zzk(context, str, str2)) {
            zzawVarZzs.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zzawVarZzs.zza)) {
            zzbzr.zze("Creative is not pushed for this device.");
            zzawVarZzs.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzawVarZzs.zza)) {
            zzbzr.zze("The app is not linked for creative preview.");
            zzawVarZzs.zzd(context, str, str2);
        } else if ("0".equals(zzawVarZzs.zza)) {
            zzbzr.zze("Device is linked for in app preview.");
            zzawVarZzs.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.zzg;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzet)).longValue());
                return;
            }
            return;
        }
        if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z10 |= !zzt(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            if (!(this.zza instanceof Activity)) {
                zzbzr.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzs().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iZzu = zzu(arrayList, "Ad information", true);
            final int iZzu2 = zzu(arrayList, str, true);
            final int iZzu3 = zzu(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue();
            final int iZzu4 = zzu(arrayList, "Open ad inspector", zBooleanValue);
            final int iZzu5 = zzu(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder builderZzG = zzs.zzG(this.zza);
            builderZzG.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.zza.zzj(iZzu, iZzu2, iZzu3, iZzu4, iZzu5, dialogInterface, i10);
                }
            });
            builderZzG.create().show();
        } catch (WindowManager.BadTokenException e10) {
            zze.zzb("", e10);
        }
    }
}
