package z4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f45025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y4.a.b f45026b;

    public d(AppMeasurementSdk appMeasurementSdk, y4.a.b bVar) {
        this.f45026b = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new c(this));
        this.f45025a = new HashSet();
    }
}
