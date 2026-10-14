package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebViewDatabase;
import ch.qos.logback.classic.spi.CallerData;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f25285a = (long) (Math.floor(Math.random() * 4.294967295E9d) + 1.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25286b = 0;

    public static Bitmap a(String str) {
        try {
            String strSubstring = str.substring(str.indexOf(",") + 1);
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ResultReceiver a(ResultReceiver resultReceiver) {
        if (resultReceiver == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver2;
    }

    public static <T> String a(T t10) {
        return t10.toString();
    }

    public static ArrayList a(AdResponse adResponse, Map map) {
        List<String> listL = adResponse.l();
        List<Long> listF = adResponse.f();
        List<Integer> listQ = adResponse.q();
        ArrayList arrayList = new ArrayList();
        if (listL != null) {
            int i10 = 0;
            while (i10 < listL.size()) {
                String string = listL.get(i10);
                if (map != null) {
                    Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                    for (Map.Entry entry : map.entrySet()) {
                        StringBuilder sbA = v60.a(CallerData.NA);
                        sbA.append((String) entry.getKey());
                        sbA.append("=");
                        sbA.append((String) entry.getValue());
                        Uri uri = Uri.parse(sbA.toString());
                        for (String str : uri.getQueryParameterNames()) {
                            builderBuildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
                        }
                    }
                    string = builderBuildUpon.build().toString();
                }
                long jLongValue = listF.size() > i10 ? listF.get(i10).longValue() : 0L;
                int iIntValue = listQ.size() > i10 ? listQ.get(i10).intValue() : 0;
                g11 g11Var = new g11();
                g11Var.a(string);
                g11Var.a(jLongValue);
                g11Var.a(iIntValue);
                arrayList.add(g11Var);
                i10++;
            }
        }
        return arrayList;
    }

    public static boolean a(Context context) {
        try {
            return WebViewDatabase.getInstance(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(vh vhVar) {
        return vhVar == null || vhVar.a();
    }
}
