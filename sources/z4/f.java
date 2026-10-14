package z4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4.a.b f45028a;

    public f(AppMeasurementSdk appMeasurementSdk, y4.a.b bVar) {
        this.f45028a = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new e(this));
    }
}
