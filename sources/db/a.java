package db;

import ch.qos.logback.core.net.SyslogConstants;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import mc.d;
import oc.c;
import oc.e;

/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity", f = "PHSplashActivity.kt", l = {146, 154, SyslogConstants.LOG_LOCAL4}, m = "waitForInitComplete")
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f28919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PHSplashActivity f28922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28923g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PHSplashActivity pHSplashActivity, d<? super a> dVar) {
        super(dVar);
        this.f28922f = pHSplashActivity;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        this.f28921e = obj;
        this.f28923g |= Integer.MIN_VALUE;
        return PHSplashActivity.g(this.f28922f, this);
    }
}
