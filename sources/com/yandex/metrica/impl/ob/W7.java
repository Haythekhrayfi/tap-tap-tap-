package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.NativeCrashesHelper;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class W7 implements S7 {
    @Override // com.yandex.metrica.impl.ob.S7
    public String a() {
        return "YandexMetricaNativeCrashes";
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(String str) {
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(String str, String str2, String str3) {
        NativeCrashesHelper.setUpNativeUncaughtExceptionHandler(str2);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(boolean z10) {
        NativeCrashesHelper.logsEnabled(z10);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void b() {
        NativeCrashesHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public String c() {
        return "YandexMetricaNativeModule";
    }
}
