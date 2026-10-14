package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzlh {
    private static final zzlg zza;
    private static final zzlg zzb;

    static {
        zzlg zzlgVar;
        try {
            zzlgVar = (zzlg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlgVar = null;
        }
        zza = zzlgVar;
        zzb = new zzlg();
    }

    public static zzlg zza() {
        return zza;
    }

    public static zzlg zzb() {
        return zzb;
    }
}
