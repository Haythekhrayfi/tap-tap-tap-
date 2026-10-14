package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "AdValueParcelCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Field(id = 3)
    public final String zzc;

    @SafeParcelable.Field(id = 4)
    public final long zzd;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = j10;
    }

    public static zzs zza(JSONObject jSONObject) throws JSONException {
        return new zzs(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(AppLovinEventParameters.REVENUE_CURRENCY), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
