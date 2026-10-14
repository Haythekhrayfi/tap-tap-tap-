package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.activity.j;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaq extends zzgs {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    public zzaq(zzfy zzfyVar) {
        super(zzfyVar);
    }

    public final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzu();
        return this.zza;
    }

    public final String zzc() {
        zzu();
        return this.zzb;
    }

    public final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    public final boolean zze() {
        zzg();
        long jCurrentTimeMillis = this.zzs.zzav().currentTimeMillis();
        if (jCurrentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (e0.a.a(this.zzs.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
            this.zzs.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.zzc == null) {
                this.zzc = AccountManager.get(this.zzs.zzau());
            }
            try {
                Account[] result = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.zzd = Boolean.TRUE;
                    this.zze = jCurrentTimeMillis;
                    return true;
                }
                Account[] result2 = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.zzd = Boolean.TRUE;
                    this.zze = jCurrentTimeMillis;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                this.zzs.zzay().zzh().zzb("Exception checking account types", e10);
            }
        }
        this.zze = jCurrentTimeMillis;
        this.zzd = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgs
    public final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = j.a(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }
}
