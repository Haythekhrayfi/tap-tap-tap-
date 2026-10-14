package com.applovin.impl.sdk.a;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10135b = o.au();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10136c;

    public f(o oVar) {
        this.f10134a = oVar;
    }

    public String a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.f10136c, str);
        } catch (Throwable th) {
            this.f10134a.F();
            if (y.a()) {
                this.f10134a.F().b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }

    public void a() {
        if (((Boolean) this.f10134a.a(com.applovin.impl.sdk.c.b.aF)).booleanValue()) {
            this.f10134a.F();
            if (y.a()) {
                y yVarF = this.f10134a.F();
                StringBuilder sbA = defpackage.a.a("Initializing Open Measurement SDK v");
                sbA.append(c());
                sbA.append("...");
                yVarF.b("OpenMeasurementService", sbA.toString());
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.f.1
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Omid.activate(f.this.f10135b);
                    f.this.f10134a.F();
                    if (y.a()) {
                        y yVarF2 = f.this.f10134a.F();
                        StringBuilder sbA2 = defpackage.a.a("Init ");
                        sbA2.append(f.this.b() ? "succeeded" : "failed");
                        sbA2.append(" and took ");
                        sbA2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        sbA2.append("ms");
                        yVarF2.b("OpenMeasurementService", sbA2.toString());
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f.this.f10135b.getResources().openRawResource(R.raw.omsdk_v_1_0)));
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    sb2.append(line);
                                }
                            }
                            f.this.f10136c = sb2.toString();
                        } catch (Throwable th) {
                            try {
                                Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e10) {
                                    Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        f.this.f10134a.F();
                        if (y.a()) {
                            f.this.f10134a.F().b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th2);
                        }
                    }
                }
            });
        }
    }

    public boolean b() {
        return Omid.isActive();
    }

    public String c() {
        return Omid.getVersion();
    }

    public Partner d() {
        return Partner.createPartner((String) this.f10134a.a(com.applovin.impl.sdk.c.b.aG), AppLovinSdk.VERSION);
    }

    public String e() {
        return this.f10136c;
    }
}
