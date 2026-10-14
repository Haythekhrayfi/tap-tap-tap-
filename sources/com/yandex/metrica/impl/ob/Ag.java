package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Ag implements IReporter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uo<String> f13650b = new ro(new po("Event name"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uo<String> f13651c = new ro(new po("Error message"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uo<String> f13652d = new ro(new po("Error identifier"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uo<Throwable> f13653e = new ro(new qo("Unhandled exception"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uo<UserProfile> f13654f = new ro(new qo("User profile"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uo<Revenue> f13655g = new ro(new qo("Revenue"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uo<ECommerceEvent> f13656h = new ro(new qo("ECommerceEvent"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2139zg f13657a;

    public Ag() {
        this(new C2139zg());
    }

    public Ag(C2139zg c2139zg) {
        this.f13657a = c2139zg;
    }

    public C2139zg a() {
        return this.f13657a;
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this.f13657a;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        ((ro) f13656h).a(eCommerceEvent);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        ((ro) f13652d).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        ((ro) f13652d).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) throws ValidationException {
        ((ro) f13651c).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) throws ValidationException {
        ((ro) f13650b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) throws ValidationException {
        ((ro) f13650b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        ((ro) f13650b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) throws ValidationException {
        ((ro) f13655g).a(revenue);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) throws ValidationException {
        ((ro) f13653e).a(th);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) throws ValidationException {
        ((ro) f13654f).a(userProfile);
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z10) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
    }
}
