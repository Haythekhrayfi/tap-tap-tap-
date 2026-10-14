package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeap {
    private final zzawz zza;
    private final Context zzb;
    private final zzdzt zzc;
    private final zzbzx zzd;
    private final String zze;
    private final zzfev zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzeap(Context context, zzbzx zzbzxVar, zzawz zzawzVar, zzdzt zzdztVar, String str, zzfev zzfevVar) {
        this.zzb = context;
        this.zzd = zzbzxVar;
        this.zza = zzawzVar;
        this.zzc = zzdztVar;
        this.zze = str;
        this.zzf = zzfevVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jZze = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zzazi zzaziVar = (zzazi) arrayList.get(i10);
            if (zzaziVar.zzw() == 2 && zzaziVar.zze() > jZze) {
                jZze = zzaziVar.zze();
            }
        }
        if (jZze != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jZze));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final /* synthetic */ Void zza(boolean z10, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzig)).booleanValue()) {
            zzfeu zzfeuVarZzb = zzfeu.zzb("oa_upload");
            zzfeuVarZzb.zza("oa_failed_reqs", String.valueOf(zzeai.zza(sQLiteDatabase, 0)));
            zzfeuVarZzb.zza("oa_total_reqs", String.valueOf(zzeai.zza(sQLiteDatabase, 1)));
            zzfeuVarZzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzfeuVarZzb.zza("oa_last_successful_time", String.valueOf(zzeai.zzb(sQLiteDatabase, 2)));
            zzfeuVarZzb.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzfeuVarZzb);
            ArrayList arrayListZzc = zzeai.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, arrayListZzc);
            int size = arrayListZzc.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzazi zzaziVar = (zzazi) arrayListZzc.get(i10);
                zzfeu zzfeuVarZzb2 = zzfeu.zzb("oa_signals");
                zzfeuVarZzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
                zzazd zzazdVarZzf = zzaziVar.zzf();
                String strValueOf = zzazdVarZzf.zzf() ? String.valueOf(zzazdVarZzf.zzh() - 1) : "-1";
                String string = zzfsq.zzb(zzaziVar.zzk(), new zzfov() { // from class: com.google.android.gms.internal.ads.zzeao
                    @Override // com.google.android.gms.internal.ads.zzfov
                    public final Object apply(Object obj) {
                        return ((zzaxx) obj).name();
                    }
                }).toString();
                zzfeuVarZzb2.zza("oa_sig_ts", String.valueOf(zzaziVar.zze()));
                zzfeuVarZzb2.zza("oa_sig_status", String.valueOf(zzaziVar.zzw() - 1));
                zzfeuVarZzb2.zza("oa_sig_resp_lat", String.valueOf(zzaziVar.zzd()));
                zzfeuVarZzb2.zza("oa_sig_render_lat", String.valueOf(zzaziVar.zzc()));
                zzfeuVarZzb2.zza("oa_sig_formats", string);
                zzfeuVarZzb2.zza("oa_sig_nw_type", strValueOf);
                zzfeuVarZzb2.zza("oa_sig_wifi", String.valueOf(zzaziVar.zzx() - 1));
                zzfeuVarZzb2.zza("oa_sig_airplane", String.valueOf(zzaziVar.zzt() - 1));
                zzfeuVarZzb2.zza("oa_sig_data", String.valueOf(zzaziVar.zzu() - 1));
                zzfeuVarZzb2.zza("oa_sig_nw_resp", String.valueOf(zzaziVar.zza()));
                zzfeuVarZzb2.zza("oa_sig_offline", String.valueOf(zzaziVar.zzv() - 1));
                zzfeuVarZzb2.zza("oa_sig_nw_state", String.valueOf(zzaziVar.zzj().zza()));
                if (zzazdVarZzf.zze() && zzazdVarZzf.zzf() && zzazdVarZzf.zzh() == 2) {
                    zzfeuVarZzb2.zza("oa_sig_cell_type", String.valueOf(zzazdVarZzf.zzg() - 1));
                }
                this.zzf.zzb(zzfeuVarZzb2);
            }
        } else {
            ArrayList arrayListZzc2 = zzeai.zzc(sQLiteDatabase);
            zzazj zzazjVarZza = zzazn.zza();
            zzazjVarZza.zzb(this.zzb.getPackageName());
            zzazjVarZza.zzd(Build.MODEL);
            zzazjVarZza.zze(zzeai.zza(sQLiteDatabase, 0));
            zzazjVarZza.zza(arrayListZzc2);
            zzazjVarZza.zzg(zzeai.zza(sQLiteDatabase, 1));
            zzazjVarZza.zzc(zzeai.zza(sQLiteDatabase, 3));
            zzazjVarZza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
            zzazjVarZza.zzf(zzeai.zzb(sQLiteDatabase, 2));
            final zzazn zzaznVar = (zzazn) zzazjVarZza.zzal();
            zzc(sQLiteDatabase, arrayListZzc2);
            this.zza.zzb(new zzawy() { // from class: com.google.android.gms.internal.ads.zzeam
                @Override // com.google.android.gms.internal.ads.zzawy
                public final void zza(zzayo zzayoVar) {
                    zzayoVar.zzi(zzaznVar);
                }
            });
            zzazy zzazyVarZza = zzazz.zza();
            zzazyVarZza.zza(this.zzd.zzb);
            zzazyVarZza.zzc(this.zzd.zzc);
            zzazyVarZza.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzazz zzazzVar = (zzazz) zzazyVarZza.zzal();
            this.zza.zzb(new zzawy() { // from class: com.google.android.gms.internal.ads.zzean
                @Override // com.google.android.gms.internal.ads.zzawy
                public final void zza(zzayo zzayoVar) {
                    zzazz zzazzVar2 = zzazzVar;
                    zzayg zzaygVar = (zzayg) zzayoVar.zzb().zzaB();
                    zzaygVar.zzb(zzazzVar2);
                    zzayoVar.zzg(zzaygVar);
                }
            });
            this.zza.zzc(10004);
        }
        zzeai.zzf(sQLiteDatabase);
        return null;
    }

    public final void zzb(final boolean z10) {
        try {
            this.zzc.zza(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzeal
                @Override // com.google.android.gms.internal.ads.zzfdo
                public final Object zza(Object obj) throws Exception {
                    this.zza.zza(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            zzbzr.zzg("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
