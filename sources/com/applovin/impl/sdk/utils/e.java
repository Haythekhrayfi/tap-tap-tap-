package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f11200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f11201b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f11202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11204e;

    private e(Context context) {
        boolean zBooleanValue;
        Bundle bundle = null;
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                com.applovin.impl.sdk.y.c("AndroidManifest", "Failed to get meta data.", e10);
            }
            this.f11202c = bundle;
            int i10 = 0;
            try {
                XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
                int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
                int iIntValue = 0;
                zBooleanValue = false;
                do {
                    if (2 == eventType) {
                        try {
                            if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                                for (int i11 = 0; i11 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i11++) {
                                    String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i11);
                                    String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i11);
                                    if (attributeName.equals("networkSecurityConfig")) {
                                        iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                    } else if (attributeName.equals("usesCleartextTraffic")) {
                                        zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i10 = iIntValue;
                            try {
                                com.applovin.impl.sdk.y.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                                this.f11203d = i10;
                            } finally {
                                this.f11203d = i10;
                                this.f11204e = zBooleanValue;
                            }
                        }
                    }
                    eventType = xmlResourceParserOpenXmlResourceParser.next();
                } while (eventType != 1);
                this.f11203d = iIntValue;
            } catch (Throwable th2) {
                th = th2;
                zBooleanValue = false;
            }
        } catch (Throwable th3) {
            this.f11202c = bundle;
            throw th3;
        }
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f11201b) {
            if (f11200a == null) {
                f11200a = new e(context);
            }
            eVar = f11200a;
        }
        return eVar;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.f11202c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean a(String str) {
        Bundle bundle = this.f11202c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f11202c;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }
}
