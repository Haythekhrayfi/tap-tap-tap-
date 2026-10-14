package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<ScanResult> f22762a = new a();

    public class a implements Comparator<ScanResult> {
        @Override // java.util.Comparator
        public final int compare(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult.level - scanResult2.level;
        }
    }

    public static String a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo.getType() != 0 ? activeNetworkInfo.getTypeName() : activeNetworkInfo.getSubtypeName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Point b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @SuppressLint({"MissingPermission"})
    public static String c(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (!wifiManager.isWifiEnabled()) {
                return null;
            }
            List<ScanResult> scanResults = wifiManager.getScanResults();
            Object obj = (ScanResult[]) scanResults.toArray(new ScanResult[scanResults.size()]);
            int i10 = 0;
            if (obj == null) {
                obj = new Object[0];
            }
            ScanResult[] scanResultArr = (ScanResult[]) obj;
            Arrays.sort(scanResultArr, Collections.reverseOrder(f22762a));
            if (scanResultArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                int iMin = Math.min(3, scanResultArr.length);
                while (i10 < iMin) {
                    sb2.append(scanResultArr[i10].BSSID);
                    sb2.append(",");
                    sb2.append(scanResultArr[i10].level);
                    i10++;
                    sb2.append(i10 < iMin ? ";" : "");
                }
                return sb2.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
