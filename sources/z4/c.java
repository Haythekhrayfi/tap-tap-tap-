package z4;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgv;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f45024a;

    public c(d dVar) {
        this.f45024a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgz
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (this.f45024a.f45025a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            Set set = b.f45018a;
            String strZza = zzgv.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            ((b5.c) this.f45024a.f45026b).a(2, bundle2);
        }
    }
}
