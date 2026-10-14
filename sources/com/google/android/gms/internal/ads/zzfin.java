package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfin implements zzfhs {
    private static final zzfin zza = new zzfin();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfij();
    private static final Runnable zze = new zzfik();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfig zzk = new zzfig();
    private final zzfhu zzj = new zzfhu();
    private final zzfih zzl = new zzfih(new zzfiq());

    public static zzfin zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfin zzfinVar) {
        zzfinVar.zzg = 0;
        zzfinVar.zzi.clear();
        zzfinVar.zzh = false;
        for (zzfha zzfhaVar : zzfhl.zza().zzb()) {
        }
        zzfinVar.zzm = System.nanoTime();
        zzfinVar.zzk.zzi();
        long jNanoTime = System.nanoTime();
        zzfht zzfhtVarZza = zzfinVar.zzj.zza();
        if (zzfinVar.zzk.zze().size() > 0) {
            for (String str : zzfinVar.zzk.zze()) {
                JSONObject jSONObjectZza = zzfib.zza(0, 0, 0, 0);
                View viewZza = zzfinVar.zzk.zza(str);
                zzfht zzfhtVarZzb = zzfinVar.zzj.zzb();
                String strZzc = zzfinVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfhtVarZzb.zza(viewZza);
                    zzfib.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e10) {
                        zzfic.zza("Error with setting not visible reason", e10);
                    }
                    zzfib.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfib.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfinVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzfinVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzfib.zza(0, 0, 0, 0);
            zzfinVar.zzk(null, zzfhtVarZza, jSONObjectZza3, 1, false);
            zzfib.zzf(jSONObjectZza3);
            zzfinVar.zzl.zzd(jSONObjectZza3, zzfinVar.zzk.zzf(), jNanoTime);
        } else {
            zzfinVar.zzl.zzb();
        }
        zzfinVar.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzfinVar.zzm;
        if (zzfinVar.zzf.size() > 0) {
            for (zzfim zzfimVar : zzfinVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfimVar.zzb();
                if (zzfimVar instanceof zzfil) {
                    ((zzfil) zzfimVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfht zzfhtVar, JSONObject jSONObject, int i10, boolean z10) {
        zzfhtVar.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zza(View view, zzfht zzfhtVar, JSONObject jSONObject, boolean z10) {
        int iZzk;
        boolean z11;
        if (zzfie.zzb(view) != null || (iZzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfhtVar.zza(view);
        zzfib.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            zzfib.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e10) {
                zzfic.zza("Error with setting not visible reason", e10);
            }
            this.zzk.zzh();
        } else {
            zzfif zzfifVarZzb = this.zzk.zzb(view);
            if (zzfifVarZzb != null) {
                zzfhn zzfhnVarZza = zzfifVarZzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = zzfifVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) arrayListZzb.get(i10));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfhnVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfhnVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzfhnVarZza.zzc());
                } catch (JSONException e11) {
                    zzfic.zza("Error with setting friendly obstruction", e11);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            zzk(view, zzfhtVar, jSONObjectZza, iZzk, z10 || z11);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfii(this));
    }
}
