package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbm implements zzg {
    private final Application zza;
    private final zzbi zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzh zze;
    private final zzak zzf;
    private final zzay zzg;
    private final zzam zzh;

    public zzbm(Application application, zzbi zzbiVar, Handler handler, Executor executor, zzh zzhVar, zzak zzakVar, zzay zzayVar, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzbiVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzhVar;
        this.zzf = zzakVar;
        this.zzg = zzayVar;
        this.zzh = zzamVar;
    }

    private final void zzf(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(strOptString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            String strValueOf = String.valueOf(strOptString);
            Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Action[browser]: empty scheme: ".concat(strValueOf) : new String("Action[browser]: empty scheme: "));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e10) {
            String strValueOf2 = String.valueOf(strOptString);
            Log.d("UserMessagingPlatform", strValueOf2.length() != 0 ? "Action[browser]: can not open url: ".concat(strValueOf2) : new String("Action[browser]: can not open url: "), e10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        final Handler handler = this.zzc;
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String str, JSONObject jSONObject) {
        byte b10;
        byte b11 = -1;
        switch (str) {
            case "load_complete":
                b10 = 0;
                break;
            case "configure_app_assets":
                b10 = 3;
                break;
            case "browser":
                b10 = 2;
                break;
            case "dismiss":
                b10 = 1;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            this.zzg.zze();
            return true;
        }
        if (b10 != 1) {
            if (b10 == 2) {
                zzf(jSONObject);
                return true;
            }
            if (b10 != 3) {
                return false;
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
            return true;
        }
        String strOptString = jSONObject.optString("status");
        switch (strOptString.hashCode()) {
            case -954325659:
                if (strOptString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    b11 = 3;
                }
                break;
            case -258041904:
                if (strOptString.equals("personalized")) {
                    b11 = 0;
                }
                break;
            case 429411856:
                if (strOptString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    b11 = 4;
                }
                break;
            case 467888915:
                if (strOptString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    b11 = 1;
                }
                break;
            case 1666911234:
                if (strOptString.equals("non_personalized")) {
                    b11 = 2;
                }
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2 || b11 == 3 || b11 == 4) {
            this.zzg.zzc(3);
        } else {
            this.zzg.zzd(new zzj(1, "We are getting something wrong with the webview."));
        }
        return true;
    }

    public final /* synthetic */ void zzc() {
        String strConcat;
        Application application = this.zza;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String strValueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                strConcat = strValueOf.length() != 0 ? "data:image/png;base64,".concat(strValueOf) : new String("data:image/png;base64,");
            }
            jSONObject.put("app_icon", strConcat);
            jSONObject.put("stored_infos_map", this.zzh.zzb());
        } catch (JSONException unused) {
        }
        this.zzg.zza().zzb("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    public final void zzd(String str) {
        String strValueOf = String.valueOf(str);
        Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Receive consent action: ".concat(strValueOf) : new String("Receive consent action: "));
        Uri uri = Uri.parse(str);
        this.zze.zzb(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.zzf);
    }

    public final void zze(int i10, String str, String str2) {
        this.zzg.zzf(new zzj(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i10), str2, str)));
    }
}
