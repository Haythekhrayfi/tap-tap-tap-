package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzbx;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ConsentDebugSettings {
    private final boolean zza;
    private final int zzb;

    public static class Builder {
        private final Context zzb;
        private boolean zzd;
        private final List<String> zza = new ArrayList();
        private int zzc = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.zzb = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.zza.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            Context context = this.zzb;
            List<String> list = this.zza;
            boolean z10 = true;
            if (!zzbx.zzb() && !list.contains(zzbx.zza(context)) && !this.zzd) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i10) {
            this.zzc = i10;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z10) {
            this.zzd = z10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder, zza zzaVar) {
        this.zza = z10;
        this.zzb = builder.zzc;
    }

    public int getDebugGeography() {
        return this.zzb;
    }

    public boolean isTestDevice() {
        return this.zza;
    }
}
