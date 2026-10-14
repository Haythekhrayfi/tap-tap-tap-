package hm.mod.update;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class up1 implements Runnable {
    private final Context context;

    public up1(Context context) {
        this.context = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject;
        JSONArray jSONArray;
        try {
            final String packageName = this.context.getPackageName();
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packageName, 0);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://pop-up.apkomega.com/202307/api/popup.php?packageName=" + packageName + "&versionName=" + packageInfo.versionName + "&versionCode=" + packageInfo.versionCode + "&lang=" + up5.getLang() + "&country=" + up5.getCountry()).openConnection();
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            httpURLConnection.setRequestMethod("GET");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    sb2.append(line);
                }
            }
            bufferedReader.close();
            Log.e("zjx", "data: " + sb2.toString());
            JSONObject jSONObject2 = new JSONObject(sb2.toString());
            if (jSONObject2.optBoolean("hasNewVersion", false)) {
                final String strOptString = jSONObject2.optString("title");
                final String strOptString2 = jSONObject2.optString("icon");
                final String strOptString3 = jSONObject2.optString("author");
                final String strOptString4 = jSONObject2.optString(AppLovinEventTypes.USER_VIEWED_CONTENT);
                final boolean zOptBoolean = jSONObject2.optBoolean("canClose", true);
                final String strOptString5 = jSONObject2.optString(ImagesContract.URL, "https://spdn.poumod.com/HappyMod-2-9-7.apk");
                ((Activity) this.context).runOnUiThread(new Runnable() { // from class: hm.mod.update.up1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        up2.show(up1.this.context, Uri.encode(strOptString), Uri.encode(strOptString2), Uri.encode(strOptString3), packageName, strOptString4, strOptString5, zOptBoolean);
                    }
                });
                return;
            }
            if (jSONObject2.has("ad_info") && (jSONObject = jSONObject2.getJSONObject("ad_info")) != null && jSONObject.has("ad_list")) {
                long jOptLong = jSONObject.optLong("interval", 3600L);
                int showTimes = up5.getShowTimes(this.context);
                long lastShow = up5.getLastShow(this.context);
                if ((showTimes >= 2 && (System.currentTimeMillis() / 1000) - lastShow <= jOptLong) || (jSONArray = jSONObject.getJSONArray("ad_list")) == null || jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    if (!isAppInstalled(jSONObject3.optString("packageName"))) {
                        final String strOptString6 = jSONObject3.optString("title");
                        final String strOptString7 = jSONObject3.optString("icon");
                        final String strOptString8 = jSONObject3.optString("banner");
                        final String strOptString9 = jSONObject3.optString("desc");
                        final String strOptString10 = jSONObject3.optString(ImagesContract.URL);
                        final String strOptString11 = jSONObject3.optString("action", "INSTALL");
                        ((Activity) this.context).runOnUiThread(new Runnable() { // from class: hm.mod.update.up1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                up2.showAd(up1.this.context, strOptString6, strOptString7, strOptString8, strOptString9, strOptString10, strOptString11);
                                up5.setLastShow(up1.this.context);
                                up5.setShowTimes(up1.this.context);
                            }
                        });
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            Log.e("zjx", "update: " + e10.getLocalizedMessage());
        }
    }

    private boolean isAppInstalled(String str) {
        try {
            return this.context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Exception unused) {
        }
    }
}
