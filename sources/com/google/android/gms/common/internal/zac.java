package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import l0.f;
import q.h;

/* JADX INFO: loaded from: classes.dex */
public final class zac {

    @GuardedBy("sCache")
    private static final h<String, String> zaa = new h<>();

    @GuardedBy("sCache")
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String zac(Context context, int i10) {
        int i11;
        Resources resources = context.getResources();
        if (i10 == 1) {
            i11 = R.string.common_google_play_services_install_button;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? android.R.string.ok : R.string.common_google_play_services_enable_button;
        } else {
            i11 = R.string.common_google_play_services_update_button;
        }
        return resources.getString(i11);
    }

    public static String zad(Context context, int i10) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strZaa);
        }
        if (i10 == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strZaa);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strZaa);
        }
        if (i10 == 5) {
            return zah(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i10 == 7) {
            return zah(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i10 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strZaa);
        }
        if (i10 == 20) {
            return zah(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i10) {
            case 16:
                return zah(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zah(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    public static String zae(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? zah(context, "common_google_play_services_resolution_required_text", zaa(context)) : zad(context, i10);
    }

    public static String zaf(Context context, int i10) {
        String strZai = i10 == 6 ? zai(context, "common_google_play_services_resolution_required_title") : zag(context, i10);
        return strZai == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : strZai;
    }

    public static String zag(Context context, int i10) {
        String string;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zai(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zai(context, "common_google_play_services_network_error_title");
            case 8:
                string = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                string = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                string = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                string = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                string = sb2.toString();
                break;
            case 16:
                string = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zai(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zai(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", string);
        return null;
    }

    private static String zah(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZai = zai(context, str);
        if (strZai == null) {
            strZai = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZai, str2);
    }

    private static String zai(Context context, String str) {
        h<String, String> hVar = zaa;
        synchronized (hVar) {
            Locale localeC = f.g(e.a(context.getResources().getConfiguration())).c(0);
            if (!localeC.equals(zab)) {
                hVar.clear();
                zab = localeC;
            }
            String orDefault = hVar.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            hVar.put(str, string);
            return string;
        }
    }
}
