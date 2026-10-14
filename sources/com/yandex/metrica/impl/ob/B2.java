package com.yandex.metrica.impl.ob;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.developer.filepicker.model.DialogConfigs;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f13706a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f13707b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f13708a;

        static {
            String str;
            if (B2.a("com.unity3d.player.UnityPlayer")) {
                str = PluginErrorDetails.Platform.UNITY;
            } else if (B2.a("mono.MonoPackageManager")) {
                str = PluginErrorDetails.Platform.XAMARIN;
            } else if (B2.a("org.apache.cordova.CordovaPlugin")) {
                str = PluginErrorDetails.Platform.CORDOVA;
            } else if (B2.a("com.facebook.react.ReactRootView")) {
                str = "react";
            } else {
                str = B2.a("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : PluginErrorDetails.Platform.NATIVE;
            }
            f13708a = str;
        }
    }

    public static String a() {
        return a.f13708a;
    }

    public static void a(String str, Object... objArr) {
        Log.i("AppMetrica-Attribution", String.format(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e("AppMetrica-Attribution", String.format(str, objArr), th);
    }

    public static boolean a(String str) {
        return b(str) != null;
    }

    public static boolean a(Throwable th) {
        String string;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            string = stringWriter.toString();
            printWriter.close();
        } else {
            string = "";
        }
        return !TextUtils.isEmpty(string) && f13707b.matcher(string).find();
    }

    public static Class b(String str) {
        try {
            return Class.forName(str, false, B2.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b() {
        StringBuilder sbA = defpackage.a.a("Initializing of Metrica, ");
        sbA.append(O2.a("release"));
        sbA.append(" type, Version ");
        sbA.append("5.0.0");
        sbA.append(", API Level ");
        sbA.append(YandexMetrica.getLibraryApiLevel());
        sbA.append(", Dated ");
        sbA.append("18.05.2022");
        sbA.append(".");
        Log.i("AppMetrica", sbA.toString());
    }

    public static void b(String str, Object... objArr) {
        Log.w("AppMetrica-Attribution", String.format(str, objArr));
    }

    public static boolean b(Throwable th) {
        String string;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            string = stringWriter.toString();
            printWriter.close();
        } else {
            string = "";
        }
        return !TextUtils.isEmpty(string) && f13706a.matcher(string).find();
    }

    public static String c(String str) {
        String strA;
        StringBuilder sbA = q2.a.a(str, DialogConfigs.DIRECTORY_SEPERATOR, "5.0.0", ".", "45001354");
        sbA.append(" (");
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        if (str2.startsWith(str3)) {
            strA = O2.a(str2);
        } else {
            strA = O2.a(str3) + " " + str2;
        }
        sbA.append(strA);
        sbA.append("; Android ");
        return androidx.activity.k.a(sbA, Build.VERSION.RELEASE, ")");
    }
}
