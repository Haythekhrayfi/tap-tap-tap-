package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class VariableServiceImpl implements AppLovinVariableService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10099a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinVariableService.OnVariablesUpdateListener f10102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bundle f10103e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f10100b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10101c = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f10104f = new Object();

    public VariableServiceImpl(o oVar) {
        this.f10099a = oVar;
        String str = (String) oVar.a(com.applovin.impl.sdk.c.d.f10395m);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    private Object a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            y.j("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return obj;
        }
        if (!this.f10099a.d()) {
            y.h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f10104f) {
            if (this.f10103e == null) {
                y.j("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                return obj;
            }
            if (cls.equals(String.class)) {
                return this.f10103e.getString(str, (String) obj);
            }
            if (cls.equals(Boolean.class)) {
                return Boolean.valueOf(this.f10103e.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            throw new IllegalStateException("Unable to retrieve variable value for " + str);
        }
    }

    private void a() {
        Bundle bundle;
        synchronized (this.f10104f) {
            if (this.f10102d != null && (bundle = this.f10103e) != null) {
                final Bundle bundle2 = (Bundle) bundle.clone();
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.VariableServiceImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        VariableServiceImpl.this.f10102d.onVariablesUpdate(bundle2);
                    }
                });
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str, boolean z10) {
        return ((Boolean) a(str, Boolean.valueOf(z10), Boolean.class)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str, String str2) {
        return (String) a(str, str2, String.class);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void loadVariables() {
        String str;
        if (!this.f10099a.d()) {
            str = "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.";
        } else {
            if (this.f10100b.compareAndSet(false, true)) {
                this.f10099a.G().a(new com.applovin.impl.sdk.e.p(this.f10099a, new com.applovin.impl.sdk.e.p.a() { // from class: com.applovin.impl.sdk.VariableServiceImpl.1
                    @Override // com.applovin.impl.sdk.e.p.a
                    public void a() {
                        VariableServiceImpl.this.f10100b.set(false);
                    }
                }), com.applovin.impl.sdk.e.r.b.BACKGROUND);
                return;
            }
            str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
        }
        y.j("AppLovinVariableService", str);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f10102d = onVariablesUpdateListener;
        synchronized (this.f10104f) {
            if (onVariablesUpdateListener != null) {
                if (this.f10103e != null && this.f10101c.compareAndSet(false, true)) {
                    this.f10099a.F();
                    if (y.a()) {
                        this.f10099a.F().b("AppLovinVariableService", "Setting initial listener");
                    }
                    a();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VariableService{variables=");
        sbA.append(this.f10103e);
        sbA.append(", listener=");
        sbA.append(this.f10102d);
        sbA.append('}');
        return sbA.toString();
    }

    public void updateVariables(JSONObject jSONObject) {
        this.f10099a.F();
        if (y.a()) {
            this.f10099a.F().b("AppLovinVariableService", "Updating variables: " + jSONObject + "...");
        }
        synchronized (this.f10104f) {
            this.f10103e = JsonUtils.toBundle(jSONObject);
            a();
            this.f10099a.a(com.applovin.impl.sdk.c.d.f10395m, jSONObject.toString());
        }
    }
}
